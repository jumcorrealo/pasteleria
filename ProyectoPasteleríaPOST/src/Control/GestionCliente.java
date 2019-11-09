/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import Entidad.*;
import FronteraAdministrativo.GestionDeClientes;
/**
 *
 * @author andre
 */
public class GestionCliente {
    public static Sistema sistema = GestionDeClientes.sistema;
    public GestionCliente() {
    }
    
    /**
     *
     * @param cliente
     * @return
     */
    public boolean usuarioUnico(Cliente cliente){
        int i,k,j,n;
        n = sistema.getClientes().size();
        System.out.println("-->"+n);
        for(i=0;i<n;i++){
            if(cliente.getNombre().equals(sistema.getClientes().get(i).getNombre())){
                return false;
            }
        }     
    return true;
    }
    
    /**
     *
     * @param cliente
     * @return
     */
    public String textoSalida(Cliente cliente){
        if(usuarioUnico(cliente)== false){
            return "Este usuario ya existe";
        }else{
            return "Registro con exito";
        }
    }   
}