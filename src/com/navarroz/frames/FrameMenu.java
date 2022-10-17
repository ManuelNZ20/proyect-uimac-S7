package com.navarroz.frames;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Color;

public class FrameMenu extends javax.swing.JFrame {

    private int x, y;

    public FrameMenu() {
        initComponents();
        setBackground(new Color(255, 255, 255, 0));
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelRound1 = new com.navarroz.component.PanelRound();
        panelRound2 = new com.navarroz.component.PanelRound();
        buttonRound1 = new com.navarroz.component.ButtonRound();
        buttonRound2 = new com.navarroz.component.ButtonRound();
        buttonRound3 = new com.navarroz.component.ButtonRound();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        btnStudent = new com.navarroz.component.ButtonRound();
        btnTeacher = new com.navarroz.component.ButtonRound();
        btnServiceStaff = new com.navarroz.component.ButtonRound();
        btnCycle = new com.navarroz.component.ButtonRound();
        btnCase = new com.navarroz.component.ButtonRound();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelRound1.setBackground(new java.awt.Color(51, 51, 51));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);

        panelRound2.setBackground(new java.awt.Color(0, 0, 0));
        panelRound2.setRoundTopLeft(50);
        panelRound2.setRoundTopRight(50);
        panelRound2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelRound2MouseDragged(evt);
            }
        });
        panelRound2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelRound2MousePressed(evt);
            }
        });

        buttonRound1.setBackground(new java.awt.Color(255, 51, 51));
        buttonRound1.setRadius(15);
        buttonRound1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRound1ActionPerformed(evt);
            }
        });

        buttonRound2.setBackground(new java.awt.Color(255, 204, 51));
        buttonRound2.setRadius(15);

        buttonRound3.setBackground(new java.awt.Color(0, 204, 204));
        buttonRound3.setRadius(15);

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonRound2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonRound3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonRound2, javax.swing.GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
                    .addComponent(buttonRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonRound3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.setLayout(new java.awt.GridBagLayout());

        btnStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/webinar.png"))); // NOI18N
        btnStudent.setRadius(50);
        btnStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 40;
        gridBagConstraints.insets = new java.awt.Insets(50, 30, 50, 30);
        jPanel1.add(btnStudent, gridBagConstraints);

        btnTeacher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hombre.png"))); // NOI18N
        btnTeacher.setRadius(50);
        btnTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeacherActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 40;
        gridBagConstraints.insets = new java.awt.Insets(50, 30, 50, 30);
        jPanel1.add(btnTeacher, gridBagConstraints);

        btnServiceStaff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/servicio-al-cliente.png"))); // NOI18N
        btnServiceStaff.setRadius(50);
        btnServiceStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServiceStaffActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 40;
        gridBagConstraints.insets = new java.awt.Insets(50, 30, 50, 30);
        jPanel1.add(btnServiceStaff, gridBagConstraints);

        btnCycle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cascada.png"))); // NOI18N
        btnCycle.setRadius(50);
        btnCycle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCycleActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 40;
        gridBagConstraints.insets = new java.awt.Insets(50, 30, 50, 30);
        jPanel1.add(btnCycle, gridBagConstraints);

        btnCase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lista-de-tareas.png"))); // NOI18N
        btnCase.setRadius(50);
        btnCase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaseActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 40;
        gridBagConstraints.insets = new java.awt.Insets(50, 30, 50, 30);
        jPanel1.add(btnCase, gridBagConstraints);

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void panelRound2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRound2MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_panelRound2MousePressed

    private void panelRound2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRound2MouseDragged
        this.setLocation(getLocation().x + evt.getX() - x, getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_panelRound2MouseDragged

    private void buttonRound1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRound1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_buttonRound1ActionPerformed

    private void btnServiceStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServiceStaffActionPerformed
        new FrameServiceStaff().setVisible(true);
    }//GEN-LAST:event_btnServiceStaffActionPerformed

    private void btnCaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaseActionPerformed
        new FrameCase().setVisible(true);
    }//GEN-LAST:event_btnCaseActionPerformed

    private void btnStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentActionPerformed
        new FrameStudent().setVisible(true);
    }//GEN-LAST:event_btnStudentActionPerformed

    private void btnTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeacherActionPerformed
        new FrameTeacher().setVisible(true);
    }//GEN-LAST:event_btnTeacherActionPerformed

    private void btnCycleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCycleActionPerformed
        new CourseDate().setVisible(true);
    }//GEN-LAST:event_btnCycleActionPerformed

    public static void main(String args[]) {
        FlatDarkLaf.setup();
        java.awt.EventQueue.invokeLater(() -> {
            new FrameMenu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.navarroz.component.ButtonRound btnCase;
    private com.navarroz.component.ButtonRound btnCycle;
    private com.navarroz.component.ButtonRound btnServiceStaff;
    private com.navarroz.component.ButtonRound btnStudent;
    private com.navarroz.component.ButtonRound btnTeacher;
    private com.navarroz.component.ButtonRound buttonRound1;
    private com.navarroz.component.ButtonRound buttonRound2;
    private com.navarroz.component.ButtonRound buttonRound3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.navarroz.component.PanelRound panelRound1;
    private com.navarroz.component.PanelRound panelRound2;
    // End of variables declaration//GEN-END:variables
}
