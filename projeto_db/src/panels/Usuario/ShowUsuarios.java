/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels.Usuario;

import forms.Dashboard;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import panels.Cliente.AtualizarCliente;
import projeto_db.Projeto_DB;
import projeto_db.User;

/**
 *
 * @author Mateus
 */
public class ShowUsuarios extends javax.swing.JPanel {

    /**
     * Creates new form ShowUsr
     */
    
    Dashboard dboard;
    JDialog jDialog;
    public ShowUsuarios() {
        initComponents();
    }
    public ShowUsuarios(ArrayList<User> u, Dashboard d, JDialog jd) {
        initComponents();
        this.dboard = d;
        this.jDialog = jd;
        DefaultTableModel model = (DefaultTableModel) usrTable.getModel();
        for (int i = 0; i < u.size(); i++) {
            model.addRow(new Object[]{
                u.get(i).getId(),
                u.get(i).getTipo(),
                u.get(i).getLogin(),
                u.get(i).getTell()
            });
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        atualizarBtn = new javax.swing.JButton();
        excluirBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        usrTable = new javax.swing.JTable();
        todosBtn = new javax.swing.JButton();
        pesquisarBtn = new javax.swing.JButton();
        termoInpt = new javax.swing.JTextField();
        colunaInpt = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        atualizarBtn.setText("Atualizar");
        atualizarBtn.setEnabled(false);
        atualizarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarBtnActionPerformed(evt);
            }
        });

        excluirBtn.setText("Excluir");
        excluirBtn.setEnabled(false);
        excluirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirBtnActionPerformed(evt);
            }
        });

        usrTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        usrTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tipo", "Login", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        usrTable.setRowHeight(25);
        usrTable.getTableHeader().setReorderingAllowed(false);
        usrTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usrTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(usrTable);

        todosBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        todosBtn.setText("TODOS");
        todosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todosBtnActionPerformed(evt);
            }
        });

        pesquisarBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        pesquisarBtn.setText("Pesquisar");
        pesquisarBtn.setToolTipText("");
        pesquisarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarBtnActionPerformed(evt);
            }
        });

        termoInpt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        colunaInpt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        colunaInpt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Tipo", "Login", "Telefone" }));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Coluna:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Termo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(colunaInpt, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(termoInpt, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pesquisarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(todosBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(excluirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(atualizarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(colunaInpt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(termoInpt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pesquisarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(todosBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(excluirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atualizarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void todosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todosBtnActionPerformed
        todoList();
    }//GEN-LAST:event_todosBtnActionPerformed

    private void pesquisarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarBtnActionPerformed
        usrTable.clearSelection();
        excluirBtn.setEnabled(false);
        atualizarBtn.setEnabled(false);
        if(!termoInpt.getText().equals("")){
            ArrayList<User> u = null;
            if(colunaInpt.getSelectedItem() == "ID"){
                try{
                    u = Projeto_DB.GetUsers("WHERE id LIKE '%" + Integer.parseInt(termoInpt.getText()) + "%'");
                } catch(Exception ex){
                    System.out.println(ex.getMessage());
                }
            } else if(colunaInpt.getSelectedItem() == "Tipo"){
                u = Projeto_DB.GetUsers("WHERE tipo LIKE '%" + termoInpt.getText().replaceAll("/", "-") + "%'");
            } else if(colunaInpt.getSelectedItem() == "Login"){
                u = Projeto_DB.GetUsers("WHERE login LIKE '%" + termoInpt.getText() + "%'");
            } else if(colunaInpt.getSelectedItem() == "Telefone"){
                u = Projeto_DB.GetUsers("WHERE telefone LIKE '%" + termoInpt.getText() + "%'");
            } 

            if(u != null){
                DefaultTableModel model = (DefaultTableModel) usrTable.getModel();
                model.setRowCount(0);
                for (int i = 0; i < u.size(); i++) {
                    model.addRow(new Object[]{
                        u.get(i).getId(),
                        u.get(i).getTipo(),
                        u.get(i).getLogin(),
                        u.get(i).getTell()
                    });
                }
            }
        } else {
            todoList();
        }
    }//GEN-LAST:event_pesquisarBtnActionPerformed

    private void usrTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usrTableMouseClicked
        int index = usrTable.getSelectedRow();
        if(index != -1){
            excluirBtn.setEnabled(true);
            atualizarBtn.setEnabled(true);
        }
    }//GEN-LAST:event_usrTableMouseClicked

    private void excluirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirBtnActionPerformed
        TableModel model = usrTable.getModel();
        int index = usrTable.getSelectedRow();
        if(index != -1){
            String text = "Você tem certeza que deseja apagar o Usuário Nº" + model.getValueAt(index, 0) + "?";
            if(JOptionPane.showConfirmDialog(this.dboard, text, "Atenção", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                if(Projeto_DB.RemoveUser((int) model.getValueAt(index, 0))){
                    JOptionPane.showMessageDialog(this, "Usuário removido com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    todoList();
                }else{
                    JOptionPane.showMessageDialog(this, "Não foi possível remover esse Usuário.", "Erro [007]", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_excluirBtnActionPerformed

    public void todoList(){
        usrTable.clearSelection();
        excluirBtn.setEnabled(false);
        atualizarBtn.setEnabled(false);
        ArrayList<User> u = Projeto_DB.GetUsers();
        DefaultTableModel model = (DefaultTableModel) usrTable.getModel();
        model.setRowCount(0);
        for (int i = 0; i < u.size(); i++) {
            model.addRow(new Object[]{
                u.get(i).getId(),
                u.get(i).getTipo(),
                u.get(i).getLogin(),
                u.get(i).getTell()
            });
        }
    }
    
    private void atualizarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarBtnActionPerformed
        TableModel model = usrTable.getModel();
        int index = usrTable.getSelectedRow();
        if(index != -1){
            JDialog d = new JDialog(this.jDialog, "Atualizar Usuário", true);
            AtualizarUsuario atuUsr = new AtualizarUsuario((int) model.getValueAt(index, 0), d, this);
            atuUsr.loginInpt.setText((String) model.getValueAt(index, 2));
            atuUsr.tellInpt.setText((String) model.getValueAt(index, 3));
            atuUsr.tipoUsr.setSelectedItem((String) model.getValueAt(index, 1));
            d.getContentPane().add(atuUsr);
            d.pack();
            d.setLocationRelativeTo(this);
            d.setVisible(true);
        }
    }//GEN-LAST:event_atualizarBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizarBtn;
    private javax.swing.JComboBox<String> colunaInpt;
    private javax.swing.JButton excluirBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pesquisarBtn;
    private javax.swing.JTextField termoInpt;
    private javax.swing.JButton todosBtn;
    private javax.swing.JTable usrTable;
    // End of variables declaration//GEN-END:variables
}
