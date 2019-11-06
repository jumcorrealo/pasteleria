/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import Entidad.*;
import Frontera.*;
import FronteraAdministrativo.*;
/**
 *
 * @author andre
 */
public class ValidarRegistroC {
    public static Sistema sistema = GestionDeClientes.sistema;
    public ValidarRegistroC() {
    }
    
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
    
    public String textoSalida(Cliente cliente){
        if(usuarioUnico(cliente)== false){
        return "Este usuario ya existe";
        }else{
        return "Registro con exito";
        }
    }
    
    
}
