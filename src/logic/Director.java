/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

public class Director extends Teacher {

    @Override
    public int getTeacherId() {
        return idTeacher;
    }

    @Override
    public void setTeacherId(int idTeacher) {
        this.idTeacher = idTeacher;
    }

    public int getIdDirector() {
        return idDirector;
    }

    public void setIdDirector(int idDirector) {
        this.idDirector = idDirector;
    }
    private int idDirector;
    private int idTeacher;

}