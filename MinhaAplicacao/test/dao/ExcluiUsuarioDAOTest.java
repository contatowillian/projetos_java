/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author willian.batista
 */
public class ExcluiUsuarioDAOTest {
    
    public ExcluiUsuarioDAOTest() {
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
     * Test of Deleta_Usuario method, of class ExcluiUsuarioDAO.
     */
    @Test
    public void testDeleta_Usuario() {
        System.out.println("Deleta_Usuario");
        String usuario_id = "";
        ExcluiUsuarioDAO instance = new ExcluiUsuarioDAO();
        boolean expResult = false;
        boolean result = instance.Deleta_Usuario(usuario_id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
