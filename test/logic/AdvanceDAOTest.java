/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package logic;

import DAO.AdvanceDAO;
import java.time.LocalDateTime;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
//import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author samuel
 */
public class AdvanceDAOTest {
    
    public AdvanceDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of createAdvance method, of class AdvanceDAO.
     */
    @Test
    public void testCreateAdvance() throws Exception {
        System.out.println("createAdvance");
        Advance advance = new Advance();
        AdvanceDAO instance = new AdvanceDAO();
        advance.setIdDraft(1);
        advance.setTitle("Primera entrega up2");
        advance.setInicialDateTime(LocalDateTime.of(2023, 3, 18, 12 , 00, 00));
        advance.setFinalDateTime(LocalDateTime.of(2023, 4, 18, 22 , 00, 00));
        advance.setDescription("Primer avance up2");
        int exceptedResult = 1;
        int result = instance.createAdvance(advance);
        assertEquals(exceptedResult, result);
    }

    /**
     * Test of consultAdvances method, of class AdvanceDAO.
     */
    @Test
    public void testConsultAdvances() throws Exception {
        System.out.println("consultAdvances");
        AdvanceDAO instance = new AdvanceDAO();
        ArrayList<Advance> expResult = null;
        ArrayList<Advance> result = instance.consultAdvances();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateAdvance method, of class AdvanceDAO.
     */
    @Test
    public void testUpdateAdvance() throws Exception {
        System.out.println("updateAdvance");
        Advance advance = null;
        AdvanceDAO instance = new AdvanceDAO();
        int expResult = 0;
        int result = instance.updateAdvance(advance);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
