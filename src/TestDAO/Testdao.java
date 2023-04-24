/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestDAO;
import java.sql.SQLException;
import logic.*;
import dataaccess.DataBaseManager;
import java.time.LocalDateTime;
import java.util.ArrayList;
/**
 *
 * @author samuel
 */
public class Testdao {
    public static void main(String[] args) throws SQLException {
        /*User nuevo = new User();
        nuevo.setFirstName("Samuel");
        nuevo.setFatherLastName("Ramirez");
        nuevo.setMotherLastName("Figueroa");
        nuevo.seteMail("samuel05@gmail.com");
        nuevo.setPassword("samuel01");
        UserDAO userDAO = new UserDAO();
        userDAO.addUser(nuevo);*/
        
        
       
        
      //  Advance advancen = new Advance();
        /*advancen.setIdDraft(1);
        advancen.setTitle("Primera entrega up2");
        advancen.setInicialDateTime(LocalDateTime.of(2023, 3, 18, 12 , 00, 00));
        advancen.setFinalDateTime(LocalDateTime.of(2023, 4, 18, 22 , 00, 00));
        advancen.setDescription("Primer avance up2");*/
        /*AdvanceDAO advancedao = new AdvanceDAO();
        advancen = advancedao.consultAdvance();
        System.out.println(advancen.getTitle());
        System.out.println(advancen.getInicialDateTime());
        System.out.println(advancen.getFinalDateTime());
        System.out.println(advancen.getDescription());
        //advancedao.createAdvance(advancen);
        //advancedao.updateAdvance(advancen);
        
     /*   ArrayList<Advance> advances = new ArrayList();
       
        advances=advancedao.consultAdvances();
        
        for(int i=0; i<advances.size(); i++){
            System.out.println(advances.get(i).getTitle());
            System.out.println(advances.get(i).getInicialDateTime());
            System.out.println(advances.get(i).getFinalDateTime());
            System.out.println(advances.get(i).getDescription());
        }*/
        //DraftDAO draftdao = new DraftDAO();
        
      /*  ArrayList<DraftConsult> drafts = new ArrayList();
        drafts=draftdao.consultDraft();
        for(int i=0; i<drafts.size(); i++){
            System.out.println("Cuerpo academico: " + drafts.get(i).getCuerpoAcademico());
            System.out.println("NombreDelProyecto: " + drafts.get(i).getNombreDelProyecto());
            System.out.println("LGAC: " + drafts.get(i).getLGAC());
            System.out.println("LineaDeInvestigacion: " + drafts.get(i).getLineaDeInvestigacion());
            System.out.println("DuracionAproximada: " + drafts.get(i).getDuracionAproximada());
            System.out.println("ModalidadDeTrabajoRecepcional: " + drafts.get(i).getModalidadDeTrabajoRecepcional());
            System.out.println("NombreDeTrabajoRecepcional: " + drafts.get(i).getNombreDeTrabajoRecepcional());
            System.out.println("Requisitos: " + drafts.get(i).getRequisitos());
            System.out.println("AlumnosParticipantes: " + (char) drafts.get(i).getAlumnosParticipantes());
            System.out.println("DescripcionDelProyectoInvestigacion: " + drafts.get(i).getDescripcionDelProyectoInvestigacion());
            System.out.println("DescripcionDelTrabajoRecepcional: " + drafts.get(i).getDescripcionDelTrabajoRecepcional());
            System.out.println("LineaDeInvestigacion: " + drafts.get(i).getLineaDeInvestigacion());
            System.out.println("ResultadosEsperados: " + drafts.get(i).getResultadosEsperados());
            System.out.println("BibliografiaRecomendada: " + drafts.get(i).getBibliografiaRecomendada());
        }
        
        /*
        Draft draftn = new Draft();
        draftn.setIdCuerpoAcademico(1);
        draftn.setNombreDelProyecto("Proyecto prueba update");
        draftn.setIdLGAC(1);
        draftn.setIdlineaDeInvestigacion(1);
        draftn.setIdDuracionAproximada(1);
        draftn.setIdModalidadDeTrabajoRecepcional(1);
        draftn.setNombreDeTrabajoRecepcional("Trabajo recepcional prueba update");
        draftn.setIdRequisitos(1);
        draftn.setIdDirector(1);
        draftn.setAlumnosParticipantes(2);
        draftn.setDescripcionDelProyectoInvestigacion("descripcionDelProyectoInvestigacion");
        draftn.setDescripcionDelTrabajoRecepcional("descripcionDelTrabajoRecepcional");
        draftn.setIdResultadosEsperados(1);
        draftn.setBibliografiaRecomendada("bibliografiaRecomendada");
        draftdao.updateDraft(draftn);*/
}
}