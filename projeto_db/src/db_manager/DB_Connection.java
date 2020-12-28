/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_manager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Mateus
 */
public class DB_Connection {
    
    private Connection conn;
    private boolean error = false;
    private boolean connBoolean = false;
    private String errorStr = "";
    public DB_Connection(String host, int port, String user, String pass, String database, boolean useSSL){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = String.format("jdbc:mysql://%s:%d/%s?useSSL=%s&useTimezone=true&serverTimezone=UTC&autoReconnect=true", host, port, database, (useSSL?"true":"false"));
            conn = DriverManager.getConnection(url, user, pass);
            if(conn != null){
                connBoolean = true;
            }else{
                connBoolean = false;
            }
        } catch (ClassNotFoundException | SQLException ex) {
            error = true;
            errorStr = ex.getMessage();
        }
    }
    
    public boolean asError(){
        return error;
    }
    
    public String ErrorMsg(){
        return errorStr;
    }
    
    public boolean asConnected(){
        return connBoolean;
    }
    
    public Connection getConn(){
        return conn;
    }
}
