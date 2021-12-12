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
public class ChangeDataClient extends javax.swing.JFrame {

    /**
     * Creates new form ChangeDataClient
     */
    public ChangeDataClient() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Container = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inputClientName = new javax.swing.JTextField();
        inputClientNumber = new javax.swing.JTextField();
        inputClientPhone = new javax.swing.JTextField();
        inputClientCep = new javax.swing.JTextField();
        BtnAlterClient = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        inputCpfClient = new javax.swing.JTextField();
        inputClientPassword = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Container.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Clínica BioTech");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Alterar dados cliente");

        inputClientName.setBackground(new java.awt.Color(51, 51, 51));
        inputClientName.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        inputClientName.setForeground(new java.awt.Color(255, 255, 255));
        inputClientName.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Mudar nome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        inputClientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputClientNameActionPerformed(evt);
            }
        });

        inputClientNumber.setBackground(new java.awt.Color(51, 51, 51));
        inputClientNumber.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        inputClientNumber.setForeground(new java.awt.Color(255, 255, 255));
        inputClientNumber.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Mudar N° da Casa:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        inputClientNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputClientNumberActionPerformed(evt);
            }
        });

        inputClientPhone.setBackground(new java.awt.Color(51, 51, 51));
        inputClientPhone.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        inputClientPhone.setForeground(new java.awt.Color(255, 255, 255));
        inputClientPhone.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Mudar celular", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        inputClientPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputClientPhoneActionPerformed(evt);
            }
        });

        inputClientCep.setBackground(new java.awt.Color(51, 51, 51));
        inputClientCep.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        inputClientCep.setForeground(new java.awt.Color(255, 255, 255));
        inputClientCep.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Mudar CEP:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        inputClientCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputClientCepActionPerformed(evt);
            }
        });

        BtnAlterClient.setBackground(new java.awt.Color(0, 204, 255));
        BtnAlterClient.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        BtnAlterClient.setForeground(new java.awt.Color(255, 255, 255));
        BtnAlterClient.setText("Alterar");
        BtnAlterClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAlterClientActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnBack.setText("Voltar");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        inputCpfClient.setBackground(new java.awt.Color(51, 51, 51));
        inputCpfClient.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        inputCpfClient.setForeground(new java.awt.Color(255, 255, 255));
        inputCpfClient.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Insira aqui o seu CPF", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        inputCpfClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCpfClientActionPerformed(evt);
            }
        });

        inputClientPassword.setBackground(new java.awt.Color(51, 51, 51));
        inputClientPassword.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        inputClientPassword.setForeground(new java.awt.Color(255, 255, 255));
        inputClientPassword.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Mudar Senha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        inputClientPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputClientPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContainerLayout = new javax.swing.GroupLayout(Container);
        Container.setLayout(ContainerLayout);
        ContainerLayout.setHorizontalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnAlterClient, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputClientPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputClientCep, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputClientNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputClientPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(inputCpfClient, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputClientName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                        .addContainerGap(20, Short.MAX_VALUE))))
        );
        ContainerLayout.setVerticalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(7, 7, 7)
                .addComponent(inputCpfClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputClientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(inputClientPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputClientPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputClientCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputClientNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnAlterClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 467, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(Container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 519, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Container, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputClientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputClientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputClientNameActionPerformed

    private void inputClientNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputClientNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputClientNumberActionPerformed

    private void inputClientPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputClientPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputClientPhoneActionPerformed

    private void inputClientCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputClientCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputClientCepActionPerformed

    private void BtnAlterClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAlterClientActionPerformed
     
        String inputPass = inputClientPassword.getText();
        String inputCpf = inputCpfClient.getText();
        String inputName = inputClientName.getText();
        String inputPhone = inputClientPhone.getText();
        String inputCep = inputClientCep.getText();
        String inputNum = inputClientNumber.getText();
        
        Client c = new Client();
        c.setPASSWORD_C(inputPass);
        c.setCPF_C(inputCpf);
        c.setNAME_C(inputName);
        c.setPHONE_C(inputPhone);
        c.setCEP_C(inputCep);
        c.setNUM_C(inputNum);
        
        try {
            c.UpdateClient2();
        } catch (SQLException ex) {
            Logger.getLogger(ChangeClientInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.dispose();
        new EmployeeLogin().setVisible(true);
        
    }//GEN-LAST:event_BtnAlterClientActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new ClientScreen().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void inputCpfClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCpfClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCpfClientActionPerformed

    private void inputClientPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputClientPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputClientPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(ChangeDataClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeDataClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeDataClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeDataClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangeDataClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAlterClient;
    private javax.swing.JPanel Container;
    private javax.swing.JButton btnBack;
    private javax.swing.JTextField inputClientCep;
    private javax.swing.JTextField inputClientName;
    private javax.swing.JTextField inputClientNumber;
    private javax.swing.JTextField inputClientPassword;
    private javax.swing.JTextField inputClientPhone;
    private javax.swing.JTextField inputCpfClient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}