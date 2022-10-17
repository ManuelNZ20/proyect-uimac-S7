package com.navarroze.uml;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public class Tuition {

    private int code;
    private String date;

    public Tuition() {
        this.code = generateCode();
        this.date = new SimpleDateFormat("hh:mm:ss a dd-MMM-yyyy").format(new Date());
    }

    public int getCode() {
        return code;
    }
    public String getDate(){
        return date;
    }

    private int generateCode() {
        return (int) (Math.random() * 1111111 + 9999999 - 1) - 1111111;
    }

    public String printTuition(Student st) {
        String courses = "";
        String columns[] = new String[3];
        columns[0] = "Id";
        columns[1] = "Nombre de la asignatura";
        columns[2] = "Creditos";
        courses = columns[0] + "\t\t" + columns[1] + "\t\t\t\t\t\t" + columns[2] + "\n";
        courses += "---------------------------------------------------------------------------------------\n";
        Course c;
        for (Map.Entry<Integer, Course> entry : st.getCourses().entrySet()) {
            c = entry.getValue();
            columns[0] = "" + c.getIdCourse();
            columns[1] = c.getName();
            columns[2] = c.getCredits() + "";
            for (int i = columns[0].length(); i <= 10; i++) {
                columns[0] += " ";
            }
            for (int i = columns[1].length(); i <= 65; i++) {
                columns[1] += " ";
            }
            courses += columns[0] + columns[1] + columns[2] + "\n";
        }

        return "\t\t\t***Matricula de estudiante***\n"
                + "Codigo de matricula: " + this.code + " fecha: " + this.date + "\n"
                + "DNI: " + st.getDni() + "\n"
                + "Nombre: " + st.getName_() + " " + st.getLastName() + "\n"
                + "Ciclo: " + st.getCycle() + "\tCreditos: " + st.getCycle().getCredits() + "\n"
                + "Número de cursos inscrito: "+st.getNumberCourse()
                + "---------------------------------------------------------------------------------------\n"
                + courses
                + "---------------------------------------------------------------------------------------\n"
                + "Créditos totales: " + st.getTotalCredits();

    }

}
