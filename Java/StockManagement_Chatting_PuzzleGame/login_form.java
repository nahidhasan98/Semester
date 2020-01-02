package project_sms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class login_form extends javax.swing.JFrame {

    public login_form() {
        initComponents();
        setLocation(145, 190);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton_exit = new javax.swing.JButton();
        jButton_login = new javax.swing.JButton();
        jButton_cutomer_panel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 130));
        setMaximumSize(new java.awt.Dimension(780, 420));
        setMinimumSize(new java.awt.Dimension(780, 420));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("     Store Management System Software");
        jPanel2.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 70));

        jPanel3.setBackground(new java.awt.Color(0, 0, 102));
        jPanel3.setPreferredSize(new java.awt.Dimension(780, 330));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(0, 204, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(0, 204, 0));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("                   Administrator Login");
        jPanel6.add(jLabel3, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 40));

        jPanel7.setBackground(new java.awt.Color(255, 255, 153));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Username :");
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 90, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Password :");
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 90, 30));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel7.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 160, 30));

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel7.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 160, 30));

        jButton_exit.setBackground(new java.awt.Color(153, 153, 255));
        jButton_exit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_exit.setForeground(new java.awt.Color(255, 255, 255));
        jButton_exit.setText("Exit");
        jButton_exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_exit.setFocusPainted(false);
        jButton_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_exitActionPerformed(evt);
            }
        });
        jPanel7.add(jButton_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 145, 100, 40));

        jButton_login.setBackground(new java.awt.Color(153, 153, 255));
        jButton_login.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_login.setForeground(new java.awt.Color(255, 255, 255));
        jButton_login.setText("Login");
        jButton_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_login.setFocusPainted(false);
        jButton_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_loginActionPerformed(evt);
            }
        });
        jPanel7.add(jButton_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 145, 100, 40));

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 380, 210));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 40, 380, 250));

        jButton_cutomer_panel.setBackground(new java.awt.Color(153, 153, 255));
        jButton_cutomer_panel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_cutomer_panel.setForeground(new java.awt.Color(255, 255, 255));
        jButton_cutomer_panel.setText("Customer Panel");
        jButton_cutomer_panel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_cutomer_panel.setFocusPainted(false);
        jButton_cutomer_panel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cutomer_panelActionPerformed(evt);
            }
        });
        jPanel3.add(jButton_cutomer_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(617, 320, 160, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 780, 350));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    main_form main_form_obj=new main_form();
    customer_form customer_form_obj=new customer_form();
    
    private void jButton_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_loginActionPerformed
        String s1=jTextField1.getText().trim();
        String s2=jPasswordField1.getText().trim();

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=SMS;integratedSecurity=true");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select Username, Password from login where Username='"+s1+"' and Password='"+s2+"' ");
            
            if(resultSet.next()){
                this.setVisible(false);
                main_form_obj.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Username and Password not matched. Please try again.");
            }
        }
        catch (Exception e) {  
            e.printStackTrace();  
        }
    }//GEN-LAST:event_jButton_loginActionPerformed
    
    private void jButton_cutomer_panelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cutomer_panelActionPerformed
        this.setVisible(false);
        customer_form_obj.setVisible(true);
    }//GEN-LAST:event_jButton_cutomer_panelActionPerformed

    private void jButton_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton_exitActionPerformed

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
            java.util.logging.Logger.getLogger(login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_cutomer_panel;
    private javax.swing.JButton jButton_exit;
    private javax.swing.JButton jButton_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
