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
public class LoginDAOTest {
    
    public LoginDAOTest() {
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
     * Test of adiciona method, of class LoginDAO.
     */
    @Test
    public void testAdiciona() {
        System.out.println("adiciona");
        String login = "";
        String senha = "";
        LoginDAO instance = new LoginDAO();
        boolean expResult = false;
        boolean result = instance.adiciona(login, senha);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
