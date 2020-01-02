package project_sms;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//import net.proteanit.sql.DbUtils;

public class main_form extends javax.swing.JFrame {

    public main_form() {
        initComponents();
        setLocation(19, 90);
        
        this.addWindowListener (
            new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    JOptionPane.showMessageDialog(null,"      Please Logout First.");
                }
            }
        );
        
        show_data();
        
        jLabel_insert_item.setVisible(false);
        jLabel_delete_item.setVisible(false);
        jLabel_update_item.setVisible(false);
        jButton_delete_2.setVisible(false);
        jPanel20.setVisible(false);
        jLabel_product_id.setVisible(false);
        jTextField_product_id.setVisible(false);
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
        jPanel20.setBackground(new Color(239,243,247));
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
        jButton_logout = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton_insert = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jButton_update = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jButton_delete = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jButton_chat = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jButton_take_a_break = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel_search = new javax.swing.JLabel();
        jLabel_product_id = new javax.swing.JLabel();
        jLabel_product_name = new javax.swing.JLabel();
        jLabel_product_category = new javax.swing.JLabel();
        jTextField_product_name = new javax.swing.JTextField();
        jComboBox_product_category = new javax.swing.JComboBox<>();
        jPanel20 = new javax.swing.JPanel();
        jLabel_stock_quantity = new javax.swing.JLabel();
        jLabel_unit_price = new javax.swing.JLabel();
        jTextField_unit_price = new javax.swing.JTextField();
        jTextField_stock_quantity = new javax.swing.JTextField();
        jButton_update_2 = new javax.swing.JButton();
        jButton_insert_2 = new javax.swing.JButton();
        jLabel_insert_item = new javax.swing.JLabel();
        jLabel_delete_item = new javax.swing.JLabel();
        jLabel_update_item = new javax.swing.JLabel();
        jButton_delete_2 = new javax.swing.JButton();
        jTextField_product_id = new javax.swing.JTextField();
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

        jButton_logout.setBackground(new java.awt.Color(153, 153, 255));
        jButton_logout.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_logout.setForeground(new java.awt.Color(255, 255, 255));
        jButton_logout.setText("Log Out");
        jButton_logout.setBorderPainted(false);
        jButton_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_logout.setFocusPainted(false);
        jButton_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_logoutActionPerformed(evt);
            }
        });
        jPanel9.add(jButton_logout, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 435, 140, -1));

        jPanel10.setPreferredSize(new java.awt.Dimension(140, 64));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jButton_insert.setBackground(new java.awt.Color(153, 153, 255));
        jButton_insert.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_insert.setForeground(new java.awt.Color(255, 255, 255));
        jButton_insert.setText("Insert");
        jButton_insert.setBorderPainted(false);
        jButton_insert.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_insert.setFocusPainted(false);
        jButton_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_insertActionPerformed(evt);
            }
        });
        jPanel10.add(jButton_insert, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 66, 140, -1));

        jPanel11.setPreferredSize(new java.awt.Dimension(140, 64));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jButton_update.setBackground(new java.awt.Color(153, 153, 255));
        jButton_update.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_update.setForeground(new java.awt.Color(255, 255, 255));
        jButton_update.setText("Update");
        jButton_update.setBorderPainted(false);
        jButton_update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_update.setFocusPainted(false);
        jButton_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_updateActionPerformed(evt);
            }
        });
        jPanel11.add(jButton_update, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 132, 140, -1));

        jPanel12.setPreferredSize(new java.awt.Dimension(140, 64));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jButton_delete.setBackground(new java.awt.Color(153, 153, 255));
        jButton_delete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_delete.setForeground(new java.awt.Color(255, 255, 255));
        jButton_delete.setText("Delete");
        jButton_delete.setBorderPainted(false);
        jButton_delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_delete.setFocusPainted(false);
        jButton_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_deleteActionPerformed(evt);
            }
        });
        jPanel12.add(jButton_delete, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 198, 140, -1));

        jPanel13.setPreferredSize(new java.awt.Dimension(140, 64));
        jPanel13.setLayout(new java.awt.BorderLayout());

        jButton_chat.setBackground(new java.awt.Color(153, 153, 255));
        jButton_chat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_chat.setForeground(new java.awt.Color(255, 255, 255));
        jButton_chat.setText("Chat");
        jButton_chat.setBorderPainted(false);
        jButton_chat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_chat.setFocusPainted(false);
        jButton_chat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_chatActionPerformed(evt);
            }
        });
        jPanel13.add(jButton_chat, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 283, 140, -1));

        jPanel14.setPreferredSize(new java.awt.Dimension(140, 64));
        jPanel14.setLayout(new java.awt.BorderLayout());

        jButton_take_a_break.setBackground(new java.awt.Color(153, 153, 255));
        jButton_take_a_break.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_take_a_break.setForeground(new java.awt.Color(255, 255, 255));
        jButton_take_a_break.setText("Take A Break");
        jButton_take_a_break.setBorderPainted(false);
        jButton_take_a_break.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_take_a_break.setFocusPainted(false);
        jButton_take_a_break.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_take_a_breakActionPerformed(evt);
            }
        });
        jPanel14.add(jButton_take_a_break, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 349, 140, -1));

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

        jLabel_search.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_search.setText("Search Item:");
        jPanel15.add(jLabel_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 120, 30));

        jLabel_product_id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_product_id.setText("Product ID :");
        jPanel15.add(jLabel_product_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 110, 36));

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

        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_stock_quantity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_stock_quantity.setText("Stock Quantity :");
        jPanel20.add(jLabel_stock_quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 130, 36));

        jLabel_unit_price.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_unit_price.setText("Unit Price :");
        jPanel20.add(jLabel_unit_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 90, 36));

        jTextField_unit_price.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel20.add(jTextField_unit_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 0, 151, 36));

        jTextField_stock_quantity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel20.add(jTextField_stock_quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 50, 151, 36));

        jButton_update_2.setBackground(new java.awt.Color(153, 153, 255));
        jButton_update_2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_update_2.setForeground(new java.awt.Color(255, 255, 255));
        jButton_update_2.setText("Update");
        jButton_update_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_update_2.setFocusPainted(false);
        jButton_update_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_update_2ActionPerformed(evt);
            }
        });
        jPanel20.add(jButton_update_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 115, 110, 40));

        jButton_insert_2.setBackground(new java.awt.Color(153, 153, 255));
        jButton_insert_2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_insert_2.setForeground(new java.awt.Color(255, 255, 255));
        jButton_insert_2.setText("Insert");
        jButton_insert_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_insert_2.setFocusPainted(false);
        jButton_insert_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_insert_2ActionPerformed(evt);
            }
        });
        jPanel20.add(jButton_insert_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 115, 110, 40));

        jPanel15.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 320, 180));

        jLabel_insert_item.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_insert_item.setText("Insert Item:");
        jPanel15.add(jLabel_insert_item, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 130, 30));

        jLabel_delete_item.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_delete_item.setText("Delete Item:");
        jPanel15.add(jLabel_delete_item, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, 30));
        jLabel_delete_item.getAccessibleContext().setAccessibleName("");

        jLabel_update_item.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_update_item.setText("Update Item:");
        jPanel15.add(jLabel_update_item, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, 30));

        jButton_delete_2.setBackground(new java.awt.Color(153, 153, 255));
        jButton_delete_2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_delete_2.setForeground(new java.awt.Color(255, 255, 255));
        jButton_delete_2.setText("Delete");
        jButton_delete_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_delete_2.setFocusPainted(false);
        jButton_delete_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_delete_2ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton_delete_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 110, 40));

        jTextField_product_id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField_product_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_product_idKeyReleased(evt);
            }
        });
        jPanel15.add(jTextField_product_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 110, 151, 36));

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

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Product ID", "Product Name", "Category", "Unit Price", "Stock Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setFocusable(false);
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel18.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel16.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 560, 470));

        jPanel5.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 560, 500));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 35, 880, 500));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    String menu="search";
    
    public void clear_field(){
        jTextField_product_id.setText("");
        jTextField_product_name.setText("");
        jComboBox_product_category.setSelectedItem("Laptop");
        jTextField_stock_quantity.setText("");
        jTextField_unit_price.setText("");
    }
    
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

    private void jButton_chatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_chatActionPerformed
        jButton_view_search.setBackground(new Color(153,153,255));
        jButton_view_search.setForeground(new Color(255,255,255));
        jButton_insert.setBackground(new Color(153,153,255));
        jButton_insert.setForeground(new Color(255,255,255));
        jButton_update.setBackground(new Color(153,153,255));
        jButton_update.setForeground(new Color(255,255,255));
        jButton_delete.setBackground(new Color(153,153,255));
        jButton_delete.setForeground(new Color(255,255,255));
        jButton_take_a_break.setBackground(new Color(153,153,255));
        jButton_take_a_break.setForeground(new Color(255,255,255));
        jButton_logout.setBackground(new Color(153,153,255));
        jButton_logout.setForeground(new Color(255,255,255));
        
        jButton_chat.setBackground(new Color(239,243,247));
        jButton_chat.setForeground(new Color(0,0,0));
        jPanel15.setBackground(new Color(239,243,247));
        jPanel20.setBackground(new Color(239,243,247));
        
        chatting_form_obj.setVisible(true);
    }//GEN-LAST:event_jButton_chatActionPerformed

    private void jButton_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_logoutActionPerformed
        menu="logout";
        
        jButton_view_search.setBackground(new Color(153,153,255));
        jButton_view_search.setForeground(new Color(255,255,255));
        jButton_insert.setBackground(new Color(153,153,255));
        jButton_insert.setForeground(new Color(255,255,255));
        jButton_update.setBackground(new Color(153,153,255));
        jButton_update.setForeground(new Color(255,255,255));
        jButton_delete.setBackground(new Color(153,153,255));
        jButton_delete.setForeground(new Color(255,255,255));
        jButton_chat.setBackground(new Color(153,153,255));
        jButton_chat.setForeground(new Color(255,255,255));
        jButton_take_a_break.setBackground(new Color(153,153,255));
        jButton_take_a_break.setForeground(new Color(255,255,255));
        
        jButton_logout.setBackground(new Color(239,243,247));
        jButton_logout.setForeground(new Color(0,0,0));
        jPanel15.setBackground(new Color(239,243,247));
        jPanel20.setBackground(new Color(239,243,247));
        
        this.setVisible(false);
        puzzle_form_obj.setVisible(false);
        chatting_form_obj.setVisible(false);
        new login_form().setVisible(true);
    }//GEN-LAST:event_jButton_logoutActionPerformed

    private void jButton_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_insertActionPerformed
        menu="insert";
        
        jLabel_search.setVisible(false);
        jLabel_delete_item.setVisible(false);
        jLabel_update_item.setVisible(false);
        jButton_delete_2.setVisible(false);
        jButton_update_2.setVisible(false);
        jLabel_search_by.setVisible(false);
        jComboBox_search_category.setVisible(false);
        jLabel_search_ID.setVisible(false);
        jTextField_search_ID.setVisible(false);
        jLabel_insert_item.setVisible(true);
        jPanel20.setVisible(true);
        jButton_insert_2.setVisible(true);
        jLabel_product_id.setVisible(true);
        jTextField_product_id.setVisible(true);
        jLabel_product_name.setVisible(true);
        jTextField_product_name.setVisible(true);
        jLabel_product_category.setVisible(true);
        jComboBox_product_category.setVisible(true);
        
        jButton_view_search.setBackground(new Color(153,153,255));
        jButton_view_search.setForeground(new Color(255,255,255));
        jButton_update.setBackground(new Color(153,153,255));
        jButton_update.setForeground(new Color(255,255,255));
        jButton_delete.setBackground(new Color(153,153,255));
        jButton_delete.setForeground(new Color(255,255,255));
        jButton_chat.setBackground(new Color(153,153,255));
        jButton_chat.setForeground(new Color(255,255,255));
        jButton_take_a_break.setBackground(new Color(153,153,255));
        jButton_take_a_break.setForeground(new Color(255,255,255));
        jButton_logout.setBackground(new Color(153,153,255));
        jButton_logout.setForeground(new Color(255,255,255));
        
        jButton_insert.setBackground(new Color(239,243,247));
        jButton_insert.setForeground(new Color(0,0,0));
        jPanel15.setBackground(new Color(239,243,247));
        jPanel20.setBackground(new Color(239,243,247));
        
        show_data();
        clear_field();
    }//GEN-LAST:event_jButton_insertActionPerformed

    private void jButton_view_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_view_searchActionPerformed
        menu="search";
        
        jLabel_insert_item.setVisible(false);
        jLabel_delete_item.setVisible(false);
        jLabel_update_item.setVisible(false);
        jButton_delete_2.setVisible(false);
        jPanel20.setVisible(false);
        jLabel_product_id.setVisible(false);
        jTextField_product_id.setVisible(false);
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
        
        jButton_insert.setBackground(new Color(153,153,255));
        jButton_insert.setForeground(new Color(255,255,255));
        jButton_update.setBackground(new Color(153,153,255));
        jButton_update.setForeground(new Color(255,255,255));
        jButton_delete.setBackground(new Color(153,153,255));
        jButton_delete.setForeground(new Color(255,255,255));
        jButton_chat.setBackground(new Color(153,153,255));
        jButton_chat.setForeground(new Color(255,255,255));
        jButton_take_a_break.setBackground(new Color(153,153,255));
        jButton_take_a_break.setForeground(new Color(255,255,255));
        jButton_logout.setBackground(new Color(153,153,255));
        jButton_logout.setForeground(new Color(255,255,255));
        
        jButton_view_search.setBackground(new Color(239,243,247));
        jButton_view_search.setForeground(new Color(0,0,0));
        jPanel15.setBackground(new Color(239,243,247));
        jPanel20.setBackground(new Color(239,243,247));
        
        jComboBox_search_category.setSelectedIndex(0);
        show_data();
    }//GEN-LAST:event_jButton_view_searchActionPerformed

    private void jButton_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_updateActionPerformed
        menu="update";
        
        jLabel_search.setVisible(false);
        jLabel_delete_item.setVisible(false);
        jLabel_insert_item.setVisible(false);
        jButton_delete_2.setVisible(false);
        jButton_insert_2.setVisible(false);
        jLabel_search_by.setVisible(false);
        jComboBox_search_category.setVisible(false);
        jLabel_search_ID.setVisible(false);
        jTextField_search_ID.setVisible(false);
        jLabel_update_item.setVisible(true);
        jPanel20.setVisible(true);
        jButton_update_2.setVisible(true);
        jLabel_product_id.setVisible(true);
        jTextField_product_id.setVisible(true);
        jLabel_product_name.setVisible(true);
        jTextField_product_name.setVisible(true);
        jLabel_product_category.setVisible(true);
        jComboBox_product_category.setVisible(true);
        
        jButton_view_search.setBackground(new Color(153,153,255));
        jButton_view_search.setForeground(new Color(255,255,255));
        jButton_insert.setBackground(new Color(153,153,255));
        jButton_insert.setForeground(new Color(255,255,255));
        jButton_delete.setBackground(new Color(153,153,255));
        jButton_delete.setForeground(new Color(255,255,255));
        jButton_chat.setBackground(new Color(153,153,255));
        jButton_chat.setForeground(new Color(255,255,255));
        jButton_take_a_break.setBackground(new Color(153,153,255));
        jButton_take_a_break.setForeground(new Color(255,255,255));
        jButton_logout.setBackground(new Color(153,153,255));
        jButton_logout.setForeground(new Color(255,255,255));
        
        jButton_update.setBackground(new Color(239,243,247));
        jButton_update.setForeground(new Color(0,0,0));
        jPanel15.setBackground(new Color(239,243,247));
        jPanel20.setBackground(new Color(239,243,247));
        
        show_data();
        clear_field();
    }//GEN-LAST:event_jButton_updateActionPerformed

    private void jButton_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_deleteActionPerformed
        menu="delete";
        
        jLabel_search.setVisible(false);
        jLabel_update_item.setVisible(false);
        jLabel_insert_item.setVisible(false);
        jPanel20.setVisible(false);
        jButton_insert_2.setVisible(false);
        jButton_update_2.setVisible(false);
        jLabel_search_by.setVisible(false);
        jComboBox_search_category.setVisible(false);
        jLabel_search_ID.setVisible(false);
        jTextField_search_ID.setVisible(false);
        jLabel_product_category.setVisible(false);
        jComboBox_product_category.setVisible(false);
        jLabel_delete_item.setVisible(true);
        jButton_delete_2.setVisible(true);
        jLabel_product_id.setVisible(true);
        jTextField_product_id.setVisible(true);
        jLabel_product_name.setVisible(true);
        jTextField_product_name.setVisible(true);
        
        jButton_view_search.setBackground(new Color(153,153,255));
        jButton_view_search.setForeground(new Color(255,255,255));
        jButton_insert.setBackground(new Color(153,153,255));
        jButton_insert.setForeground(new Color(255,255,255));
        jButton_update.setBackground(new Color(153,153,255));
        jButton_update.setForeground(new Color(255,255,255));
        jButton_chat.setBackground(new Color(153,153,255));
        jButton_chat.setForeground(new Color(255,255,255));
        jButton_take_a_break.setBackground(new Color(153,153,255));
        jButton_take_a_break.setForeground(new Color(255,255,255));
        jButton_logout.setBackground(new Color(153,153,255));
        jButton_logout.setForeground(new Color(255,255,255));
        
        jButton_delete.setBackground(new Color(239,243,247));
        jButton_delete.setForeground(new Color(0,0,0));
        jPanel15.setBackground(new Color(239,243,247));
        jPanel20.setBackground(new Color(239,243,247));
        
        show_data();
        clear_field();
    }//GEN-LAST:event_jButton_deleteActionPerformed

    private void jButton_take_a_breakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_take_a_breakActionPerformed
        jButton_view_search.setBackground(new Color(153,153,255));
        jButton_view_search.setForeground(new Color(255,255,255));
        jButton_insert.setBackground(new Color(153,153,255));
        jButton_insert.setForeground(new Color(255,255,255));
        jButton_update.setBackground(new Color(153,153,255));
        jButton_update.setForeground(new Color(255,255,255));
        jButton_delete.setBackground(new Color(153,153,255));
        jButton_delete.setForeground(new Color(255,255,255));
        jButton_chat.setBackground(new Color(153,153,255));
        jButton_chat.setForeground(new Color(255,255,255));
        jButton_logout.setBackground(new Color(153,153,255));
        jButton_logout.setForeground(new Color(255,255,255));
        
        jButton_take_a_break.setBackground(new Color(239,243,247));
        jButton_take_a_break.setForeground(new Color(0,0,0));
        jPanel15.setBackground(new Color(239,243,247));
        jPanel20.setBackground(new Color(239,243,247));
        
        puzzle_form_obj.setVisible(true);
    }//GEN-LAST:event_jButton_take_a_breakActionPerformed

    private void jButton_insert_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_insert_2ActionPerformed
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=SMS;integratedSecurity=true");
            Statement statement = connection.createStatement();
            
            if(jTextField_product_id.getText().trim().length()==0 || jTextField_product_name.getText().trim().length()==0 || jTextField_unit_price.getText().trim().length()==0 || jTextField_stock_quantity.getText().trim().length()==0)
            {
                
                JOptionPane.showMessageDialog(null, "Please fill all field.");
            }
            else
            {
                statement.execute("insert into Products (Product_ID,Product_Name,Category,Unit_Price,Stock) values ('"+jTextField_product_id.getText().trim()+"','"+jTextField_product_name.getText().trim()+"','"+jComboBox_product_category.getSelectedItem()+"','"+jTextField_unit_price.getText().trim()+"','"+jTextField_stock_quantity.getText().trim()+"')");
                
                show_data();
            
                JOptionPane.showMessageDialog(null, "Data inserted successfully.");

                jTextField_product_id.setText("");
                jTextField_product_name.setText("");
                jComboBox_product_category.setSelectedItem("Laptop");
                jTextField_stock_quantity.setText("");
                jTextField_unit_price.setText("");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton_insert_2ActionPerformed

    private void jButton_update_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_update_2ActionPerformed
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=SMS;integratedSecurity=true");
            Statement statement = connection.createStatement();
            
            if(jTextField_product_id.getText().trim().length()==0 || jTextField_product_name.getText().trim().length()==0 || jTextField_unit_price.getText().trim().length()==0 || jTextField_stock_quantity.getText().trim().length()==0)
            {
                
                JOptionPane.showMessageDialog(null, "Please fill all field.");
            }
            else
            {
                statement.execute("update Products set Product_Name='"+jTextField_product_name.getText().trim()+"',Category='"+jComboBox_product_category.getSelectedItem()+"',Unit_Price='"+jTextField_unit_price.getText().trim()+"',Stock='"+jTextField_stock_quantity.getText().trim()+"' where Product_ID='"+jTextField_product_id.getText().trim()+"'");
                
                show_data();
            
                JOptionPane.showMessageDialog(null, "Data updateded successfully.");

                clear_field();
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton_update_2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        if(menu=="update" || menu=="delete")
        {
            try{
                DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
                int selectedRowIndex=jTable1.getSelectedRow();

                jTextField_product_id.setText(model.getValueAt(selectedRowIndex, 0).toString());
                jTextField_product_name.setText(model.getValueAt(selectedRowIndex, 1).toString());
                jComboBox_product_category.setSelectedItem(model.getValueAt(selectedRowIndex, 2).toString().trim());
                jTextField_unit_price.setText(model.getValueAt(selectedRowIndex, 3).toString());
                jTextField_stock_quantity.setText(model.getValueAt(selectedRowIndex, 4).toString());
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton_delete_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_delete_2ActionPerformed
        int flag=0;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=SMS;integratedSecurity=true");
            Statement statement = connection.createStatement();
            
            if(jTextField_product_id.getText().trim().length()!=0)
            {
                ResultSet resultSet1 = statement.executeQuery("select Product_ID from Products where Product_ID='"+jTextField_product_id.getText().trim()+"'");
                if(!resultSet1.next()){
                    flag=1;
                    JOptionPane.showMessageDialog(null, "Product not found with this ID.");
                    show_data();
                }
            }
            else if(jTextField_product_name.getText().trim().length()!=0)
            {
                ResultSet resultSet2 = statement.executeQuery("select Product_Name from Products where Product_Name='"+jTextField_product_name.getText().trim()+"'");
                if(!resultSet2.next()){
                    flag=1;
                    JOptionPane.showMessageDialog(null, "Product not found with this Name.");
                    show_data();
                }
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        if(flag!=1)
        {
            try{
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=SMS;integratedSecurity=true");
                Statement statement = connection.createStatement();

                statement.execute("delete from Products where Product_ID='"+jTextField_product_id.getText().trim()+"' or Product_Name='"+jTextField_product_name.getText().trim()+"'");

                show_data();

                JOptionPane.showMessageDialog(null, "Data deleted successfully.");

                jTextField_product_id.setText("");
                jTextField_product_name.setText("");
                jComboBox_product_category.setSelectedItem("Laptop");
                jTextField_stock_quantity.setText("");
                jTextField_unit_price.setText("");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_jButton_delete_2ActionPerformed

    private void jTextField_product_idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_product_idKeyReleased
        if(menu=="delete")
        {
            try{
                jTextField_product_name.setText("");
                
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=SMS;integratedSecurity=true");
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("select * from Products where Product_ID like '"+jTextField_product_id.getText()+"%'");

                //jTable1.setModel(DbUtils.resultSetToTableModel(resultSet));
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_jTextField_product_idKeyReleased

    private void jTextField_product_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_product_nameKeyReleased
        if(menu=="search")
        {
            try{
                jTextField_product_id.setText("");
                
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=SMS;integratedSecurity=true");
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("select * from Products where Product_Name like '"+jTextField_product_name.getText()+"%'");

                //jTable1.setModel(DbUtils.resultSetToTableModel(resultSet));
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
        else if(menu=="delete")
        {
            try{
                jTextField_product_id.setText("");
                
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=SMS;integratedSecurity=true");
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("select * from Products where Product_Name like '"+jTextField_product_name.getText()+"%'");

                //jTable1.setModel(DbUtils.resultSetToTableModel(resultSet));
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_jTextField_product_nameKeyReleased

    private void jComboBox_product_categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_product_categoryActionPerformed
        if(menu=="search")
        {
            try{
                jTextField_product_id.setText("");
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
        }
    }//GEN-LAST:event_jComboBox_product_categoryActionPerformed

    private void jComboBox_search_categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_search_categoryActionPerformed
        if(menu=="search")
        {
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
        }
    }//GEN-LAST:event_jComboBox_search_categoryActionPerformed

    private void jTextField_search_IDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_search_IDKeyReleased
        if(menu=="search")
        {
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
        }
    }//GEN-LAST:event_jTextField_search_IDKeyReleased

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
            java.util.logging.Logger.getLogger(main_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_chat;
    private javax.swing.JButton jButton_delete;
    private javax.swing.JButton jButton_delete_2;
    private javax.swing.JButton jButton_insert;
    private javax.swing.JButton jButton_insert_2;
    private javax.swing.JButton jButton_logout;
    private javax.swing.JButton jButton_take_a_break;
    private javax.swing.JButton jButton_update;
    private javax.swing.JButton jButton_update_2;
    private javax.swing.JButton jButton_view_search;
    private javax.swing.JComboBox<String> jComboBox_product_category;
    private javax.swing.JComboBox<String> jComboBox_search_category;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_delete_item;
    private javax.swing.JLabel jLabel_insert_item;
    private javax.swing.JLabel jLabel_product_category;
    private javax.swing.JLabel jLabel_product_id;
    private javax.swing.JLabel jLabel_product_name;
    private javax.swing.JLabel jLabel_search;
    private javax.swing.JLabel jLabel_search_ID;
    private javax.swing.JLabel jLabel_search_by;
    private javax.swing.JLabel jLabel_stock_quantity;
    private javax.swing.JLabel jLabel_unit_price;
    private javax.swing.JLabel jLabel_update_item;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_product_id;
    private javax.swing.JTextField jTextField_product_name;
    private javax.swing.JTextField jTextField_search_ID;
    private javax.swing.JTextField jTextField_stock_quantity;
    private javax.swing.JTextField jTextField_unit_price;
    // End of variables declaration//GEN-END:variables

}
