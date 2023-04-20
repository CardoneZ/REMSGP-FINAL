/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectofinal;
import java.sql.SQLException;
import logic.*;
import dataaccess.DataBaseManager;
/**
 *
 * @author samuel
 */
public class ProyectoFinal {

    public static void main(String[] args) throws SQLException {
        User nuevo = new User();
        nuevo.setFirstName("Samuel");
        nuevo.setFatherLastName("Ramirez");
        nuevo.setMotherLastName("Figueroa");
        nuevo.seteMail("samuel05@gmail.com");
        nuevo.setPassword("samuel01");
        
        UserDAO userDAO = new UserDAO();
        userDAO.addUser(nuevo);
    }
    
    
}
