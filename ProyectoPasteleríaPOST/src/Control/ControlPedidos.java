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

public class ControlPedidos {
    private final PedidoDAO pA;
    private ArrayList<Pedido> lista_Pedido;
    
    public ControlPedidos() {
        pA = new PedidoDAO();
        lista_Pedido = new ArrayList(pA.findPedidoEntities());
    }
    
    public Boolean difFecha(Calendar FechaR,Calendar FechaE){
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(FechaR.getTime().getTime()-FechaE.getTime().getTime());
        if(c.get(Calendar.DAY_OF_YEAR)<2){
            return false;
        }
        return true;
    }
    
    public void AgregarPedido(Pedido pedido){ 
        pA.create(pedido);
        lista_Pedido.add(pedido);
    }
    
    public ArrayList<Pedido> getPedidos() {
        return lista_Pedido;
    }
}
