package com.navarroze.uml;

import javax.swing.JOptionPane;

public class Enroll {
    
       private void assignCredits(Student st,float credits) {
        float currentCredits = st.getTotalCredits() + credits;//creditos actuales
        st.setTotalCredits(currentCredits);
    }

    private void removeCredits(Student st,float credits) {
        float currentCredits = st.getTotalCredits() - credits;//creditos actuales
        st.setTotalCredits(currentCredits);
    }

    public void assignCourse(Student st,Course course) {
        boolean assignmentPermission = (course.getCredits() + st.getTotalCredits()) <= st.getCycle().getCredits();
        boolean existingCourse = st.getCourses().containsKey(course.getIdCourse());
        if (assignmentPermission & !existingCourse) {
            assignCredits(st,course.getCredits());
            st.getCourses().put(course.getIdCourse(), course);
        } else if (existingCourse) {
            JOptionPane.showMessageDialog(null, "El curso ya existe");
        } else if (completeCourses(st)) {
            JOptionPane.showMessageDialog(null, "A Completado el total de creditos posibles");
        } else if (!assignmentPermission) {
            JOptionPane.showMessageDialog(null, "No puede asignar más cursos");
        }
    }

    public void removeCourse(Student st,Course course) {
        boolean permissionRemove = (st.getTotalCredits() - course.getCredits()) >= 0;
        if (permissionRemove) {
            removeCredits(st,course.getCredits());
            st.getCourses().remove(course.getIdCourse());
        } else {
            JOptionPane.showMessageDialog(null, "Acción incorrecta");
        }
    }
    
    public boolean completeCourses(Student st) {
        return (st.getTotalCredits() == st.getCycle().getCredits());
    }
}
