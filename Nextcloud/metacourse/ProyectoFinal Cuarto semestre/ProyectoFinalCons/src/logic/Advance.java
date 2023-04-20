/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;
import java.time.LocalDateTime;

/**
 *
 * @author samuel
 */
public class Advance {

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

    public LocalDateTime getInicialDateTime() {
        return inicialDateTime;
    }

    public void setInicialDateTime(LocalDateTime inicialDateTime) {
        this.inicialDateTime = inicialDateTime;
    }

    public LocalDateTime getFinalDateTime() {
        return finalDateTime;
    }

    public void setFinalDateTime(LocalDateTime finalDateTime) {
        this.finalDateTime = finalDateTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

   

    
    private int idDraft;
    private String title;
    private LocalDateTime inicialDateTime;
    private LocalDateTime finalDateTime;
    private String description;
    
    
    
    
}
