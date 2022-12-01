package com.java_ea;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Töröl implements Initializable {

    @FXML
    private ComboBox<Integer> combo;

    @FXML
    private Button torolBtn;

    EloadasDAO dao;

    @FXML
    void torles(ActionEvent event) {
        int erintett = dao.torol(combo.getSelectionModel().getSelectedItem());
        Alert a = new Alert(erintett>0 ? Alert.AlertType.INFORMATION : Alert.AlertType.ERROR);
        a.setHeaderText(erintett>0 ? "Sikeres törlés" : "Sikertelen művelet");
        a.setTitle(erintett>0 ? "Siker" : "Sikertelen művelet");
        a.setContentText(erintett + " sor törölve");
        a.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        dao=new EloadasDAO();
        ArrayList<Integer> azonositok = dao.moziid();
        combo.getItems().addAll(azonositok);
        combo.setValue(azonositok.get(0));
    }
}
