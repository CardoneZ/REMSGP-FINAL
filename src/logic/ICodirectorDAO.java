/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import java.sql.SQLException;
import java.util.ArrayList;


public interface ICodirectorDAO {
    boolean createCodirector(Codirector codirector)throws SQLException;
    ArrayList<Codirector> consultCodirector() throws SQLException;
    boolean updateCodirector(Codirector codirector)throws SQLException;
    boolean deleteCodirector(int idCodirector)throws SQLException;
}
