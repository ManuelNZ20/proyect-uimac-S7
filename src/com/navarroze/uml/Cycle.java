package com.navarroze.uml;

public class Cycle {

    private String idCycle;
    private float credits;

    public Cycle(String idCycle, float credits) {
        this.idCycle = idCycle;
        this.credits = credits;
    }

    public Cycle() {
        this(null, 0);
    }

    public String getIdCycle() {
        return idCycle;
    }

    public void setIdCycle(String idCycle) {
        this.idCycle = idCycle;
    }

    public float getCredits() {
        return credits;
    }

    public void setCredits(float credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return getIdCycle();
    }

}
