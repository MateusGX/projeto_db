/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package forms;

import panels.Cliente.CriarCliente;
import panels.OrdemServico.CriarOS;
import panels.Usuario.CriarUsuario;
import java.awt.Dialog;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import panels.*;
import panels.Cliente.ShowClientes;
import panels.OrdemServico.ShowOS;
import panels.Usuario.ShowUsuarios;
import panels.relatorio.GerarRelatorio;
import projeto_db.*;

/**
 *
 * @author Mateus
 */
public class Dashboard extends javax.swing.JFrame {

    private Login loginForm = null;
    
    public Dashboard() {
        initComponents();
    }
    
    public Dashboard(Login loginForm, String userType) {
        initComponents();
        this.loginForm = loginForm;
        if(!userType.equals("Administrador")){
            menuRelatorio.setEnabled(false);
            subUsuario.setEnabled(false);
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuMain = new javax.swing.JMenuBar();
        menuSistema = new javax.swing.JMenu();
        subOrdem = new javax.swing.JMenu();
        itemCriOrd = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        itemGenOrd = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        subCliente = new javax.swing.JMenu();
        itemCriCli = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        itemGenCli = new javax.swing.JMenuItem();
        subUsuario = new javax.swing.JMenu();
        itemCriUsr = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        itemGenUsr = new javax.swing.JMenuItem();
        menuRelatorio = new javax.swing.JMenu();
        itemGerRel = new javax.swing.JMenuItem();
        menuOpcoes = new javax.swing.JMenu();
        itemOptSair = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        itemLic = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        menuSistema.setText("Sistema");

        subOrdem.setText("Ordem");

        itemCriOrd.setText("Criar Ordem");
        itemCriOrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCriOrdActionPerformed(evt);
            }
        });
        subOrdem.add(itemCriOrd);
        subOrdem.add(jSeparator2);

        itemGenOrd.setText("Gerênciar Ordens");
        itemGenOrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemGenOrdActionPerformed(evt);
            }
        });
        subOrdem.add(itemGenOrd);

        menuSistema.add(subOrdem);
        menuSistema.add(jSeparator1);

        subCliente.setText("Cliente");

        itemCriCli.setText("Criar Cliente");
        itemCriCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCriCliActionPerformed(evt);
            }
        });
        subCliente.add(itemCriCli);
        subCliente.add(jSeparator3);

        itemGenCli.setText("Gerênciar Clientes");
        itemGenCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemGenCliActionPerformed(evt);
            }
        });
        subCliente.add(itemGenCli);

        menuSistema.add(subCliente);

        subUsuario.setText("Usuário");

        itemCriUsr.setText("Criar Usuário");
        itemCriUsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCriUsrActionPerformed(evt);
            }
        });
        subUsuario.add(itemCriUsr);
        subUsuario.add(jSeparator4);

        itemGenUsr.setText("Gerênciar Usuários");
        itemGenUsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemGenUsrActionPerformed(evt);
            }
        });
        subUsuario.add(itemGenUsr);

        menuSistema.add(subUsuario);

        menuMain.add(menuSistema);

        menuRelatorio.setText("Relatório");

        itemGerRel.setText("Gerar");
        itemGerRel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemGerRelActionPerformed(evt);
            }
        });
        menuRelatorio.add(itemGerRel);

        menuMain.add(menuRelatorio);

        menuOpcoes.setText("Opções");

        itemOptSair.setText("Sair");
        itemOptSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemOptSairActionPerformed(evt);
            }
        });
        menuOpcoes.add(itemOptSair);

        menuMain.add(menuOpcoes);

        menuAjuda.setText("Ajuda");

        itemLic.setText("Licença");
        itemLic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemLicActionPerformed(evt);
            }
        });
        menuAjuda.add(itemLic);

        menuMain.add(menuAjuda);

        setJMenuBar(menuMain);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1116, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 613, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        if(loginForm != null){
            loginForm.setVisible(true);
        }
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if(JOptionPane.showConfirmDialog(this, "Você deseja realmente sair?", "Atenção", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            this.dispose();
        }
    }//GEN-LAST:event_formWindowClosing

    private void itemOptSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemOptSairActionPerformed
        if(JOptionPane.showConfirmDialog(this, "Você deseja realmente sair?", "Atenção", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            this.dispose();
        }
    }//GEN-LAST:event_itemOptSairActionPerformed

    private void itemLicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemLicActionPerformed
        Sobre ajuda = new Sobre();
        JDialog d = new JDialog(this, "Licença", true);
        d.getContentPane().add(ajuda);
        d.pack();
        d.setLocationRelativeTo(this);
        d.setVisible(true);
    }//GEN-LAST:event_itemLicActionPerformed

    private void itemCriUsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCriUsrActionPerformed
        CriarUsuario cadUsr = new CriarUsuario();
        JDialog d = new JDialog(this, "Cadastrar Usuário", true);
        d.getContentPane().add(cadUsr);
        d.pack();
        d.setLocationRelativeTo(this);
        d.setVisible(true);
    }//GEN-LAST:event_itemCriUsrActionPerformed

    private void itemCriCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCriCliActionPerformed
        CriarCliente cadClient = new CriarCliente();
        JDialog d = new JDialog(this, "Cadastrar Cliente", true);
        d.getContentPane().add(cadClient);
        d.pack();
        d.setLocationRelativeTo(this);
        d.setVisible(true);
    }//GEN-LAST:event_itemCriCliActionPerformed

    private void itemCriOrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCriOrdActionPerformed
        
        ArrayList<Client> c = Projeto_DB.GetClients();
        if(c != null){
            if(c.size() >= 1){
                CriarOS cadOS = new CriarOS(c);
                JDialog d = new JDialog(this, "Cadastrar Ordem de Serviço", true);
                d.getContentPane().add(cadOS);
                d.pack();
                d.setLocationRelativeTo(this);
                d.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Não foram encontrados clientes para realizar essa ação.", "Sem Clientes", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_itemCriOrdActionPerformed

    private void itemGenOrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemGenOrdActionPerformed
        JDialog d = new JDialog(this, "Ordens de Serviço", true);
        ShowOS showOS = new ShowOS(Projeto_DB.GetOS(), Projeto_DB.GetClients(), this, d);
        d.getContentPane().add(showOS);
        d.pack();
        d.setLocationRelativeTo(this);
        d.setVisible(true);
    }//GEN-LAST:event_itemGenOrdActionPerformed

    private void itemGenUsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemGenUsrActionPerformed
        JDialog d = new JDialog(this, "Usuários", true);
        ShowUsuarios showUsuarios = new ShowUsuarios(Projeto_DB.GetUsers(), this, d);
        d.getContentPane().add(showUsuarios);
        d.pack();
        d.setLocationRelativeTo(this);
        d.setVisible(true);
    }//GEN-LAST:event_itemGenUsrActionPerformed

    private void itemGenCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemGenCliActionPerformed
        JDialog d = new JDialog(this, "Clientes", true);
        ShowClientes showUsuarios = new ShowClientes(Projeto_DB.GetClients(), this, d);
        d.getContentPane().add(showUsuarios);
        d.pack();
        d.setLocationRelativeTo(this);
        d.setVisible(true);
    }//GEN-LAST:event_itemGenCliActionPerformed

    private void itemGerRelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemGerRelActionPerformed
        JDialog d = new JDialog(this, "Gerar Relatório", true);
        GerarRelatorio showGR = new GerarRelatorio(this, d);
        d.getContentPane().add(showGR);
        d.pack();
        d.setLocationRelativeTo(this);
        d.setVisible(true);
    }//GEN-LAST:event_itemGerRelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemCriCli;
    private javax.swing.JMenuItem itemCriOrd;
    private javax.swing.JMenuItem itemCriUsr;
    private javax.swing.JMenuItem itemGenCli;
    private javax.swing.JMenuItem itemGenOrd;
    private javax.swing.JMenuItem itemGenUsr;
    private javax.swing.JMenuItem itemGerRel;
    private javax.swing.JMenuItem itemLic;
    private javax.swing.JMenuItem itemOptSair;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenuBar menuMain;
    private javax.swing.JMenu menuOpcoes;
    private javax.swing.JMenu menuRelatorio;
    private javax.swing.JMenu menuSistema;
    private javax.swing.JMenu subCliente;
    private javax.swing.JMenu subOrdem;
    private javax.swing.JMenu subUsuario;
    // End of variables declaration//GEN-END:variables

}
