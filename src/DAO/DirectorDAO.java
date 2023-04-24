/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import dataaccess.DataBaseManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import logic.Director;
import logic.IDirectorDAO;


public class DirectorDAO implements IDirectorDAO {

    @Override
    public boolean createDirector(Director director) throws SQLException{
      int result;
      String query = "INSERT INTO Director (IdProfesor) VALUES (?)";
      DataBaseManager dataBaseManager = new DataBaseManager();
        try (Connection connection = dataBaseManager.getConnection()) {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, director.getTeacherId());
            result = statement.executeUpdate();
        }

      return result > 0;

    }

    @Override
    public List<Director> consultDirector() throws SQLException {
      String sql = "SELECT Profesor.NumeroDePersonal, Usuario.Nombre, Usuario.ApellidoPaterno, Usuario.ApellidoMaterno, Usuario.CorreoInstitucional "
            + "FROM Director "
            + "INNER JOIN Profesor ON Director.IdProfesor = Profesor.IdProfesor "
            + "INNER JOIN Usuario ON Profesor.IdUsuario = Usuario.IdUsuario";
      List<Director> list = new ArrayList<>();
      DataBaseManager dataBaseManager = new DataBaseManager();
        try (Connection connection = dataBaseManager.getConnection()) {
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet result = statement.executeQuery();

            while (result.next()) {

                Director director = new Director();
                director.setTeacherId(result.getInt("NumeroDePersonal"));
                director.setFirstName(result.getString("Nombre"));
                director.setFatherLastName(result.getString("ApellidoPaterno"));
                director.setMotherLastName(result.getString("ApellidoMaterno"));
                director.seteMail(result.getString("CorreoInstitucional"));
                list.add(director);
            }   }

    return  list;

    }

    @Override
    public boolean updateDirector(Director director) throws SQLException {
    int result;
    String query = "UPDATE Director SET IdProfesor=? WHERE IdDirector=?";
    DataBaseManager dataBaseManager = new DataBaseManager();
        try (Connection connection = dataBaseManager.getConnection()) {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, director.getTeacherId());
            statement.setInt(2, director.getIdDirector());
            result = statement.executeUpdate();
        }
    return result > 0;

    }

    @Override
    public boolean deleteDirector(int idDirector) throws SQLException {
        int result;
        String query = "DELETE FROM Director WHERE IdDirector = ?";
        DataBaseManager dataBaseManager = new DataBaseManager();
        try (Connection connection = dataBaseManager.getConnection()) {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, idDirector);
            result = statement.executeUpdate();
        }

        return result > 0;
    }

}