package com.java_ea;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Parhuzamos{
    @FXML
    private Button btn;

    @FXML
    public Label lb1;

    @FXML
    public Label lb2;

    @FXML
    void indit(ActionEvent event) {

        lb1.setText("Változó");
        lb2.setText("Változó");
        Runnable task=()->{
            int round=0;
            while(round<6) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                Platform.runLater(() -> {
                            lb1.setText(lb1.getText() + "ó");
                        }
                );
                round++;
            }
        };

        Runnable task2=()->{
            int round=0;
            while(round<3) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                Platform.runLater(() -> {
                            lb2.setText(lb2.getText() + "ó");
                        }
                );
                round++;
            }
        };

        new Thread(task).start();
        new Thread(task2).start();
    }
}


