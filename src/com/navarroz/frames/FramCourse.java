package com.navarroz.frames;

import com.formdev.flatlaf.FlatDarkLaf;
import com.navarroz.data.CourseData;
import com.navarroze.uml.Course;
import com.navarroze.uml.Enroll;
import com.navarroze.uml.Student;
import com.navarroze.uml.Teacher;
import com.navarroze.uml.Tuition;
import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class FramCourse extends javax.swing.JDialog {

    private int x, y;
    private Teacher t;
    private Student s;
    private CourseData data;
    private Enroll enroll;
    public FramCourse(java.awt.Frame parent, boolean modal, Object object) {
        super(parent, modal);
        initComponents();
        setBackground(new Color(255, 255, 255, 0));
        this.data = new CourseData();
        if (object instanceof Teacher) {
            this.t = (Teacher) object;
            lbltotalCredits.setVisible(false);
            jLabel2.setVisible(false);
            btnPrintTuition.setVisible(false);
        } else {
            this.s = (Student) object;
            lbltotalCredits.setText(String.valueOf(s.getTotalCredits()));
            enroll = new Enroll();
        }
        completeTable();
        listCourse();
        tableDefineColumn(tableList);
        tableDefineColumn(tableCourseAssign);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new com.navarroz.component.PanelRound();
        panelTop = new com.navarroz.component.PanelRound();
        btnRegister = new com.navarroz.component.ButtonRound();
        btnAssign = new com.navarroz.component.ButtonRound();
        lbltotalCredits = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnRemove = new com.navarroz.component.ButtonRound();
        btnPrintTuition = new com.navarroz.component.ButtonRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableList = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableCourseAssign = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        panelRound1.setBackground(new java.awt.Color(51, 51, 51));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);

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

        btnRegister.setBackground(new java.awt.Color(0, 153, 153));
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Registrar");
        btnRegister.setFont(new java.awt.Font("Cascadia Mono Light", 0, 14)); // NOI18N
        btnRegister.setRadius(15);
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        btnAssign.setBackground(new java.awt.Color(0, 102, 153));
        btnAssign.setForeground(new java.awt.Color(255, 255, 255));
        btnAssign.setText(">>");
        btnAssign.setFont(new java.awt.Font("Cascadia Mono Light", 0, 14)); // NOI18N
        btnAssign.setRadius(15);
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        lbltotalCredits.setBackground(new java.awt.Color(51, 51, 51));
        lbltotalCredits.setFont(new java.awt.Font("Cascadia Code SemiLight", 0, 14)); // NOI18N
        lbltotalCredits.setForeground(new java.awt.Color(102, 102, 102));
        lbltotalCredits.setText("0.0");

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Cascadia Code SemiLight", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Creditos");

        btnRemove.setBackground(new java.awt.Color(255, 51, 51));
        btnRemove.setForeground(new java.awt.Color(255, 255, 255));
        btnRemove.setText("<<");
        btnRemove.setToolTipText("");
        btnRemove.setFont(new java.awt.Font("Cascadia Mono Light", 0, 14)); // NOI18N
        btnRemove.setRadius(15);
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnPrintTuition.setBackground(new java.awt.Color(255, 153, 153));
        btnPrintTuition.setForeground(new java.awt.Color(255, 255, 255));
        btnPrintTuition.setText("Imprimir matricula");
        btnPrintTuition.setFont(new java.awt.Font("Cascadia Mono Light", 0, 14)); // NOI18N
        btnPrintTuition.setRadius(15);
        btnPrintTuition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintTuitionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTopLayout = new javax.swing.GroupLayout(panelTop);
        panelTop.setLayout(panelTopLayout);
        panelTopLayout.setHorizontalGroup(
            panelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnPrintTuition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbltotalCredits, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelTopLayout.setVerticalGroup(
            panelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTopLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(btnPrintTuition, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbltotalCredits, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(5, 5, 5))
        );

        tableList.setFont(new java.awt.Font("Cascadia Mono Light", 0, 12)); // NOI18N
        tableList.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableList);

        tableCourseAssign.setFont(new java.awt.Font("Cascadia Mono Light", 0, 12)); // NOI18N
        tableCourseAssign.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tableCourseAssign);

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addComponent(panelTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
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

    private void panelTopMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelTopMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_panelTopMouseDragged

    private void panelTopMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelTopMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_panelTopMousePressed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        dispose();
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        int row = tableList.getSelectedRow();
        if (row >= 0) {
            if (t != null) {
                t.assignCourse(getCourse(tableList, row));
            } else {
                enroll.assignCourse(s, getCourse(tableList, row));
                setShowCredits(s.getTotalCredits());

            }
            listCourse();
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila para asignar un nuevo curso");
        }

    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        int row = tableCourseAssign.getSelectedRow();
        if (row >= 0) {
            if (t != null) {
                t.removeCourse(getCourse(tableCourseAssign, row));
            } else {
                enroll.removeCourse(s, getCourse(tableList, row));
                setShowCredits(s.getTotalCredits());
            }
            listCourse();
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar un curso");
        }

    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnPrintTuitionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintTuitionActionPerformed
        Tuition tuition = new Tuition();
        printFile(tuition.printTuition(s), getRoute(s.getDni() + "-" + tuition.getCode()));
    }//GEN-LAST:event_btnPrintTuitionActionPerformed

    public String getRoute(String code) {
        return "C:\\Users\\user\\Downloads\\Matriculas\\" + code + ".txt";
    }

    public Course getCourse(javax.swing.JTable table, int row) {
        int id = Integer.valueOf(table.getValueAt(row, 0).toString());
        String name = table.getValueAt(row, 1).toString();
        float credits = Float.valueOf(table.getValueAt(row, 2).toString());
        return new Course(id, name, credits);
    }

    public void setShowCredits(float credits) {
        lbltotalCredits.setText(String.valueOf(credits == 0 ? "0.0" : credits));
    }

    //<editor-fold desc="Data table">
    private void completeTable() {
        tableList.setModel(data.getModelTable());
    }
    //</editor-fold>

    private void listCourse() {
        DefaultTableModel model = new DefaultTableModel(new Object[][]{}, CourseData.th);
        tableCourseAssign.setModel(model);
        tableDefineColumn(tableCourseAssign);
        HashMap<Integer, Course> listCourse = (t != null) ? t.getListCourse() : s.getCourses();
        for (Map.Entry<Integer, Course> entry
                : listCourse.entrySet()) {
            Course c = entry.getValue();
            model.addRow(new Object[]{c.getIdCourse(), c.getName(), c.getCredits()});
        }

    }

    private void tableDefineColumn(javax.swing.JTable table) {
        TableColumn column = table.getColumnModel().getColumn(0);
        column.setPreferredWidth(15);
        column = table.getColumnModel().getColumn(1);
        column.setPreferredWidth(200);
        column = table.getColumnModel().getColumn(2);
        column.setPreferredWidth(20);
        table.getTableHeader().setReorderingAllowed(false);
        table.getTableHeader().setResizingAllowed(false);
    }

    private void printFile(String text, String route) {
        File file = new File(route);
        try {
            try ( PrintWriter pwExit = new PrintWriter(file)) {
                pwExit.println(text);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        }
    }

    public static void main(String args[]) {
        FlatDarkLaf.setup();
        java.awt.EventQueue.invokeLater(() -> {
            FramCourse dialog = new FramCourse(new javax.swing.JFrame(), true, null);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.navarroz.component.ButtonRound btnAssign;
    private com.navarroz.component.ButtonRound btnPrintTuition;
    private com.navarroz.component.ButtonRound btnRegister;
    private com.navarroz.component.ButtonRound btnRemove;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbltotalCredits;
    private com.navarroz.component.PanelRound panelRound1;
    private com.navarroz.component.PanelRound panelTop;
    private javax.swing.JTable tableCourseAssign;
    private javax.swing.JTable tableList;
    // End of variables declaration//GEN-END:variables
}
