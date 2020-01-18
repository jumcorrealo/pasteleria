/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Control.GestionPostres;
import DAO.ClienteDAO;
import DAO.PostresDAO;
import Entidad.Cliente;
import Entidad.Postres;
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
public class JTest_Inventario {
    private final GestionPostres validar = new GestionPostres();
    private final String POSTRE_REPETIDO = "Postre Existente";
    private final String POSTRE_ACEPTADO = "Registro Exitoso";
    private final String POSTRE_ACTUALIZADO = "Datos Actualizado";
    private final String POSTRE_NO_ACTUALIZADO = "Información invalida";
    public JTest_Inventario() {
    }
    
    @BeforeClass
    public static void setUpClass() {
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
    public void PostreRepetido() {
        Postres u = new Postres();
        u.setFlavor("Tres leches");;
        u.setPrice(2000);
        u.setTipo("Cupcake");
        assertEquals(validar.persistPostre(u),POSTRE_REPETIDO);
         
    }
    @Test
    public void noActualizar() throws Exception {
        Postres u = new Postres();
        u.setFlavor("Negro");
        u.setPrice(2000);
        u.setTipo("Cupcake");
        validar.persistPostre(u);
        u.setPrice(2000);
        u.setTipo("Torta");
        assertEquals(validar.upDatePostre(u),POSTRE_NO_ACTUALIZADO);
    }
    @Test
    public void Actualizar() throws Exception {
        Postres u = new Postres();
        u.setFlavor("Chocolate");
        u.setPrice(2000);
        u.setTipo("Cupcake");
        validar.persistPostre(u);
        u.setPrice(3000);
        assertEquals(validar.upDatePostre(u),POSTRE_ACTUALIZADO);
    }
    @Test
    public void DatosCorrectos() {
        Postres u = new Postres();
        u.setFlavor("chocolate");;
        u.setPrice(2000);
        u.setTipo("Postre");
        assertEquals(validar.persistPostre(u),POSTRE_ACEPTADO);
    }
}
