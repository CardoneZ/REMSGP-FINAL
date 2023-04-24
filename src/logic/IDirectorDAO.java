/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import java.sql.SQLException;
import java.util.List;


public interface IDirectorDAO {

    boolean createDirector(Director director)throws SQLException;
    List<Director> consultDirector() throws SQLException;
    boolean deleteDirector(int directorId) throws SQLException;
    boolean updateDirector(Director director) throws SQLException;
}
