package ui;

import com.example.coronasoftware.DialogUtil;
import com.example.coronasoftware.Testperson;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Callback;

import java.util.Iterator;

public class TestpersonView extends Application {
    TableView table = new TableView();

    private final ObservableList<Testperson> daten = FXCollections.observableArrayList(
            new Testperson("Bidiamba", "Sephora", "1996-09-01", "Musterstraße 1", "918340456", "abc@def.de", "Positiv", ""),
            new Testperson("Yigittekin", "Dilara", "1999-04-19", "Musterstraße 2", "345678634", "hjk@def.de", "Negativ", ""),
            new Testperson("Brooke", "Aaliah", "1995-08-23", "Musterstraße 5", "907892634", "ekg@def.de", "Positiv", ""),
            new Testperson("Lee", "Seok-Jae", "1980-06-04", "Musterstraße 6", "483085900", "dek@def.de", "Negativ", "")
    );

    //    public TestpersonView (Stage stage){
//
//    }
    @Override
    public void start(Stage stage) throws Exception {

        stage.setTitle("Neue Testperson");
        stage.setHeight(500.0);
        stage.setWidth(1500.0);
        table.setEditable(true);

        Button hinzufügen = new Button("Hinzufügen");
        Button entfernen = new Button("Entfernen");
        Button ok = new Button("Ok");
        Button abbr = new Button("Abbrechen");

        BorderPane bp = new BorderPane();

        /*Tabelle Spaltennamen*/
        TableColumn name = new TableColumn("Name");
        name.setMaxWidth(1500);
        name.setCellValueFactory(
                new PropertyValueFactory<Testperson, String>("name")
        );

        TableColumn vorname = new TableColumn("Vorname");
        vorname.setMinWidth(100);
        vorname.setCellValueFactory(
                new PropertyValueFactory<Testperson, String>("vorname")
        );

        TableColumn geburtsdatum = new TableColumn("Geburtsdatum");
        geburtsdatum.setMinWidth(100);
        geburtsdatum.setCellValueFactory(
                new PropertyValueFactory<Testperson, String>("geburtsdatum")
        );

        TableColumn adresse = new TableColumn("Adresse");
        adresse.setMinWidth(100);
        adresse.setCellValueFactory(
                new PropertyValueFactory<Testperson, String>("adresse")
        );

        TableColumn telefonnummer = new TableColumn("Telefonnummer");
        telefonnummer.setMinWidth(100);
        telefonnummer.setCellValueFactory(
                new PropertyValueFactory<Testperson, String>("telefonnummer")
        );

        TableColumn email = new TableColumn("Email");
        email.setMinWidth(100);
        email.setCellValueFactory(
                new PropertyValueFactory<Testperson, String>("email")
        );

        TableColumn resultat = new TableColumn("Resultat");
        resultat.setMinWidth(100);
        resultat.setCellValueFactory(
                new PropertyValueFactory<Testperson, String>("resultat")
        );

        TableColumn auswahl = new TableColumn("Auswahl");
        auswahl.setMinWidth(100);
        auswahl.setCellValueFactory(
                new PropertyValueFactory<Testperson, String>("remark")
        );

        String[] choice = {"Positiv", "Negativ"};
        ChoiceBox cb = new ChoiceBox(FXCollections.observableArrayList(choice));


        /*Testperson hinzufügen*/
        final TextField addName = new TextField("Name");
        addName.setPromptText("Name");
        addName.setMaxWidth(name.getPrefWidth());

        final TextField addVorname = new TextField("Vorname");
        addVorname.setPromptText("Vorname");
        addVorname.setMaxWidth(vorname.getPrefWidth());

        final DatePicker addGeburtsdatum = new DatePicker();
        addGeburtsdatum.setPromptText("Geburtsdatum");
        addGeburtsdatum.setMaxWidth(geburtsdatum.getPrefWidth());

        final TextField addAdresse = new TextField();

        ChoiceBox cbAdress = new ChoiceBox();
        ChoiceBox choiceAdr = new ChoiceBox(FXCollections.observableArrayList(cbAdress));

        cbAdress.getItems().add("Musterstraße");
        cbAdress.getItems().add("Tannenstr.");
        cbAdress.getItems().add("Am Wasserturm");
        cbAdress.getItems().add("Heinrich-Heine Str.");
        cbAdress.getItems().add("Königsallee");
        cbAdress.getItems().add("Frankfurter Str.");

        choiceAdr.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                addAdresse.setPromptText(cbAdress.getValue().toString());
            }
        });
        addAdresse.setMaxWidth(adresse.getPrefWidth());

        final TextField addTelefonnummer = new TextField();
        addTelefonnummer.setPromptText("Telefonnummer");
        addTelefonnummer.setMaxWidth(telefonnummer.getPrefWidth());

        final TextField addEmail = new TextField();
        addEmail.setPromptText("Email");
        addEmail.setMaxWidth(email.getPrefWidth());

        final TextField addResultat = new TextField();
        cb.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                addResultat.setPromptText(choice[t1.intValue()]);
            }
        });
        addResultat.setMaxWidth(resultat.getPrefWidth());

        hinzufügen.setOnAction(e-> {
            daten.add(new Testperson(
                            addName.getText(), addVorname.getText(),
                            addGeburtsdatum.getValue().toString(), addAdresse.getPromptText(),
                            addTelefonnummer.getText(), addEmail.getText(), addResultat.getPromptText(),
                            ""
                    )
            );

            addName.clear();
            addVorname.clear();
            addGeburtsdatum.setValue(null);
            addAdresse.clear();
            addTelefonnummer.clear();
            addEmail.clear();
        });

        entfernen.setOnAction(e-> {
            Iterator<Testperson> it = daten.iterator();
            while(it.hasNext()){
                Testperson p = it.next(); //Hier holt er die nächste Person und danach überprüft er, ob die Person selektiert worden ist
                if (p.getRemark().isSelected()){
                    daten.remove(p);
                }
            }
        });

        ok.setOnAction(e->{
            if (addName == null || addVorname == null || addGeburtsdatum == null || addAdresse == null
                    || addTelefonnummer == null || addEmail == null){
                DialogUtil.showErrorDialog("Daten fehlen", "Bitte ALLE Felder ausfüllen");
            }
            else{
                stage.close();

            }
        });

        abbr.setOnAction(e->{
            stage.close();
        });

        table.setItems(daten);
        table.getColumns().addAll(name,vorname,geburtsdatum,adresse,
                telefonnummer, email, resultat,auswahl);

        VBox vbox = new VBox(addName,addVorname,addGeburtsdatum,addAdresse,addTelefonnummer,addEmail, addResultat);
        vbox.setSpacing(5.0);



        HBox hbox = new HBox(hinzufügen,entfernen);
        hbox.setSpacing(3.0);
        hbox.setAlignment(Pos.BOTTOM_CENTER);

        HBox hb = new HBox(ok,abbr);
        hb.setAlignment(Pos.BOTTOM_RIGHT);
        hb.setSpacing(10.0);


        bp.setLeft(vbox);
        bp.setCenter(hbox);
        bp.setBottom(hb);

        stage.setScene(new Scene(bp));

        stage.show();

    }


}
