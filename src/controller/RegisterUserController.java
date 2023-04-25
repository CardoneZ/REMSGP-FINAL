/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import DAO.UserDAO;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import logic.JavaApplication;
import logic.User;

/**
 * FXML Controller class
 *
 * @author samuel
 */
public class RegisterUserController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private Label fieldTextName;
    @FXML
    private Label fieldTextFatherLastName;
    @FXML
    private Label fieldTextMotherLastName;
    @FXML
    private Label fieldTextEmail;
    @FXML
    private Label fieldTextPassword;
    @FXML
    private Label fieldTextSecondPassword;
    
        @FXML
    void eventRegisterUser(ActionEvent event) throws SQLException {
        String firstPassword = fieldTextPassword.getText();
        String secondPassword = fieldTextSecondPassword.getText();
        if(firstPassword == null ? secondPassword == null : firstPassword.equals(secondPassword)){
            User user = new User ();
            UserDAO userDao = new UserDAO();
            user.setFirstName(fieldTextName.getText());
            user.setFatherLastName(fieldTextFatherLastName.getText());
            user.setMotherLastName(fieldTextMotherLastName.getText());
            user.seteMail(fieldTextEmail.getText());
            user.setPassword(fieldTextPassword.getText());
            userDao.addUser(user);
        }
        
        
    }
    
    @FXML
    void eventReturntoLogin(ActionEvent event) throws IOException {
        JavaApplication.changeView("../views/Login.fxml", 700, 400);
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
