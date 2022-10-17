package com.navarroz.data;

import com.navarroze.uml.Course;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MANUEL
 */
public final class CourseData {

    private static final String route = "files/coursedata.txt";
    public static Object th[] = {"Id", "Name", "Credits"};
    static DefaultTableModel model;
    static ArrayList<Course> courses;
    public static int numberCourse;

    public CourseData() {
        courses = new ArrayList<>();
        initData();
        courses.trimToSize();
        numberCourse = numberCourse();
    }

    public void addCourses(Course course) {
        courses.add(course);
        numberCourse++;
    }

    public void remove(Course c) {
        courses.remove(c);
        numberCourse++;
    }

    public int numberCourse() {
        return courses.get(courses.size() - 1).getIdCourse() + 1;
    }

    public Course search(int id) {
        for (Course c : courses) {
            if (c.getIdCourse() == id) {
                return c;
            }
        }
        return null;
    }

    public DefaultTableModel getModelTable() {
        model = new DefaultTableModel(new Object[][]{}, th);
        courses.forEach(c -> {
            model.addRow(new Object[]{c.getIdCourse(), c.getName(), c.getCredits()});
        });
        return model;
    }

    private boolean initData() {
        File file = new File(route);
        if (file.exists()) {
            try ( BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line = "";
                while ((line = br.readLine()) != null) {
                    StringTokenizer st = new StringTokenizer(line, "/");
                    int id = Integer.valueOf(st.nextToken().trim());
                    String name = st.nextToken().trim();
                    float credits = Float.valueOf(st.nextToken().trim());
                    addCourses(new Course(id, name, credits));
                }
                return true;
            } catch (IOException e) {
                System.out.println("Error, class coursedata, " + e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "File not exists");
        }
        return false;
    }

    public void savedData() {
        try ( PrintWriter pw = new PrintWriter(new FileWriter(route))) {
            courses.forEach(c -> {
                pw.println(c.data());
            });
        } catch (Exception e) {

        }
    }
}
