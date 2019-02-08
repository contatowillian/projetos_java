/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package webservice;

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
public class BuscaCepTest {
    
    public BuscaCepTest() {
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
     * Test of main method, of class BuscaCep.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        BuscaCep.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of BuscaCep method, of class BuscaCep.
     */
    @Test
    public void testBuscaCep() {
        System.out.println("BuscaCep");
        String CEP = "";
        BuscaCep instance = new BuscaCep();
        String expResult = "";
        String result = instance.BuscaCep(CEP);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
