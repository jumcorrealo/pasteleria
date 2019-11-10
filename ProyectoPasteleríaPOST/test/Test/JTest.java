/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Control.GestionCliente;
import Entidad.Cliente;
import Entidad.Sistema;
import FronteraAdministrativo.GestionDeClientes;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nicolas
 */
public class JTest {
    private static GestionCliente validar = new GestionCliente();
    private final String NOMBRES_REPETIDOS="Este usuario ya existe";
    private final String CLIENTE_ACEPTADO="Registro con exito";

    
    public JTest() {
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
     public void NombreRepetido() {
         Cliente u= new Cliente();
         u.setNombre("Juan Jose");
         u.setCasa("12");
         u.setTelefono("33");
         assertEquals(validar.textoSalida(u),NOMBRES_REPETIDOS);
         
     }
     @Test
     public void DatosCorrectos() {
         Cliente u= new Cliente();
         u.setNombre("Nicolas");
         u.setCasa("567");
         u.setTelefono("934");
         assertEquals(validar.textoSalida(u),CLIENTE_ACEPTADO);
         Cliente v= new Cliente();
         v.setNombre("Alejandra");
         v.setCasa("234");
         v.setTelefono("2348");
         assertEquals(validar.textoSalida(v),CLIENTE_ACEPTADO);
}
}