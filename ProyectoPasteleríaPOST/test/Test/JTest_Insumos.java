/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Control.*;
import Entidad.*;
import DAO.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

/**
 *
 * @author Nicolas
 */
public class JTest_Insumos {
     private final Control_Insumos validar = new Control_Insumos();
    private final String INSUMO_REPETIDO = "Insumo Existente";
    private final String INSUMO_ACEPTADO = "Registro Exitoso";
    private final String RECORDATORIO_INSUMO = "Datos Actualizado";
    private final String NO_RECORDATORIO_INSUMO = "Algo salio mal";
    
    public JTest_Insumos() {
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
    @Test
    public void InsumoRepetido() {
        Insumo u = new Insumo();
        u.setNombre("Vino");
        u.setUnidad("Botellas");
        assertEquals(validar.persistInsumo(u),INSUMO_REPETIDO);
         
    }
    @Test
    public void Recordatorio() throws Exception {
        Insumo u = new Insumo();
        u.setNombre("nnnn");
        u.setUnidad("nnnn");
        u.setRecordatorio("20/04/19", 3);
        validar.addInsumo(u);
        assertEquals(validar.EInsumo(u),RECORDATORIO_INSUMO);
    }
    /*
    @Test
    public void noRecordatorio() throws Exception {
        Insumo u = new Insumo();
        u.setNombre("nnnn");
        u.setUnidad("nnnn");
        u.setRecordatorio("20/04/19", 3);
        validar.addInsumo(u);
        u.setRecordatorio("20/04/19", 7);
        assertEquals(validar.EInsumo(u),RECORDATORIO_INSUMO);
    }*/
    @Test
    public void DatosCorrectos() {
        Insumo u = new Insumo();
        u.setNombre("nn");
        u.setUnidad("nnnn");
        assertEquals(validar.persistInsumo(u),INSUMO_ACEPTADO);
    }
}
