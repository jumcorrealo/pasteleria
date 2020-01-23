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
import java.util.Date;
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
        
        Postre d = new Postre();
        Postre e = new Postre();
        Postre f = new Postre();
        
        d.setFlavor("Tres leches");
        e.setFlavor("Vino");
        f.setFlavor("Fresa");
        
        
        d.setPrice(2000);
        e.setPrice(12000);
        f.setPrice(1500);
        
        
        d.setTipo("Cupcake");
        e.setTipo("Torta");
        f.setTipo("Postre");
        
        ArrayList<Postre> listP = new ArrayList<>();
        
        listP.add(d);
        listP.add(e);
        listP.add(f);
        
        for(Postre i: listP){
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
        PedidoDAO n =new PedidoDAO(); 
        Date d1= new Date(2020,01,12);
        Date d2= new Date(2020,02,13);
        Date d3= new Date(2020,03,12);
        Date d4= new Date(2020,01,13);
        Pedido p= new Pedido();
        p.setIdPedido(1);
        p.setPrecio(1000);
        p.setIdPostre(d.getId());
        p.setIdCliente(a.getId());
        p.setEstado(true);
        p.setCantidadTortas(1);
        p.setFechaE(d1);
        p.setFechaR(d2);
        p.setAbono(0);
        p.setAdiciones("aaa");
        p.setDecoracion("aaa");
        p.setForma("circulo");
        n.create(p);
        Pedido p1= new Pedido();
        p1.setIdPedido(1);
        p1.setPrecio(1000);
        p1.setIdPostre(d.getId());
        p1.setIdCliente(a.getId());
        p1.setEstado(true);
        p1.setCantidadTortas(1);
        p1.setFechaE(d1);
        p1.setFechaR(d2);
        p1.setAbono(0);
        p1.setAdiciones("aaa");
        p1.setDecoracion("aaa");
        p1.setForma("circulo");
        n.create(p1);
        Pedido p2= new Pedido();
        p2.setIdPedido(1);
        p2.setPrecio(1000);
        p2.setIdPostre(d.getId());
        p2.setIdCliente(a.getId());
        p2.setEstado(true);
        p2.setCantidadTortas(1);
        p2.setFechaE(d1);
        p2.setFechaR(d2);
        p2.setAbono(0);
        p2.setAdiciones("aaa");
        p2.setDecoracion("aaa");
        p2.setForma("circulo");
        n.create(p2);
        Pedido p3= new Pedido();
        p3.setIdPedido(1);
        p3.setPrecio(1000);
        p3.setIdPostre(d.getId());
        p3.setIdCliente(a.getId());
        p3.setEstado(true);
        p3.setCantidadTortas(1);
        p3.setFechaE(d1);
        p3.setFechaR(d2);
        p3.setAbono(0);
        p3.setAdiciones("aaa");
        p3.setDecoracion("aaa");
        p3.setForma("circulo");
        n.create(p3);
    }
    
}
