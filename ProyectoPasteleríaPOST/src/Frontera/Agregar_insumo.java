/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontera;

import Control.GestionInsumos;
import Entidad.Insumo;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class Agregar_insumo extends javax.swing.JFrame {

    GestionInsumos gi;
    
    
    public Agregar_insumo(GestionInsumos gi) {
        this.gi=gi;
        initComponents();
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
        panel_titulo_Insumos = new javax.swing.JPanel();
        titulo_insumos = new javax.swing.JLabel();
        label_buscar = new javax.swing.JLabel();
        label_buscar1 = new javax.swing.JLabel();
        tx_nombre_insumo = new java.awt.TextField();
        tx_unidad = new java.awt.TextField();
        button_aceptar = new javax.swing.JButton();
        button_cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(241, 198, 241));

        panel_titulo_Insumos.setBackground(new java.awt.Color(212, 17, 200));
        panel_titulo_Insumos.setPreferredSize(new java.awt.Dimension(300, 89));

        titulo_insumos.setFont(new java.awt.Font("Giddyup Std", 1, 66)); // NOI18N
        titulo_insumos.setForeground(new java.awt.Color(255, 255, 255));
        titulo_insumos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_insumos.setText("Nuevo insumo");
        titulo_insumos.setToolTipText("");
        titulo_insumos.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout panel_titulo_InsumosLayout = new javax.swing.GroupLayout(panel_titulo_Insumos);
        panel_titulo_Insumos.setLayout(panel_titulo_InsumosLayout);
        panel_titulo_InsumosLayout.setHorizontalGroup(
            panel_titulo_InsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_titulo_InsumosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo_insumos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_titulo_InsumosLayout.setVerticalGroup(
            panel_titulo_InsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo_insumos, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
        );

        titulo_insumos.getAccessibleContext().setAccessibleName("Nuevo Insumo");

        label_buscar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label_buscar.setText("Nombre");
        label_buscar.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        label_buscar1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label_buscar1.setText("Unidad");

        tx_nombre_insumo.setText("Ingrese el nombre del nuevo insumo");
        tx_nombre_insumo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tx_nombre_insumoMouseClicked(evt);
            }
        });
        tx_nombre_insumo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tx_nombre_insumoFocusGained(evt);
            }
        });
        tx_nombre_insumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx_nombre_insumoActionPerformed(evt);
            }
        });

        tx_unidad.setText("Ingrese la unidad de medida");
        tx_unidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tx_unidadMouseClicked(evt);
            }
        });
        tx_unidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tx_unidadFocusGained(evt);
            }
        });
        tx_unidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx_unidadActionPerformed(evt);
            }
        });

        button_aceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/iconfinder_done-01_186405.png"))); // NOI18N
        button_aceptar.setBorder(null);
        button_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_aceptarActionPerformed(evt);
            }
        });

        button_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/iconfinder_Delete_1493279.png"))); // NOI18N
        button_cancelar.setBorder(null);
        button_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_titulo_Insumos, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_buscar)
                    .addComponent(label_buscar1))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(button_aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(button_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tx_nombre_insumo, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addComponent(tx_unidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panel_titulo_Insumos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tx_nombre_insumo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label_buscar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tx_unidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tx_unidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx_unidadActionPerformed
        System.out.println("enter pressed");        // TODO add your handling code here:
        button_aceptarActionPerformed(evt);
    }//GEN-LAST:event_tx_unidadActionPerformed

    private void button_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_aceptarActionPerformed
        Long id=new Long( gi.getInsumoList().size()+1);
        Insumo ins=new Insumo(id,tx_nombre_insumo.getText(),tx_unidad.getText());
        if(gi.addInsumo(ins)){
             JOptionPane.showMessageDialog(null, "Exito al crear insumo " + ins.getNombre());
            dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Algo salió mal");
        }
    }//GEN-LAST:event_button_aceptarActionPerformed

    private void button_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_cancelarActionPerformed
        dispose();
    }//GEN-LAST:event_button_cancelarActionPerformed

    private void tx_unidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tx_unidadMouseClicked
             if (tx_unidad.getText().equals("Ingrese la unidad de medida")){
                 tx_unidad.setText("");
             }
    }//GEN-LAST:event_tx_unidadMouseClicked

    private void tx_nombre_insumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx_nombre_insumoActionPerformed
        tx_unidad.requestFocusInWindow();        // TODO add your handling code here:
    }//GEN-LAST:event_tx_nombre_insumoActionPerformed

    private void tx_nombre_insumoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tx_nombre_insumoMouseClicked
        if(tx_nombre_insumo.getText().equals("Ingrese el nombre del nuevo insumo")){
            tx_nombre_insumo.setText("");
        }// TODO add your handling code here:
    }//GEN-LAST:event_tx_nombre_insumoMouseClicked

    private void tx_unidadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tx_unidadFocusGained
        if (tx_unidad.getText().equals("Ingrese la unidad de medida")){
                 tx_unidad.setText("");
             }
    }//GEN-LAST:event_tx_unidadFocusGained

    private void tx_nombre_insumoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tx_nombre_insumoFocusGained
        if(tx_nombre_insumo.getText().equals("Ingrese el nombre del nuevo insumo")){
            tx_nombre_insumo.setText("");
        }
    }//GEN-LAST:event_tx_nombre_insumoFocusGained

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_aceptar;
    private javax.swing.JButton button_cancelar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_buscar;
    private javax.swing.JLabel label_buscar1;
    private javax.swing.JPanel panel_titulo_Insumos;
    private javax.swing.JLabel titulo_insumos;
    private java.awt.TextField tx_nombre_insumo;
    private java.awt.TextField tx_unidad;
    // End of variables declaration//GEN-END:variables
}
