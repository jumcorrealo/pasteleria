/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontera;
import Control.GestionCliente;
import Entidad.Cliente;
import java.util.List;
        
/**
 *
 * @author Home
 */
public class ProyectoPasteleríaPOST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GestionCliente gc = new GestionCliente();
        List<Cliente> list = gc.dynoSerch("an");
        for (Cliente cliente : list) {
            System.out.println(cliente.getNombre());
        }
    }
    
}
