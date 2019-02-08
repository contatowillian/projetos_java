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
import org.w3c.dom.Element;

/**
 *
 * @author willian.batista
 */
public class Leitor_xml_cepTest {
    
    public Leitor_xml_cepTest() {
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
     * Test of main method, of class Leitor_xml_cep.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Leitor_xml.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCharacterDataFromElement method, of class Leitor_xml_cep.
     */
    @Test
    public void testGetCharacterDataFromElement() {
        System.out.println("getCharacterDataFromElement");
        Element e = null;
        String expResult = "";
        String result = Leitor_xml.getCharacterDataFromElement(e);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Webservicecep method, of class Leitor_xml_cep.
     */
    @Test
    public void testWebservicecep() {
        System.out.println("Webservicecep");
        String xml = "";
        String campo = "";
        Leitor_xml instance = new Leitor_xml();
        String expResult = "";
        String result = instance.Webservicecep(xml, campo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
