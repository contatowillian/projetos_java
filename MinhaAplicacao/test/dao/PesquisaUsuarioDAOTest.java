/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import java.util.Vector;
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
public class PesquisaUsuarioDAOTest {
    
    public PesquisaUsuarioDAOTest() {
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
     * Test of getDataUsuarios method, of class PesquisaUsuarioDAO.
     */
    @Test
    public void testGetDataUsuarios() {
        System.out.println("getDataUsuarios");
        String Nome_busca = "";
        String CPF_busca = "";
        String Status_busca = "";
        int pagina = 0;
        Vector expResult = null;
        Vector result = PesquisaUsuarioDAO.getDataUsuarios(Nome_busca, CPF_busca, Status_busca, pagina);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class PesquisaUsuarioDAO.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        PesquisaUsuarioDAO.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
