/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import Entidad.Cliente;
import DAO.ClienteJpaDAO;
import java.util.ArrayList;
/**
 *
 * @author andre
 */
public class GestionCliente {
    private final ClienteJpaDAO clienteJpaDAO = new ClienteJpaDAO();
    
    public GestionCliente() {
    }
    
    public boolean usuarioUnico(Cliente cliente){
        ArrayList<Cliente> list = new ArrayList<>(clienteJpaDAO.findClienteEntities());
        for(Cliente c : list){
            if(c.getNombre().hashCode() == cliente.getNombre().hashCode()){
                if(c.getNombre().equals(cliente.getNombre())) return false;
            }
        }
        clienteJpaDAO.create(cliente);
        return true;
    }
    
    public String textoSalida(Cliente cliente){
        if(!usuarioUnico(cliente)){
            return "Este usuario ya existe";
        }else{
            return "Registro con exito";
        }
    }
    
    
}
