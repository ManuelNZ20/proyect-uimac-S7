package com.navarroze.uml;

import java.util.HashMap;

public class Teacher extends Employee {

    private String departamentType;
    private String academicTitle;
    private String specialty;
    private HashMap<Integer, Course> listCourse;

    public Teacher(String departamentType, String academicTitle, String specialty, short yearIncorporation, byte numberDes, String dni, String name_, String lastName, byte age,String civilStatus) {
        super(yearIncorporation, numberDes, dni, name_, lastName, age,civilStatus);
        this.departamentType = departamentType;
        this.academicTitle = academicTitle;
        this.specialty = specialty;
        listCourse = new HashMap<>();
    }

    public String getDepartamentType() {
        return departamentType;
    }

    public void setDepartamentType(String departamentType) {
        this.departamentType = departamentType;
    }

    public String getAcademicTitle() {
        return academicTitle;
    }

    public void setAcademicTitle(String academicTitle) {
        this.academicTitle = academicTitle;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public HashMap<Integer, Course> getListCourse() {
        return listCourse;
    }

    public void setListCourse(HashMap<Integer, Course> listCourse) {
        this.listCourse = listCourse;
    }

    public void assignCourse(Course course) {
        listCourse.put(course.getIdCourse(), course);
    }

    public void removeCourse(Course course) {
        listCourse.remove(course.getIdCourse());
    }
    

}
