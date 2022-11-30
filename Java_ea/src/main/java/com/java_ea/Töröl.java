package com.java_ea;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

import java.net.URL;
import java.util.ResourceBundle;

public class Töröl implements Initializable {

    @FXML
    private ComboBox<Integer> combo;

    @FXML
    private Button torolBtn;

    EloadasDAO dao;

    @FXML
    void torles(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        combo.getItems().addAll(dao.moziid());
    }
}
