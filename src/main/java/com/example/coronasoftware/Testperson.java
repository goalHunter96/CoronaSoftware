package com.example.coronasoftware;

import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.CheckBox;


public class Testperson {


    private final SimpleStringProperty name;
    private final SimpleStringProperty vorname;
    private final SimpleStringProperty gebDatum;
    private final SimpleStringProperty adresse;
    private final SimpleStringProperty telefonnummer;
    private final SimpleStringProperty email;
    private final SimpleStringProperty resultat;
    private CheckBox remark;/**/


    public Testperson (String name, String vorname, String gebDatum, String adresse, String telefonnummer, String email, String resultat, String value){/**/
        this.name =new SimpleStringProperty(name) ;
        this.vorname = new SimpleStringProperty(vorname);
        this.gebDatum = new SimpleStringProperty(gebDatum);
        this.adresse = new SimpleStringProperty(adresse);
        this.telefonnummer = new SimpleStringProperty(telefonnummer);
        this.email = new SimpleStringProperty(email);
        this.resultat = new SimpleStringProperty(resultat);
        this.remark = new CheckBox();
    }


    public String getName() {

        return name.get();
    }
    public void setName(String name) {

        this.name.set(name);
    }

    public String getVorname() {

        return vorname.get();
    }
    public void setVorname(String vorname) {
        this.vorname.set(vorname);
    }


    public void setGeburtsdatum(String geburtsdatum) {

        this.gebDatum.set(geburtsdatum);
    }
    public String getGeburtsdatum() {

        return gebDatum.get();
    }

    public void setAdresse(String adresse) {

        this.adresse.set(adresse);
    }
    public String getAdresse() {

        return adresse.get();
    }

    public void setEmail(String email) {

        this.email.set(email);
    }

    public String getEmail() {

        return email.get();
    }

    public String getTelefonnummer() {

        return telefonnummer.get();
    }

    public void setTelefonnummer(String telefonnummer) {

        this.telefonnummer.set(telefonnummer);
    }

    public String getResultat() {
        return resultat.get();
    }

    public SimpleStringProperty resultatProperty() {
        return resultat;
    }

    public void setResultat(String resultat) {
        this.resultat.set(resultat);
    }

    public CheckBox getRemark() {

        return remark;
    }

    public void setRemark(CheckBox remark) {

        this.remark = remark;
    }

    public String toString(){
        return   name + ",  " + vorname + ",  " + gebDatum + ",  " + adresse + ",  " + telefonnummer + ", " + email;
    }
}
