package logic;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author julio
 */
public interface IDraft {
    int addDraft(Draft draft) throws SQLException;
    void updateDraft(Draft draft) throws SQLException;
    ArrayList<DraftConsult> consultDraft() throws SQLException;
}
