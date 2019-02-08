/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

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
public class ListaUsuariosTest {
    
    public ListaUsuariosTest() {
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
     * Test of getid method, of class ListaUsuarios.
     */
    @Test
    public void testGetid() {
        System.out.println("getid");
        ListaUsuarios instance = new ListaUsuarios();
        String expResult = "";
        String result = instance.getid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setid method, of class ListaUsuarios.
     */
    @Test
    public void testSetid() {
        System.out.println("setid");
        String id = "";
        ListaUsuarios instance = new ListaUsuarios();
        instance.setid(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class ListaUsuarios.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        ListaUsuarios instance = new ListaUsuarios();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class ListaUsuarios.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        ListaUsuarios instance = new ListaUsuarios();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getcpf method, of class ListaUsuarios.
     */
    @Test
    public void testGetcpf() {
        System.out.println("getcpf");
        ListaUsuarios instance = new ListaUsuarios();
        String expResult = "";
        String result = instance.getcpf();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setcpf method, of class ListaUsuarios.
     */
    @Test
    public void testSetcpf() {
        System.out.println("setcpf");
        String cpf = "";
        ListaUsuarios instance = new ListaUsuarios();
        instance.setcpf(cpf);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getemail method, of class ListaUsuarios.
     */
    @Test
    public void testGetemail() {
        System.out.println("getemail");
        ListaUsuarios instance = new ListaUsuarios();
        String expResult = "";
        String result = instance.getemail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setemail method, of class ListaUsuarios.
     */
    @Test
    public void testSetemail() {
        System.out.println("setemail");
        String email = "";
        ListaUsuarios instance = new ListaUsuarios();
        instance.setemail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getlogin method, of class ListaUsuarios.
     */
    @Test
    public void testGetlogin() {
        System.out.println("getlogin");
        ListaUsuarios instance = new ListaUsuarios();
        String expResult = "";
        String result = instance.getlogin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setlogin method, of class ListaUsuarios.
     */
    @Test
    public void testSetlogin() {
        System.out.println("setlogin");
        String login = "";
        ListaUsuarios instance = new ListaUsuarios();
        instance.setlogin(login);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
