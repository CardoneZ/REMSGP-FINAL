/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import logic.JavaApplication;

/**
 * FXML Controller class
 *
 * @author samuel
 */
public class LoginController implements Initializable {

    @FXML
    void eventInicioSesion(ActionEvent event) throws IOException {
        //JavaApplication.changeView("../views/RegisterUser.fxml", 700, 400);
    }
      @FXML
    void eventRegisterUser(ActionEvent event) throws IOException {
        JavaApplication.changeView("../views/RegisterUser.fxml", 474, 573);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
          // TODO
    }    
    
}
