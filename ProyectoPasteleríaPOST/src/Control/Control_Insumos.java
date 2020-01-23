/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import DAO.InsumoDAO;
import Entidad.Cliente;
import Entidad.Insumo;
import java.util.Collections;
import java.util.List;
/**ad
 *
 * @author ACER
 */
public class Control_Insumos {
    
    private List<Insumo> lista_insumos;
    private final InsumoDAO i_dao;
    
    public Control_Insumos(){
        i_dao=new InsumoDAO();
        lista_insumos=i_dao.findInsumoEntities();
        Collections.sort(lista_insumos);
    }
    
    public boolean exist(Insumo insumo){
        boolean res=false;
        for(Insumo x: lista_insumos){
            if (x.getNombre().equals(insumo.getNombre())) res=true;
        }
        
        return res;
    }
    
    public boolean editInsumo(Insumo ins){
        boolean res=false;
        if(exist(ins))res=i_dao.edit(ins);
        return res;
    }
    
    public boolean addInsumo(Insumo ins){
        boolean res=false;
        if(!exist(ins)){
            res=i_dao.create(ins);
            if (res) lista_insumos.add(ins);
        }
            return res;    
    }
    
    public List<Insumo> getInsumoList(){
        return lista_insumos;
    }
    public String persistInsumo(Insumo insumo){
        if(!exist(insumo)){
            i_dao.create(insumo);
            return "Registro Exitoso"; 
        }else {
            return "Insumo Existente";
        }
    }
    
    public String EInsumo(Insumo insumo) throws Exception {
        if(editInsumo(insumo)) {
            i_dao.edit(insumo);
            return "Datos Actualizado";
        }else {
            return "Información invalida";
        }
    }
}
