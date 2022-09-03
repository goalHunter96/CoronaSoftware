package com.example.coronasoftware;

import java.util.Date;

public class Schicht {
    private Mitarbeiter mitarbeiterID;
    private Date datum;
    private String uhrzeit;

    public Mitarbeiter getMitarbeiterID() {
        return mitarbeiterID;
    }

    public void setMitarbeiterID(Mitarbeiter mitarbeiterID) {
        this.mitarbeiterID = mitarbeiterID;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public String getUhrzeit() {
        return uhrzeit;
    }

    public void setUhrzeit(String uhrzeit) {
        this.uhrzeit = uhrzeit;
    }

}
