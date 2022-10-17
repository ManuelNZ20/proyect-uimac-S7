package com.navarroze.uml;

import java.util.HashMap;

public class Student extends Person {

    private Cycle cycle;
    private HashMap<Integer, Course> courses;
    private float totalCredits;

    public Student(Cycle cycle, String dni, String name_, String lastName, byte age, String civilStatus) {
        super(dni, name_, lastName, age, civilStatus);
        this.cycle = cycle;
        courses = new HashMap<>();
    }

    public Cycle getCycle() {
        return cycle;
    }

    public void setCycle(Cycle cycle) {
        this.cycle = cycle;
    }

    public HashMap<Integer, Course> getCourses() {
        return courses;
    }

    public void setCourses(HashMap<Integer, Course> courses) {
        this.courses = courses;
    }

    public float getTotalCredits() {
        return totalCredits;
    }
    public void setTotalCredits(float totalCredits){
        this.totalCredits = totalCredits;
    }

 
    public int getNumberCourse() {
        return courses.size();
    }

    
}
