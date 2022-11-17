package com.java_ea;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainController {
    @FXML
    void olvas1(ActionEvent actionEvent) {
        try {
            FXMLLoader olv1fxml = new FXMLLoader(HelloApplication.class.getResource("Adatb/olvas1.fxml"));
            Stage olv1Stage = new Stage();
            Scene olv1scene = new Scene(olv1fxml.load(), 600, 400);
            olv1Stage.setTitle("Olvas");
            olv1Stage.setScene(olv1scene);
            olv1Stage.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    @FXML
    public void olvas2(ActionEvent actionEvent) {
        try{
            FXMLLoader fxml = new FXMLLoader(HelloApplication.class.getResource("Adatb/olvas2.fxml"));
            Stage stage = new Stage();
            Scene olv1scene = new Scene(fxml.load(), 600, 400);
            stage.setTitle("Olvas2");
            stage.setScene(olv1scene);
            stage.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @FXML
    public void ir(ActionEvent actionEvent) {
        try{
            FXMLLoader fxml = new FXMLLoader(HelloApplication.class.getResource("Adatb/Ír.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(fxml.load(), 600, 400);
            stage.setTitle("Rekord létrehozás");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @FXML
    public void modosit(ActionEvent actionEvent) {
        try{
            FXMLLoader fxml = new FXMLLoader(HelloApplication.class.getResource("Adatb/Módosít.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(fxml.load(), 600, 400);
            stage.setTitle("Módosítás");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @FXML
    public void torol(ActionEvent actionEvent) {
        try{
            FXMLLoader fxml = new FXMLLoader(HelloApplication.class.getResource("Adatb/Töröl.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(fxml.load(), 600, 400);
            stage.setTitle("Törlés");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }



}
