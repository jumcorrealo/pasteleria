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
/**
 *
 * @author andre
 */
public class GestionCliente {
    
    private final ClienteDAO clienteJpaDAO = new ClienteDAO();
    
    public GestionCliente() {
    }
    
    public boolean usuarioUnico(Cliente cliente){
        ArrayList<Cliente> list = new ArrayList<>(clienteJpaDAO.findClienteEntities());
        for(Cliente c : list){
            if(c.getNombre().toLowerCase().hashCode() == cliente.getNombre().toLowerCase().hashCode()){
                System.out.println(c.getNombre().toLowerCase().hashCode() + " " + cliente.getNombre().toLowerCase().hashCode());
                if(c.getNombre().toLowerCase().equals(cliente.getNombre().toLowerCase())) return false;
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
    
    public String deleteClient(Cliente cliente) {
        return clienteJpaDAO.destroy(cliente.getId())? "Cliente Eliminado" : "No se Encontro el Cliente";
    }
    
    public String upDateClient(Cliente cliente) {
        return clienteJpaDAO.edit(cliente)? "Datos Actualizado" : "No se pudo Actualizar";
    }
    
    public List<Cliente> allClients() {
        return clienteJpaDAO.findClienteEntities();
    }
    
    public void isFrequentClient(Cliente cliente) {
        //TODO Los clientes se clasifican por medio de la cantidad de pedidos
        //Que ha realizado por medio de un puntaje de tres estrellas recibiendo un incentivo en descuentos
    }
}
