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
/**
 *
 * @author samuel
 */
public class UserDAO implements IUser{
    
    public int addUser(User user) throws SQLException{
        int result = 0;
       /* int verify = userVerify(user);
        if(verify == 0){*/
            
            String query = "insert into Usuario(nombre, apellido, correoElectronico,) values(?,?,?)";
            DataBaseManager dataBaseManager = new DataBaseManager();
            Connection connection = dataBaseManager.getConnection();
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, user.getFirstName());
            statement.setString(2, user.getFatherLastName());
            statement.setString(3, user.getMotherLastName());
            statement.setString(4, user.geteMail());
            statement.setString(5, user.getPassword());
            result = statement.executeUpdate();
            return result;
            
      /*  }else if(verify == 1){
            return result = 1;
            
        }else{
            return result = -1;
            
        }*/
    }

    /*@Override
    public int userVerify(User user) throws SQLException {
        int result = 0;
        String query = "select * from Usuario where correoElectronico = ?;";
        DataBaseManager dataBaseManager = new DataBaseManager();
        Connection connection = dataBaseManager.getConnection();
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, user.geteMail());
        
        ResultSet resultSet = statement.executeQuery();
        
        
        if(resultSet.next()){
            if(resultSet.getString("nombre").equals(user.getfirstName()) && resultSet.getString("apellido").equals(user.getlastName())){
                result = 1;
            }else{
                result = -1;
            }
        }
        return result;
    }*/
}
