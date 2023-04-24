




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;
import java.sql.SQLException;
import java.util.ArrayList;

 

public interface ITeacherDAO {
    boolean createTeacher(Teacher teacher) throws SQLException;
    ArrayList<Teacher> consultTeacher() throws SQLException;
    boolean deleteTeacher (Teacher teacher) throws SQLException;
    boolean updateTeacher (Teacher teacher) throws SQLException;
}