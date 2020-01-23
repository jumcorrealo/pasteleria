 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import Entidad.Cliente;
import DAO.ClienteDAO;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/**
 *
 * @author andre
 */
public class GestionCliente {
    
    private static final ClienteDAO clienteDAO = new ClienteDAO();
    private static ArrayList<Cliente> list = new ArrayList<>(clienteDAO.findClienteEntities());
    
    public GestionCliente() {  
    }
    
    public boolean usuarioUnicoUpDate(Cliente cliente){
        for(Cliente c : list){
            if(c.getNombre().toLowerCase().hashCode() == cliente.getNombre().toLowerCase().hashCode()){
                if(c.getNombre().toLowerCase().equals(cliente.getNombre().toLowerCase())) {
                    if (!Objects.equals(c.getId(), cliente.getId())) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    public boolean usuarioUnico(Cliente cliente){
        for(Cliente c : list){
            if(c.getNombre().toLowerCase().hashCode() == cliente.getNombre().toLowerCase().hashCode()){
                if(c.getNombre().toLowerCase().equals(cliente.getNombre().toLowerCase())) return true;
            }
        }
        return false;
    }
    
    public String textoSalida(Cliente cliente){
        if(!usuarioUnico(cliente)){
            clienteDAO.create(cliente);
            return "Registro con exito";
        }else{
            return "Este usuario ya existe";
        }
    }
    
    public String deleteClient(Cliente cliente) {
        clienteDAO.edit(cliente);
        if(cliente.getActivo() == false){
            return "cliente ahora es inactivo";
        }
        return "cliente ahora es activo";
    }
    
    public String upDateClient(Cliente cliente) {
        if(usuarioUnicoUpDate(cliente)){
            return clienteDAO.edit(cliente)? "Datos Actualizado" : "No se pudo Actualizar";
        }
        return "Nombre de Usuario Existente";
    }
    
    public List<Cliente> allClients() {
        return list;
    }
    
    public boolean isFrequentClient(Cliente cliente) {
        return cliente.getPuntaje() > 10;
    }
    
    public List<Cliente> dynoSerch(String keyTyped){
        return clienteDAO.dynoSerch(keyTyped);
    }
    
    public Cliente findCliente(int id){
        return clienteDAO.findCliente(id);
    }
}
