package com.java_ea;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

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
    }

    public static void main(String[] args) {

        launch();
    }
}