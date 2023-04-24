/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import dataaccess.DataBaseManager;
import java.sql.Statement;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import logic.Advance;
import logic.IAdvance;
/**
 *
 * @author samuel
 */
public class AdvanceDAO implements IAdvance{

    @Override
    public int createAdvance(Advance advance) throws SQLException{
        int result = 0;
        String query = "INSERT INTO Avance(IdAnteproyecto, Titulo, FechaHoraDeInicio, FechaHoraDeTermino, Descripcion) VALUES ( ?, ?, ?, ?, ?)";
        DataBaseManager dataBaseManager = new DataBaseManager();
        Connection connection = dataBaseManager.getConnection();
        PreparedStatement statement = connection.prepareStatement(query);
        
            statement.setInt(1, advance.getIdDraft());
            statement.setString(2, advance.getTitle());
            statement.setString(3, advance.getInicialDateTime().format(DateTimeFormatter.ofPattern("yyyy-LL-dd HH:mm:ss")));
            statement.setString(4, advance.getFinalDateTime().format(DateTimeFormatter.ofPattern("yyyy-LL-dd HH:mm:ss")));
            statement.setString(5, advance.getDescription());
            result = statement.executeUpdate();
            connection.close();
            return result;
    }

    @Override
    public ArrayList<Advance> consultAdvances() throws SQLException {
        Advance advance = new Advance();
        ArrayList<Advance> advances = new ArrayList();
        String query = "select * from Avance where Avance.IdAvance = 1";
        DataBaseManager dataBaseManager = new DataBaseManager();
        Connection connection = dataBaseManager.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()){
            advance = new Advance();
            advance.setIdDraft(resultSet.getInt("IdAnteproyecto"));
            advance.setTitle(resultSet.getString("Titulo"));
            advance.setInicialDateTime(resultSet.getObject("FechaHoraDeInicio", LocalDateTime.class));
            advance.setFinalDateTime(resultSet.getObject("FechaHoraDeTermino", LocalDateTime.class));
            advance.setDescription(resultSet.getString("Descripcion"));
            advances.add(advance);
        }       
        
        connection.close();
        return advances;
                    
  
    }

    @Override
    public int updateAdvance(Advance advance) throws SQLException{
        int result = 0;
        String query = "UPDATE Avance SET Titulo = ?, FechaHoraDeInicio = ?, FechaHoraDeTermino = ?, Descripcion = ?  WHERE IdAvance = ?";
        DataBaseManager dataBaseManager = new DataBaseManager();
        Connection connection = dataBaseManager.getConnection();
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, advance.getTitle());
        statement.setString(2, advance.getInicialDateTime().format(DateTimeFormatter.ofPattern("yyyy-LL-dd HH:mm:ss")));
        statement.setString(3, advance.getFinalDateTime().format(DateTimeFormatter.ofPattern("yyyy-LL-dd HH:mm:ss")));
        statement.setString(4, advance.getDescription());
        statement.setInt(5, advance.getIdDraft());
        result = statement.executeUpdate();
        connection.close();
        return result;
    }

    @Override
    public Advance consultAdvance() throws SQLException {
        Advance advance = new Advance();
        String query = "select * from Avance where Avance.IdAvance = 1";
        DataBaseManager dataBaseManager = new DataBaseManager();
        Connection connection = dataBaseManager.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()){
            advance = new Advance();
            advance.setIdDraft(resultSet.getInt("IdAnteproyecto"));
            advance.setTitle(resultSet.getString("Titulo"));
            advance.setInicialDateTime(resultSet.getObject("FechaHoraDeInicio", LocalDateTime.class));
            advance.setFinalDateTime(resultSet.getObject("FechaHoraDeTermino", LocalDateTime.class));
            advance.setDescription(resultSet.getString("Descripcion"));
        }   
        
        return advance;
    }


    
    
}
