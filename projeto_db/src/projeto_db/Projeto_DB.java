/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_db;
import panels.Usuario.CriarUsuario;
import panels.Cliente.CriarCliente;
import db_manager.*;
import forms.*;
import java.awt.List;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.springframework.core.io.ClassPathResource;
import panels.Cliente.AtualizarCliente;
import panels.OrdemServico.CriarOS;
import panels.relatorio.GerarRelatorio;
/**
 *
 * @author Mateus
 */
public class Projeto_DB {

    static DB_Connection conn;
    static InputStream xml = null;
    static JasperReport jReport = null;
    public static void main(String[] args) {
        conn = new DB_Connection("localhost", 3306, "root", "", "projeto_db", false);
        if(!conn.asError()){
            xml = new ByteArrayInputStream(XMLSave.xml.getBytes(StandardCharsets.UTF_8));
            
            if(compileReport()){
                Login loginForm = new Login();
                loginForm.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Não foi possível carregar o sistema de relatório.", "ERRO [000]", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Não foi possível estabelecer uma conexão com o banco de dados.", "ERRO [001]", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    static boolean compileReport(){
        try {
            jReport = JasperCompileManager.compileReport(xml);
        } catch (JRException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
        return true;
    }
    
    public static boolean Login(Login loginForm, String user, String pass){
        if(conn.asConnected()){
            String query = "SELECT tipo FROM usuarios WHERE login=? AND senha=?";
            DataType[] values = {
                new DataType(user),
                new DataType(pass)
            };
            ResultSet result = DB_Actions.Query(conn, query, values);
            try {
                if(result != null){
                    if(result.next()){
                        Dashboard dashboard = new Dashboard(loginForm, result.getString("tipo"));
                        dashboard.setTitle(String.format("Dashboard [%s]", result.getString("tipo")));
                        dashboard.setVisible(true);
                        return true;
                    }   
                }else{
                    JOptionPane.showMessageDialog(null, "Não foi possível realizar a consulta no banco de dados.", "ERRO [002]", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro ao fazer login.", "ERRO [003]", JOptionPane.ERROR_MESSAGE);
                System.out.println(ex.getMessage());
            }
        }
        return false;
    }
    
    public static void relatorio(Map <String, Object> param, Dashboard db, String datasInfo, JDialog gr){
        if(conn.asConnected()){
            try {
                gr.dispose();
                JasperPrint print = JasperFillManager.fillReport(jReport, param, conn.getConn());
                JasperViewer view = new JasperViewer(print, false);
                JDialog d = new JDialog(db, "Relatório [" + datasInfo + "]", true);
                d.setSize(1100, 1000);
                d.getContentPane().add(view.getContentPane());
                d.setLocationRelativeTo(db);
                if(print.getPages().size() > 0){
                   d.setVisible(true); 
                }else{
                    JOptionPane.showMessageDialog(null, "Sem dados suficientes para gerar o relatório.", "Atenção", JOptionPane.INFORMATION_MESSAGE); 
                }
            } catch (JRException ex) {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro ao fazer o relatório.", "ERRO [011]", JOptionPane.ERROR_MESSAGE); 
                System.out.println(ex.getMessage());
            }
        }
    }
    
    public static ArrayList<Client> GetClients(){
        
        ArrayList<Client> clients = new ArrayList<Client>();
        
        if(conn.asConnected()){
            String query = "SELECT * FROM clientes";
            DataType[] values = {};
            ResultSet result = DB_Actions.Query(conn, query, values);
            try {
                if(result != null){
                    while(result.next()){
                        clients.add(new Client(
                                result.getInt("id"),
                                result.getString("nome"),
                                result.getString("email"),
                                result.getString("endereco")
                        ));
                    }   
                    return clients;
                }else{
                    JOptionPane.showMessageDialog(null, "Não foi possível realizar a consulta no banco de dados.", "ERRO [002/1]", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro ao fazer a busca pelos clientes.", "ERRO [003/1]", JOptionPane.ERROR_MESSAGE);
                System.out.println(ex.getMessage());
            }
        }
        return null;
    }
    
    public static ArrayList<Client> GetClients(String cond){
        
        ArrayList<Client> clients = new ArrayList<Client>();
        
        if(conn.asConnected()){
            String query = "SELECT * FROM clientes " + cond;
            DataType[] values = {};
            ResultSet result = DB_Actions.Query(conn, query, values);
            try {
                if(result != null){
                    while(result.next()){
                        clients.add(new Client(
                                result.getInt("id"),
                                result.getString("nome"),
                                result.getString("email"),
                                result.getString("endereco")
                        ));
                    }   
                    return clients;
                }else{
                    JOptionPane.showMessageDialog(null, "Não foi possível realizar a consulta no banco de dados.", "ERRO [002/1]", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro ao fazer a busca pelos clientes.", "ERRO [003/1]", JOptionPane.ERROR_MESSAGE);
                System.out.println(ex.getMessage());
            }
        }
        return null;
    }
    
    public static ArrayList<User> GetUsers(){
        
        ArrayList<User> users = new ArrayList<User>();
        
        if(conn.asConnected()){
            String query = "SELECT id, tipo, telefone, login FROM usuarios";
            DataType[] values = {};
            ResultSet result = DB_Actions.Query(conn, query, values);
            try {
                if(result != null){
                    while(result.next()){
                        users.add(new User(
                                result.getInt("id"),
                                result.getString("tipo"),
                                result.getString("telefone"),
                                result.getString("login")
                        ));
                    }   
                    return users;
                }else{
                    JOptionPane.showMessageDialog(null, "Não foi possível realizar a consulta no banco de dados.", "ERRO [002/1]", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro ao fazer a busca pelos usuários.", "ERRO [003/1]", JOptionPane.ERROR_MESSAGE);
                System.out.println(ex.getMessage());
            }
        }
        return null;
    }
    
    public static ArrayList<User> GetUsers(String cond){
        
        ArrayList<User> users = new ArrayList<User>();
        
        if(conn.asConnected()){
            String query = "SELECT id, tipo, telefone, login FROM usuarios " + cond;
            DataType[] values = {};
            ResultSet result = DB_Actions.Query(conn, query, values);
            try {
                if(result != null){
                    while(result.next()){
                        users.add(new User(
                                result.getInt("id"),
                                result.getString("tipo"),
                                result.getString("telefone"),
                                result.getString("login")
                        ));
                    }   
                    return users;
                }else{
                    JOptionPane.showMessageDialog(null, "Não foi possível realizar a consulta no banco de dados.", "ERRO [002/1]", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro ao fazer a busca pelos usuários.", "ERRO [003/1]", JOptionPane.ERROR_MESSAGE);
                System.out.println(ex.getMessage());
            }
        }
        return null;
    }
    
    public static ArrayList<OS> GetOS(){
        
        ArrayList<OS> os = new ArrayList<OS>();
        
        if(conn.asConnected()){
            String query = "SELECT * FROM ordens_servico";
            DataType[] values = {};
            ResultSet result = DB_Actions.Query(conn, query, values);
            try {
                if(result != null){
                    while(result.next()){
                        os.add(new OS(
                                result.getInt("id"),
                                result.getDate("data"),
                                result.getString("equipamento"),
                                result.getString("defeito"),
                                result.getString("servico"),
                                result.getString("tecnico"),
                                result.getFloat("valor"),
                                result.getInt("cliente_id")
                        ));
                    }   
                    return os;
                }else{
                    JOptionPane.showMessageDialog(null, "Não foi possível realizar a consulta no banco de dados.", "ERRO [002/1]", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro ao fazer a busca pelas Ordens de Serviço.", "ERRO [003/1]", JOptionPane.ERROR_MESSAGE);
                System.out.println(ex.getMessage());
            }
        }
        return null;
    }
    
    public static ArrayList<OS> GetOS(String cond){
        
        ArrayList<OS> os = new ArrayList<OS>();
        
        if(conn.asConnected()){
            String query = "SELECT * FROM ordens_servico " + cond;
            DataType[] values = {};
            ResultSet result = DB_Actions.Query(conn, query, values);
            try {
                if(result != null){
                    while(result.next()){
                        os.add(new OS(
                                result.getInt("id"),
                                result.getDate("data"),
                                result.getString("equipamento"),
                                result.getString("defeito"),
                                result.getString("servico"),
                                result.getString("tecnico"),
                                result.getFloat("valor"),
                                result.getInt("cliente_id")
                        ));
                    }   
                    return os;
                }else{
                    JOptionPane.showMessageDialog(null, "Não foi possível realizar a consulta no banco de dados.", "ERRO [002/1]", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro ao fazer a busca pelas Ordens de Serviço.", "ERRO [003/1]", JOptionPane.ERROR_MESSAGE);
                System.out.println(ex.getMessage());
            }
        }
        return null;
    }
    
    public static boolean AddUser(CriarUsuario cadUsrForm, String user, String pass, String tell, String typeUsr){
        if(conn.asConnected()){
            String query = "INSERT INTO usuarios (tipo, telefone, login, senha) VALUES (?,?,?,?)";
            DataType[] values = {
                new DataType(typeUsr),
                new DataType(tell),
                new DataType(user),
                new DataType(pass)
            };
            return DB_Actions.Insert(conn, query, values);
        }
        return false;
    }
    public static boolean UpdateUser(int id, String user, String pass, String tell, String typeUsr){
        if(conn.asConnected()){
            String query = "UPDATE usuarios SET tipo=?, telefone=?, login=?, senha=? WHERE id=?";
            DataType[] values = {
                new DataType(typeUsr),
                new DataType(tell),
                new DataType(user),
                new DataType(pass),
                new DataType(id)
            };
            return DB_Actions.Update(conn, query, values);
        }
        return false;
    }
    public static boolean RemoveUser(int id){
        if(conn.asConnected()){
            String query = "DELETE FROM usuarios WHERE id=?";
            DataType[] values = {
                new DataType(id)
            };
            return DB_Actions.Delete(conn, query, values);
        }
        return false;
    }
    public static boolean AddClient(CriarCliente cadClientForm, String clientName, String email, String endereco){
        if(conn.asConnected()){
            String query = "INSERT INTO clientes (nome, email, endereco) VALUES (?,?,?)";
            DataType[] values = {
                new DataType(clientName),
                new DataType(email),
                new DataType(endereco)
            };
            return DB_Actions.Insert(conn, query, values);
        }
        return false;
    }
    public static boolean UpdateClient(int clienteID, String clientName, String email, String endereco){
        if(conn.asConnected()){
            String query = "UPDATE clientes SET nome=?, email=?, endereco=? WHERE id=?";
            DataType[] values = {
                new DataType(clientName),
                new DataType(email),
                new DataType(endereco),
                new DataType(clienteID)
            };
            return DB_Actions.Update(conn, query, values);
        }
        return false;
    }
    public static boolean RemoveClient(int id){
        if(conn.asConnected()){
            String query = "DELETE FROM clientes WHERE id=?";
            DataType[] values = {
                new DataType(id)
            };
            return DB_Actions.Delete(conn, query, values);
        }
        return false;
    }
    public static boolean AddOS(CriarOS cadOSForm, String equipamento, String defeito, String servico, String tecnico, float valor, int cliente_id){
        if(conn.asConnected()){
            String query = "INSERT INTO ordens_servico (data, equipamento, defeito, servico, tecnico, valor, cliente_id) VALUES (?, ?, ?, ?, ?, ?, ?)";
            DataType[] values = {
                new DataType(new java.sql.Timestamp(new Date().getTime())),
                new DataType(equipamento),
                new DataType(defeito),
                new DataType(servico),
                new DataType(tecnico),
                new DataType(valor),
                new DataType(cliente_id)
            };
            return DB_Actions.Insert(conn, query, values);
        }
        return false;
    }
    public static boolean UpdateOS(int id, String equipamento, String defeito, String servico, String tecnico, float valor, int cliente_id){
        if(conn.asConnected()){
            String query = "UPDATE ordens_servico SET equipamento=?, defeito=?, servico=?, tecnico=?, valor=?, cliente_id=? WHERE id=?";
            DataType[] values = {
                new DataType(equipamento),
                new DataType(defeito),
                new DataType(servico),
                new DataType(tecnico),
                new DataType(valor),
                new DataType(cliente_id),
                new DataType(id)
            };
            return DB_Actions.Update(conn, query, values);
        }
        return false;
    }
    public static boolean RemoveOS(int id){
        if(conn.asConnected()){
            String query = "DELETE FROM ordens_servico WHERE id=?";
            DataType[] values = {
                new DataType(id)
            };
            return DB_Actions.Delete(conn, query, values);
        }
        return false;
    }
}
