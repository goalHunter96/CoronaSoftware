package com.example.coronasoftware;

import javax.swing.*;

public class PCR_Test {
    private int probenID;
    Testperson testperson;
    String resultat;

    public PCR_Test(int probenID, Testperson testperson, String resultat){
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

    public void setResultat(String resultat) {
        this.resultat = resultat;
    }

    public boolean istPositiv(){
        /*Bitte füllen*/
        boolean erg;
        if (resultat == "Positiv"){
            erg = true;
        }else{
            erg = false;
        }
        return erg;
    }
    public void versendeAnGesA(int probenID, Testperson person){
        /*Bitte füllen*/
        JOptionPane.showMessageDialog(null, "Das Ergebnis der Testperson: " + person.getName() + ", " + person.getVorname() + " und der Probe: " + probenID + " wurde an das Gesundheitsamt Dortmund versendet!");
    }
}
