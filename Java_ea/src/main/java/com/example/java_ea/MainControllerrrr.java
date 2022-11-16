package com.example.java_ea;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainControllerrrr {
    @FXML
    private Label welcomeText;

    @FXML
    protected void sayHi() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

}