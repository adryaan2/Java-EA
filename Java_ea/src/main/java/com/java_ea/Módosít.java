package com.java_ea;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Módosít implements Initializable {

    @FXML
    private Button btn;

    @FXML
    private ComboBox<Integer> combo;

    @FXML
    private TextField tfFerohely;

    @FXML
    private TextField tfNev;

    @FXML
    private TextField tfVaros;

    EloadasDAO dao;

    @FXML
    void ment(ActionEvent event) {
        try{
            int ferohely = Integer.parseInt(tfFerohely.getText());
            String nev=tfNev.getText();
            String varos=tfVaros.getText();
            dao.modositMozi(combo.getValue(), nev, varos, ferohely);

            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setHeaderText("Siker");
            a.setTitle("Rekord módosítva");
            a.setContentText("A rekordot módosítottuk. Azonosítója: "+combo.getValue());
            a.show();
        }catch(NumberFormatException e){
            Alert a = new Alert(Alert.AlertType.WARNING);
            a.setHeaderText("Sikertelen művelet");
            a.setTitle("Helytelen formátum");
            a.setContentText("A férőhely csak egész szám lehet");
            a.show();
        }catch(SQLException e){
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setHeaderText("Sikertelen művelet");
            a.setTitle("Művelet meghiúsult");
            a.setContentText("Az adatbázisművelet sikertelen volt (SQLException)");
            a.show();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        dao=new EloadasDAO();
        ArrayList<Integer> azonositok = dao.moziid();
        combo.getItems().addAll(azonositok);
        combo.setValue(azonositok.get(0));
        moziKivalasztva(new ActionEvent());
    }

    @FXML
    void moziKivalasztva(ActionEvent event) {
        MoziEntity aktMozi= dao.getMoziById(combo.getValue());
        tfNev.setText(aktMozi.nev);
        tfFerohely.setText(String.valueOf(aktMozi.ferohely));
        tfVaros.setText(aktMozi.varos);
    }
}
