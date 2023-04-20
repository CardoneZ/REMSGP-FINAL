/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;
import java.time.LocalDate;
import java.time.LocalTime;
/**
 *
 * @author samuel
 */
public class Advance {
    
    private int idDraft;
    private String title;
    private LocalDate inicialDate;
    private LocalDate finalDate;
    private LocalTime inicialTime;
    private LocalTime finalTime;

    public int getIdDraft() {
        return idDraft;
    }

    public void setIdDraft(int idDraft) {
        this.idDraft = idDraft;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getInicialDate() {
        return inicialDate;
    }

    public void setInicialDate(LocalDate inicialDate) {
        this.inicialDate = inicialDate;
    }

    public LocalDate getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(LocalDate finalDate) {
        this.finalDate = finalDate;
    }

    public LocalTime getInicialTime() {
        return inicialTime;
    }

    public void setInicialTime(LocalTime inicialTime) {
        this.inicialTime = inicialTime;
    }

    public LocalTime getFinalTime() {
        return finalTime;
    }

    public void setFinalTime(LocalTime finalTime) {
        this.finalTime = finalTime;
    }
    
    
}
