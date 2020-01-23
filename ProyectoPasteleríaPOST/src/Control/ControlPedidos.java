/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import DAO.*;
import Entidad.*;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class ControlPedidos {
    private final PedidoDAO pA;
    private ArrayList<Pedido> lista_Pedido;
    
    public ControlPedidos() {
        pA = new PedidoDAO();
        lista_Pedido = new ArrayList(pA.findPedidoEntities());
    }

    public void AgregarPedido(Pedido pedido){ 
        pA.create(pedido);
    }
    
}
