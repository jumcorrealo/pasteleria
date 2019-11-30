/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import DAO.InsumoDAO;
import Entidad.Insumo;
import java.util.List;

/**
 *
 * @author ACER
 */
public class GestionInsumos {
    
    private List<Insumo> lista_insumos;
    private final InsumoDAO i_dao;
    
    public GestionInsumos(){
        i_dao=new InsumoDAO();
        lista_insumos=i_dao.findInsumoEntities();
    }
    
    public boolean exist(Insumo insumo){
        boolean res=false;
        for(Insumo x: lista_insumos){
            if (x.getNombre().equals(insumo.getNombre())) res=true;
        }
        
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
}
