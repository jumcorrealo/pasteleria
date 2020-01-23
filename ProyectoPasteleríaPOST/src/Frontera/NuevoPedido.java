package Frontera;

import Control.*;
import Entidad.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class NuevoPedido extends javax.swing.JPanel {
    public SimpleDateFormat dtf = new SimpleDateFormat("yyyy-MM-dd");
    private static GestionCliente gestor_cliente=new GestionCliente();
    private static final ClientePedido Clienteinfo = new ClientePedido(gestor_cliente);
    private static DetallesVenta detalles = new DetallesVenta();
    private static FinalizarVenta finalizar = new FinalizarVenta();
    private static ControlPedidos control_pedido= new ControlPedidos();
    private Pedido pedidoEnCurso;
    public boolean fechaC;
    
    int contador = 0;
    public int subTotal = 0;

    
    public NuevoPedido() {
        pedidoEnCurso=new Pedido();
        
        initComponents();
        panelGeneral.setVisible(false);
        panelGeneral.removeAll();
        panelGeneral.add(Clienteinfo);
        panelGeneral.setVisible(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelGeneral = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btSiguiente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        boton_atras = new javax.swing.JButton();
        boton_atras.setVisible(false);
        label_advertencia_campos = new javax.swing.JLabel();
        label_advertencia_campos.setVisible(false);

        setBackground(new java.awt.Color(40, 43, 40));
        setLayout(new java.awt.GridBagLayout());

        panelGeneral.setBackground(new java.awt.Color(255, 255, 0));
        panelGeneral.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                panelGeneralComponentAdded(evt);
            }
        });
        panelGeneral.setLayout(new java.awt.BorderLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.ipadx = 540;
        gridBagConstraints.ipady = 520;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(panelGeneral, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nuevo Pedido");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 229;
        gridBagConstraints.ipady = 40;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        add(jLabel1, gridBagConstraints);

        btSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/1063918-48.png"))); // NOI18N
        btSiguiente.setBorderPainted(false);
        btSiguiente.setContentAreaFilled(false);
        btSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSiguienteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = -11;
        gridBagConstraints.ipady = -7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 70, 0, 0);
        add(btSiguiente, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Subtotal $");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(50, 20, 30, 0);
        add(jLabel2, gridBagConstraints);

        jTextField1.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 114;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(60, 10, 0, 0);
        add(jTextField1, gridBagConstraints);

        boton_atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/216436-48.png"))); // NOI18N
        boton_atras.setBorderPainted(false);
        boton_atras.setContentAreaFilled(false);
        boton_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_atrasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = -11;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 30, 30, 0);
        add(boton_atras, gridBagConstraints);

        label_advertencia_campos.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        label_advertencia_campos.setForeground(new java.awt.Color(255, 0, 51));
        label_advertencia_campos.setText("Complete todos los campos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 85;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 20, 0, 0);
        add(label_advertencia_campos, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSiguienteActionPerformed
        
        switch(contador){
            case 0:{//cuando el panel selecciona clientes y fechas
                if(Clienteinfo.checkAllFilled()){
                   if(control_pedido.difFecha(Clienteinfo.getFechaR(),Clienteinfo.getFechaE())){
                        pedidoEnCurso.setIdCliente(Clienteinfo.getCliente().getId());
                        pedidoEnCurso.setFechaR(Clienteinfo.getFechaE().getTime());
                        pedidoEnCurso.setFechaE(Clienteinfo.getFechaR().getTime());
                        pedidoEnCurso.setHoraEntrega(Clienteinfo.getHora());
                        label_advertencia_campos.setVisible(false);
                        boton_atras.setVisible(true);
                        contador++;    
                   }else{
                       label_advertencia_campos.setText("La fecha de entrega es muy pronto");
                       label_advertencia_campos.setVisible(true);
                   }
                }else{
                    label_advertencia_campos.setText("Complete todos los campos");
                    label_advertencia_campos.setVisible(true); 
                    
                }
                
                    
                
                break;}
            case 1:{//cuando el panel selecciona Detalles
                pedidoEnCurso.setIdPostre(detalles.getIdPostre());
                pedidoEnCurso.setForma(detalles.getForma());
                pedidoEnCurso.setPorciones(detalles.getPorciones());
                pedidoEnCurso.setCantidadTortas(detalles.getCantidadPasteles());
                contador++;
                break;}
            case 2:{
                pedidoEnCurso.setAdiciones(finalizar.getAditivos());
                pedidoEnCurso.setDecoracion(finalizar.getdecoracion());
                pedidoEnCurso.setPrecio(finalizar.getSaldo());
                pedidoEnCurso.setAbono(finalizar.getAbono());
                pedidoEnCurso.setPrecioad(finalizar.getPrecioAD());
                contador = 0;
                btSiguiente.setText("Siguiente");
                jTextField1.setText("");
                control_pedido.AgregarPedido(pedidoEnCurso);
                break;}
            
        }
        
        updatePanel();
        
    }//GEN-LAST:event_btSiguienteActionPerformed

    private void boton_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_atrasActionPerformed
        contador--;
        updatePanel();        
    }//GEN-LAST:event_boton_atrasActionPerformed

    private void panelGeneralComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_panelGeneralComponentAdded
        if(evt.getChild().equals(Clienteinfo))
            Clienteinfo.agregarDatos();
    }//GEN-LAST:event_panelGeneralComponentAdded

    private void updatePanel(){
        
        panelGeneral.setVisible(false);
        panelGeneral.removeAll();
        
        switch(contador){
            case 0:
                panelGeneral.add(Clienteinfo);
                panelGeneral.setVisible(true);
                boton_atras.setVisible(false);
                break;
            case 1:
                btSiguiente.setText("Siguiente");
                panelGeneral.add(detalles);
                panelGeneral.setVisible(true);
                boton_atras.setVisible(true);
                break;
            case 2:
                btSiguiente.setText("Finalizar");
                panelGeneral.add(finalizar);
                panelGeneral.setVisible(true);
                break;
        }
    };
    
    public void upDateSubTotal(int upDate){
        jTextField1.setText(String.valueOf(upDate));
    }
    
    public int getSubTotal(){
        return subTotal;
    }
    public void setSubTotal(int subTotal){
        this.subTotal = subTotal;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_atras;
    private javax.swing.JButton btSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel label_advertencia_campos;
    private javax.swing.JPanel panelGeneral;
    // End of variables declaration//GEN-END:variables
}
