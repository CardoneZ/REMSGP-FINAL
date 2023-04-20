/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package logic;

import java.sql.SQLException;

/**
 *
 * @author samuel
 */
public interface IUser{
    public int addUser(User user) throws SQLException;
}
