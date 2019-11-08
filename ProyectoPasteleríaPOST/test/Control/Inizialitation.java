/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import Entidad.Cliente;

/**
 *
 * @author enano
 */
public class Inizialitation {
    
    public Inizialitation() {
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

    @Test
    public void initData() {
        ValidarRegistroC registroC = new ValidarRegistroC();
        Cliente c = new Cliente();
        c.setNombre("Maria");
        c.setTelefono("1234");
        c.setCasa("250");
        registroC.textoSalida(c);
    }
}
