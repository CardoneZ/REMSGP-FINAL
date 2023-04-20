/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;
import dataaccess.DataBaseManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author julio
 */
public class DraftDAO implements IDraft{
    @Override
    public int addDraft(Draft draft) throws SQLException {
        int result;
        String query = "insert into Anteproyecto(IdCuerpoAcademico, NombreDelProyecto, IdLGAC, IdLineaDeInvestigacion, IdDuracionAproximada, IdModalidadDeTrabajoRecepcional, NombreDeTrabajoRecepcional, IdRequisitos, IdDirector, AlumnosParticipantes, DescripcionDelProyectoInvestigacion, DescripcionDelTrabajoRecepcional, IdResultadosEsperados, BibliografiaRecomendada) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        DataBaseManager dataBaseManager = new DataBaseManager();
        Connection connection = dataBaseManager.getConnection();
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, draft.getIdCuerpoAcademico());
        statement.setString(2, draft.getNombreDelProyecto());
        statement.setInt(3, draft.getIdLGAC());
        statement.setInt(4, draft.getIdlineaDeInvestigacion());
        statement.setInt(5, draft.getIdDuracionAproximada());
        statement.setInt(6, draft.getIdModalidadDeTrabajoRecepcional());
        statement.setString(7, draft.getNombreDeTrabajoRecepcional());
        statement.setInt(8, draft.getIdRequisitos());
        statement.setInt(9, draft.getIdDirector());
        statement.setInt(10, draft.getAlumnosParticipantes());
        statement.setString(11, draft.getDescripcionDelProyectoInvestigacion());
        statement.setString(12, draft.getDescripcionDelTrabajoRecepcional());
        statement.setInt(13, draft.getIdResultadosEsperados());
        statement.setString(14, draft.getBibliografiaRecomendada());
        result = statement.executeUpdate();
        return result;
    }

    @Override
    public void updateDraft(Draft draft) throws SQLException {
        String query = "UPDATE Anteproyecto SET IdCuerpoAcademico = ?, NombreDelProyecto = ?, IdLGAC = ?, IdLineaDeInvestigacion = ?, IdDuracionAproximada = ?, IdModalidadDeTrabajoRecepcional = ?, NombreDeTrabajoRecepcional = ?, IdRequisitos = ?,IdDirector = ?, AlumnosParticipantes = ?, DescripcionDelProyectoInvestigacion = ?, DescripcionDelTrabajoRecepcional = ?, IdResultadosEsperados = ?, BibliografiaRecomendada = ? WHERE IdAnteproyecto = 3";
        DataBaseManager dataBaseManager = new DataBaseManager();
        Connection connection = dataBaseManager.getConnection();
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, draft.getIdCuerpoAcademico());
        statement.setString(2, draft.getNombreDelProyecto());
        statement.setInt(3, draft.getIdLGAC());
        statement.setInt(4, draft.getIdlineaDeInvestigacion());
        statement.setInt(5, draft.getIdDuracionAproximada());
        statement.setInt(6, draft.getIdModalidadDeTrabajoRecepcional());
        statement.setString(7, draft.getNombreDeTrabajoRecepcional());
        statement.setInt(8, draft.getIdRequisitos());
        statement.setInt(9, draft.getIdDirector());
        statement.setInt(10, draft.getAlumnosParticipantes());
        statement.setString(11, draft.getDescripcionDelProyectoInvestigacion());
        statement.setString(12, draft.getDescripcionDelTrabajoRecepcional());
        statement.setInt(13, draft.getIdResultadosEsperados());
        statement.setString(14, draft.getBibliografiaRecomendada());
        statement.executeUpdate();
        connection.close();
    }

    @Override
    public ArrayList<DraftConsult> consultDraft() throws SQLException {
        DraftConsult draft = new DraftConsult();
        ArrayList<DraftConsult> drafts = new ArrayList();
        String query = "Select CA.CuerpoAcademico, an.nombredelproyecto, LC.LGAC, LI.LineaDeInvestigacion, DA.DuracionAproximada, MTR.ModalidadDeTrabajoRecepcional, an.NombreDeTrabajoRecepcional, R.Requisitos, an.AlumnosParticipantes, an.DescripcionDelProyectoInvestigacion, an.DescripcionDelTrabajoRecepcional, RE.ResultadosEsperados, an.BibliografiaRecomendada from anteproyecto AN inner join CuerpoAcademico CA on AN.IdCuerpoAcademico = CA.IdCuerpoAcademico inner join LGAC LC on AN.IdLGAC = LC.IdLGAC inner join LineaDeInvestigacion LI on AN.IdLineaDeInvestigacion = LI.IdLineaDeInvestigacion inner join DuracionAproximada DA on AN.IdDuracionAproximada = DA.IdDuracionAproximada inner join ModalidadDeTrabajoRecepcional MTR on AN.IdModalidadDeTrabajoRecepcional = MTR.IdModalidadDeTrabajoRecepcional inner join Requisitos R on AN.IdRequisitos = R.IdRequisitos inner join ResultadosEsperados RE on AN.IdResultadosEsperados = RE.IdResultadosEsperados Where AN.IdAnteproyecto = 1;";
        DataBaseManager dataBaseManager = new DataBaseManager();
        Connection connection = dataBaseManager.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()){
            draft = new DraftConsult();
            draft.setCuerpoAcademico(resultSet.getString("CuerpoAcademico"));
            draft.setNombreDelProyecto(resultSet.getString("NombreDelProyecto"));
            draft.setLGAC(resultSet.getString("LGAC"));
            draft.setLineaDeInvestigacion(resultSet.getString("lineaDeInvestigacion"));
            draft.setDuracionAproximada(resultSet.getString("DuracionAproximada"));
            draft.setModalidadDeTrabajoRecepcional(resultSet.getString("ModalidadDeTrabajoRecepcional"));
            draft.setNombreDeTrabajoRecepcional(resultSet.getString("NombreDeTrabajoRecepcional"));
            draft.setRequisitos(resultSet.getString("Requisitos"));
            draft.setAlumnosParticipantes(resultSet.getInt("AlumnosParticipantes"));
            draft.setDescripcionDelProyectoInvestigacion(resultSet.getString("DescripcionDelProyectoInvestigacion"));
            draft.setDescripcionDelTrabajoRecepcional(resultSet.getString("DescripcionDelTrabajoRecepcional"));
            draft.setRequisitos(resultSet.getString("Requisitos"));
            draft.setBibliografiaRecomendada(resultSet.getString("BibliografiaRecomendada"));
            drafts.add(draft);
        }       
        
        connection.close();
        return drafts;
    }
    
    
}
