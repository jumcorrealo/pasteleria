/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontera;

/**
 *
 * @author Home
 */
public class NuevoPedido extends javax.swing.JPanel {
    private ClientePedido clienteinfo = new ClientePedido();
    private DetallesVenta detalles = new DetallesVenta();
    private FinalizarVenta finalizar = new FinalizarVenta();
    int contador = 0;

    /**
     * Creates new form NuevoPedido
     */
    public NuevoPedido() {
        initComponents();
        panelGeneral.setVisible(false);
        panelGeneral.removeAll();
        panelGeneral.add(clienteinfo);
        panelGeneral.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGeneral = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(40, 43, 40));
        setLayout(null);

        panelGeneral.setBackground(new java.awt.Color(40, 43, 40));
        panelGeneral.setLayout(new java.awt.BorderLayout());
        add(panelGeneral);
        panelGeneral.setBounds(0, 80, 540, 520);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nuevo Pedido");
        add(jLabel1);
        jLabel1.setBounds(160, 0, 230, 80);

        jButton1.setText("Siguiente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(390, 640, 100, 50);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Subtotal:");
        add(jLabel2);
        jLabel2.setBounds(20, 650, 90, 40);
        add(jTextField1);
        jTextField1.setBounds(110, 660, 120, 20);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        contador ++;
        if(contador==1){
            panelGeneral.setVisible(false);
            panelGeneral.removeAll();
            panelGeneral.add(detalles);
            panelGeneral.setVisible(true);
        }
        if(contador==2){
            panelGeneral.setVisible(false);
            panelGeneral.removeAll();
            panelGeneral.add(finalizar);
            panelGeneral.setVisible(true);
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel panelGeneral;
    // End of variables declaration//GEN-END:variables
}
