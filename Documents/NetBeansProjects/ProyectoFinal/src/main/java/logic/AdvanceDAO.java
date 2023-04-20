/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import dataaccess.DataBaseManager;
import java.sql.Statement;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
/**
 *
 * @author samuel
 */
public class AdvanceDAO implements IAdvance{

    @Override
    public void createAdvance(Advance advance) throws SQLException{
        String query = "INSERT INTO advances (id_draft, title, inicial_date, final_date, inicial_time, final_time) VALUES (?, ?, ?, ?, ?, ?)";
        DataBaseManager dataBaseManager = new DataBaseManager();
        Connection connection = dataBaseManager.getConnection();
        PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, advance.getIdDraft());
            statement.setString(2, advance.getTitle());
            statement.setObject(3, advance.getInicialDate());
            statement.setObject(4, advance.getFinalDate());
            statement.setObject(5, advance.getInicialTime());
            statement.setObject(6, advance.getFinalTime());
            statement.executeUpdate();
            connection.close();
    }

    @Override
    public ArrayList<Advance> consultAdvances(Advance advance) throws SQLException {
       
       
        ArrayList<Advance> advances = new ArrayList();
        String query = "select * from Platica";
        DataBaseManager dataBaseManager = new DataBaseManager();
        Connection connection = dataBaseManager.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()){
                    advance = new Advance();
                    advance.setIdDraft(resultSet.getInt("id_draft"));
                    advance.setTitle(resultSet.getString("title"));
                    advance.setInicialDate(resultSet.getObject("inicial_date", LocalDate.class));
                    advance.setFinalDate(resultSet.getObject("final_date", LocalDate.class));
                    advance.setInicialTime(resultSet.getObject("inicial_time", LocalTime.class));
                    advance.setFinalTime(resultSet.getObject("final_time", LocalTime.class));
                    advances.add(advance);
        }       
        
        connection.close();
        return advances;
                    
  
    }

    @Override
    public void updateAdvance(Advance advance) throws SQLException{
        
        String query = "UPDATE advances SET title = ?, inicial_date = ?, final_date = ?, inicial_time = ?, final_time = ? WHERE id_draft = ?";
        DataBaseManager dataBaseManager = new DataBaseManager();
        Connection connection = dataBaseManager.getConnection();
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, advance.getTitle());
        statement.setObject(2, advance.getInicialDate());
        statement.setObject(3, advance.getFinalDate());
        statement.setObject(4, advance.getInicialTime());
        statement.setObject(5, advance.getFinalTime());
        statement.setInt(6, advance.getIdDraft());
        statement.executeUpdate();
        connection.close();
    }


    
    
}
