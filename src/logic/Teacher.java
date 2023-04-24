/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author samuel
 */
public class Teacher extends User{

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getStaffNumber() {
        return staffNumber;
    }

    public void setStaffNumber(int staffNumber) {
        this.staffNumber = staffNumber;
    }

    public int getTeacherId() {
        return idTeacher;
    }

    public void setTeacherId(int idTeacher) {
        this.idTeacher = idTeacher;
    }

    private int userId;
    private int staffNumber;
    private int idTeacher;

}