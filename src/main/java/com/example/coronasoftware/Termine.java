package com.example.coronasoftware;

import java.util.Date;

public class Termine {
    private int nr;
    private Date termin_datum;
    private Testperson name;
    private String kunden_telefon;
    private Testperson email;


    public Termine(int nr, Date termin_datum, Testperson name, String kunden_telefon, Testperson email){

        this.nr = nr;
        this.name = name;
        this.termin_datum = termin_datum;
        this.email = email;
        this.kunden_telefon = kunden_telefon;

    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public Date getTermin_datum() {
        return termin_datum;
    }

    public void setTermin_datum(Date termin_datum) {
        this.termin_datum = termin_datum;
    }

    public Testperson getName() {
        return name;
    }

    public void setName(Testperson name) {
        this.name = name;
    }

    public String getKunden_telefon() {
        return kunden_telefon;
    }

    public void setKunden_telefon(String kunden_telefon) {
        this.kunden_telefon = kunden_telefon;
    }

    public Testperson getEmail() {
        return email;
    }

    public void setEmail(Testperson email) {
        this.email = email;
    }
}
