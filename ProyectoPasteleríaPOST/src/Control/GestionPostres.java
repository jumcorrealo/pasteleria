/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import Entidad.Postre;
import DAO.PostresDAO;
import java.util.List;
import java.util.Objects;
/**
 *
 * @author enano
 */
public class GestionPostres {
    private static final PostresDAO PDAO = new PostresDAO();
    private static List<Postre> list;

    public GestionPostres() {
    }
    
    private boolean upDateSamePostre(Postre p) {
        list = PDAO.findPostresEntities();
        for (Postre postres : list) {
            if(p.isSame(postres)) {
                if(Objects.equals(p.getId(), postres.getId())){
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean postreUnico(Postre p) {
        list = PDAO.findPostresEntities();
        for (Postre postres : list) {
            if(p.isSame(postres)) {
                return true;
            }
        }
        return false;
    }
    
    public String persistPostre(Postre postres){
        if(!postreUnico(postres)) {
            PDAO.create(postres);
            return "Registro Exitoso"; 
        }else {
            return "Postre Existente";
        }
    }
    
    public String upDatePostre(Postre postres) throws Exception {
        if(upDateSamePostre(postres)) {
            PDAO.edit(postres);
            return "Datos Actualizado";
        }else {
            return "Información invalida";
        }
    }
    
    public List<Postre> allPostres(){
        return PDAO.findPostresEntities();
    }
    
    public List<Postre> dynoSerch(String data){
        return PDAO.dynoSerch(data);
    }
    
    public List<String> distincTipo(){
        return PDAO.selectDistinct();
    }
    
    public List<Postre> byTipo(String tipo){
        return PDAO.selectByTipo(tipo);
    }
    
    public Postre findPostre(int id){
        return PDAO.findPostres(id);
    }
}
