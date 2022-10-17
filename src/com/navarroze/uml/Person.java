package com.navarroze.uml;

public abstract class Person {
    private String dni;
    private String name_;
    private String lastName;
    private byte age;
    private String civilStatus;

    public Person(String dni, String name_, String lastName, byte age,String civilStatus) {
        this.dni = dni;
        this.name_ = name_;
        this.lastName = lastName;
        this.age = age;
        this.civilStatus = civilStatus;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName_() {
        return name_;
    }

    public void setName_(String name_) {
        this.name_ = name_;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getCivilStatus() {
        return civilStatus;
    }

    public void setCivilStatus(String civilStatus) {
        this.civilStatus = civilStatus;
    }
    
}
