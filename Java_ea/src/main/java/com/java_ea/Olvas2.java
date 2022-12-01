package com.java_ea;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Olvas2 implements Initializable {

    @FXML
    private TableColumn<EloadasModel, Integer> bev;

    @FXML
    private Button btn;

    @FXML
    private CheckBox checkBox7000;

    @FXML
    private ComboBox<String> comboVaros;

    @FXML
    private TableColumn<EloadasModel, String> datum;

    @FXML
    private TableColumn<EloadasModel, String> fcim;

    @FXML
    private ToggleGroup felev;

    @FXML
    private TableColumn<EloadasModel, Integer> fev;

    @FXML
    private TableColumn<EloadasModel, String> mnev;

    @FXML
    private TableColumn<EloadasModel, String> mvaros;

    @FXML
    private RadioButton radioElsoFelev;

    @FXML
    private RadioButton radioMasodikFelev;

    @FXML
    private TableView<EloadasModel> table;

    @FXML
    private TextField tfCim;

    EloadasDAO dao;

    ObservableList<EloadasModel> lista;

    @FXML
    void szuresClick(ActionEvent event) {
        ArrayList<EloadasModel> osszes = dao.getAllData();
        java.util.stream.Stream<EloadasModel> stream=osszes.stream();
        osszes=null; //memória

        if(! tfCim.getText().isBlank())
            stream=stream.filter(x -> x.fcim.toLowerCase().contains(tfCim.getText().toLowerCase()));
        stream=stream.filter(x -> Objects.equals(x.mvaros, comboVaros.getSelectionModel().getSelectedItem()));


        ArrayList<String> elsoFelev = new ArrayList<String>();
        for(int i=1; i<=6; i++){
            elsoFelev.add("0"+i);
        }

        ArrayList<String> masodikFelev = new ArrayList<String>();
        for(int i=7; i<=12; i++){
            if(i<10)
                masodikFelev.add("0"+i);
            else
                masodikFelev.add(String.valueOf(i));
        }

        if(radioElsoFelev.isSelected())
            stream=stream.filter(x->elsoFelev.contains(x.datum.substring(5,7)));
        if(radioMasodikFelev.isSelected())
            stream=stream.filter(x->masodikFelev.contains(x.datum.substring(5,7)));

        if(checkBox7000.isSelected())
            stream=stream.filter(x -> x.bev>70000);

        //https://stackoverflow.com/questions/33849538/collectors-lambda-return-observable-list
        lista=stream.collect(Collectors.collectingAndThen(toList(), l -> FXCollections.observableArrayList(l)));
        table.setItems(lista);

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        dao = new EloadasDAO();
        lista = FXCollections.observableArrayList();

        fcim.setCellValueFactory(new PropertyValueFactory<EloadasModel, String>("fcim"));
        fev.setCellValueFactory(new PropertyValueFactory<EloadasModel, Integer>("fev"));
        datum.setCellValueFactory(new PropertyValueFactory<EloadasModel, String>("datum"));
        bev.setCellValueFactory(new PropertyValueFactory<EloadasModel, Integer>("bev"));
        mnev.setCellValueFactory(new PropertyValueFactory<EloadasModel, String>("mnev"));
        mvaros.setCellValueFactory(new PropertyValueFactory<EloadasModel, String>("mvaros"));
        List<String> varosok =
                dao.getAllData().stream()
                        .map(EloadasModel::getMvaros)
                        .distinct()
                        .sorted()
                        .collect(Collectors.toList());
        comboVaros.getItems().addAll(varosok);
        comboVaros.setValue(varosok.get(0));
        table.setItems(lista);
    }
}
