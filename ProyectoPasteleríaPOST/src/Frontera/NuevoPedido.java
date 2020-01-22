package Frontera;

import Control.GestionCliente;
import Entidad.Pedido;


public class NuevoPedido extends javax.swing.JPanel {
    private static GestionCliente gestor_cliente=new GestionCliente();
    private static final ClientePedido Clienteinfo = new ClientePedido(gestor_cliente);
    private static DetallesVenta detalles = new DetallesVenta();
    private static FinalizarVenta finalizar = new FinalizarVenta();
    
    private Pedido pedidoEnCurso;
    
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

        panelGeneral = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        boton_sig = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        boton_atras = new javax.swing.JButton();
        boton_atras.setVisible(false);
        label_advertencia_campos = new javax.swing.JLabel();
        label_advertencia_campos.setVisible(false);

        setBackground(new java.awt.Color(40, 43, 40));
        setLayout(null);

        panelGeneral.setBackground(new java.awt.Color(255, 255, 0));
        panelGeneral.setLayout(new java.awt.BorderLayout());
        add(panelGeneral);
        panelGeneral.setBounds(0, 80, 540, 520);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nuevo Pedido");
        add(jLabel1);
        jLabel1.setBounds(50, 0, 440, 80);

        boton_sig.setText("Siguiente");
        boton_sig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_sigActionPerformed(evt);
            }
        });
        add(boton_sig);
        boton_sig.setBounds(390, 640, 100, 50);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Subtotal $");
        add(jLabel2);
        jLabel2.setBounds(20, 650, 110, 40);

        jTextField1.setEditable(false);
        add(jTextField1);
        jTextField1.setBounds(140, 660, 120, 20);

        boton_atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/iconfinder_arrow-back_216437.png"))); // NOI18N
        boton_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_atrasActionPerformed(evt);
            }
        });
        add(boton_atras);
        boton_atras.setBounds(320, 640, 50, 50);

        label_advertencia_campos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        label_advertencia_campos.setForeground(new java.awt.Color(255, 0, 51));
        label_advertencia_campos.setText("Complete todos los campos");
        add(label_advertencia_campos);
        label_advertencia_campos.setBounds(10, 590, 360, 40);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void boton_sigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_sigActionPerformed
        
        switch(contador){
            case 0:{//cuando el panel selecciona clientes y fechas
                if(Clienteinfo.checkAllFilled()){
                    label_advertencia_campos.setVisible(false);
                    boton_atras.setVisible(true);
                    
                    contador++;    
                   
                }else{
                    label_advertencia_campos.setVisible(true); 
                }
                
                
                
                break;}
            case 1:{//cuando el panel selecciona Detalles
                
                contador++;
                break;}
            case 2:{
                
                
                break;}
            
        }
        
        updatePanel();
        
    }//GEN-LAST:event_boton_sigActionPerformed

    private void boton_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_atrasActionPerformed
        contador--;
        updatePanel();        
    }//GEN-LAST:event_boton_atrasActionPerformed

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
                boton_sig.setText("Siguiente");
                panelGeneral.add(detalles);
                panelGeneral.setVisible(true);
                boton_atras.setVisible(true);
                break;
            case 2:
                boton_sig.setText("Finalizar");
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
    private javax.swing.JButton boton_sig;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel label_advertencia_campos;
    private javax.swing.JPanel panelGeneral;
    // End of variables declaration//GEN-END:variables
}
