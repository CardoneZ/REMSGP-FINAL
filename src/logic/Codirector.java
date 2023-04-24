/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

public class Codirector extends Teacher {

    @Override
    public int getTeacherId() {
        return idTeacher;
    }

    @Override
    public void setTeacherId(int idTeacher) {
        this.idTeacher = idTeacher;
    }

    public int getIdCodirector() {
        return idCodirector;
    }

    public void setIdCodirector(int idCodirector) {
        this.idCodirector = idCodirector;
    }
    private int idCodirector;
    private int idTeacher;

}