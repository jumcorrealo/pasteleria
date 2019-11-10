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
import DAO.ClienteJpaDAO;
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
        ClienteJpaDAO registroC = new ClienteJpaDAO();
        
        Entidad.Cliente a= new Entidad.Cliente();
//        Cliente b= new Cliente();
//        Cliente c= new Cliente();
        
        a.setNombre("Juan Jose");
//        b.setNombre("Luis");
//        c.setNombre("Sara");
        
        a.setCasa("1");
//        b.setCasa("2");
//        c.setCasa("3");
        
        a.setTelefono("12");
//        b.setTelefono("23");
//        c.setTelefono("34");
        
        registroC.create(a);
//        ArrayList<Cliente> list = new ArrayList<>();
        
//        list.add(a);
//        list.add(b);
//        list.add(c);
        

        
//        for(Cliente i: list){
//            registroC.textoSalida(i);
//        }
    }
}
