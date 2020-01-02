package project_sms;

import mychatapp.networking.MessageListener;
import mychatapp.networking.MessageTransmitter;
import mychatapp.networking.WritableGUI;

public class chatting_form extends javax.swing.JFrame implements WritableGUI {

    public chatting_form() {
        initComponents();
        setLocation(1035, 90);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel10 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton_connect = new javax.swing.JButton();
        jTextField_ip = new javax.swing.JTextField();
        jTextField_receivers_port = new javax.swing.JTextField();
        jTextField_your_port = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_message_box = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jTextField_write_message = new javax.swing.JTextField();
        jButton_send = new javax.swing.JButton();
        jButton_close_chat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(1180, 90));
        setMinimumSize(new java.awt.Dimension(310, 564));
        setResizable(false);

        jPanel10.setBackground(new java.awt.Color(51, 51, 51));
        jPanel10.setMaximumSize(new java.awt.Dimension(310, 533));
        jPanel10.setMinimumSize(new java.awt.Dimension(310, 533));
        jPanel10.setPreferredSize(new java.awt.Dimension(310, 533));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("                       Chatting");
        jPanel1.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel10.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 35));

        jPanel2.setBackground(new java.awt.Color(255, 255, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        jButton_connect.setBackground(new java.awt.Color(153, 153, 255));
        jButton_connect.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_connect.setForeground(new java.awt.Color(255, 255, 255));
        jButton_connect.setText("Connect");
        jButton_connect.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_connect.setFocusPainted(false);
        jButton_connect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_connectActionPerformed(evt);
            }
        });

        jTextField_ip.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField_ip.setForeground(new java.awt.Color(153, 153, 153));
        jTextField_ip.setText("Receiver's IP");
        jTextField_ip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_ipMouseClicked(evt);
            }
        });

        jTextField_receivers_port.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField_receivers_port.setForeground(new java.awt.Color(153, 153, 153));
        jTextField_receivers_port.setText("Receiver's Port");
        jTextField_receivers_port.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_receivers_portMouseClicked(evt);
            }
        });

        jTextField_your_port.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField_your_port.setForeground(new java.awt.Color(153, 153, 153));
        jTextField_your_port.setText("Your Port");
        jTextField_your_port.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_your_portMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_ip, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_your_port, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_receivers_port, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addComponent(jButton_connect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_receivers_port, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_your_port, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField_ip, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_connect, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 80));

        jPanel4.setBackground(new java.awt.Color(0, 204, 153));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jTextArea_message_box.setEditable(false);
        jTextArea_message_box.setColumns(20);
        jTextArea_message_box.setRows(5);
        jScrollPane1.setViewportView(jTextArea_message_box);

        jPanel4.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 310, 310));

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField_write_message.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField_write_message.setForeground(new java.awt.Color(153, 153, 153));
        jTextField_write_message.setText("Write Your Message...");
        jTextField_write_message.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_write_messageMouseClicked(evt);
            }
        });
        jTextField_write_message.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_write_messageActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField_write_message, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 8, 294, 47));

        jButton_send.setBackground(new java.awt.Color(153, 153, 255));
        jButton_send.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_send.setForeground(new java.awt.Color(255, 255, 255));
        jButton_send.setText("Send");
        jButton_send.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_send.setFocusPainted(false);
        jButton_send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_sendActionPerformed(evt);
            }
        });
        jPanel5.add(jButton_send, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 64, 120, 37));

        jButton_close_chat.setBackground(new java.awt.Color(153, 153, 255));
        jButton_close_chat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_close_chat.setForeground(new java.awt.Color(255, 255, 255));
        jButton_close_chat.setText("Close Chat");
        jButton_close_chat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_close_chat.setFocusPainted(false);
        jButton_close_chat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_close_chatActionPerformed(evt);
            }
        });
        jPanel5.add(jButton_close_chat, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 64, 120, 37));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 310, 110));

        jPanel10.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 35, 310, 500));

        getContentPane().add(jPanel10, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    MessageListener listener;
    
    private void jTextField_write_messageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_write_messageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_write_messageActionPerformed

    private void jButton_close_chatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_close_chatActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton_close_chatActionPerformed

    private void jButton_connectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_connectActionPerformed
        listener =new MessageListener(this, Integer.parseInt(jTextField_your_port.getText()),jTextField_receivers_port.getText());
        listener.start();
    }//GEN-LAST:event_jButton_connectActionPerformed

    private void jButton_sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_sendActionPerformed
        MessageTransmitter transmitter=new MessageTransmitter(jTextField_write_message.getText(),jTextField_ip.getText(),Integer.parseInt(jTextField_receivers_port.getText()));
        transmitter.start();
        
        jTextArea_message_box.setText(jTextArea_message_box.getText()+"\n"+jTextField_your_port.getText()+" : "+jTextField_write_message.getText());
        jTextField_write_message.setText("");
    }//GEN-LAST:event_jButton_sendActionPerformed

    private void jTextField_your_portMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_your_portMouseClicked
        jTextField_your_port.setText("");
    }//GEN-LAST:event_jTextField_your_portMouseClicked

    private void jTextField_receivers_portMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_receivers_portMouseClicked
        jTextField_receivers_port.setText("");
    }//GEN-LAST:event_jTextField_receivers_portMouseClicked

    private void jTextField_ipMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_ipMouseClicked
        jTextField_ip.setText("");
    }//GEN-LAST:event_jTextField_ipMouseClicked

    private void jTextField_write_messageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_write_messageMouseClicked
        jTextField_write_message.setText("");
    }//GEN-LAST:event_jTextField_write_messageMouseClicked

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
            java.util.logging.Logger.getLogger(chatting_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(chatting_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(chatting_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(chatting_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new chatting_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_close_chat;
    private javax.swing.JButton jButton_connect;
    private javax.swing.JButton jButton_send;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_message_box;
    private javax.swing.JTextField jTextField_ip;
    private javax.swing.JTextField jTextField_receivers_port;
    private javax.swing.JTextField jTextField_write_message;
    private javax.swing.JTextField jTextField_your_port;
    // End of variables declaration//GEN-END:variables

    @Override
    public void write(String s) {
       jTextArea_message_box.append(s);
    }
}
