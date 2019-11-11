/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Control.GestionCliente;
import DAO.ClienteDAO;
import Entidad.Cliente;
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
    private final GestionCliente validar = new GestionCliente();
    private final String NOMBRES_REPETIDOS = "Este usuario ya existe";
    private final String CLIENTE_ACEPTADO = "Registro con exito";
    private final String CLIENTE_ELIMINADO = "Cliente Eliminado";
    private final String CLIENTE_ACTUALIZADO = "Datos Actualizado";
    private final String NOMBRE_EXISTENTE = "Nombre de Usuario Exixtente";

    
    public JTest() {
        
    }
    
   @BeforeClass
    public static void setUpClass() {
        ClienteDAO registroC = new ClienteDAO();
        
        Cliente a= new Cliente();
        Cliente b= new Cliente();
        Cliente c= new Cliente();
        
        a.setNombre("Juan Jose");
        b.setNombre("Luis");
        c.setNombre("Sara");
        
        a.setCasa("1");
        b.setCasa("2");
        c.setCasa("3");
        
        a.setTelefono("12");
        b.setTelefono("23");
        c.setTelefono("34");
        
        ArrayList<Cliente> list = new ArrayList<>();
        
        list.add(a);
        list.add(b);
        list.add(c);
        
        for(Cliente i: list){
            registroC.create(i);
        }
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
         Cliente u = new Cliente();
         u.setNombre("Juan Jose");
         u.setCasa("12");
         u.setTelefono("33");
         assertEquals(validar.textoSalida(u),NOMBRES_REPETIDOS);
         
    }
    @Test
    public void Eliminar() {
         ClienteDAO cdao = new ClienteDAO();
         Cliente u = new Cliente();
         u.setNombre("Juan");
         u.setCasa("12");
         u.setTelefono("33");
         cdao.create(u);
         assertEquals(validar.deleteClient(u),CLIENTE_ELIMINADO);
         
    }
    @Test
    public void Actualizar() {
         Cliente u = new Cliente();
         u.setNombre("Juan");
         u.setCasa("12");
         u.setTelefono("33");
         validar.usuarioUnico(u);
         u.setNombre("Eduardo");
         u.setTelefono("432");
         assertEquals(validar.upDateClient(u),CLIENTE_ACTUALIZADO);
         
         Cliente v = new Cliente();
         v.setNombre("Veronica");
         v.setCasa("12");
         v.setTelefono("33");
         validar.textoSalida(v);
         v.setNombre("Sara");
         v.setTelefono("047");
         assertEquals(validar.upDateClient(v),NOMBRE_EXISTENTE);
         
    }
    @Test
    public void DatosCorrectos() {
         Cliente u = new Cliente();
         u.setNombre("Nicolas");
         u.setCasa("567");
         u.setTelefono("934");
         assertEquals(validar.textoSalida(u),CLIENTE_ACEPTADO);
         Cliente v = new Cliente();
         v.setNombre("Alejandra");
         v.setCasa("234");
         v.setTelefono("2348");
         assertEquals(validar.textoSalida(v),CLIENTE_ACEPTADO);
    }
}