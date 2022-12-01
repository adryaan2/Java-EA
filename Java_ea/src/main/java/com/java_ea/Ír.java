package com.java_ea;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class Ír {

    @FXML
    private Button btn;

    @FXML
    private TextField tfFerohely;

    @FXML
    private TextField tfId;

    @FXML
    private TextField tfNev;

    @FXML
    private TextField tfVaros;

    @FXML
    void insertAction(ActionEvent event) {
        try{
            int ferohely = Integer.parseInt(tfFerohely.getText());
            int id = Integer.parseInt(tfId.getText());
            String nev=tfNev.getText();
            String varos=tfVaros.getText();
            MoziEntity uj = new MoziEntity(id, nev, varos, ferohely);
            EloadasDAO dao = new EloadasDAO();
            dao.hozzaadMozi(uj);

            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setHeaderText("Siker");
            a.setTitle("Rekord beszúrva");
            a.setContentText("A rekordot beszúrtuk az adatbázisba. Azonosítója: "+uj.id);
            a.show();
        }catch(NumberFormatException e){
            Alert a = new Alert(Alert.AlertType.WARNING);
            a.setHeaderText("Sikertelen művelet");
            a.setTitle("Helytelen formátum");
            a.setContentText("Az azonosító és a férőhely csak egész szám lehet");
            a.show();
        }catch(SQLException e){
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setHeaderText("Sikertelen művelet");
            a.setTitle("Művelet meghiúsult");
            a.setContentText("Az adatbázisműveéet sikertelen volt (SQLException)");
            a.show();
        }

    }

}
