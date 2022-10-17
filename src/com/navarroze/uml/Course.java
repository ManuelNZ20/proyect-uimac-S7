package com.navarroze.uml;

public class Course {
    private int idCourse;
    private String name;
    private float credits;

    public Course(){
        this(0, null, 0);
    }
    public Course(int idCourse, String name, float credits) {
        this.idCourse = idCourse;
        this.name = name;
        this.credits = credits;
    }

    public int getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCredits() {
        return credits;
    }

    public void setCredits(float credits) {
        this.credits = credits;
    }
    
    public String data()
    {
        return idCourse+"/"+name+"/"+credits;
    }
}
