package com.example.coronasoftware;

public class Buergertest {
    private int probenID;
    private Testperson testperson;
    private String resultat;

    public Buergertest(int probenID, Testperson testperson, String resultat){
        this.probenID = probenID;
        this.testperson = testperson;
        this.resultat = resultat;
    }

    public int getProbenID() {
        return probenID;
    }

    public Testperson getTestperson() {
        return testperson;
    }

    public String getResultat() {
        return resultat;
    }

}
