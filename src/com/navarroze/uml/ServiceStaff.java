package com.navarroze.uml;

public class ServiceStaff extends Employee{
    private String section;

    public ServiceStaff(String section, short yearIncorporation, byte numberDes, String dni, String name_, String lastName, byte age,String civilStatus) {
        super(yearIncorporation, numberDes, dni, name_, lastName, age,civilStatus);
        this.section = section;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
    
}
