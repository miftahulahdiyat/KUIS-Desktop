/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;



public class FXMLDocumentController implements Initializable {
    
   @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private DatePicker tanggal;

    @FXML
    private TextField harga;

    @FXML
    private ComboBox<?> jenis;

    @FXML
    private TextField merek;

    @FXML
    private TextField warna;
    @FXML
    void initialize() {
        assert tanggal != null : "fx:id=\"tanggal\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert harga != null : "fx:id=\"harga\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert warna != null : "fx:id=\"warna\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert jenis != null : "fx:id=\"jenis\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert merek != null : "fx:id=\"merek\" was not injected: check your FXML file 'FXMLDocument.fxml'.";

    }
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        System.out.println(merek.getText());
        System.out.println(harga.getText());
        System.out.println(warna.getText());
        System.out.println(tanggal.getValue().toString());
        
        
       
         }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       ArrayList <String> list = new ArrayList<String>();
        list.add("NVDIA GTX 1650");
        list.add("NVDIA RTX 3060");
        list.add("RADEON RX6500 XT ");
        list.add("RADEON PRO W6800");
        ObservableList items = FXCollections.observableArrayList(list);
        jenis.setItems(items);
        
        
        
    }    
}
