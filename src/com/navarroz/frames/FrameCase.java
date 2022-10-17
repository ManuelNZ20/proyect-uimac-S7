package com.navarroz.frames;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Color;
import javax.swing.JOptionPane;

public class FrameCase extends javax.swing.JFrame {

    private int x, y;
    private float score = 0;

    public FrameCase() {
        initComponents();
        setBackground(new Color(255, 255, 255, 0));
        jEditorPane1.setText("PROBLEMA\n"
                + "Se pretende realizar una aplicación en JFrame de Java  aplicando relaciones entre clases (POO) para una facultad que gestione la información sobre las personas vinculadas con la misma, que se pueden clasificar en tres tipos: estudiantes, profesores y personal de servicio. A continuación, se detalla qué tipo de información debe gestionar esta aplicación:");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new com.navarroz.component.PanelRound();
        panelRound2 = new com.navarroz.component.PanelRound();
        buttonRound1 = new com.navarroz.component.ButtonRound();
        buttonRound2 = new com.navarroz.component.ButtonRound();
        buttonRound3 = new com.navarroz.component.ButtonRound();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        chkItem1 = new javax.swing.JCheckBox();
        chkItem2 = new javax.swing.JCheckBox();
        chkItem3 = new javax.swing.JCheckBox();
        chkItem4 = new javax.swing.JCheckBox();
        chkItem5 = new javax.swing.JCheckBox();
        chkItem6 = new javax.swing.JCheckBox();
        chkItem7 = new javax.swing.JCheckBox();
        chkItem8 = new javax.swing.JCheckBox();
        buttonRound4 = new com.navarroz.component.ButtonRound();

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

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jEditorPane1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(jEditorPane1);

        jCheckBox1.setFont(new java.awt.Font("Cascadia Mono Light", 0, 12)); // NOI18N
        jCheckBox1.setSelected(true);
        jCheckBox1.setText("<html>Con respecto a los empleados, sean del tipo que sean, hay que saber su año de incorporación a la facultad y qué número de despacho tienen asignado. </html>");

        jCheckBox2.setFont(new java.awt.Font("Cascadia Mono Light", 0, 12)); // NOI18N
        jCheckBox2.setSelected(true);
        jCheckBox2.setText("<html>Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de DNI y su estado civil.</html>");

        jCheckBox3.setFont(new java.awt.Font("Cascadia Mono Light", 0, 12)); // NOI18N
        jCheckBox3.setSelected(true);
        jCheckBox3.setText("<html>En cuanto a los estudiantes, se requiere registrar los cursos que llevará en el presente ciclo académico , los cuales no debe sobrepasar el número de créditos permitidos que se debe llevar por ciclo.</html>");

        jCheckBox4.setFont(new java.awt.Font("Cascadia Mono Light", 0, 12)); // NOI18N
        jCheckBox4.setSelected(true);
        jCheckBox4.setText("<html>Sobre el personal de servicio, hay que conocer a qué sección están asignados (biblioteca, decanato, secretaría, ...). </html>");

        jCheckBox5.setFont(new java.awt.Font("Cascadia Mono Light", 0, 12)); // NOI18N
        jCheckBox5.setSelected(true);
        jCheckBox5.setText("<html>Por lo que se refiere a los profesores, es necesario gestionar a qué departamento pertenecen (Ingenierías, matemáticas, arquitectura, ...). </html>");

        chkItem1.setFont(new java.awt.Font("Cascadia Mono Light", 0, 12)); // NOI18N
        chkItem1.setText("Cambio del estado civil de una persona.   ");
        chkItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkItem1ActionPerformed(evt);
            }
        });

        chkItem2.setFont(new java.awt.Font("Cascadia Mono Light", 0, 12)); // NOI18N
        chkItem2.setText("Reasignación de despacho a un empleado.");
        chkItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkItem2ActionPerformed(evt);
            }
        });

        chkItem3.setFont(new java.awt.Font("Cascadia Mono Light", 0, 12)); // NOI18N
        chkItem3.setText("Matriculación de un estudiante en un nuevo curso. ");
        chkItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkItem3ActionPerformed(evt);
            }
        });

        chkItem4.setFont(new java.awt.Font("Cascadia Mono Light", 0, 12)); // NOI18N
        chkItem4.setText("<html>Listar los cursos matriculados por estudiante y el total de créditos que llevará en el ciclo.</html>");
        chkItem4.setToolTipText("");
        chkItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkItem4ActionPerformed(evt);
            }
        });

        chkItem5.setFont(new java.awt.Font("Cascadia Mono Light", 0, 12)); // NOI18N
        chkItem5.setText("Cambio de departamento de un profesor. ");
        chkItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkItem5ActionPerformed(evt);
            }
        });

        chkItem6.setFont(new java.awt.Font("Cascadia Mono Light", 0, 12)); // NOI18N
        chkItem6.setText("Listar los cursos que dictará cada profesor ");
        chkItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkItem6ActionPerformed(evt);
            }
        });

        chkItem7.setFont(new java.awt.Font("Cascadia Mono Light", 0, 12)); // NOI18N
        chkItem7.setText("Traslado de sección de un empleado del personal de servicio. ");
        chkItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkItem7ActionPerformed(evt);
            }
        });

        chkItem8.setFont(new java.awt.Font("Cascadia Mono Light", 0, 12)); // NOI18N
        chkItem8.setText("<html>Imprimir toda la información de cada tipo de individuo. Incluya un programa de prueba que instancie objetos de los distintos tipos y pruebe los métodos desarrollados. </html>");
        chkItem8.setToolTipText("");
        chkItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkItem8ActionPerformed(evt);
            }
        });

        buttonRound4.setBackground(new java.awt.Color(0, 153, 153));
        buttonRound4.setForeground(new java.awt.Color(255, 255, 255));
        buttonRound4.setText("EVALUAR");
        buttonRound4.setFont(new java.awt.Font("Cascadia Mono Light", 0, 14)); // NOI18N
        buttonRound4.setRadius(20);
        buttonRound4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRound4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkItem3, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkItem2, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkItem1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkItem4, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(buttonRound4, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(chkItem7, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkItem6, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkItem5, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkItem8, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jCheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(chkItem1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(chkItem2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(chkItem3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(chkItem5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(chkItem6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(chkItem7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(chkItem4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(buttonRound4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(chkItem8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
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
        dispose();
    }//GEN-LAST:event_buttonRound1ActionPerformed

    private void chkItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkItem1ActionPerformed
        score = (chkItem1.isSelected()) ? score + 2.5f : score - 2.5f;
    }//GEN-LAST:event_chkItem1ActionPerformed

    private void chkItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkItem2ActionPerformed
        score = (chkItem2.isSelected()) ? score + 2.5f : score - 2.5f;
    }//GEN-LAST:event_chkItem2ActionPerformed

    private void chkItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkItem3ActionPerformed
        score = (chkItem3.isSelected()) ? score + 2.5f : score - 2.5f;
    }//GEN-LAST:event_chkItem3ActionPerformed

    private void chkItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkItem8ActionPerformed
        score = (chkItem8.isSelected()) ? score + 2.5f : score - 2.5f;
    }//GEN-LAST:event_chkItem8ActionPerformed

    private void chkItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkItem5ActionPerformed
        score = (chkItem5.isSelected()) ? score + 2.5f : score - 2.5f;
    }//GEN-LAST:event_chkItem5ActionPerformed

    private void chkItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkItem6ActionPerformed
        score = (chkItem6.isSelected()) ? score + 2.5f : score - 2.5f;
    }//GEN-LAST:event_chkItem6ActionPerformed

    private void chkItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkItem7ActionPerformed
        score = (chkItem7.isSelected()) ? score + 2.5f : score - 2.5f;
    }//GEN-LAST:event_chkItem7ActionPerformed

    private void chkItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkItem4ActionPerformed
        score = (chkItem4.isSelected()) ? score + 2.5f : score - 2.5f;
    }//GEN-LAST:event_chkItem4ActionPerformed

    private void buttonRound4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRound4ActionPerformed
        JOptionPane.showMessageDialog(null, "Puntaje: "+score);
    }//GEN-LAST:event_buttonRound4ActionPerformed

    public static void main(String args[]) {
        FlatDarkLaf.setup();
        java.awt.EventQueue.invokeLater(() -> {
            new FrameCase().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.navarroz.component.ButtonRound buttonRound1;
    private com.navarroz.component.ButtonRound buttonRound2;
    private com.navarroz.component.ButtonRound buttonRound3;
    private com.navarroz.component.ButtonRound buttonRound4;
    private javax.swing.JCheckBox chkItem1;
    private javax.swing.JCheckBox chkItem2;
    private javax.swing.JCheckBox chkItem3;
    private javax.swing.JCheckBox chkItem4;
    private javax.swing.JCheckBox chkItem5;
    private javax.swing.JCheckBox chkItem6;
    private javax.swing.JCheckBox chkItem7;
    private javax.swing.JCheckBox chkItem8;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private com.navarroz.component.PanelRound panelRound1;
    private com.navarroz.component.PanelRound panelRound2;
    // End of variables declaration//GEN-END:variables
}
