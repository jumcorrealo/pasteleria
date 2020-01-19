/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import DAO.*;
import Entidad.*;
import java.util.ArrayList;
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
        
        a.setPuntaje(0);
        b.setPuntaje(0);
        c.setPuntaje(0);
        
        a.setActivo(true);
        b.setActivo(true);
        c.setActivo(true);
        
        ArrayList<Cliente> list = new ArrayList<>();
        
        list.add(a);
        list.add(b);
        list.add(c);
        
        for(Cliente i: list){
            registroC.create(i);
        }
        
        PostresDAO registroP = new PostresDAO();
        
        Postres d = new Postres();
        Postres e = new Postres();
        Postres f = new Postres();
        
        d.setFlavor("Tres leches");
        e.setFlavor("Vino");
        f.setFlavor("Fresa");
        
        
        d.setPrice(2000);
        e.setPrice(12000);
        f.setPrice(1500);
        
        
        d.setTipo("Cupcake");
        e.setTipo("Torta");
        f.setTipo("Postre");
        
        ArrayList<Postres> listP = new ArrayList<>();
        
        listP.add(d);
        listP.add(e);
        listP.add(f);
        
        for(Postres i: listP){
            registroP.create(i);
        }
        
        InsumoDAO registroI= new InsumoDAO();
        
        Insumo g = new Insumo();
        Insumo h = new Insumo();
        
        g.setNombre("Vino");
        h.setNombre("Fresas");
        
        g.setUnidad("Botellas");
        h.setUnidad("Bolsas");
        
        ArrayList<Insumo> listI = new ArrayList<>();
        
        listI.add(g);
        listI.add(h);
        
        for(Insumo i: listI){
            registroI.create(i);
        }
    }
    
}
