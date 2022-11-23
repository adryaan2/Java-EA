package com.java_ea;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Olvas implements Initializable {

    @FXML
    private TableColumn<EloadasModel, Integer> bev;

    @FXML
    private TableColumn<EloadasModel, String> datum;

    @FXML
    private TableColumn<EloadasModel, String> fcim;

    @FXML
    private TableColumn<EloadasModel, Integer> fev;

    @FXML
    private TableColumn<EloadasModel, String> mnev;

    @FXML
    private TableColumn<EloadasModel, String> mvaros;

    @FXML
    private TableView<EloadasModel> table;

    EloadasDAO dao;

    ObservableList<EloadasModel> lista;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        dao= new EloadasDAO();
        lista = FXCollections.observableArrayList();

        lista.addAll(dao.getTopData(50));

        fcim.setCellValueFactory(new PropertyValueFactory<EloadasModel, String>("fcim"));
        fev.setCellValueFactory(new PropertyValueFactory<EloadasModel, Integer>("fev"));
        datum.setCellValueFactory(new PropertyValueFactory<EloadasModel, String>("datum"));
        bev.setCellValueFactory(new PropertyValueFactory<EloadasModel, Integer>("bev"));
        mnev.setCellValueFactory(new PropertyValueFactory<EloadasModel, String>("mnev"));
        mvaros.setCellValueFactory(new PropertyValueFactory<EloadasModel, String>("mvaros"));

        table.setItems(lista);
    }


}
