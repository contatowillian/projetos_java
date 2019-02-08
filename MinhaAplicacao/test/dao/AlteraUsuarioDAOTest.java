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
public class AlteraUsuarioDAOTest {
    
    public AlteraUsuarioDAOTest() {
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
     * Test of getCampoUsuario method, of class AlteraUsuarioDAO.
     */
    @Test
    public void testGetCampoUsuario() {
        System.out.println("getCampoUsuario");
        String nome_campo = "";
        String codigo_usuario = "";
        AlteraUsuarioDAO instance = new AlteraUsuarioDAO();
        String expResult = "";
        String result = instance.getCampoUsuario(nome_campo, codigo_usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class AlteraUsuarioDAO.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        AlteraUsuarioDAO.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
