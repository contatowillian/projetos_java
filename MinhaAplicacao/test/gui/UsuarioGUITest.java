/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

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
public class UsuarioGUITest {
    
    public UsuarioGUITest() {
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
     * Test of formatar method, of class UsuarioGUI.
     */
    @Test
    public void testFormatar() {
        System.out.println("formatar");
        String valor = "";
        String mascara = "";
        String expResult = "";
        String result = UsuarioGUI.formatar(valor, mascara);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class UsuarioGUI.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        UsuarioGUI.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
