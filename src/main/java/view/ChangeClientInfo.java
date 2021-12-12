/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import table.Client;

/**
 *
 * @author gscoe
 */
public class ChangeClientInfo extends javax.swing.JFrame {

    /**
     * Creates new form ChangeClientInfo
     */
    public ChangeClientInfo() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        conteiner = new java.awt.Panel();
        inputNameClient = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        inputCepClient = new javax.swing.JTextField();
        btnRegisterEnployee = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        inputCpfClient = new javax.swing.JTextField();
        inputPhoneClient = new javax.swing.JTextField();
        inputNumberClient = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        conteiner.setBackground(new java.awt.Color(51, 51, 51));

        inputNameClient.setBackground(new java.awt.Color(51, 51, 51));
        inputNameClient.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        inputNameClient.setForeground(new java.awt.Color(255, 255, 255));
        inputNameClient.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Novo nome:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        inputNameClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNameClientActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 204, 204));
        jLabel2.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Clínica BioTech");
        jLabel2.setToolTipText("");

        inputCepClient.setBackground(new java.awt.Color(51, 51, 51));
        inputCepClient.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        inputCepClient.setForeground(new java.awt.Color(255, 255, 255));
        inputCepClient.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Novo Cep:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        inputCepClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCepClientActionPerformed(evt);
            }
        });

        btnRegisterEnployee.setBackground(new java.awt.Color(0, 204, 255));
        btnRegisterEnployee.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnRegisterEnployee.setForeground(new java.awt.Color(255, 255, 255));
        btnRegisterEnployee.setText("Alterar Dados");
        btnRegisterEnployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterEnployeeActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Alterar dados do paciente");

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Voltar");

        inputCpfClient.setBackground(new java.awt.Color(51, 51, 51));
        inputCpfClient.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        inputCpfClient.setForeground(new java.awt.Color(255, 255, 255));
        inputCpfClient.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Insira aqui o CPF do Paciente ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        inputCpfClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCpfClientActionPerformed(evt);
            }
        });

        inputPhoneClient.setBackground(new java.awt.Color(51, 51, 51));
        inputPhoneClient.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        inputPhoneClient.setForeground(new java.awt.Color(255, 255, 255));
        inputPhoneClient.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Novo Celular:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        inputPhoneClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPhoneClientActionPerformed(evt);
            }
        });

        inputNumberClient.setBackground(new java.awt.Color(51, 51, 51));
        inputNumberClient.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        inputNumberClient.setForeground(new java.awt.Color(255, 255, 255));
        inputNumberClient.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Novo Nº da casa:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        inputNumberClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNumberClientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout conteinerLayout = new javax.swing.GroupLayout(conteiner);
        conteiner.setLayout(conteinerLayout);
        conteinerLayout.setHorizontalGroup(
            conteinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conteinerLayout.createSequentialGroup()
                .addGroup(conteinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(conteinerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(conteinerLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(conteinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputPhoneClient, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(conteinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(conteinerLayout.createSequentialGroup()
                                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnRegisterEnployee, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(inputCepClient, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(inputNameClient, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(inputCpfClient, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(inputNumberClient, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 30, Short.MAX_VALUE)))
                .addContainerGap())
        );
        conteinerLayout.setVerticalGroup(
            conteinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conteinerLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputCpfClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(inputNameClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputCepClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputPhoneClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputNumberClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(conteinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegisterEnployee, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(conteiner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(conteiner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputNameClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNameClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNameClientActionPerformed

    private void inputCepClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCepClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCepClientActionPerformed

    private void btnRegisterEnployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterEnployeeActionPerformed
        
        String inputCpf = inputCpfClient.getText();
        String inputName = inputNameClient.getText();
        String inputPhone = inputPhoneClient.getText();
        String inputCep = inputCepClient.getText();
        String inputNum = inputNumberClient.getText();
        
        Client c = new Client();
        
        c.setCPF_C(inputCpf);
        c.setNAME_C(inputName);
        c.setPHONE_C(inputPhone);
        c.setCEP_C(inputCep);
        c.setNUM_C(inputNum);
        
        try {
            c.UpdateClient();
        } catch (SQLException ex) {
            Logger.getLogger(ChangeClientInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.dispose();
        new EmployeeLogin().setVisible(true);
    }//GEN-LAST:event_btnRegisterEnployeeActionPerformed

    private void inputCpfClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCpfClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCpfClientActionPerformed

    private void inputPhoneClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPhoneClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPhoneClientActionPerformed

    private void inputNumberClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNumberClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNumberClientActionPerformed

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
            java.util.logging.Logger.getLogger(ChangeClientInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeClientInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeClientInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeClientInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangeClientInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRegisterEnployee;
    private java.awt.Panel conteiner;
    private javax.swing.JTextField inputCepClient;
    private javax.swing.JTextField inputCpfClient;
    private javax.swing.JTextField inputNameClient;
    private javax.swing.JTextField inputNumberClient;
    private javax.swing.JTextField inputPhoneClient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
