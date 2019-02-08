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
public class UsuarioTest {
    
    public UsuarioTest() {
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
     * Test of getCpf method, of class Usuario.
     */
    @Test
    public void testGetCpf() {
        System.out.println("getCpf");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getCpf();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCpf method, of class Usuario.
     */
    @Test
    public void testSetCpf() {
        System.out.println("setCpf");
        String cpf = "";
        Usuario instance = new Usuario();
        instance.setCpf(cpf);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Usuario.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Usuario.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Usuario instance = new Usuario();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Usuario.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Usuario instance = new Usuario();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Usuario.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        Usuario instance = new Usuario();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Usuario.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Usuario.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Usuario instance = new Usuario();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTelefone method, of class Usuario.
     */
    @Test
    public void testGetTelefone() {
        System.out.println("getTelefone");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getTelefone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTelefone method, of class Usuario.
     */
    @Test
    public void testSetTelefone() {
        System.out.println("setTelefone");
        String telefone = "";
        Usuario instance = new Usuario();
        instance.setTelefone(telefone);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
