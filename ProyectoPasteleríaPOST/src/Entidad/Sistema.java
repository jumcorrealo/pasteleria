/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;
import Entidad.Cliente;
import java.util.ArrayList;
/**
 *
 * @author andre
 */
public class Sistema {
    private ArrayList <Cliente> clientes;
    
    public Sistema() {
        this.clientes = new ArrayList<>();
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    
}
