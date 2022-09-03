package com.example.coronasoftware;
import javax.swing.JOptionPane;

public class Mitarbeiter {
    private int mitarbeiterID;
    private String name;
    private String vorname;
    private Buergertest resultat; /*Resultat der Testperson. Die wird gebraucht, um die Ergebnisse an die getesteten Personen weiterzuleiten*/

    public Mitarbeiter(int mitarbeiterID, String name, String vorname, Buergertest resultat) {
        this.mitarbeiterID = mitarbeiterID;
        this.name = name;
        this.vorname = vorname;
        this.resultat = resultat;
    }

    public int getMitarbeiterID() {

        return mitarbeiterID;
    }

    public String getName() {
        return name;
    }

    public String getVorname() {
        return vorname;
    }

    public boolean ergebnisPos() {
     /*Hier müssen wir eine Abfrage machen und schauen, ab wann ein Test positiv ist*/
     /*Bitte füllen*/
        boolean pos;

         if (resultat.getResultat() == "Positiv") {
             pos = true;
             System.out.println("Das Ergebnis ist Positiv!");
         } else {
             pos = false;
             System.out.println("Das Ergebnis ist Negativ!");
     }
     return pos;
    }
    public void ergebnisVersenden(Testperson testperson, Buergertest resultat){ /*Die Testperson und das dazugehörige Resultat*/
        JOptionPane.showMessageDialog(null, "E-Mail mit dem '" + resultat.getResultat() + "' Resultat wurde an: " + testperson.getName() + ", " + testperson.getVorname() + " versendet!");
    }


}

