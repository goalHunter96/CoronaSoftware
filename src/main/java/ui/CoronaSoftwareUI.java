package ui;

import com.example.coronasoftware.DialogUtil;
import com.example.coronasoftware.Testperson;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.CheckBoxListCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.util.StringConverter;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;

public class CoronaSoftwareUI extends Application {
    /*Tabelle*/
    TableView table = new TableView<Testperson>(); /*Liste der Testpersonen*/

    /*Tabelle mit Werten füllen*/
    private final ObservableList<Testperson> daten =
            FXCollections.observableArrayList(

                    /*Testpersonen Standardwerte*/
                    new Testperson("Bidiamba", "Sephora", "1996-09-01", "Musterstraße 1", "918340456", "abc@def.de", "Positiv", ""),
                    new Testperson("Yigittekin", "Dilara", "1999-04-19", "Musterstraße 2", "345678634", "hjk@def.de", "Negativ", ""),
                    new Testperson("Brooke", "Aaliah", "1995-08-23", "Musterstraße 5", "907892634", "ekg@def.de", "Positiv", ""),
                    new Testperson("Lee", "Seok-Jae", "1980-06-04", "Musterstraße 6", "483085900", "dek@def.de", "Negativ", "")
            );


    @Override
    public void start(Stage stage) throws Exception {

        stage.setTitle("Corona Testzentrum - Herzlich Willkommen!");
        BorderPane bp = new BorderPane();
        bp.setPrefSize(1050.0, 500.0);

//        final Label home = new Label("Homepage - Corona Testzentrum Dortmund");
//        home.setFont(new Font("Arial", 30.0));
//        home.setTextFill(Paint.valueOf("orange"));


        //table.setEditable(true);
        /*Tabellenspalte*/

//        /*Tabelle Spaltennamen*/
//        TableColumn name = new TableColumn("Name");
//        name.setMinWidth(100);
//        /*Daten werden mit Spalten in Beziehung gesetzt*/
//        name.setCellValueFactory(
//                new PropertyValueFactory<Testperson, String>("name")
//        );
//
//        TableColumn vorname = new TableColumn("Vorname");
//        vorname.setMinWidth(100);
//        /*Daten werden mit Spalten in Beziehung gesetzt*/
//        vorname.setCellValueFactory(
//                new PropertyValueFactory<Testperson, String>("vorname")
//        );
//
//        TableColumn geburtsdatum = new TableColumn("Geburtsdatum");
//        geburtsdatum.setMinWidth(100);
//        /*Daten werden mit Spalten in Beziehung gesetzt*/
//        geburtsdatum.setCellValueFactory(
//                new PropertyValueFactory<Testperson, String>("geburtsdatum")
//        );
//
//
//        TableColumn adresse = new TableColumn("Adresse");
//        adresse.setMinWidth(100);
//        /*Daten werden mit Spalten in Beziehung gesetzt*/
//        adresse.setCellValueFactory(
//                new PropertyValueFactory<Testperson, String>("adresse")
//        );
//
//        TableColumn telefonnummer = new TableColumn("Telefonnummer");
//        telefonnummer.setMinWidth(100);
//        /*Daten werden mit Spalten in Beziehung gesetzt*/
//        telefonnummer.setCellValueFactory(
//                new PropertyValueFactory<Testperson, String>("telefonnummer")
//        );
//
//        TableColumn email = new TableColumn("E-Mail");
//        email.setMinWidth(100);
//        /*Daten werden mit Spalten in Beziehung gesetzt*/
//        email.setCellValueFactory(
//                new PropertyValueFactory<Testperson, String>("email")
//
//        );
//
//        TableColumn resultat = new TableColumn("Resultat");
//        resultat.setMinWidth(100);
//        /*Daten werden mit Spalten in Beziehung gesetzt*/
//        resultat.setCellValueFactory(
//                new PropertyValueFactory<Testperson, String>("resultat")
//        );
//
//        /*Auswahlmöglichkeiten Positiv oder Negativ und mehrere Adressen*/
//
//        String[] choice = {"Positiv", "Negativ"};
//        ChoiceBox cb = new ChoiceBox(FXCollections.observableArrayList(choice));
//
//
//
//
//        TableColumn auswahl = new TableColumn("Auswahl");
//        auswahl.setMinWidth(100);
//        /*Daten werden mit Spalten in Beziehung gesetzt*/
//        auswahl.setCellValueFactory(
//                new PropertyValueFactory<Testperson, String>("remark")
//        );
//
//
//        /*Damit man weitere Testpersonen hinzufügen kann*/
//        final TextField addName = new TextField();
//        addName.setPromptText("Name");
//        addName.setMaxWidth(name.getPrefWidth());
//
//        final TextField addVorname = new TextField();
//        addVorname.setPromptText("Vorname");
//        addVorname.setMaxWidth(vorname.getPrefWidth());
//
//
//        final DatePicker addGeburtsdatum = new DatePicker();
//        addGeburtsdatum.setPromptText("Geburtsdatum");
//        addGeburtsdatum.setMaxWidth(geburtsdatum.getPrefWidth());
//        addGeburtsdatum.setShowWeekNumbers(true);
//
//        ChoiceBox choiceAddress = new ChoiceBox();
//        choiceAddress.getItems().add("Musterstraße");
//        choiceAddress.getItems().add("Tannenstr.");
//        choiceAddress.getItems().add("Am Wasserturm");
//        choiceAddress.getItems().add("Heinrich-Heine Str.");
//        choiceAddress.getItems().add("Königsallee");
//        choiceAddress.getItems().add("Frankfurter Str.");
//
//
//        ChoiceBox cbAdress = new ChoiceBox(FXCollections.observableArrayList(choiceAddress));
//
//        final TextField addAddress = new TextField();
//        cbAdress.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
//            @Override
//            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
//                addAddress.setPromptText(choiceAddress.getValue().toString());
//            }
//        });
//        addAddress.setMaxWidth(adresse.getPrefWidth());
//
//        final TextField addTelefonnummer = new TextField();
//        addTelefonnummer.setPromptText("Telefonnummer");
//        addTelefonnummer.setMaxWidth(telefonnummer.getPrefWidth());
//
//        final TextField addEmail = new TextField();
//        addEmail.setPromptText("Email");
//        addEmail.setMaxWidth(email.getPrefWidth());
//
//
//            /* CODE BEISPIEL !!!!
//            DemoChoiceBox.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
//
//            // if items of the list are changed
//            public void changed(ObservableValue ov, Number value, Number new_value) {
//
//                // text for the label to the selected item
//            	Label2.setText(Choice_Array[new_value.intValue()] + " is Selected");
//            }
//        });*/
//
//
//        final TextField addResultat = new TextField();
//        cb.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
//            @Override
//            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
//                addResultat.setPromptText(choice[t1.intValue()]);
//            }
//        });
//        addResultat.setMaxWidth(resultat.getPrefWidth());


        /*Spalte auf der linken Seite der GUI in Menü umwandeln*/
        MenuBar menu = new MenuBar();
        Menu dashboard = new Menu("Dashboard");
        Menu schichtplan = new Menu("Schichtplan");
        Menu testpersonen = new Menu("Testpersonen");
        Menu termin = new Menu("Termin");
        Menu öffnungszeiten = new Menu("Öffnungszeiten");
        Menu einstellung = new Menu("Einstellungen");

        MenuItem testPers = new MenuItem("Neue Testperson hinzufügen");
        testpersonen.getItems().add(testPers);
        menu.getMenus().addAll(dashboard,schichtplan,testpersonen,termin,öffnungszeiten,einstellung);

        testpersonen.setOnAction(e->{
            //Stage primaryStage = new Stage();
            boolean wiederholen = true;
            while(wiederholen){
                TestpersonView newPersonStage = new TestpersonView();
                try {
                    newPersonStage.start(stage);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });


        /*TEST TEST TEST*/

        /*Buttons*/
//        Button hinzufügen = new Button("Hinzufügen");

//        hinzufügen.setOnAction(e -> {
//            while (!(!(addName != null) || addVorname != null || addGeburtsdatum != null || addAddress != null
//                    || addTelefonnummer != null || addEmail != null)) {
//                DialogUtil.showErrorDialog("Fehler", "Sie können keinen leeren Wert eingeben." +
//                        "\nBitte geben Sie Werte ein!");
//
//            }
//            daten.add(new Testperson(
//                            addName.getText(), addVorname.getText(),
//                            addGeburtsdatum.getValue().toString(), addAddress.getText(),
//                            addTelefonnummer.getText(), addEmail.getText(), addResultat.getPromptText(),
//                            ""
//                    )
//            );
//
//            addName.clear();
//            addVorname.clear();
//            //addGeburtsdatum.clear();
//            addAddress.clear();
//            addTelefonnummer.clear();
//            addEmail.clear();
//
//        });
//        Button entf = new Button("Entfernen");
//        entf.setOnAction(e -> {
//            Iterator<Testperson> it = daten.iterator();
//            while (it.hasNext()) {
//                Testperson p = it.next(); //Hier holt er die nächste Person und danach überprüft er, ob die Person selektiert worden ist
//                if (p.getRemark().isSelected()) {
//                    daten.remove(p);
//                }
//            }
//        });

        Button schließen = new Button("Schließen");
        schließen.setOnAction(e -> {
            stage.close();
        });

        Button senden = new Button("Resultat senden");
        /*Aktivitäten der Maus, wenn die etwas anklickt*/

        senden.setOnAction(e -> { /*Nachdem senden der Resultate an die betroffene Person, wird diese von der Liste entfernt*/
            Iterator<Testperson> iterator = daten.iterator(); //ER zeigt auf das erste Element in der Liste

            while (iterator.hasNext()) { //Solange in der Liste ein Nachfolger vorhanden ist -> ENDLOSSCHLEIFE, weil immer wahr bei for schleife
                Testperson p = iterator.next(); //Hier holt sich der Iterator die nächste Person
                if (p.getRemark().isSelected()) {
                    DialogUtil.showMessageDialog("Email versendet",
                            "E-Mail mit dem '" + p.getResultat() + "' Resultat wurde an: " + p.getName() + ", " + p.getVorname() + " versendet!");
                    daten.remove(p);
                }
//                        if (p.getRemark().isSelected() && anz >= 1){
//                                     sammelListe.add(p);
//                                        DialogUtil.showMessageDialog("Email versendet",
//                                          "Es wurden mehrere Emails, mit den zugehörigen Resultaten an: "  + sammelListe.get(anz).toString() + " gesendent");
//                        }
            }



                  /*Wenn mehr als eine Person selektiert worden ist, soll eine Meldung mit Aufzählung aller ausgewählten Personen aufgelistet werden
                  if ( p.getRemark().isSelected() && anz >= 1){
                      personListe.add(p); //Die selektieren Personen müssen in die Liste
                      for (Testperson liste: personListe) {
                          DialogUtil.showMessageDialog("Mehrere EMails wurden versendet",
                                  "Die Email und deren dazugehörigen Resulten wurden an: [" + personListe + "] gesendet!");
                          daten.remove(personListe);
                      }

                  }else if(anz >10){
                      DialogUtil.showErrorDialog("Fehler", "Es wurden zu viele Emails ausgewählt! " +
                              "Die maximale Anzahl an gewählten Objekten liegt bei 10."+
                      "\nBitte wählen Sie max. 10 Personen aus.");
                  }*/


        });


//        table.setItems(daten);
//        table.getColumns().addAll(name, vorname, geburtsdatum, adresse, telefonnummer, email, resultat, auswahl);

        final VBox vBox = new VBox();
        vBox.setSpacing(5.0);
        vBox.setPadding(new Insets(10, 0, 0, 10));
        vBox.getChildren().addAll(table);

        /*Liste auf der linken Spalte*/
//        var liste2 = new ListView<Label>();
//        liste2.getItems().addAll(dashboard, schichtplan, testpersonen, termin, öffungszeiten, einstellung);

        /*Die Buttons - HBox, VBox*/
        HBox hBox = new HBox(senden, schließen);
        hBox.setSpacing(15.0);
        hBox.setAlignment(Pos.BOTTOM_RIGHT);

//        HBox hinzu = new HBox();
//        hinzu.getChildren().addAll(addName, addVorname,
//                addGeburtsdatum, addAddress, addTelefonnummer,
//                addEmail, cb);
//        hinzu.setSpacing(3);
//
//        HBox h = new HBox(hinzu, hinzufügen, entf);
//        h.setSpacing(3);

        VBox v_hinzu = new VBox(hBox);

        bp.setTop(menu);
        bp.setCenter(vBox);   /*Tabelle der Testpersonen*/
        bp.setBottom(v_hinzu);

        stage.setScene(new Scene(bp));
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }


}










  /*
            label5.setFont(Font.font("Arial", FontWeight.BOLD, Font.getDefault().getSize()));
            label6.setFont(Font.font("Arial", FontWeight.BOLD, Font.getDefault().getSize()));
            label7.setFont(Font.font("Arial", FontWeight.BOLD, Font.getDefault().getSize()));
            label8.setFont(Font.font("Arial", FontWeight.BOLD, Font.getDefault().getSize()));
            label9.setFont(Font.font("Arial", FontWeight.BOLD, Font.getDefault().getSize()));
            label10.setFont(Font.font("Arial", FontWeight.BOLD, Font.getDefault().getSize()));
            label11.setFont(Font.font("Arial", FontWeight.BOLD, Font.getDefault().getSize()));
           */









/*Testpersonen*/
//            Testperson p1 = new Testperson("Bidiamba", "Sephora", "01.09.1996", "Musterstraße 1", 918340456, "abc@def.de");
//            Testperson p2 = new Testperson("Yigittekin", "Dilara", "19.04.1999", "Musterstraße 2", 345678634, "hjk@def.de");
//            Testperson p3 = new Testperson("Brooke", "Aaliah", "23.08.1995", "Musterstraße 5", 907892634, "ekg@def.de");
/*Bürgertest*/
//            Buergertest b = new Buergertest(45, p1, "Positiv");
//            Buergertest b1 = new Buergertest(987, p2, "Negativ");
//            Buergertest b2 = new Buergertest(37, p3, "Positiv");
/*Mitarbeiter*in*/
//            Mitarbeiter ma = new Mitarbeiter(234, "Müller", "Lisa", b);
//            Mitarbeiter ma1 = new Mitarbeiter(777, "Becker", "Lars", b1);
//            Mitarbeiter ma2 = new Mitarbeiter(409, "Teller", "Monika", b2);


//Testperson p1 = new Testperson("Bidiamba", "Sephora", "01.09.1996", "Musterstraße 1", 91834, "abc@def.de");
//Testperson p2 = new Testperson("Yigittekin", "Dilara", "19.04.1999", "Musterstraße 2", 345678, "hjk@def.de");


//Buergertest b1 = new Buergertest(234, p1, "Positiv");
//Buergertest b2 = new Buergertest(789,p2,"Negativ");

//Mitarbeiter m1 = new Mitarbeiter(21, "Müller", "Max", b1);
//Mitarbeiter m2 = new Mitarbeiter(34, "Müller", "Lisa", b2);
//m1.ergebnisVersenden(p1);
//m1.ergebnisVersenden(p2);
//m1.ergebnisPos();
//m2.ergebnisVersenden(p1, b1); /*HIER KOMMT EIN DIALOG FENSTER RAUS - Muss man darauf achten, dass das Testergebnis der richtigen Testperson zugeordnet ist*/
//m2.ergebnisPos();


//System.out.println(p1);
//System.out.println(p2);
