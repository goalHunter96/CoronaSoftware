package com.example.coronasoftware;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class FMXLDocumentController implements Initializable {

    @FXML
    private Label home;
    @FXML
    TableView table;

    ObservableList<Testperson> daten;

    private void handleButtonAction(ActionEvent event){
        System.out.println("Test. Keine Ahnung was er macht");
        home.setText("Test");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        TableColumn name = new TableColumn("Name");
        TableColumn vorname = new TableColumn("Vorname");
        TableColumn geburtsdatum  = new TableColumn("Geburtsdatum");
        TableColumn adresse = new TableColumn("Adresse");
        TableColumn telefonnummer = new TableColumn("Telefonnummer");
        TableColumn email = new TableColumn("E-Mail");
        TableColumn auswahl = new TableColumn("Auswahl");

        table.getColumns().addAll(name,vorname,geburtsdatum,adresse,telefonnummer,email,auswahl);

        daten = FXCollections.observableArrayList(
                /*Testpersonen*/
                new Testperson("Bidiamba", "Sephora", "01.09.1996", "Musterstraße 1", "918340456", "abc@def.de", "Positiv", ""),
                new Testperson("Yigittekin", "Dilara", "19.04.1999", "Musterstraße 2", "345678634", "hjk@def.de", "Negativ",""),
                new Testperson("Brooke", "Aaliah", "23.08.1995", "Musterstraße 5", "907892634", "ekg@def.de", "Positiv", ""),
                new Testperson("Lee", "Seok-Jae", "04.06.1980", "Musterstraße 45", "483085900", "dek@def.de","Negativ","")
        );

        name.setCellValueFactory(
                new PropertyValueFactory<Testperson, String>("name")
        );
        vorname.setCellValueFactory(
                new PropertyValueFactory<Testperson,String>("vorname")
        );
        geburtsdatum.setCellValueFactory(
                new PropertyValueFactory<Testperson, String>("geburtsdatum")
        );
        adresse.setCellValueFactory(
                new PropertyValueFactory<Testperson, String>("adresse")
        );
        telefonnummer.setCellValueFactory(
                new PropertyValueFactory<Testperson, String>("telefonnummer")
        );
        email.setCellValueFactory(
                new PropertyValueFactory<Testperson,String>("email")

        );
        auswahl.setCellValueFactory(
                new PropertyValueFactory<Testperson,String>("remark")
        );
        table.setItems(daten);
    }

    @FXML
    private void deleteSelectedRows(ActionEvent event){
        ObservableList<Testperson> dataListRemove = FXCollections.observableArrayList();
        for (Testperson p: daten)
        {
            if (p.getRemark().isSelected())
            {
                dataListRemove.add(p);
            }
        }
        daten.remove(dataListRemove);
    }


}
