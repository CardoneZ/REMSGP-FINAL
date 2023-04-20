/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package logic;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author samuel
 */
public interface IAdvance {
    void createAdvance(Advance advance)throws SQLException;
    ArrayList<Advance> consultAdvances(Advance advance) throws SQLException;
    void updateAdvance(Advance advance)throws SQLException;

}
