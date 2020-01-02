package project_sms;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
//import net.proteanit.sql.DbUtils;

public class customer_form extends javax.swing.JFrame {

    public customer_form() {
        initComponents();
        setLocation(19, 90);
        
        this.addWindowListener (
            new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    int x=JOptionPane.showConfirmDialog(null,"           Confirm Exit?","Confirmation",JOptionPane.YES_NO_OPTION);
                    
                    if(x==JOptionPane.YES_OPTION)
                    {
                        System.exit(0);
                    }
                }
            }
        );

        show_data();
        
        jLabel_product_category.setVisible(false);
        jComboBox_product_category.setVisible(false);
        jLabel_product_name.setVisible(false);
        jTextField_product_name.setVisible(false);
        jLabel_search_ID.setVisible(false);
        jTextField_search_ID.setVisible(false);
        jLabel_search.setVisible(true);
        jLabel_search_by.setVisible(true);
        jComboBox_search_category.setVisible(true);
        
        jButton_view_search.setBackground(new Color(239,243,247));
        jButton_view_search.setForeground(new Color(0,0,0));
        jPanel15.setBackground(new Color(239,243,247));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jButton_view_search = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton_exit = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel_product_name = new javax.swing.JLabel();
        jLabel_product_category = new javax.swing.JLabel();
        jTextField_product_name = new javax.swing.JTextField();
        jComboBox_product_category = new javax.swing.JComboBox<>();
        jButton_order = new javax.swing.JButton();
        jLabel_search = new javax.swing.JLabel();
        jLabel_search_by = new javax.swing.JLabel();
        jComboBox_search_category = new javax.swing.JComboBox<>();
        jLabel_search_ID = new javax.swing.JLabel();
        jTextField_search_ID = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setLocation(new java.awt.Point(172, 90));
        setMaximumSize(new java.awt.Dimension(1020, 564));
        setMinimumSize(new java.awt.Dimension(1020, 564));
        setPreferredSize(new java.awt.Dimension(1020, 564));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1020, 533));
        jPanel1.setMinimumSize(new java.awt.Dimension(1020, 533));
        jPanel1.setPreferredSize(new java.awt.Dimension(1020, 533));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("         Menu");
        jPanel2.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 35));

        jPanel3.setBackground(new java.awt.Color(153, 0, 0));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("                                                                       WorkSpace");
        jPanel3.add(jLabel2, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 880, 35));

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setPreferredSize(new java.awt.Dimension(140, 64));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jButton_view_search.setBackground(new java.awt.Color(153, 153, 255));
        jButton_view_search.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_view_search.setForeground(new java.awt.Color(255, 255, 255));
        jButton_view_search.setText("View/Search");
        jButton_view_search.setBorderPainted(false);
        jButton_view_search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_view_search.setFocusPainted(false);
        jButton_view_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_view_searchActionPerformed(evt);
            }
        });
        jPanel8.add(jButton_view_search, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel9.setPreferredSize(new java.awt.Dimension(140, 64));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jButton_exit.setBackground(new java.awt.Color(153, 153, 255));
        jButton_exit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_exit.setForeground(new java.awt.Color(255, 255, 255));
        jButton_exit.setText("Exit");
        jButton_exit.setBorderPainted(false);
        jButton_exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_exit.setFocusPainted(false);
        jButton_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_exitActionPerformed(evt);
            }
        });
        jPanel9.add(jButton_exit, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 435, 140, -1));

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(140, 26));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 140, -1));

        jPanel7.setBackground(new java.awt.Color(204, 204, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(140, 26));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 256, 140, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 35, 140, 500));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_product_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_product_name.setText("Product Name :");
        jPanel15.add(jLabel_product_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 110, 36));

        jLabel_product_category.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_product_category.setText("Product Category :");
        jPanel15.add(jLabel_product_category, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, 36));

        jTextField_product_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField_product_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_product_nameKeyReleased(evt);
            }
        });
        jPanel15.add(jTextField_product_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 160, 151, 36));

        jComboBox_product_category.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox_product_category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laptop", "Mobile", "Tablet", "Pen Drive", "Keyboard", "Mouse", "Headphone", "Sound System", "Others" }));
        jComboBox_product_category.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBox_product_category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_product_categoryActionPerformed(evt);
            }
        });
        jPanel15.add(jComboBox_product_category, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 210, 151, 36));

        jButton_order.setBackground(new java.awt.Color(153, 153, 255));
        jButton_order.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_order.setForeground(new java.awt.Color(255, 255, 255));
        jButton_order.setText("Place An Order");
        jButton_order.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_order.setFocusPainted(false);
        jButton_order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_orderActionPerformed(evt);
            }
        });
        jPanel15.add(jButton_order, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 180, 40));

        jLabel_search.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_search.setText("Search Item:");
        jPanel15.add(jLabel_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 120, 30));

        jLabel_search_by.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_search_by.setText("Search By :");
        jPanel15.add(jLabel_search_by, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 110, 36));

        jComboBox_search_category.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox_search_category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select An Option", "- - - - - -", "Product ID", "Product Name", "Category" }));
        jComboBox_search_category.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBox_search_category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_search_categoryActionPerformed(evt);
            }
        });
        jPanel15.add(jComboBox_search_category, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 110, 151, 36));

        jLabel_search_ID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_search_ID.setText("Product ID :");
        jPanel15.add(jLabel_search_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 110, 36));

        jTextField_search_ID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField_search_ID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_search_IDKeyReleased(evt);
            }
        });
        jPanel15.add(jTextField_search_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 160, 151, 36));

        jPanel5.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 500));

        jPanel16.setBackground(new java.awt.Color(204, 204, 0));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel17.setBackground(new java.awt.Color(255, 204, 204));
        jPanel17.setLayout(new java.awt.BorderLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("                                          Displaying Data");
        jPanel17.add(jLabel7, java.awt.BorderLayout.CENTER);

        jPanel16.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 40));

        jPanel18.setBackground(new java.awt.Color(0, 153, 153));
        jPanel18.setLayout(new java.awt.BorderLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel18.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel16.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 560, 470));

        jPanel5.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 560, 500));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 35, 880, 500));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    public void show_data(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=SMS;integratedSecurity=true");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from Products");
            
            //jTable1.setModel(DbUtils.resultSetToTableModel(resultSet));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    chatting_form chatting_form_obj=new chatting_form();
    puzzle_form puzzle_form_obj=new puzzle_form();

    private void jButton_view_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_view_searchActionPerformed
        jLabel_product_category.setVisible(false);
        jComboBox_product_category.setVisible(false);
        jLabel_product_name.setVisible(false);
        jTextField_product_name.setVisible(false);
        jLabel_search_ID.setVisible(false);
        jTextField_search_ID.setVisible(false);
        jLabel_search.setVisible(true);
        jLabel_search_by.setVisible(true);
        jComboBox_search_category.setVisible(true);
        jLabel_search_ID.setVisible(true);
        jTextField_search_ID.setVisible(true);
        
        jButton_view_search.setBackground(new Color(239,243,247));
        jButton_view_search.setForeground(new Color(0,0,0));
        jPanel15.setBackground(new Color(239,243,247));
        
        jComboBox_search_category.setSelectedIndex(0);
        show_data();
    }//GEN-LAST:event_jButton_view_searchActionPerformed

    private void jButton_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_exitActionPerformed
        jButton_view_search.setBackground(new Color(153,153,255));
        jButton_view_search.setForeground(new Color(255,255,255));

        jButton_exit.setBackground(new Color(239,243,247));
        jButton_exit.setForeground(new Color(0,0,0));
        jPanel15.setBackground(new Color(239,243,247));

        System.exit(0);
    }//GEN-LAST:event_jButton_exitActionPerformed

    private void jComboBox_search_categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_search_categoryActionPerformed
        if(jComboBox_search_category.getSelectedIndex()==0 || jComboBox_search_category.getSelectedIndex()==1)
        {
            jLabel_search_ID.setVisible(false);
            jTextField_search_ID.setVisible(false);

            show_data();
        }
        else if(jComboBox_search_category.getSelectedIndex()==2)
        {
            jLabel_search_ID.setVisible(true);
            jTextField_search_ID.setVisible(true);
            jLabel_product_name.setVisible(false);
            jTextField_product_name.setVisible(false);
            jLabel_product_category.setVisible(false);
            jComboBox_product_category.setVisible(false);

            show_data();
        }
        else if(jComboBox_search_category.getSelectedIndex()==3)
        {
            jLabel_product_name.setVisible(true);
            jTextField_product_name.setVisible(true);
            jLabel_search_ID.setVisible(false);
            jTextField_search_ID.setVisible(false);
            jLabel_product_category.setVisible(false);
            jComboBox_product_category.setVisible(false);

            show_data();
        }
        else if(jComboBox_search_category.getSelectedIndex()==4)
        {
            jLabel_search_ID.setVisible(false);
            jTextField_search_ID.setVisible(false);
            jLabel_product_name.setVisible(false);
            jTextField_product_name.setVisible(false);
            jLabel_product_category.setVisible(true);
            jComboBox_product_category.setVisible(true);

            show_data();
        }
    }//GEN-LAST:event_jComboBox_search_categoryActionPerformed

    private void jTextField_search_IDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_search_IDKeyReleased
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=SMS;integratedSecurity=true");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from Products where Product_ID like '"+jTextField_search_ID.getText()+"%'");

            //jTable1.setModel(DbUtils.resultSetToTableModel(resultSet));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jTextField_search_IDKeyReleased

    private void jTextField_product_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_product_nameKeyReleased
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=SMS;integratedSecurity=true");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from Products where Product_Name like '"+jTextField_product_name.getText()+"%'");

            //jTable1.setModel(DbUtils.resultSetToTableModel(resultSet));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jTextField_product_nameKeyReleased

    private void jComboBox_product_categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_product_categoryActionPerformed
        try{
            jTextField_product_name.setText("");

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=SMS;integratedSecurity=true");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from Products where Category='"+jComboBox_product_category.getSelectedItem()+"'");

            //jTable1.setModel(DbUtils.resultSetToTableModel(resultSet));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jComboBox_product_categoryActionPerformed

    private void jButton_orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_orderActionPerformed
        JOptionPane.showMessageDialog(null,"This feature will come soon...!!!");
    }//GEN-LAST:event_jButton_orderActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(customer_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customer_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customer_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customer_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customer_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_exit;
    private javax.swing.JButton jButton_order;
    private javax.swing.JButton jButton_view_search;
    private javax.swing.JComboBox<String> jComboBox_product_category;
    private javax.swing.JComboBox<String> jComboBox_search_category;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_product_category;
    private javax.swing.JLabel jLabel_product_name;
    private javax.swing.JLabel jLabel_search;
    private javax.swing.JLabel jLabel_search_ID;
    private javax.swing.JLabel jLabel_search_by;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_product_name;
    private javax.swing.JTextField jTextField_search_ID;
    // End of variables declaration//GEN-END:variables

}
