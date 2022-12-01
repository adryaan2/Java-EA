package com.java_ea;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {
    @FXML
    void olvas1(ActionEvent actionEvent) {
        Stage stage = new Stage();
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("Adatb/olvas1.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.setTitle("Olvas");
        stage.setScene(new Scene(root, 800,800));
        stage.show();
    }

    @FXML
    public void olvas2(ActionEvent actionEvent) {
        try{
            FXMLLoader fxml = new FXMLLoader(Main.class.getResource("Adatb/olvas2.fxml"));
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
            FXMLLoader fxml = new FXMLLoader(Main.class.getResource("Adatb/Ír.fxml"));
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
            FXMLLoader fxml = new FXMLLoader(Main.class.getResource("Adatb/Módosít.fxml"));
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
        Stage stage = new Stage();
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("Adatb/Torol.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.setTitle("Rekord törlése a mozi táblából");
        stage.setScene(new Scene(root, 600,320));
        stage.show();
    }

    @FXML
    public void parhuzamos(ActionEvent actionEvent) {
        try{
            FXMLLoader fxml = new FXMLLoader(Main.class.getResource("parhuzamos.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(fxml.load(), 600, 330);
            stage.setTitle("Párhuzamos szálkezelés");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @FXML
    public void stream(ActionEvent actionEvent) {
        try{
            FXMLLoader fxml = new FXMLLoader(Main.class.getResource("parhuzamos.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(fxml.load(), 600, 400);
            stage.setTitle("Stream");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


}
