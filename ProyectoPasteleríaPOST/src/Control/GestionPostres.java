/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import Entidad.Postres;
import DAO.PostresDAO;
import java.util.List;
import java.util.Objects;
/**
 *
 * @author enano
 */
public class GestionPostres {
    private static final PostresDAO PDAO = new PostresDAO();
    private static final List<Postres> list = PDAO.findPostresEntities();

    public GestionPostres() {
    }
    
    private boolean upDateSamePostre(Postres p) {
        for (Postres postres : list) {
            if(p.isSame(postres)) {
                if(Objects.equals(p.getId(), postres.getId())){
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean postreUnico(Postres p) {
        for (Postres postres : list) {
            if(p.isSame(postres)) {
                return true;
            }
        }
        return false;
    }
    
    public String persistPostre(Postres postres){
        if(!postreUnico(postres)) {
            PDAO.create(postres);
            return "Registro Exitoso"; 
        }else {
            return "Postre Existente";
        }
    }
    
    public String upDatePostre(Postres postres) throws Exception {
        if(!upDateSamePostre(postres)) {
            PDAO.edit(postres);
            return "Datos Actualizado";
        }else {
            return "Información invalida";
        }
    }
    
    public String discontinuePostre(Postres postres) throws Exception {
        postres.setDiscontinued(postres.getDiscontinued());
        PDAO.edit(postres);
        return postres.getDiscontinued()? "Postre Descontinuado" : "Postre Reintegrado";
    }
    
    public List<Postres> allPostres(){
        return PDAO.findPostresEntities();
    }
    
    public List<Postres> dynoSerch(Postres postres){
        //TODO Por hacer el procedimiento almacenado en la DB y la funcion en PostresDAO
        return null;
    }
}
