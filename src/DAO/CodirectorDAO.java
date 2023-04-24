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
import java.util.ArrayList;
import logic.Codirector;
import logic.ICodirectorDAO;


public class CodirectorDAO implements ICodirectorDAO {

    @Override
    public boolean createCodirector(Codirector codirector) throws SQLException{
       int result;
      String query = "INSERT INTO Codirector (IdProfesor) VALUES (?)";
      DataBaseManager dataBaseManager = new DataBaseManager();
        try (Connection connection = dataBaseManager.getConnection()) {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, codirector.getTeacherId());
            result = statement.executeUpdate();
        }

      return result > 0;

    }

    @Override
   public ArrayList<Codirector> consultCodirector() throws SQLException {
    String sql = "SELECT Profesor.NumeroDePersonal, Usuario.Nombre, Usuario.ApellidoPaterno, Usuario.ApellidoMaterno, Usuario.CorreoInstitucional "
            + "FROM Codirector "
            + "INNER JOIN Profesor ON Codirector.IdProfesor = Profesor.IdProfesor "
            + "INNER JOIN Usuario ON Profesor.IdUsuario = Usuario.IdUsuario";
    ArrayList<Codirector> list = new ArrayList<>();
    DataBaseManager dataBaseManager = new DataBaseManager();
    Connection connection = dataBaseManager.getConnection();
    PreparedStatement statement = connection.prepareStatement(sql);
    ResultSet result = statement.executeQuery();

    while (result.next()) {
        Codirector codirector = new Codirector();
        codirector.setTeacherId(result.getInt("NumeroDePersonal"));
        codirector.setFirstName(result.getString("Nombre"));
        codirector.setFatherLastName(result.getString("ApellidoPaterno"));
        codirector.setMotherLastName(result.getString("ApellidoMaterno"));
        codirector.seteMail(result.getString("CorreoInstitucional"));
        list.add(codirector);
    }

    connection.close();

    return (ArrayList<Codirector>) list;
}

   @Override
    public boolean updateCodirector(Codirector codirector) throws SQLException {
    int result;
    String query = "UPDATE Codirector SET IdProfesor=? WHERE IdCodirector=?";
    DataBaseManager dataBaseManager = new DataBaseManager();
        try (Connection connection = dataBaseManager.getConnection()) {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, codirector.getTeacherId());
            statement.setInt(2, codirector.getIdCodirector());
            result = statement.executeUpdate();
        }
        return result > 0;

    }

    @Override
    public boolean deleteCodirector(int idCodirector) throws SQLException {
    int result;
    String query = "DELETE FROM Codirector WHERE IdCodirector = ?";
    DataBaseManager dataBaseManager = new DataBaseManager();
        try (Connection connection = dataBaseManager.getConnection()) {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, idCodirector);
            result = statement.executeUpdate();
        }

        return result > 0;
    }

}