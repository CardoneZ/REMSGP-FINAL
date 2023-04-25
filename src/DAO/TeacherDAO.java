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
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import logic.ITeacherDAO;
import logic.Teacher;


public class TeacherDAO implements ITeacherDAO {

    @Override
    public boolean createTeacher(Teacher teacher) throws SQLException{
        int result = 0;
        String query = "INSERT INTO Profesor (IdUsuario, NumeroDePersonal) VALUES (?,?)";
        DataBaseManager dataBaseManager = new DataBaseManager();
        Connection connection = dataBaseManager.getConnection();
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, teacher.getUserId());
        statement.setInt(2,teacher.getStaffNumber());
        result = statement.executeUpdate();
        connection.close();

        return result > 0;
    }

    @Override
   public ObservableList<Teacher> consultTeacher() throws SQLException{
    String sql = "SELECT Profesor.NumeroDePersonal, Usuario.Nombre, Usuario.ApellidoPaterno, Usuario.ApellidoMaterno, Usuario.CorreoInstitucional "
            + "FROM Profesor"
            + "INNER JOIN Usuario ON Profesor.IdUsuario = Usuario.IdUsuario";
    ObservableList<Teacher> list = FXCollections.observableArrayList();
    DataBaseManager dataBaseManager = new DataBaseManager();
    Connection connection = dataBaseManager.getConnection();
    PreparedStatement statement = connection.prepareStatement(sql);
    ResultSet result = statement.executeQuery();

    while (result.next()) {
        Teacher teacher = new Teacher();
        teacher.setStaffNumber(result.getInt("NumeroDePersonal"));
        teacher.setFirstName(result.getString("Nombre"));
        teacher.setFatherLastName(result.getString("ApellidoPaterno"));
        teacher.setMotherLastName(result.getString("ApellidoMaterno"));
        teacher.seteMail(result.getString("CorreoInstitucional"));
        list.add(teacher);
    }

    connection.close();

    return (ObservableList<Teacher>) list;
  }

    @Override
    public boolean deleteTeacher(Teacher teacher) throws SQLException {
    int result;
        String query = "UPDATE Profesor SET IdProfesor=? WHERE IdProfesor=?";
        DataBaseManager dataBaseManager = new DataBaseManager();
        try (Connection connection = dataBaseManager.getConnection()) {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, teacher.getUserId());
            statement.setInt(2, teacher.getTeacherId());
            result = statement.executeUpdate();
        }
    return result > 0;
    }

    @Override
    public boolean updateTeacher(Teacher teacher) throws SQLException {
        int result;
        String query = "DELETE FROM Profesor WHERE IdProfesor = ?";
        DataBaseManager dataBaseManager = new DataBaseManager();
        try (Connection connection = dataBaseManager.getConnection()) {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, teacher.getTeacherId());
            result = statement.executeUpdate();
        }

        return result > 0;
    }
    }