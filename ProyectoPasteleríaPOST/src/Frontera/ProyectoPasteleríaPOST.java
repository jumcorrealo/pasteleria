/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontera;

import Control.ControlPedidos;

/**
 *
 * @author Home
 */
public class ProyectoPasteleríaPOST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Inicio tortAPP=new Inicio();
        RecordatoriosPrincipal alarmas=new RecordatoriosPrincipal(new ControlPedidos());
       
        
        tortAPP.run();
        alarmas.run();
 
        
    }
}
