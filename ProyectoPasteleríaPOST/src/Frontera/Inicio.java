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
public class Inicio extends javax.swing.JFrame {
    public static ControlPedidos control_pedidos=new ControlPedidos();
    private static final Administrativo adm = new Administrativo();
    private static final Ventas ventas = new Ventas();
    private static final RecordatoriosPrincipal alarmas=new RecordatoriosPrincipal(control_pedidos);
    
    
    
    /**77
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        button_ventas = new javax.swing.JButton();
        button_close = new javax.swing.JButton();
        button_admin = new javax.swing.JButton();
        button_recordatorios = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setBackground(new java.awt.Color(40, 43, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        button_ventas.setBackground(new java.awt.Color(124, 198, 254));
        button_ventas.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        button_ventas.setForeground(new java.awt.Color(255, 255, 255));
        button_ventas.setText("Ventas");
        button_ventas.setBorderPainted(false);
        button_ventas.setContentAreaFilled(false);
        button_ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_ventasActionPerformed(evt);
            }
        });
        jPanel2.add(button_ventas);
        button_ventas.setBounds(340, 340, 420, 30);

        button_close.setBackground(new java.awt.Color(255, 255, 255));
        button_close.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        button_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/iconfinder_Delete_1493279.png"))); // NOI18N
        button_close.setBorderPainted(false);
        button_close.setContentAreaFilled(false);
        button_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_closeActionPerformed(evt);
            }
        });
        jPanel2.add(button_close);
        button_close.setBounds(1010, 10, 60, 50);

        button_admin.setBackground(new java.awt.Color(124, 198, 254));
        button_admin.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        button_admin.setForeground(new java.awt.Color(255, 255, 255));
        button_admin.setText("Administrativo");
        button_admin.setBorderPainted(false);
        button_admin.setContentAreaFilled(false);
        button_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_adminActionPerformed(evt);
            }
        });
        jPanel2.add(button_admin);
        button_admin.setBounds(340, 300, 420, 30);

        button_recordatorios.setBackground(new java.awt.Color(124, 198, 254));
        button_recordatorios.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        button_recordatorios.setForeground(new java.awt.Color(255, 255, 255));
        button_recordatorios.setText("Recordatorios");
        button_recordatorios.setBorderPainted(false);
        button_recordatorios.setContentAreaFilled(false);
        button_recordatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_recordatoriosActionPerformed(evt);
            }
        });
        jPanel2.add(button_recordatorios);
        button_recordatorios.setBounds(340, 390, 420, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cake-1241413_1280.jpg"))); // NOI18N
        jLabel1.setToolTipText("");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 1080, 720);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_adminActionPerformed
        adm.setVisible(true);
        dispose();
    }//GEN-LAST:event_button_adminActionPerformed

    private void button_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_closeActionPerformed
        System.exit(0);
    }//GEN-LAST:event_button_closeActionPerformed

    private void button_ventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ventasActionPerformed
        ventas.setVisible(true);
        dispose();
    }//GEN-LAST:event_button_ventasActionPerformed

    private void button_recordatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_recordatoriosActionPerformed
        alarmas.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_button_recordatoriosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_admin;
    private javax.swing.JButton button_close;
    private javax.swing.JButton button_recordatorios;
    private javax.swing.JButton button_ventas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    void run() {
        java.awt.EventQueue.invokeLater(() -> {
            Inicio init_frame;
            init_frame = new Inicio();
            init_frame.setVisible(true);
        });
    }
}
