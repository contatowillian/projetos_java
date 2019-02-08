/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dao.DaoSuite;
import factory.ConnectionFactoryTest;
import factory.FactorySuite;
import factory.TestaConexaoTest;
import gui.GuiSuite;
import imagens.ImagensSuite;
import minhaaplicacao.MinhaaplicacaoSuite;
import modelo.ModeloSuite;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import webservice.WebserviceSuite;

/**
 *
 * @author willian.batista
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({META-INF.META.class, ModeloSuite.class, TestaConexaoTest.class, WebserviceSuite.class, DaoSuite.class, ConnectionFactoryTest.class, FactorySuite.class, ImagensSuite.class, MinhaaplicacaoSuite.class, GuiSuite.class})
public class RootSuite {

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
