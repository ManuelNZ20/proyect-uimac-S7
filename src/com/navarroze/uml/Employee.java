package com.navarroze.uml;

public class Employee extends Person{
    private short yearIncorporation;
    private byte numberDes;//número de despacho

    public Employee(short yearIncorporation, byte numberDes, String dni, String name_, String lastName, byte age,String civilStatus) {
        super(dni, name_, lastName, age,civilStatus);
        this.yearIncorporation = yearIncorporation;
        this.numberDes = numberDes;
    }

    public short getYearIncorporation() {
        return yearIncorporation;
    }

    public void setYearIncorporation(short yearIncorporation) {
        this.yearIncorporation = yearIncorporation;
    }

    public byte getNumberDes() {
        return numberDes;
    }

    public void setNumberDes(byte numberDes) {//reasignación de despacho
        this.numberDes = numberDes;
    }
    
    
}
