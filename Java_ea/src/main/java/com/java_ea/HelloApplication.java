package com.java_ea;

import entities.FilmEntity;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


import javax.persistence.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//https://gluonhq.com/products/scene-builder/#download
//Settings/Languages & Frameworks/JavaFX

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        Query nativeQuery= entityManager.createNativeQuery("select * from film");
        ArrayList<FilmEntity> filmek=(ArrayList<FilmEntity>) nativeQuery.getResultList();
        for(FilmEntity f:filmek){
            System.out.println(f.getId()+" "+f.getCim());
        }



        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MainWindow.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 440);
        stage.setTitle("Java beadandó - Mozi adatbázis");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        launch();

    }
}