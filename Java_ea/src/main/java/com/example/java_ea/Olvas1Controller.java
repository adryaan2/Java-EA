package com.example.java_ea;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Olvas1Controller {
    @FXML
    void olvas1(ActionEvent actionEvent) {
        try {
            FXMLLoader olv1fxml = new FXMLLoader(HelloApplication.class.getResource("Adatb/olvas1.fxml"));
            Stage olv1Stage = new Stage();
            Scene olv1scene = new Scene(olv1fxml.load(), 600, 400);
            olv1Stage.setTitle("Olvas1");
            olv1Stage.setScene(olv1scene);
            olv1Stage.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void olvas2(ActionEvent actionEvent) {
    }

    public void ir(ActionEvent actionEvent) {
    }

    public void modosit(ActionEvent actionEvent) {
    }

    public void torol(ActionEvent actionEvent) {
    }
}
