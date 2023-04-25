/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import logic.Advance;
import logic.Advance;
import DAO.AdvanceDAO;
import DAO.AdvanceDAO;

import javafx.stage.Stage;
/**
 * FXML Controller class
 *
 * @author samuel
 */
public class DetailsController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private Label labelfechainicio;
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException{
        
    }
    
    @FXML
    private Label labelfechatermino;
    
    @FXML
    private Label labelAdvanceTitle;
    
    @FXML
    private Label labelAdvanceDescription;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Advance advancen = new Advance();
        AdvanceDAO advancedao = new AdvanceDAO();
        try {
            advancen = advancedao.consultAdvance();
        } catch (SQLException ex) {
            Logger.getLogger(DetailsController.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(advancen.getTitle());
        System.out.println(advancen.getInicialDateTime());
        System.out.println(advancen.getFinalDateTime());
        System.out.println(advancen.getDescription());
        
        labelAdvanceTitle.setText(advancen.getTitle());
        labelfechainicio.setText(advancen.getInicialDateTime().format(DateTimeFormatter.ofPattern("yyyy-LL-dd HH:mm:ss")));
        labelfechatermino.setText(advancen.getFinalDateTime().format(DateTimeFormatter.ofPattern("yyyy-LL-dd HH:mm:ss")));
        labelAdvanceDescription.setText(advancen.getDescription());
    }   
   
    
}
