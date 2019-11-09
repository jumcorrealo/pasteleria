/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Entidad.Cliente;
import DAO.*;
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
public class inicializacion {
    
    public inicializacion() {
        
    }
    @Test
    public void initData(){
        Cliente a= new Cliente();
        Cliente b= new Cliente();
        Cliente c= new Cliente();
        
        a.setNombre("nn");
        b.setNombre("nnn");
        c.setNombre("nnnn");
        
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
        
        ClienteJpaDAO dao = new ClienteJpaDAO();
        
        for(Cliente u : list){
           System.out.println(u.getNombre());
           System.out.println(u.getCasa());
           System.out.println(u.getTelefono());
           System.out.println("-------------");
           dao.create(u);
        }
        
        
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
