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
public class AlteraUsuariosTest {
    
    public AlteraUsuariosTest() {
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
     * Test of AlteraUsuarios method, of class AlteraUsuarios.
     */
    @Test
    public void testAlteraUsuarios() {
        System.out.println("AlteraUsuarios");
        String codigo_usuario = "";
        AlteraUsuarios instance = new AlteraUsuarios();
        instance.AlteraUsuarios(codigo_usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class AlteraUsuarios.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        AlteraUsuarios.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
