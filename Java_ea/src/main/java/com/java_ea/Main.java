package com.java_ea;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

//https://gluonhq.com/products/scene-builder/#download
//Settings/Languages & Frameworks/JavaFX

//TableView használat
//https://www.youtube.com/watch?v=fnU1AlyuguE&ab_channel=Randomcode

//resultSet-ből observable
//https://coderanch.com/t/706448/java/Separate-ResultSet-multiple-TableColums-ObservableList

//controllerek közti kommunikáció
//https://www.youtube.com/watch?v=wxhGKR3PQpo&ab_channel=BroCode

public class Main extends Application {
    EloadasDAO dao;
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
        stage.setTitle("Java beadandó - Mozi adatbázis");
        stage.setScene(new Scene(root, 800,400));
        stage.show();

        dao = new EloadasDAO();
        try {
            boolean letezik1 = dao.letezikMozi(1);
            System.out.println(letezik1);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            boolean letezik2 = dao.letezikMozi(2);
            System.out.println(letezik2);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Hozzáadás:");
        try {
            dao.hozzaadMozi(new MoziEntity(1, "Ujmozi", "Kecskemét", 300));
        } catch (SQLException e) {
            System.out.println("Sikertelen hozzáadás");
        }

    }

    public static void main(String[] args) {

        launch();
    }
}