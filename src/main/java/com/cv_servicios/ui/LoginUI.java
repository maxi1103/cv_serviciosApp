/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.cv_servicios.ui;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author maxi
 */
public class LoginUI extends javax.swing.JFrame {

    /**
     * Creates new form LoginUI
     */
    public LoginUI() {
        initComponents();
        
        //pintar(jlabelWelc,"/images/fondo.png");
        //pintar(jLabel2,"/images/logo.png");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jpLogin = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabelPass = new javax.swing.JLabel();
        jLabelUser = new javax.swing.JLabel();
        jTxtPass = new javax.swing.JTextField();
        jBtnEntrar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jPasswordField1 = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        jpWelcome = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlabelWelc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(878, 480));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpLogin.setBackground(new java.awt.Color(255, 255, 255));
        jpLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        jLabel4.setText("Bienvenido");
        jpLogin.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

        jLabelPass.setBackground(new java.awt.Color(0, 0, 0));
        jLabelPass.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabelPass.setText("C");
        jpLogin.add(jLabelPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 228, 24, 31));

        jLabelUser.setBackground(new java.awt.Color(0, 0, 0));
        jLabelUser.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabelUser.setText("U");
        jpLogin.add(jLabelUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 24, 31));

        jTxtPass.setBackground(new java.awt.Color(255, 255, 255));
        jTxtPass.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTxtPass.setForeground(new java.awt.Color(204, 204, 204));
        jTxtPass.setText("Usuario");
        jTxtPass.setBorder(null);
        jTxtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtPassActionPerformed(evt);
            }
        });
        jpLogin.add(jTxtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 190, -1));

        jBtnEntrar.setText("Entrar");
        jBtnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEntrarActionPerformed(evt);
            }
        });
        jpLogin.add(jBtnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 298, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));
        jpLogin.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 190, 10));

        jPasswordField1.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(204, 204, 204));
        jPasswordField1.setText("Contraseña");
        jPasswordField1.setBorder(null);
        jpLogin.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 190, -1));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jpLogin.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 190, 10));

        jPanel1.add(jpLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 610, 500));

        jpWelcome.setBackground(new java.awt.Color(255, 255, 255));
        jpWelcome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Servicios de la");
        jpWelcome.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 290, 30));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Roboto Black", 1, 25)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Construcción");
        jpWelcome.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 290, 30));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Roboto Black", 1, 25)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("CV");
        jpWelcome.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 270, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        jpWelcome.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 290, 100));

        jlabelWelc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/city.png"))); // NOI18N
        jpWelcome.add(jlabelWelc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 500));

        jPanel1.add(jpWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEntrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnEntrarActionPerformed

    private void jTxtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtPassActionPerformed

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
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginUI().setVisible(true);
            }
        });
    }
    private void pintar(JLabel label, String ruta){
        ImageIcon imageIcon= new ImageIcon(getClass().getResource(ruta)); 
        Icon fondo= new ImageIcon(imageIcon.getImage().getScaledInstance(label.getWidth(),label.getHeight(),Image.SCALE_DEFAULT));
        label.setIcon(fondo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelPass;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTxtPass;
    private javax.swing.JLabel jlabelWelc;
    private javax.swing.JPanel jpLogin;
    private javax.swing.JPanel jpWelcome;
    // End of variables declaration//GEN-END:variables
}