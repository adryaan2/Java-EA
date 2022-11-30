package com.java_ea;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Parhuzamos {

    public static String sz1;
    public static String sz2;
    @FXML
    private Button btn;

    @FXML
    public Label lb1;

    @FXML
    public Label lb2;

    @FXML
    void indit(ActionEvent event) throws InterruptedException{

        /*
        Platform.runLater(new Runnable() {

            @Override
            public void run() {
                int round=0;
                while(true){
                    String s = "Változó";
                    for(int i=0; i<round;i++)
                        s+="ó";
                    s+=" szöveg";
                    round++;
                    lb1.setText(s);
                    try {
                        Thread.sleep(2000);
                    }catch(InterruptedException e){}
                }
            }
        });

             */
        sz1=""; sz2="";
        Loader1 t1 = new Loader1();
        Loader2 t2 = new Loader2();
        t1.start(); t2.start();
        while(true){
            lb1.setText(sz1);
            lb2.setText(sz2);
            Thread.sleep(500);
        }

    }

    /*
    class Loader1 extends Thread {

        @Override

        public void run() {
            int round = 0;

            while (true) {

                String s = "Változó";
                for(int i=0; i<round;i++)
                    s+="ó";
                s+=" szöveg";
                round++;
                lb1.setText(s);

                try {

                    Thread.sleep(1000);

                } catch (InterruptedException e) {

                    e.printStackTrace();

                }

            }

        }
    }
    */



}

class Loader1 extends Thread {
    @Override
    public void run() {
        int round=0;
        while(true){
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            String s = "Változó";
            for(int i=0; i<round;i++)
                s+="ó";
            s+=" szöveg";
            round++;
            Parhuzamos.sz1=s;

        }

    }
}

class Loader2 extends Thread{
    @Override
    public void run() {
        int round=0;

        while(true){
            try{
                Thread.sleep(1000);
            }catch(Exception e){

            }
            String s = "Változó";
            for(int i=0; i<round;i++)
                s+="ó";
            s+=" szöveg";
            Parhuzamos.sz2=s;
            round++;
        }
    }
}

