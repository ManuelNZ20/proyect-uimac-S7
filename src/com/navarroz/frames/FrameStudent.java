/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.navarroz.frames;

import com.formdev.flatlaf.FlatDarkLaf;
import com.navarroz.data.CycleData;
import com.navarroze.uml.Cycle;
import com.navarroze.uml.Student;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Toolkit;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author MANUEL
 */
public class FrameStudent extends javax.swing.JFrame {

    private int x, y;
    boolean xtat;
    DefaultComboBoxModel modelCycle;
    private DefaultTableModel model;
    private boolean valueApproved = true;
    private HashMap<String, Student> mapStudent;
    private Student st;

    public FrameStudent() {
        initComponents();
        setBackground(new Color(255, 255, 255, 0));
        completeComboCycle();
        mapStudent = new HashMap<>();
        completTable();
        defineTable(table);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelRound2 = new com.navarroz.component.PanelRound();
        panelTop = new com.navarroz.component.PanelRound();
        btnExit = new com.navarroz.component.ButtonRound();
        btnExpan = new com.navarroz.component.ButtonRound();
        btnMinWindow = new com.navarroz.component.ButtonRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        panelRound7 = new com.navarroz.component.PanelRound();
        cboCivil = new javax.swing.JComboBox<>();
        sAge = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCredits = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbCycle = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        btnSearch = new com.navarroz.component.LabelRound();
        btnAddCourse = new com.navarroz.component.ButtonRound();
        panelRound9 = new com.navarroz.component.PanelRound();
        btnAdd = new com.navarroz.component.ButtonRound();
        btnUpdate = new com.navarroz.component.ButtonRound();
        btnToList = new com.navarroz.component.ButtonRound();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelRound2.setBackground(new java.awt.Color(51, 51, 51));
        panelRound2.setRoundBottomLeft(50);
        panelRound2.setRoundBottomRight(50);
        panelRound2.setRoundTopLeft(50);
        panelRound2.setRoundTopRight(50);
        panelRound2.setLayout(new java.awt.GridBagLayout());

        panelTop.setBackground(new java.awt.Color(0, 0, 0));
        panelTop.setRoundTopLeft(50);
        panelTop.setRoundTopRight(50);
        panelTop.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelTopMouseDragged(evt);
            }
        });
        panelTop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelTopMousePressed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 51, 51));
        btnExit.setRadius(15);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnExpan.setBackground(new java.awt.Color(255, 204, 0));
        btnExpan.setRadius(15);
        btnExpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExpanActionPerformed(evt);
            }
        });

        btnMinWindow.setBackground(new java.awt.Color(0, 204, 153));
        btnMinWindow.setRadius(15);
        btnMinWindow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinWindowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTopLayout = new javax.swing.GroupLayout(panelTop);
        panelTop.setLayout(panelTopLayout);
        panelTopLayout.setHorizontalGroup(
            panelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExpan, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMinWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTopLayout.setVerticalGroup(
            panelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTopLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMinWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExpan, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 750;
        gridBagConstraints.ipady = -80;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        panelRound2.add(panelTop, gridBagConstraints);

        table.setFont(new java.awt.Font("Cascadia Mono Light", 0, 10)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(table);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 750;
        gridBagConstraints.ipady = 174;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 25, 0);
        panelRound2.add(jScrollPane1, gridBagConstraints);

        panelRound7.setBackground(new java.awt.Color(24, 24, 25));
        panelRound7.setRoundBottomLeft(50);
        panelRound7.setRoundBottomRight(50);
        panelRound7.setRoundTopLeft(50);
        panelRound7.setRoundTopRight(50);

        cboCivil.setFont(new java.awt.Font("Cascadia Mono PL Light", 0, 12)); // NOI18N
        cboCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Soltero", "Casado" }));

        sAge.setFont(new java.awt.Font("Cascadia Mono PL Light", 0, 12)); // NOI18N
        sAge.setModel(new javax.swing.SpinnerNumberModel(16, 16, 126, 1));

        jLabel5.setFont(new java.awt.Font("Cascadia Mono Light", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Estado Civil");

        jLabel8.setFont(new java.awt.Font("Cascadia Mono Light", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Edad");

        jLabel4.setFont(new java.awt.Font("Cascadia Mono Light", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("DNI");

        txtDNI.setFont(new java.awt.Font("Cascadia Mono Light", 0, 12)); // NOI18N
        txtDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDNIKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Cascadia Mono Light", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Nombre");

        txtName.setFont(new java.awt.Font("Cascadia Mono Light", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Cascadia Mono Light", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Apellido");

        txtLastName.setFont(new java.awt.Font("Cascadia Mono Light", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Cascadia Mono Light", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Creditos");

        txtCredits.setFont(new java.awt.Font("Cascadia Mono Light", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Cascadia Mono Light", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Ciclo");

        cbCycle.setFont(new java.awt.Font("Cascadia Mono PL Light", 0, 12)); // NOI18N
        cbCycle.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbCycleItemStateChanged(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Cascadia Mono Light", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Datos personales");

        btnSearch.setBackground(new java.awt.Color(0, 153, 153));
        btnSearch.setForeground(new java.awt.Color(204, 204, 204));
        btnSearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSearch.setText("Buscar");
        btnSearch.setFocusCycleRoot(true);
        btnSearch.setFont(new java.awt.Font("Cascadia Mono Light", 0, 12)); // NOI18N
        btnSearch.setRoundBottomRight(15);
        btnSearch.setRoundTopRight(15);
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSearchMouseEntered(evt);
            }
        });

        btnAddCourse.setBackground(new java.awt.Color(0, 153, 153));
        btnAddCourse.setForeground(new java.awt.Color(51, 51, 51));
        btnAddCourse.setText("+ Curso");
        btnAddCourse.setFont(new java.awt.Font("Cascadia Mono Light", 0, 12)); // NOI18N
        btnAddCourse.setRadius(30);
        btnAddCourse.setEnabled(false);
        btnAddCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCourseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound7Layout = new javax.swing.GroupLayout(panelRound7);
        panelRound7.setLayout(panelRound7Layout);
        panelRound7Layout.setHorizontalGroup(
            panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound7Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cboCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRound7Layout.createSequentialGroup()
                        .addGroup(panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelRound7Layout.createSequentialGroup()
                                .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(sAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                            .addComponent(txtLastName))
                        .addGap(40, 40, 40)
                        .addGroup(panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(29, 29, 29)
                        .addGroup(panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbCycle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCredits, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(88, 88, 88))
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        panelRound7Layout.setVerticalGroup(
            panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound7Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbCycle, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtLastName)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCredits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sAge, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        panelRound2.add(panelRound7, gridBagConstraints);

        panelRound9.setBackground(new java.awt.Color(24, 24, 25));
        panelRound9.setRoundBottomLeft(50);
        panelRound9.setLayout(new java.awt.GridBagLayout());

        btnAdd.setBackground(new java.awt.Color(0, 153, 153));
        btnAdd.setForeground(new java.awt.Color(51, 51, 51));
        btnAdd.setText("* Agregar");
        btnAdd.setFont(new java.awt.Font("Cascadia Mono Light", 0, 12)); // NOI18N
        btnAdd.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAdd.setRadius(50);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        panelRound9.add(btnAdd, gridBagConstraints);

        btnUpdate.setBackground(new java.awt.Color(0, 153, 153));
        btnUpdate.setForeground(new java.awt.Color(51, 51, 51));
        btnUpdate.setText("* Actualizar");
        btnUpdate.setFont(new java.awt.Font("Cascadia Mono Light", 0, 12)); // NOI18N
        btnUpdate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnUpdate.setRadius(50);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        panelRound9.add(btnUpdate, gridBagConstraints);

        btnToList.setBackground(new java.awt.Color(0, 153, 153));
        btnToList.setForeground(new java.awt.Color(51, 51, 51));
        btnToList.setText("* Listar");
        btnToList.setFont(new java.awt.Font("Cascadia Mono Light", 0, 12)); // NOI18N
        btnToList.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnToList.setRadius(50);
        btnToList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToListActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        panelRound9.add(btnToList, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        panelRound2.add(panelRound9, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound2, javax.swing.GroupLayout.DEFAULT_SIZE, 1102, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound2, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void panelTopMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelTopMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_panelTopMousePressed

    private void panelTopMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelTopMouseDragged
        if (getExtendedState() == JFrame.MAXIMIZED_BOTH) {
            setExtendedState(JFrame.NORMAL);
        }
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_panelTopMouseDragged

    private void btnExpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExpanActionPerformed
        if (getExtendedState() == JFrame.MAXIMIZED_BOTH) {
            setExtendedState(JFrame.NORMAL);
        } else {
            setExtendedState(JFrame.MAXIMIZED_BOTH);
        }
    }//GEN-LAST:event_btnExpanActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnMinWindowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinWindowActionPerformed
        setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btnMinWindowActionPerformed

    private void btnAddCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCourseActionPerformed
        FramCourse frmCourse = new FramCourse(this, true, st);
        frmCourse.setVisible(true);
    }//GEN-LAST:event_btnAddCourseActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (valueApproved) {
            mapStudent.put(getDNI(), new Student(
                    new Cycle(getCycle(), getCredits()),
                    getDNI(),
                    getNameStudent(),
                    getLastName(),
                    getAge(),
                    getCivil()));
            completTable();
            clearBoxes();
        } else {
            valueApproved = true;
            JOptionPane.showMessageDialog(null, "No puede ingresar datos\nalgunos campos son incorrectos");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDNIKeyTyped
        if (txtDNI.getText().length() >= 8) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtDNIKeyTyped

    private void cbCycleItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCycleItemStateChanged
        txtCredits.setText(String.valueOf(((Cycle) cbCycle.getSelectedItem()).getCredits()));
    }//GEN-LAST:event_cbCycleItemStateChanged

    private void btnSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseEntered
        btnSearch.setCursor(new Cursor(Cursor.HAND_CURSOR) {
        });
    }//GEN-LAST:event_btnSearchMouseEntered

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (st != null) {
            st.setName_(getNameStudent());
            st.setLastName(getLastName());
            st.setCivilStatus(getCivil());
            clearBoxes();
            completTable();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked
        if (!getDNI().isEmpty()) {
            st = mapStudent.get(getDNI());
            completeBoxes(st);
            btnAddCourse.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar un DNI correcto");
        }
    }//GEN-LAST:event_btnSearchMouseClicked

    private void btnToListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToListActionPerformed
        completTable();
        btnAddCourse.setEnabled(false);
        clearBoxes();
    }//GEN-LAST:event_btnToListActionPerformed

    public void completeBoxes(Student s) {
        txtDNI.setText(s.getDni());
        txtName.setText(s.getName_());
        txtLastName.setText(s.getLastName());
        sAge.setValue(s.getAge());
        cboCivil.setSelectedItem(s.getCivilStatus());
        cbCycle.setSelectedItem(s.getCycle().getIdCycle());
        txtCredits.setText("" + s.getCycle().getCredits());
    }

    public void clearBoxes() {
        txtDNI.setText("");
        txtName.setText("");
        txtLastName.setText("");
        sAge.setValue(16);
        cboCivil.setSelectedIndex(0);
        cbCycle.setSelectedIndex(0);
        txtCredits.setText("");
        txtDNI.requestFocus();

    }

    public String getDNI() {
        return txtDNI.getText();
    }

    public String getNameStudent() {
        return txtName.getText();
    }

    public String getLastName() {
        return txtLastName.getText();
    }

    public byte getAge() {
        try {
            return Byte.valueOf(sAge.getValue().toString());
        } catch (NumberFormatException e) {
            valueApproved = false;
            return Byte.MIN_VALUE;
        }
    }

    public String getCivil() {
        if (cboCivil.getSelectedIndex() != 0) {
            return cboCivil.getSelectedItem().toString();
        }
        valueApproved = false;
        JOptionPane.showMessageDialog(null, "Debe seleccionar un estado civil");
        return "";
    }

    private void completeComboCycle() {
        modelCycle = new DefaultComboBoxModel<>(new CycleData().getVector());
        cbCycle.setModel(modelCycle);
    }

    public String getCycle() {
        if (cboCivil.getSelectedIndex() != 0) {
            return cbCycle.getSelectedItem().toString();
        }
        valueApproved = false;
        JOptionPane.showMessageDialog(null, "Debe seleccionar un ciclo");
        return "";
    }

    public float getCredits() {
        return Float.valueOf(txtCredits.getText());
    }

    private void completTable() {
        model = new DefaultTableModel(new Object[][]{}, new Object[]{
            "DNI", "Nombre", "Apellido", "Edad", "E. Civil", "Ciclo", "Creditos"
        });
        table.setModel(model);
        defineTable(table);
        for (HashMap.Entry<String, Student> entry : mapStudent.entrySet()) {
            Student s = entry.getValue();
            model.addRow(new Object[]{s.getDni(), s.getName_(), s.getLastName(), s.getAge(), s.getCivilStatus(),
                s.getCycle().getIdCycle(), s.getCycle().getCredits()});
        }
    }

    private void defineTable(javax.swing.JTable table) {
        TableColumn column;
        column = table.getColumnModel().getColumn(0);
        column.setPreferredWidth(10);
        column = table.getColumnModel().getColumn(1);
        column.setPreferredWidth(100);
        column = table.getColumnModel().getColumn(2);
        column.setPreferredWidth(100);
        column = table.getColumnModel().getColumn(3);
        column.setPreferredWidth(10);
        column = table.getColumnModel().getColumn(4);
        column.setPreferredWidth(60);
        column = table.getColumnModel().getColumn(5);
        column.setPreferredWidth(10);
        column = table.getColumnModel().getColumn(6);
        column.setPreferredWidth(10);
        table.getTableHeader().setReorderingAllowed(false);
        table.getTableHeader().setResizingAllowed(false);

    }

    public static void main(String args[]) {
        FlatDarkLaf.setup();
        java.awt.EventQueue.invokeLater(() -> {
            new FrameStudent().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.navarroz.component.ButtonRound btnAdd;
    private com.navarroz.component.ButtonRound btnAddCourse;
    private com.navarroz.component.ButtonRound btnExit;
    private com.navarroz.component.ButtonRound btnExpan;
    private com.navarroz.component.ButtonRound btnMinWindow;
    private com.navarroz.component.LabelRound btnSearch;
    private com.navarroz.component.ButtonRound btnToList;
    private com.navarroz.component.ButtonRound btnUpdate;
    private javax.swing.JComboBox<String> cbCycle;
    private javax.swing.JComboBox<String> cboCivil;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private com.navarroz.component.PanelRound panelRound2;
    private com.navarroz.component.PanelRound panelRound7;
    private com.navarroz.component.PanelRound panelRound9;
    private com.navarroz.component.PanelRound panelTop;
    private javax.swing.JSpinner sAge;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtCredits;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
