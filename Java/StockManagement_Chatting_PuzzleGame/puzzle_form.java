package project_sms;

import java.awt.Color;
import javax.swing.JOptionPane;

public class puzzle_form extends javax.swing.JFrame {

    int flipcount=0;
    public puzzle_form() {
        initComponents();
        setSize(608,480);
        setLocation(320,150);
        
        jPanel_easy.setVisible(true);
        jPanel_hard.setVisible(false);
        jLabel_flip.setText(" Flip : "+flipcount);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel_easy = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jButton_easy_1 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton_easy_2 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton_easy_3 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jButton_easy_4 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jButton_easy_5 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jButton_easy_6 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jButton_easy_7 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jButton_easy_8 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jButton_easy_9 = new javax.swing.JButton();
        jPanel_hard = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jButton_hard_1 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jButton_hard_2 = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jButton_hard_3 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jButton_hard_4 = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        jButton_hard_5 = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        jButton_hard_6 = new javax.swing.JButton();
        jPanel23 = new javax.swing.JPanel();
        jButton_hard_7 = new javax.swing.JButton();
        jPanel24 = new javax.swing.JPanel();
        jButton_hard_8 = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        jButton_hard_9 = new javax.swing.JButton();
        jPanel26 = new javax.swing.JPanel();
        jButton_hard_10 = new javax.swing.JButton();
        jPanel27 = new javax.swing.JPanel();
        jButton_hard_11 = new javax.swing.JButton();
        jPanel28 = new javax.swing.JPanel();
        jButton_hard_12 = new javax.swing.JButton();
        jPanel29 = new javax.swing.JPanel();
        jButton_hard_13 = new javax.swing.JButton();
        jPanel30 = new javax.swing.JPanel();
        jButton_hard_14 = new javax.swing.JButton();
        jPanel31 = new javax.swing.JPanel();
        jButton_hard_15 = new javax.swing.JButton();
        jPanel32 = new javax.swing.JPanel();
        jButton_hard_16 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton_new_game = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton_high_score = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel_flip = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jButton_close_game = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel_score_1 = new javax.swing.JLabel();
        jLabel_score_2 = new javax.swing.JLabel();
        jLabel_score_3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Puzzle Game");
        setMaximumSize(new java.awt.Dimension(608, 480));
        setMinimumSize(new java.awt.Dimension(608, 480));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(608, 480));

        jPanel_easy.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_easy.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel_easy.setPreferredSize(new java.awt.Dimension(360, 360));
        jPanel_easy.setLayout(new java.awt.GridLayout(3, 3, 1, 1));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jButton_easy_1.setBackground(new java.awt.Color(204, 0, 0));
        jButton_easy_1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton_easy_1.setForeground(new java.awt.Color(255, 255, 255));
        jButton_easy_1.setText("1");
        jButton_easy_1.setFocusPainted(false);
        jButton_easy_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_easy_1ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton_easy_1, java.awt.BorderLayout.CENTER);

        jPanel_easy.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jButton_easy_2.setBackground(new java.awt.Color(204, 0, 0));
        jButton_easy_2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton_easy_2.setForeground(new java.awt.Color(255, 255, 255));
        jButton_easy_2.setText("2");
        jButton_easy_2.setFocusPainted(false);
        jButton_easy_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_easy_2ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton_easy_2, java.awt.BorderLayout.CENTER);

        jPanel_easy.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jButton_easy_3.setBackground(new java.awt.Color(204, 0, 0));
        jButton_easy_3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton_easy_3.setForeground(new java.awt.Color(255, 255, 255));
        jButton_easy_3.setText("3");
        jButton_easy_3.setFocusPainted(false);
        jButton_easy_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_easy_3ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton_easy_3, java.awt.BorderLayout.CENTER);

        jPanel_easy.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jButton_easy_4.setBackground(new java.awt.Color(204, 0, 0));
        jButton_easy_4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton_easy_4.setForeground(new java.awt.Color(255, 255, 255));
        jButton_easy_4.setText("4");
        jButton_easy_4.setFocusPainted(false);
        jButton_easy_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_easy_4ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton_easy_4, java.awt.BorderLayout.CENTER);

        jPanel_easy.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jButton_easy_5.setBackground(new java.awt.Color(204, 0, 0));
        jButton_easy_5.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton_easy_5.setForeground(new java.awt.Color(255, 255, 255));
        jButton_easy_5.setText("5");
        jButton_easy_5.setFocusPainted(false);
        jButton_easy_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_easy_5ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton_easy_5, java.awt.BorderLayout.CENTER);

        jPanel_easy.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new java.awt.BorderLayout());

        jButton_easy_6.setBackground(new java.awt.Color(204, 0, 0));
        jButton_easy_6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton_easy_6.setForeground(new java.awt.Color(255, 255, 255));
        jButton_easy_6.setText("6");
        jButton_easy_6.setFocusPainted(false);
        jButton_easy_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_easy_6ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton_easy_6, java.awt.BorderLayout.CENTER);

        jPanel_easy.add(jPanel13);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new java.awt.BorderLayout());

        jButton_easy_7.setBackground(new java.awt.Color(204, 0, 0));
        jButton_easy_7.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton_easy_7.setForeground(new java.awt.Color(255, 255, 255));
        jButton_easy_7.setText("7");
        jButton_easy_7.setFocusPainted(false);
        jButton_easy_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_easy_7ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton_easy_7, java.awt.BorderLayout.CENTER);

        jPanel_easy.add(jPanel14);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new java.awt.BorderLayout());

        jButton_easy_8.setBackground(new java.awt.Color(204, 0, 0));
        jButton_easy_8.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton_easy_8.setForeground(new java.awt.Color(255, 255, 255));
        jButton_easy_8.setText("8");
        jButton_easy_8.setFocusPainted(false);
        jButton_easy_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_easy_8ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton_easy_8, java.awt.BorderLayout.CENTER);

        jPanel_easy.add(jPanel15);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setLayout(new java.awt.BorderLayout());

        jButton_easy_9.setBackground(new java.awt.Color(255, 255, 255));
        jButton_easy_9.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton_easy_9.setForeground(new java.awt.Color(255, 255, 255));
        jButton_easy_9.setFocusPainted(false);
        jButton_easy_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_easy_9ActionPerformed(evt);
            }
        });
        jPanel16.add(jButton_easy_9, java.awt.BorderLayout.CENTER);

        jPanel_easy.add(jPanel16);

        jPanel_hard.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_hard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel_hard.setPreferredSize(new java.awt.Dimension(360, 360));
        jPanel_hard.setLayout(new java.awt.GridLayout(4, 4, 1, 1));

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setLayout(new java.awt.BorderLayout());

        jButton_hard_1.setBackground(new java.awt.Color(204, 0, 204));
        jButton_hard_1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton_hard_1.setForeground(new java.awt.Color(255, 255, 255));
        jButton_hard_1.setText("1");
        jButton_hard_1.setFocusPainted(false);
        jButton_hard_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_hard_1ActionPerformed(evt);
            }
        });
        jPanel17.add(jButton_hard_1, java.awt.BorderLayout.CENTER);

        jPanel_hard.add(jPanel17);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setLayout(new java.awt.BorderLayout());

        jButton_hard_2.setBackground(new java.awt.Color(204, 0, 204));
        jButton_hard_2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton_hard_2.setForeground(new java.awt.Color(255, 255, 255));
        jButton_hard_2.setText("2");
        jButton_hard_2.setFocusPainted(false);
        jButton_hard_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_hard_2ActionPerformed(evt);
            }
        });
        jPanel18.add(jButton_hard_2, java.awt.BorderLayout.CENTER);

        jPanel_hard.add(jPanel18);

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setLayout(new java.awt.BorderLayout());

        jButton_hard_3.setBackground(new java.awt.Color(204, 0, 204));
        jButton_hard_3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton_hard_3.setForeground(new java.awt.Color(255, 255, 255));
        jButton_hard_3.setText("3");
        jButton_hard_3.setFocusPainted(false);
        jButton_hard_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_hard_3ActionPerformed(evt);
            }
        });
        jPanel19.add(jButton_hard_3, java.awt.BorderLayout.CENTER);

        jPanel_hard.add(jPanel19);

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setLayout(new java.awt.BorderLayout());

        jButton_hard_4.setBackground(new java.awt.Color(204, 0, 204));
        jButton_hard_4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton_hard_4.setForeground(new java.awt.Color(255, 255, 255));
        jButton_hard_4.setText("4");
        jButton_hard_4.setFocusPainted(false);
        jButton_hard_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_hard_4ActionPerformed(evt);
            }
        });
        jPanel20.add(jButton_hard_4, java.awt.BorderLayout.CENTER);

        jPanel_hard.add(jPanel20);

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setLayout(new java.awt.BorderLayout());

        jButton_hard_5.setBackground(new java.awt.Color(204, 0, 204));
        jButton_hard_5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton_hard_5.setForeground(new java.awt.Color(255, 255, 255));
        jButton_hard_5.setText("5");
        jButton_hard_5.setFocusPainted(false);
        jButton_hard_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_hard_5ActionPerformed(evt);
            }
        });
        jPanel21.add(jButton_hard_5, java.awt.BorderLayout.CENTER);

        jPanel_hard.add(jPanel21);

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setLayout(new java.awt.BorderLayout());

        jButton_hard_6.setBackground(new java.awt.Color(204, 0, 204));
        jButton_hard_6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton_hard_6.setForeground(new java.awt.Color(255, 255, 255));
        jButton_hard_6.setText("6");
        jButton_hard_6.setFocusPainted(false);
        jButton_hard_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_hard_6ActionPerformed(evt);
            }
        });
        jPanel22.add(jButton_hard_6, java.awt.BorderLayout.CENTER);

        jPanel_hard.add(jPanel22);

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setLayout(new java.awt.BorderLayout());

        jButton_hard_7.setBackground(new java.awt.Color(204, 0, 204));
        jButton_hard_7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton_hard_7.setForeground(new java.awt.Color(255, 255, 255));
        jButton_hard_7.setText("7");
        jButton_hard_7.setFocusPainted(false);
        jButton_hard_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_hard_7ActionPerformed(evt);
            }
        });
        jPanel23.add(jButton_hard_7, java.awt.BorderLayout.CENTER);

        jPanel_hard.add(jPanel23);

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setLayout(new java.awt.BorderLayout());

        jButton_hard_8.setBackground(new java.awt.Color(204, 0, 204));
        jButton_hard_8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton_hard_8.setForeground(new java.awt.Color(255, 255, 255));
        jButton_hard_8.setText("8");
        jButton_hard_8.setFocusPainted(false);
        jButton_hard_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_hard_8ActionPerformed(evt);
            }
        });
        jPanel24.add(jButton_hard_8, java.awt.BorderLayout.CENTER);

        jPanel_hard.add(jPanel24);

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setLayout(new java.awt.BorderLayout());

        jButton_hard_9.setBackground(new java.awt.Color(204, 0, 204));
        jButton_hard_9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton_hard_9.setForeground(new java.awt.Color(255, 255, 255));
        jButton_hard_9.setText("9");
        jButton_hard_9.setFocusPainted(false);
        jButton_hard_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_hard_9ActionPerformed(evt);
            }
        });
        jPanel25.add(jButton_hard_9, java.awt.BorderLayout.CENTER);

        jPanel_hard.add(jPanel25);

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));
        jPanel26.setLayout(new java.awt.BorderLayout());

        jButton_hard_10.setBackground(new java.awt.Color(204, 0, 204));
        jButton_hard_10.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton_hard_10.setForeground(new java.awt.Color(255, 255, 255));
        jButton_hard_10.setText("10");
        jButton_hard_10.setFocusPainted(false);
        jButton_hard_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_hard_10ActionPerformed(evt);
            }
        });
        jPanel26.add(jButton_hard_10, java.awt.BorderLayout.CENTER);

        jPanel_hard.add(jPanel26);

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));
        jPanel27.setLayout(new java.awt.BorderLayout());

        jButton_hard_11.setBackground(new java.awt.Color(204, 0, 204));
        jButton_hard_11.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton_hard_11.setForeground(new java.awt.Color(255, 255, 255));
        jButton_hard_11.setText("11");
        jButton_hard_11.setFocusPainted(false);
        jButton_hard_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_hard_11ActionPerformed(evt);
            }
        });
        jPanel27.add(jButton_hard_11, java.awt.BorderLayout.CENTER);

        jPanel_hard.add(jPanel27);

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));
        jPanel28.setLayout(new java.awt.BorderLayout());

        jButton_hard_12.setBackground(new java.awt.Color(204, 0, 204));
        jButton_hard_12.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton_hard_12.setForeground(new java.awt.Color(255, 255, 255));
        jButton_hard_12.setText("12");
        jButton_hard_12.setFocusPainted(false);
        jButton_hard_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_hard_12ActionPerformed(evt);
            }
        });
        jPanel28.add(jButton_hard_12, java.awt.BorderLayout.CENTER);

        jPanel_hard.add(jPanel28);

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));
        jPanel29.setLayout(new java.awt.BorderLayout());

        jButton_hard_13.setBackground(new java.awt.Color(204, 0, 204));
        jButton_hard_13.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton_hard_13.setForeground(new java.awt.Color(255, 255, 255));
        jButton_hard_13.setText("13");
        jButton_hard_13.setFocusPainted(false);
        jButton_hard_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_hard_13ActionPerformed(evt);
            }
        });
        jPanel29.add(jButton_hard_13, java.awt.BorderLayout.CENTER);

        jPanel_hard.add(jPanel29);

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));
        jPanel30.setLayout(new java.awt.BorderLayout());

        jButton_hard_14.setBackground(new java.awt.Color(204, 0, 204));
        jButton_hard_14.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton_hard_14.setForeground(new java.awt.Color(255, 255, 255));
        jButton_hard_14.setText("14");
        jButton_hard_14.setFocusPainted(false);
        jButton_hard_14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_hard_14ActionPerformed(evt);
            }
        });
        jPanel30.add(jButton_hard_14, java.awt.BorderLayout.CENTER);

        jPanel_hard.add(jPanel30);

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));
        jPanel31.setLayout(new java.awt.BorderLayout());

        jButton_hard_15.setBackground(new java.awt.Color(204, 0, 204));
        jButton_hard_15.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton_hard_15.setForeground(new java.awt.Color(255, 255, 255));
        jButton_hard_15.setText("15");
        jButton_hard_15.setFocusPainted(false);
        jButton_hard_15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_hard_15ActionPerformed(evt);
            }
        });
        jPanel31.add(jButton_hard_15, java.awt.BorderLayout.CENTER);

        jPanel_hard.add(jPanel31);

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));
        jPanel32.setLayout(new java.awt.BorderLayout());

        jButton_hard_16.setBackground(new java.awt.Color(255, 255, 255));
        jButton_hard_16.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton_hard_16.setForeground(new java.awt.Color(255, 255, 255));
        jButton_hard_16.setFocusPainted(false);
        jButton_hard_16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_hard_16ActionPerformed(evt);
            }
        });
        jPanel32.add(jButton_hard_16, java.awt.BorderLayout.CENTER);

        jPanel_hard.add(jPanel32);

        jPanel4.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText(" PUZZLE");
        jPanel4.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setLayout(new java.awt.GridLayout(3, 0));

        jButton_new_game.setBackground(new java.awt.Color(153, 153, 255));
        jButton_new_game.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_new_game.setForeground(new java.awt.Color(255, 255, 255));
        jButton_new_game.setText("Start Game");
        jButton_new_game.setBorder(null);
        jButton_new_game.setBorderPainted(false);
        jButton_new_game.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_new_game.setFocusPainted(false);
        jButton_new_game.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_new_gameActionPerformed(evt);
            }
        });
        jPanel5.add(jButton_new_game);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Level 1", "Level 2" }));
        jComboBox1.setToolTipText("");
        jComboBox1.setBorder(null);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel5.add(jComboBox1);

        jButton_high_score.setBackground(new java.awt.Color(153, 153, 255));
        jButton_high_score.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_high_score.setForeground(new java.awt.Color(255, 255, 255));
        jButton_high_score.setText("High Scores");
        jButton_high_score.setBorder(null);
        jButton_high_score.setBorderPainted(false);
        jButton_high_score.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_high_score.setFocusPainted(false);
        jButton_high_score.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_high_scoreActionPerformed(evt);
            }
        });
        jPanel5.add(jButton_high_score);

        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.LINE_AXIS));

        jLabel_flip.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_flip.setText("  Flip :");
        jPanel6.add(jLabel_flip);

        jPanel7.setLayout(new java.awt.BorderLayout());

        jButton_close_game.setBackground(new java.awt.Color(153, 153, 255));
        jButton_close_game.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_close_game.setForeground(new java.awt.Color(255, 255, 255));
        jButton_close_game.setText("Close Game");
        jButton_close_game.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_close_game.setFocusPainted(false);
        jButton_close_game.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_close_gameActionPerformed(evt);
            }
        });
        jPanel7.add(jButton_close_game, java.awt.BorderLayout.CENTER);

        jPanel2.setPreferredSize(new java.awt.Dimension(0, 103));
        jPanel2.setLayout(new java.awt.GridLayout(3, 0));

        jLabel_score_1.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        jLabel_score_1.setText("High Score 1");
        jPanel2.add(jLabel_score_1);

        jLabel_score_2.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        jLabel_score_2.setText("High Score 2");
        jPanel2.add(jLabel_score_2);

        jLabel_score_3.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        jLabel_score_3.setText("High Score 3");
        jPanel2.add(jLabel_score_3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addComponent(jPanel_hard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jPanel_easy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel_hard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_easy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public void check_easy(){
        if(jButton_easy_1.getText().toString()=="1" && jButton_easy_2.getText().toString()=="2" && jButton_easy_3.getText().toString()=="3" && jButton_easy_4.getText().toString()=="4" && jButton_easy_5.getText().toString()=="5" && jButton_easy_6.getText().toString()=="6" && jButton_easy_7.getText().toString()=="7" && jButton_easy_8.getText().toString()=="8")
        {
            JOptionPane.showMessageDialog(null,"Puzzle Solved!!!");
        }
        else
            System.err.println("Hello");
    }
    public void check_hard(){
        if(jButton_hard_1.getText()=="1" && jButton_hard_2.getText()=="2" && jButton_hard_3.getText()=="3" && jButton_hard_4.getText()=="4" && jButton_hard_5.getText()=="5" && jButton_hard_6.getText()=="6" && jButton_hard_7.getText()=="7" && jButton_hard_8.getText()=="8" && jButton_hard_9.getText()=="9" && jButton_hard_10.getText()=="10" && jButton_hard_11.getText()=="11" && jButton_hard_12.getText()=="12" && jButton_hard_13.getText()=="13" && jButton_hard_14.getText()=="14" && jButton_hard_15.getText()=="15")
        {
            JOptionPane.showMessageDialog(null,"Puzzle Solved!!!");
        }
    }
    
    public void shuffle_easy(Integer a,Integer b,Integer c,Integer d,Integer e,Integer f,Integer g,Integer h){
        jButton_easy_1.setText(f.toString());
        jButton_easy_2.setText(c.toString());
        jButton_easy_3.setText(a.toString());
        jButton_easy_4.setText(h.toString());
        jButton_easy_5.setText("");
        jButton_easy_6.setText(b.toString());
        jButton_easy_7.setText(d.toString());
        jButton_easy_8.setText(e.toString());
        jButton_easy_9.setText(g.toString());
        
        jButton_easy_1.setBackground(new Color(204,0,0));
        jButton_easy_2.setBackground(new Color(204,0,0));
        jButton_easy_3.setBackground(new Color(204,0,0));
        jButton_easy_4.setBackground(new Color(204,0,0));
        jButton_easy_5.setBackground(new Color(255,255,255));
        jButton_easy_6.setBackground(new Color(204,0,0));
        jButton_easy_7.setBackground(new Color(204,0,0));
        jButton_easy_8.setBackground(new Color(204,0,0));
        jButton_easy_9.setBackground(new Color(204,0,0));
    }
    public void shuffle_hard(Integer a,Integer b,Integer c,Integer d,Integer e,Integer f,Integer g,Integer h,Integer i,Integer j,Integer k,Integer l,Integer m,Integer n,Integer o){
        jButton_hard_1.setText(f.toString());
        jButton_hard_2.setText(c.toString());
        jButton_hard_3.setText(a.toString());
        jButton_hard_4.setText(m.toString());
        jButton_hard_5.setText(i.toString());
        jButton_hard_6.setText(b.toString());
        jButton_hard_7.setText(d.toString());
        jButton_hard_8.setText(e.toString());
        jButton_hard_9.setText(j.toString());
        jButton_hard_10.setText(o.toString());
        jButton_hard_11.setText(h.toString());
        jButton_hard_12.setText(l.toString());
        jButton_hard_13.setText(n.toString());
        jButton_hard_14.setText(g.toString());
        jButton_hard_15.setText(k.toString());
        jButton_hard_16.setText("");
        
        jButton_hard_1.setBackground(new Color(204,0,204));
        jButton_hard_2.setBackground(new Color(204,0,204));
        jButton_hard_3.setBackground(new Color(204,0,204));
        jButton_hard_4.setBackground(new Color(204,0,204));
        jButton_hard_5.setBackground(new Color(204,0,204));
        jButton_hard_6.setBackground(new Color(204,0,204));
        jButton_hard_7.setBackground(new Color(204,0,204));
        jButton_hard_8.setBackground(new Color(204,0,204));
        jButton_hard_9.setBackground(new Color(204,0,204));
        jButton_hard_10.setBackground(new Color(204,0,204));
        jButton_hard_11.setBackground(new Color(204,0,204));
        jButton_hard_12.setBackground(new Color(204,0,204));
        jButton_hard_13.setBackground(new Color(204,0,204));
        jButton_hard_14.setBackground(new Color(204,0,204));
        jButton_hard_15.setBackground(new Color(204,0,204));
        jButton_hard_16.setBackground(new Color(255,255,255));
    }
    int a=1,b=2,c=3,d=4,e=5,f=6,g=7,h=8;
    public void random_easy(){
        if(a==9)
            a=1;
        if(b==9)
            b=1;
        if(c==9)
            c=1;
        if(d==9)
            d=1;
        if(e==9)
            e=1;
        if(f==9)
            f=1;
        if(g==9)
            g=1;
        if(h==9)
            h=1;
        shuffle_easy(a,b,c,d,e,f,g,h);
        a++;b++;c++;d++;e++;f++;g++;h++;
    }
    int aa=1,bb=2,cc=3,dd=4,ee=5,ff=6,gg=7,hh=8,ii=9,jj=10,kk=11,ll=12,mm=13,nn=14,oo=15;
    public void random_hard(){
        if(aa==16)
            aa=1;
        if(bb==16)
            bb=1;
        if(cc==16)
            cc=1;
        if(dd==16)
            dd=1;
        if(ee==16)
            ee=1;
        if(ff==16)
            ff=1;
        if(gg==16)
            gg=1;
        if(hh==16)
            hh=1;
        if(ii==16)
            ii=1;
        if(jj==16)
            jj=1;
        if(kk==16)
            kk=1;
        if(ll==16)
            ll=1;
        if(mm==16)
            mm=1;
        if(nn==16)
            nn=1;
        if(oo==16)
            oo=1;
        shuffle_hard(aa,bb,cc,dd,ee,ff,gg,hh,ii,jj,kk,ll,mm,nn,oo);
        aa++;bb++;cc++;dd++;ee++;ff++;gg++;hh++;ii++;jj++;kk++;ll++;mm++;nn++;oo++;
    };
    
    int game=0,rr=0;
    private void jButton_new_gameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_new_gameActionPerformed
        if(game==0)
        {
            if(jComboBox1.getSelectedItem()=="Level 1")
            {
                rr=1;
                random_easy();
            }
            else if(jComboBox1.getSelectedItem()=="Level 2")
            {
                rr=2;
                random_hard();
            }
            
            flipcount=0;
            jLabel_flip.setText(" Flip : "+flipcount);
            game=1;
        }
        else if(game==1)
        {
            int x=JOptionPane.showConfirmDialog(null,"Do you want to start a new game?","Message",JOptionPane.YES_NO_OPTION);
            
            if(x==JOptionPane.YES_OPTION)
            {
                if(jComboBox1.getSelectedItem()=="Level 1")
                {
                    rr=1;
                    random_easy();
                }
                else if(jComboBox1.getSelectedItem()=="Level 2")
                {
                    rr=2;
                    random_hard();
                }
                
                flipcount=0;
                jLabel_flip.setText(" Flip : "+flipcount);
            }
        }
    }//GEN-LAST:event_jButton_new_gameActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if(game==0)
        {
            if(jComboBox1.getSelectedItem()=="Level 1")
            {
                jPanel_easy.setVisible(true);
                jPanel_hard.setVisible(false);

            }
            else if(jComboBox1.getSelectedItem()=="Level 2")
            {
                jPanel_hard.setVisible(true);
                jPanel_easy.setVisible(false);
            }
        }
        else if(game==1)
        {
            if(jComboBox1.getSelectedItem()=="Level 1")
            {            
                int x=JOptionPane.showConfirmDialog(null,"Do you want to start a new game?","Message",JOptionPane.YES_NO_OPTION);
                
                if(x==JOptionPane.YES_OPTION)
                {
                    jPanel_easy.setVisible(true);
                    jPanel_hard.setVisible(false);

                    rr=1;
                    random_easy();
                    flipcount=0;
                    jLabel_flip.setText(" Flip : "+flipcount);
                }
                else if(x==JOptionPane.NO_OPTION)
                {
                    if(rr==1)
                        jComboBox1.setSelectedIndex(0);
                    else if(rr==2)
                        jComboBox1.setSelectedIndex(1);
                    
                }
            }
            else if(jComboBox1.getSelectedItem()=="Level 2")
            {
                int x=JOptionPane.showConfirmDialog(null,"Do you want to start a new game?","Message",JOptionPane.YES_NO_OPTION);
                
                if(x==JOptionPane.YES_OPTION)
                {
                    jPanel_hard.setVisible(true);
                    jPanel_easy.setVisible(false);
                    
                    rr=2;
                    random_hard();
                    flipcount=0;
                    jLabel_flip.setText(" Flip : "+flipcount);
                }
                else if(x==JOptionPane.NO_OPTION)
                {
                    if(rr==1)
                        jComboBox1.setSelectedIndex(0);
                    else if(rr==2)
                        jComboBox1.setSelectedIndex(1);
                }
            }
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton_high_scoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_high_scoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_high_scoreActionPerformed

    private void jButton_close_gameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_close_gameActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton_close_gameActionPerformed

    private void jButton_easy_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_easy_1ActionPerformed
        String tmp=jButton_easy_1.getText();
        System.err.println(jButton_easy_1.getText());
        if(jButton_easy_2.getText()=="")
        {
            jButton_easy_1.setText(jButton_easy_2.getText());
            jButton_easy_2.setText(tmp);
            
            Color tmpcolor=jButton_easy_1.getBackground();
            jButton_easy_1.setBackground(jButton_easy_2.getBackground());
            jButton_easy_2.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }
        else if(jButton_easy_4.getText()=="")
        {
            jButton_easy_1.setText(jButton_easy_4.getText());
            jButton_easy_4.setText(tmp);
            
            Color tmpcolor=jButton_easy_1.getBackground();
            jButton_easy_1.setBackground(jButton_easy_4.getBackground());
            jButton_easy_4.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }

        
        check_easy();
    }//GEN-LAST:event_jButton_easy_1ActionPerformed

    private void jButton_easy_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_easy_2ActionPerformed
        String tmp=jButton_easy_2.getText();
        System.err.println(jButton_easy_2.getText());
        if(jButton_easy_1.getText()=="")
        {
            jButton_easy_2.setText(jButton_easy_1.getText());
            jButton_easy_1.setText(tmp);
            
            Color tmpcolor=jButton_easy_2.getBackground();
            jButton_easy_2.setBackground(jButton_easy_1.getBackground());
            jButton_easy_1.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }
        else if(jButton_easy_3.getText()=="")
        {
            jButton_easy_2.setText(jButton_easy_3.getText());
            jButton_easy_3.setText(tmp);
            
            Color tmpcolor=jButton_easy_2.getBackground();
            jButton_easy_2.setBackground(jButton_easy_3.getBackground());
            jButton_easy_3.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }
        else if(jButton_easy_5.getText()=="")
        {
            jButton_easy_2.setText(jButton_easy_5.getText());
            jButton_easy_5.setText(tmp);
            
            Color tmpcolor=jButton_easy_2.getBackground();
            jButton_easy_2.setBackground(jButton_easy_5.getBackground());
            jButton_easy_5.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }

        
        check_easy();
    }//GEN-LAST:event_jButton_easy_2ActionPerformed

    private void jButton_easy_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_easy_3ActionPerformed
        String tmp=jButton_easy_3.getText();
        System.err.println(jButton_easy_3.getText());
        if(jButton_easy_2.getText()=="")
        {
            jButton_easy_3.setText(jButton_easy_2.getText());
            jButton_easy_2.setText(tmp);
            
            Color tmpcolor=jButton_easy_3.getBackground();
            jButton_easy_3.setBackground(jButton_easy_2.getBackground());
            jButton_easy_2.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }
        else if(jButton_easy_6.getText()=="")
        {
            jButton_easy_3.setText(jButton_easy_6.getText());
            jButton_easy_6.setText(tmp);
            
            Color tmpcolor=jButton_easy_3.getBackground();
            jButton_easy_3.setBackground(jButton_easy_6.getBackground());
            jButton_easy_6.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }

        check_easy();
    }//GEN-LAST:event_jButton_easy_3ActionPerformed

    private void jButton_easy_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_easy_4ActionPerformed
        String tmp=jButton_easy_4.getText();
        if(jButton_easy_1.getText()=="")
        {
            jButton_easy_4.setText(jButton_easy_1.getText());
            jButton_easy_1.setText(tmp);
            
            Color tmpcolor=jButton_easy_4.getBackground();
            jButton_easy_4.setBackground(jButton_easy_1.getBackground());
            jButton_easy_1.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }
        else if(jButton_easy_5.getText()=="")
        {
            jButton_easy_4.setText(jButton_easy_5.getText());
            jButton_easy_5.setText(tmp);
            
            Color tmpcolor=jButton_easy_4.getBackground();
            jButton_easy_4.setBackground(jButton_easy_5.getBackground());
            jButton_easy_5.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }
        else if(jButton_easy_7.getText()=="")
        {
            jButton_easy_4.setText(jButton_easy_7.getText());
            jButton_easy_7.setText(tmp);
            
            Color tmpcolor=jButton_easy_4.getBackground();
            jButton_easy_4.setBackground(jButton_easy_7.getBackground());
            jButton_easy_7.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }
System.err.println(jButton_easy_4.getText());
        check_easy();
    }//GEN-LAST:event_jButton_easy_4ActionPerformed

    private void jButton_easy_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_easy_5ActionPerformed
        String tmp=jButton_easy_5.getText();
        if(jButton_easy_2.getText()=="")
        {
            jButton_easy_5.setText(jButton_easy_2.getText());
            jButton_easy_2.setText(tmp);
            
            Color tmpcolor=jButton_easy_5.getBackground();
            jButton_easy_5.setBackground(jButton_easy_2.getBackground());
            jButton_easy_2.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }
        else if(jButton_easy_4.getText()=="")
        {
            jButton_easy_5.setText(jButton_easy_4.getText());
            jButton_easy_4.setText(tmp);
            
            Color tmpcolor=jButton_easy_5.getBackground();
            jButton_easy_5.setBackground(jButton_easy_4.getBackground());
            jButton_easy_4.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }
        else if(jButton_easy_6.getText()=="")
        {
            jButton_easy_5.setText(jButton_easy_6.getText());
            jButton_easy_6.setText(tmp);
            
            Color tmpcolor=jButton_easy_5.getBackground();
            jButton_easy_5.setBackground(jButton_easy_6.getBackground());
            jButton_easy_6.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }
        else if(jButton_easy_8.getText()=="")
        {
            jButton_easy_5.setText(jButton_easy_8.getText());
            jButton_easy_8.setText(tmp);
            
            Color tmpcolor=jButton_easy_5.getBackground();
            jButton_easy_5.setBackground(jButton_easy_8.getBackground());
            jButton_easy_8.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }
System.err.println(jButton_easy_5.getText());
        check_easy();
    }//GEN-LAST:event_jButton_easy_5ActionPerformed

    private void jButton_easy_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_easy_6ActionPerformed
        String tmp=jButton_easy_6.getText();
        if(jButton_easy_3.getText()=="")
        {
            jButton_easy_6.setText(jButton_easy_3.getText());
            jButton_easy_3.setText(tmp);
            
            Color tmpcolor=jButton_easy_6.getBackground();
            jButton_easy_6.setBackground(jButton_easy_3.getBackground());
            jButton_easy_3.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }
        else if(jButton_easy_5.getText()=="")
        {
            jButton_easy_6.setText(jButton_easy_5.getText());
            jButton_easy_5.setText(tmp);
            
            Color tmpcolor=jButton_easy_6.getBackground();
            jButton_easy_6.setBackground(jButton_easy_5.getBackground());
            jButton_easy_5.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }
        else if(jButton_easy_9.getText()=="")
        {
            jButton_easy_6.setText(jButton_easy_9.getText());
            jButton_easy_9.setText(tmp);
            
            Color tmpcolor=jButton_easy_6.getBackground();
            jButton_easy_6.setBackground(jButton_easy_9.getBackground());
            jButton_easy_9.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }
System.err.println(jButton_easy_6.getText());
        check_easy();
    }//GEN-LAST:event_jButton_easy_6ActionPerformed

    private void jButton_easy_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_easy_7ActionPerformed
        String tmp=jButton_easy_7.getText();
        if(jButton_easy_4.getText()=="")
        {
            jButton_easy_7.setText(jButton_easy_4.getText());
            jButton_easy_4.setText(tmp);
            
            Color tmpcolor=jButton_easy_7.getBackground();
            jButton_easy_7.setBackground(jButton_easy_4.getBackground());
            jButton_easy_4.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }
        else if(jButton_easy_8.getText()=="")
        {
            jButton_easy_7.setText(jButton_easy_8.getText());
            jButton_easy_8.setText(tmp);
            
            Color tmpcolor=jButton_easy_7.getBackground();
            jButton_easy_7.setBackground(jButton_easy_8.getBackground());
            jButton_easy_8.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }
        System.err.println(jButton_easy_7.getText());
        check_easy();
    }//GEN-LAST:event_jButton_easy_7ActionPerformed

    private void jButton_easy_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_easy_8ActionPerformed
        String tmp=jButton_easy_8.getText();
        if(jButton_easy_5.getText()=="")
        {
            jButton_easy_8.setText(jButton_easy_5.getText());
            jButton_easy_5.setText(tmp);
            
            Color tmpcolor=jButton_easy_8.getBackground();
            jButton_easy_8.setBackground(jButton_easy_5.getBackground());
            jButton_easy_5.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }
        else if(jButton_easy_7.getText()=="")
        {
            jButton_easy_8.setText(jButton_easy_7.getText());
            jButton_easy_7.setText(tmp);
            
            Color tmpcolor=jButton_easy_8.getBackground();
            jButton_easy_8.setBackground(jButton_easy_7.getBackground());
            jButton_easy_7.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }
        else if(jButton_easy_9.getText()=="")
        {
            jButton_easy_8.setText(jButton_easy_9.getText());
            jButton_easy_9.setText(tmp);
            
            Color tmpcolor=jButton_easy_8.getBackground();
            jButton_easy_8.setBackground(jButton_easy_9.getBackground());
            jButton_easy_9.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }
System.err.println(jButton_easy_8.getText());
        check_easy();
    }//GEN-LAST:event_jButton_easy_8ActionPerformed

    private void jButton_easy_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_easy_9ActionPerformed
        //Space
        String tmp=jButton_easy_9.getText();
        if(jButton_easy_6.getText()=="")
        {
            jButton_easy_9.setText(jButton_easy_6.getText());
            jButton_easy_6.setText(tmp);
            
            Color tmpcolor=jButton_easy_9.getBackground();
            jButton_easy_9.setBackground(jButton_easy_6.getBackground());
            jButton_easy_6.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }
        else if(jButton_easy_8.getText()=="")
        {
            jButton_easy_9.setText(jButton_easy_8.getText());
            jButton_easy_8.setText(tmp);
            
            Color tmpcolor=jButton_easy_9.getBackground();
            jButton_easy_9.setBackground(jButton_easy_8.getBackground());
            jButton_easy_8.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }
        System.err.println(jButton_easy_9.getText());
        check_easy();
    }//GEN-LAST:event_jButton_easy_9ActionPerformed

    private void jButton_hard_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_hard_1ActionPerformed
        String tmp=jButton_hard_1.getText();
        if(jButton_hard_2.getText()=="")
        {
            jButton_hard_1.setText(jButton_hard_2.getText());
            jButton_hard_2.setText(tmp);
            
            Color tmpcolor=jButton_hard_1.getBackground();
            jButton_hard_1.setBackground(jButton_hard_2.getBackground());
            jButton_hard_2.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }
        else if(jButton_hard_5.getText()=="")
        {
            jButton_hard_1.setText(jButton_hard_5.getText());
            jButton_hard_5.setText(tmp);
            
            Color tmpcolor=jButton_hard_1.getBackground();
            jButton_hard_1.setBackground(jButton_hard_5.getBackground());
            jButton_hard_5.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }

        check_hard();
    }//GEN-LAST:event_jButton_hard_1ActionPerformed

    private void jButton_hard_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_hard_2ActionPerformed
        String tmp=jButton_hard_2.getText();
        if(jButton_hard_1.getText()=="")
        {
            jButton_hard_2.setText(jButton_hard_1.getText());
            jButton_hard_1.setText(tmp);
            
            Color tmpcolor=jButton_hard_2.getBackground();
            jButton_hard_2.setBackground(jButton_hard_1.getBackground());
            jButton_hard_1.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }
        else if(jButton_hard_3.getText()=="")
        {
            jButton_hard_2.setText(jButton_hard_3.getText());
            jButton_hard_3.setText(tmp);
            
            Color tmpcolor=jButton_hard_2.getBackground();
            jButton_hard_2.setBackground(jButton_hard_3.getBackground());
            jButton_hard_3.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }
        else if(jButton_hard_6.getText()=="")
        {
            jButton_hard_2.setText(jButton_hard_6.getText());
            jButton_hard_6.setText(tmp);
            
            Color tmpcolor=jButton_hard_2.getBackground();
            jButton_hard_2.setBackground(jButton_hard_6.getBackground());
            jButton_hard_6.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }

        check_hard();
    }//GEN-LAST:event_jButton_hard_2ActionPerformed

    private void jButton_hard_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_hard_3ActionPerformed
        String tmp=jButton_hard_3.getText();
        if(jButton_hard_2.getText()=="")
        {
            jButton_hard_3.setText(jButton_hard_2.getText());
            jButton_hard_2.setText(tmp);
            
            Color tmpcolor=jButton_hard_3.getBackground();
            jButton_hard_3.setBackground(jButton_hard_2.getBackground());
            jButton_hard_2.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }
        else if(jButton_hard_4.getText()=="")
        {
            jButton_hard_3.setText(jButton_hard_4.getText());
            jButton_hard_4.setText(tmp);
            
            Color tmpcolor=jButton_hard_3.getBackground();
            jButton_hard_3.setBackground(jButton_hard_4.getBackground());
            jButton_hard_4.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }
        else if(jButton_hard_7.getText()=="")
        {
            jButton_hard_3.setText(jButton_hard_7.getText());
            jButton_hard_7.setText(tmp);
            
            Color tmpcolor=jButton_hard_3.getBackground();
            jButton_hard_3.setBackground(jButton_hard_7.getBackground());
            jButton_hard_7.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }

        check_hard();
    }//GEN-LAST:event_jButton_hard_3ActionPerformed

    private void jButton_hard_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_hard_4ActionPerformed
        String tmp=jButton_hard_4.getText();
        if(jButton_hard_3.getText()=="")
        {
            jButton_hard_4.setText(jButton_hard_3.getText());
            jButton_hard_3.setText(tmp);
            
            Color tmpcolor=jButton_hard_4.getBackground();
            jButton_hard_4.setBackground(jButton_hard_3.getBackground());
            jButton_hard_3.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }
        else if(jButton_hard_8.getText()=="")
        {
            jButton_hard_4.setText(jButton_hard_8.getText());
            jButton_hard_8.setText(tmp);
            
            Color tmpcolor=jButton_hard_4.getBackground();
            jButton_hard_4.setBackground(jButton_hard_8.getBackground());
            jButton_hard_8.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }

        check_hard();
    }//GEN-LAST:event_jButton_hard_4ActionPerformed

    private void jButton_hard_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_hard_5ActionPerformed
        String tmp=jButton_hard_5.getText();
        if(jButton_hard_1.getText()=="")
        {
            jButton_hard_5.setText(jButton_hard_1.getText());
            jButton_hard_1.setText(tmp);
            
            Color tmpcolor=jButton_hard_5.getBackground();
            jButton_hard_5.setBackground(jButton_hard_1.getBackground());
            jButton_hard_1.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }
        else if(jButton_hard_6.getText()=="")
        {
            jButton_hard_5.setText(jButton_hard_6.getText());
            jButton_hard_6.setText(tmp);
            
            Color tmpcolor=jButton_hard_5.getBackground();
            jButton_hard_5.setBackground(jButton_hard_6.getBackground());
            jButton_hard_6.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }
        else if(jButton_hard_9.getText()=="")
        {
            jButton_hard_5.setText(jButton_hard_9.getText());
            jButton_hard_9.setText(tmp);
            
            Color tmpcolor=jButton_hard_5.getBackground();
            jButton_hard_5.setBackground(jButton_hard_9.getBackground());
            jButton_hard_9.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }

        check_hard();
    }//GEN-LAST:event_jButton_hard_5ActionPerformed

    private void jButton_hard_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_hard_6ActionPerformed
        String tmp=jButton_hard_6.getText();
        if(jButton_hard_2.getText()=="")
        {
            jButton_hard_6.setText(jButton_hard_2.getText());
            jButton_hard_2.setText(tmp);
            
            Color tmpcolor=jButton_hard_6.getBackground();
            jButton_hard_6.setBackground(jButton_hard_2.getBackground());
            jButton_hard_2.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }
        else if(jButton_hard_5.getText()=="")
        {
            jButton_hard_6.setText(jButton_hard_5.getText());
            jButton_hard_5.setText(tmp);
            
            Color tmpcolor=jButton_hard_6.getBackground();
            jButton_hard_6.setBackground(jButton_hard_5.getBackground());
            jButton_hard_5.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }
        else if(jButton_hard_7.getText()=="")
        {
            jButton_hard_6.setText(jButton_hard_7.getText());
            jButton_hard_7.setText(tmp);
            
            Color tmpcolor=jButton_hard_6.getBackground();
            jButton_hard_6.setBackground(jButton_hard_7.getBackground());
            jButton_hard_7.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }
        else if(jButton_hard_10.getText()=="")
        {
            jButton_hard_6.setText(jButton_hard_10.getText());
            jButton_hard_10.setText(tmp);
            
            Color tmpcolor=jButton_hard_6.getBackground();
            jButton_hard_6.setBackground(jButton_hard_10.getBackground());
            jButton_hard_10.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }

        check_hard();
    }//GEN-LAST:event_jButton_hard_6ActionPerformed

    private void jButton_hard_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_hard_7ActionPerformed
        String tmp=jButton_hard_7.getText();
        if(jButton_hard_3.getText()=="")
        {
            jButton_hard_7.setText(jButton_hard_3.getText());
            jButton_hard_3.setText(tmp);
            
            Color tmpcolor=jButton_hard_7.getBackground();
            jButton_hard_7.setBackground(jButton_hard_3.getBackground());
            jButton_hard_3.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }
        else if(jButton_hard_6.getText()=="")
        {
            jButton_hard_7.setText(jButton_hard_6.getText());
            jButton_hard_6.setText(tmp);
            
            Color tmpcolor=jButton_hard_7.getBackground();
            jButton_hard_7.setBackground(jButton_hard_6.getBackground());
            jButton_hard_6.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }
        else if(jButton_hard_8.getText()=="")
        {
            jButton_hard_7.setText(jButton_hard_8.getText());
            jButton_hard_8.setText(tmp);
            
            Color tmpcolor=jButton_hard_7.getBackground();
            jButton_hard_7.setBackground(jButton_hard_8.getBackground());
            jButton_hard_8.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }
        else if(jButton_hard_11.getText()=="")
        {
            jButton_hard_7.setText(jButton_hard_11.getText());
            jButton_hard_11.setText(tmp);
            
            Color tmpcolor=jButton_hard_7.getBackground();
            jButton_hard_7.setBackground(jButton_hard_11.getBackground());
            jButton_hard_11.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }

        check_hard();
    }//GEN-LAST:event_jButton_hard_7ActionPerformed

    private void jButton_hard_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_hard_8ActionPerformed
        String tmp=jButton_hard_8.getText();
        if(jButton_hard_4.getText()=="")
        {
            jButton_hard_8.setText(jButton_hard_4.getText());
            jButton_hard_4.setText(tmp);
            
            Color tmpcolor=jButton_hard_8.getBackground();
            jButton_hard_8.setBackground(jButton_hard_4.getBackground());
            jButton_hard_4.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }
        else if(jButton_hard_7.getText()=="")
        {
            jButton_hard_8.setText(jButton_hard_7.getText());
            jButton_hard_7.setText(tmp);
            
            Color tmpcolor=jButton_hard_8.getBackground();
            jButton_hard_8.setBackground(jButton_hard_7.getBackground());
            jButton_hard_7.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }
        else if(jButton_hard_12.getText()=="")
        {
            jButton_hard_8.setText(jButton_hard_12.getText());
            jButton_hard_12.setText(tmp);
            
            Color tmpcolor=jButton_hard_8.getBackground();
            jButton_hard_8.setBackground(jButton_hard_12.getBackground());
            jButton_hard_12.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }

        check_hard();
    }//GEN-LAST:event_jButton_hard_8ActionPerformed

    private void jButton_hard_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_hard_9ActionPerformed
        String tmp=jButton_hard_9.getText();
        if(jButton_hard_5.getText()=="")
        {
            jButton_hard_9.setText(jButton_hard_5.getText());
            jButton_hard_5.setText(tmp);
            
            Color tmpcolor=jButton_hard_9.getBackground();
            jButton_hard_9.setBackground(jButton_hard_5.getBackground());
            jButton_hard_5.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }
        else if(jButton_hard_10.getText()=="")
        {
            jButton_hard_9.setText(jButton_hard_10.getText());
            jButton_hard_10.setText(tmp);
            
            Color tmpcolor=jButton_hard_9.getBackground();
            jButton_hard_9.setBackground(jButton_hard_10.getBackground());
            jButton_hard_10.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }
        else if(jButton_hard_13.getText()=="")
        {
            jButton_hard_9.setText(jButton_hard_13.getText());
            jButton_hard_13.setText(tmp);
            
            Color tmpcolor=jButton_hard_9.getBackground();
            jButton_hard_9.setBackground(jButton_hard_13.getBackground());
            jButton_hard_13.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }

        check_hard();
    }//GEN-LAST:event_jButton_hard_9ActionPerformed

    private void jButton_hard_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_hard_10ActionPerformed
        String tmp=jButton_hard_10.getText();
        if(jButton_hard_6.getText()=="")
        {
            jButton_hard_10.setText(jButton_hard_6.getText());
            jButton_hard_6.setText(tmp);
            
            Color tmpcolor=jButton_hard_10.getBackground();
            jButton_hard_10.setBackground(jButton_hard_6.getBackground());
            jButton_hard_6.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }
        else if(jButton_hard_9.getText()=="")
        {
            jButton_hard_10.setText(jButton_hard_9.getText());
            jButton_hard_9.setText(tmp);
            
            Color tmpcolor=jButton_hard_10.getBackground();
            jButton_hard_10.setBackground(jButton_hard_9.getBackground());
            jButton_hard_9.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }
        else if(jButton_hard_11.getText()=="")
        {
            jButton_hard_10.setText(jButton_hard_11.getText());
            jButton_hard_11.setText(tmp);
            
            Color tmpcolor=jButton_hard_10.getBackground();
            jButton_hard_10.setBackground(jButton_hard_11.getBackground());
            jButton_hard_11.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }
        else if(jButton_hard_14.getText()=="")
        {
            jButton_hard_10.setText(jButton_hard_14.getText());
            jButton_hard_14.setText(tmp);
            
            Color tmpcolor=jButton_hard_10.getBackground();
            jButton_hard_10.setBackground(jButton_hard_14.getBackground());
            jButton_hard_14.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }

        check_hard();
    }//GEN-LAST:event_jButton_hard_10ActionPerformed

    private void jButton_hard_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_hard_11ActionPerformed
        String tmp=jButton_hard_11.getText();
        if(jButton_hard_7.getText()=="")
        {
            jButton_hard_11.setText(jButton_hard_7.getText());
            jButton_hard_7.setText(tmp);
            
            Color tmpcolor=jButton_hard_11.getBackground();
            jButton_hard_11.setBackground(jButton_hard_7.getBackground());
            jButton_hard_7.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }
        else if(jButton_hard_10.getText()=="")
        {
            jButton_hard_11.setText(jButton_hard_10.getText());
            jButton_hard_10.setText(tmp);
            
            Color tmpcolor=jButton_hard_11.getBackground();
            jButton_hard_11.setBackground(jButton_hard_10.getBackground());
            jButton_hard_10.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }
        else if(jButton_hard_12.getText()=="")
        {
            jButton_hard_11.setText(jButton_hard_12.getText());
            jButton_hard_12.setText(tmp);
            
            Color tmpcolor=jButton_hard_11.getBackground();
            jButton_hard_11.setBackground(jButton_hard_12.getBackground());
            jButton_hard_12.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }
        else if(jButton_hard_15.getText()=="")
        {
            jButton_hard_11.setText(jButton_hard_15.getText());
            jButton_hard_15.setText(tmp);
            
            Color tmpcolor=jButton_hard_11.getBackground();
            jButton_hard_11.setBackground(jButton_hard_15.getBackground());
            jButton_hard_15.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }

        check_hard();
    }//GEN-LAST:event_jButton_hard_11ActionPerformed

    private void jButton_hard_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_hard_12ActionPerformed
        String tmp=jButton_hard_12.getText();
        if(jButton_hard_8.getText()=="")
        {
            jButton_hard_12.setText(jButton_hard_8.getText());
            jButton_hard_8.setText(tmp);
            
            Color tmpcolor=jButton_hard_12.getBackground();
            jButton_hard_12.setBackground(jButton_hard_8.getBackground());
            jButton_hard_8.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }
        else if(jButton_hard_11.getText()=="")
        {
            jButton_hard_12.setText(jButton_hard_11.getText());
            jButton_hard_11.setText(tmp);
            
            Color tmpcolor=jButton_hard_12.getBackground();
            jButton_hard_12.setBackground(jButton_hard_11.getBackground());
            jButton_hard_11.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }
        else if(jButton_hard_16.getText()=="")
        {
            jButton_hard_12.setText(jButton_hard_16.getText());
            jButton_hard_16.setText(tmp);
            
            Color tmpcolor=jButton_hard_12.getBackground();
            jButton_hard_12.setBackground(jButton_hard_16.getBackground());
            jButton_hard_16.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }

        check_hard();
    }//GEN-LAST:event_jButton_hard_12ActionPerformed

    private void jButton_hard_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_hard_13ActionPerformed
        String tmp=jButton_hard_13.getText();
        if(jButton_hard_9.getText()=="")
        {
            jButton_hard_13.setText(jButton_hard_9.getText());
            jButton_hard_9.setText(tmp);
            
            Color tmpcolor=jButton_hard_13.getBackground();
            jButton_hard_13.setBackground(jButton_hard_9.getBackground());
            jButton_hard_9.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }
        else if(jButton_hard_14.getText()=="")
        {
            jButton_hard_13.setText(jButton_hard_14.getText());
            jButton_hard_14.setText(tmp);
            
            Color tmpcolor=jButton_hard_13.getBackground();
            jButton_hard_13.setBackground(jButton_hard_14.getBackground());
            jButton_hard_14.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }

        check_hard();
    }//GEN-LAST:event_jButton_hard_13ActionPerformed

    private void jButton_hard_14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_hard_14ActionPerformed
        String tmp=jButton_hard_14.getText();
        if(jButton_hard_10.getText()=="")
        {
            jButton_hard_14.setText(jButton_hard_10.getText());
            jButton_hard_10.setText(tmp);
            
            Color tmpcolor=jButton_hard_14.getBackground();
            jButton_hard_14.setBackground(jButton_hard_10.getBackground());
            jButton_hard_10.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }
        else if(jButton_hard_13.getText()=="")
        {
            jButton_hard_14.setText(jButton_hard_13.getText());
            jButton_hard_13.setText(tmp);
            
            Color tmpcolor=jButton_hard_14.getBackground();
            jButton_hard_14.setBackground(jButton_hard_13.getBackground());
            jButton_hard_13.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }
        else if(jButton_hard_15.getText()=="")
        {
            jButton_hard_14.setText(jButton_hard_15.getText());
            jButton_hard_15.setText(tmp);
            
            Color tmpcolor=jButton_hard_14.getBackground();
            jButton_hard_14.setBackground(jButton_hard_15.getBackground());
            jButton_hard_15.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }

        check_hard();
    }//GEN-LAST:event_jButton_hard_14ActionPerformed

    private void jButton_hard_15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_hard_15ActionPerformed
        String tmp=jButton_hard_15.getText();
        if(jButton_hard_11.getText()=="")
        {
            jButton_hard_15.setText(jButton_hard_11.getText());
            jButton_hard_11.setText(tmp);
            
            Color tmpcolor=jButton_hard_15.getBackground();
            jButton_hard_15.setBackground(jButton_hard_11.getBackground());
            jButton_hard_11.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }
        else if(jButton_hard_14.getText()=="")
        {
            jButton_hard_15.setText(jButton_hard_14.getText());
            jButton_hard_14.setText(tmp);
            
            Color tmpcolor=jButton_hard_15.getBackground();
            jButton_hard_15.setBackground(jButton_hard_14.getBackground());
            jButton_hard_14.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }
        else if(jButton_hard_16.getText()=="")
        {
            jButton_hard_15.setText(jButton_hard_16.getText());
            jButton_hard_16.setText(tmp);
            
            Color tmpcolor=jButton_hard_15.getBackground();
            jButton_hard_15.setBackground(jButton_hard_16.getBackground());
            jButton_hard_16.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }

        check_hard();
    }//GEN-LAST:event_jButton_hard_15ActionPerformed

    private void jButton_hard_16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_hard_16ActionPerformed
        String tmp=jButton_hard_16.getText();
        if(jButton_hard_12.getText()=="")
        {
            jButton_hard_16.setText(jButton_hard_12.getText());
            jButton_hard_12.setText(tmp);
            
            Color tmpcolor=jButton_hard_16.getBackground();
            jButton_hard_16.setBackground(jButton_hard_12.getBackground());
            jButton_hard_12.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }
        else if(jButton_hard_15.getText()=="")
        {
            jButton_hard_16.setText(jButton_hard_15.getText());
            jButton_hard_15.setText(tmp);
            
            Color tmpcolor=jButton_hard_16.getBackground();
            jButton_hard_16.setBackground(jButton_hard_15.getBackground());
            jButton_hard_15.setBackground(tmpcolor);
            
            flipcount++;
            jLabel_flip.setText(" Flip : "+flipcount);
        }

        check_hard();
    }//GEN-LAST:event_jButton_hard_16ActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(puzzle_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(puzzle_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(puzzle_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(puzzle_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new puzzle_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_close_game;
    private javax.swing.JButton jButton_easy_1;
    private javax.swing.JButton jButton_easy_2;
    private javax.swing.JButton jButton_easy_3;
    private javax.swing.JButton jButton_easy_4;
    private javax.swing.JButton jButton_easy_5;
    private javax.swing.JButton jButton_easy_6;
    private javax.swing.JButton jButton_easy_7;
    private javax.swing.JButton jButton_easy_8;
    private javax.swing.JButton jButton_easy_9;
    private javax.swing.JButton jButton_hard_1;
    private javax.swing.JButton jButton_hard_10;
    private javax.swing.JButton jButton_hard_11;
    private javax.swing.JButton jButton_hard_12;
    private javax.swing.JButton jButton_hard_13;
    private javax.swing.JButton jButton_hard_14;
    private javax.swing.JButton jButton_hard_15;
    private javax.swing.JButton jButton_hard_16;
    private javax.swing.JButton jButton_hard_2;
    private javax.swing.JButton jButton_hard_3;
    private javax.swing.JButton jButton_hard_4;
    private javax.swing.JButton jButton_hard_5;
    private javax.swing.JButton jButton_hard_6;
    private javax.swing.JButton jButton_hard_7;
    private javax.swing.JButton jButton_hard_8;
    private javax.swing.JButton jButton_hard_9;
    private javax.swing.JButton jButton_high_score;
    private javax.swing.JButton jButton_new_game;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_flip;
    private javax.swing.JLabel jLabel_score_1;
    private javax.swing.JLabel jLabel_score_2;
    private javax.swing.JLabel jLabel_score_3;
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
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanel_easy;
    private javax.swing.JPanel jPanel_hard;
    // End of variables declaration//GEN-END:variables
}
