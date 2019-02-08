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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author willian.batista
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({gui.UsuarioTest.class, gui.PesquisarUsuarioTest.class, gui.connTest.class, gui.imagens.ImagensSuite.class, gui.Cadastro_usuarios_novoTest.class, gui.loginTest.class, gui.UsuarioGUITest.class, gui.TelaPrincipalTest.class, gui.AlteraUsuariosTest.class})
public class GuiSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
