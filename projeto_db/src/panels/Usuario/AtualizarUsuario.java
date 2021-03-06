/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels.Usuario;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import panels.Cliente.ShowClientes;
import projeto_db.Projeto_DB;

/**
 *
 * @author Mateus
 */
public class AtualizarUsuario extends javax.swing.JPanel {

    /**
     * Creates new form AtualizarUsuario
     */
    
    private int id;
    JDialog jDialog;
    ShowUsuarios showUsuarios;
    
    public AtualizarUsuario() {
        initComponents();
    }
    public AtualizarUsuario(int id_cli, JDialog jd, ShowUsuarios su) {
        initComponents();
        this.id = id_cli;
        this.jDialog = jd;
        this.showUsuarios = su;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        infoLbl = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        senhaInpt = new javax.swing.JPasswordField();
        tellInpt = new javax.swing.JFormattedTextField();
        senhaInptV = new javax.swing.JPasswordField();
        tipoUsr = new javax.swing.JComboBox<>();
        loginInpt = new javax.swing.JTextField();
        cadastrarBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        voltarBtn = new javax.swing.JButton();

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Repetir senha:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Tipo:");

        infoLbl.setForeground(new java.awt.Color(255, 85, 85));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Telefone:");

        senhaInpt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        tellInpt.setColumns(11);
        try {
            tellInpt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tellInpt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        senhaInptV.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        tipoUsr.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tipoUsr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comum", "Administrador" }));

        loginInpt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        cadastrarBtn.setText("Atualizar");
        cadastrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Login:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Senha:");

        voltarBtn.setText("Voltar");
        voltarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cadastrarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(voltarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginInpt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(senhaInpt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(senhaInptV)
                            .addComponent(infoLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tellInpt)
                            .addComponent(tipoUsr, 0, 516, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginInpt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tellInpt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaInpt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaInptV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tipoUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(infoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cadastrarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(voltarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarBtnActionPerformed
        String user = loginInpt.getText();
        String tell = tellInpt.getText();
        String pass = new String(senhaInpt.getPassword());
        String passV = new String(senhaInptV.getPassword());
        String tipo = tipoUsr.getSelectedItem().toString();
        System.out.println(tipo);
        if(user.equals("") || tell.equals("") || pass.equals("") || passV.equals("") || tipo.equals("")){
            infoLbl.setText("A atualização não pode ter campos vazios");
        }else{
            if(pass.equals(passV)){
                infoLbl.setText("");
                String text = "Você tem certeza que deseja atualizar o usuário Nº" + this.id + "?";
                if(JOptionPane.showConfirmDialog(this, text, "Atenção", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                    if(Projeto_DB.UpdateUser(this.id, user, pass, tell, tipo)){
                        senhaInpt.setText("");
                        senhaInptV.setText("");
                        this.showUsuarios.todoList();
                        JOptionPane.showMessageDialog(this, "Usuário atualizado com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(this, "Não foi possível atualizar esse usuário.", "Erro [004]", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }else{
                infoLbl.setText("As senhas não se coincidem");
            }
        }
    }//GEN-LAST:event_cadastrarBtnActionPerformed

    private void voltarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBtnActionPerformed
        this.jDialog.dispose();
    }//GEN-LAST:event_voltarBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarBtn;
    private javax.swing.JLabel infoLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JTextField loginInpt;
    public javax.swing.JPasswordField senhaInpt;
    public javax.swing.JPasswordField senhaInptV;
    public javax.swing.JFormattedTextField tellInpt;
    public javax.swing.JComboBox<String> tipoUsr;
    private javax.swing.JButton voltarBtn;
    // End of variables declaration//GEN-END:variables
}
