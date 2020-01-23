/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import DAO.*;
import Entidad.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControlPedidos {
    private static final PedidoDAO pA = new PedidoDAO();
    private static ArrayList<Pedido> lista_Pedido;
    
    public ControlPedidos() {
        
        lista_Pedido = new ArrayList(pA.findPedidoEntities());
    }
    
    public Boolean difFecha(Calendar FechaR,Calendar FechaE){
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(FechaR.getTime().getTime()-FechaE.getTime().getTime());
        if(c.get(Calendar.DAY_OF_YEAR)<2 || FechaE.after(FechaR)){
            return false;
        }
        return true;
    }
    
    public void AgregarPedido(Pedido pedido){
        pA.create(pedido);
    }
    
    public ArrayList<Pedido> getPedidos() {
        return lista_Pedido;
    }
    
    public String upDateList(Pedido pedido){
        try {
            pA.edit(pedido);
        } catch (Exception ex) {
            Logger.getLogger(ControlPedidos.class.getName()).log(Level.SEVERE, null, ex);
            return "Error";
        }
        lista_Pedido.clear();
        lista_Pedido.addAll(pA.findPedidoEntities());
        return "Exitoso";
    }
}