/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontera;

import Entidad.Insumo;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

/**
 *
 * @author ACER
 */
public class InfoInsumo extends javax.swing.JPanel {

    public Insumo insumo;
    
    public InfoInsumo(Insumo insumo) {
        this.insumo=insumo;
        initComponents();
        
    }
    
   
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Dimension arcs = new Dimension(60,60); //Border corners arcs {width,height}, change this to whatever you want
        int width = getWidth();
        int height = getHeight();
        Graphics2D graphics = (Graphics2D) g;
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);


        //Draws the rounded panel with borders.
        graphics.setColor(getBackground());
        graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height);//paint background
        graphics.setColor(getForeground());
        graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height);//paint border
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo_insumo_subPanel = new javax.swing.JLabel();
        button_crear_recordatorio = new javax.swing.JButton();

        setBackground(new java.awt.Color(217, 17, 200));
        setForeground(new java.awt.Color(200, 17, 200));
        setPreferredSize(new java.awt.Dimension(388, 80));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        titulo_insumo_subPanel.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        titulo_insumo_subPanel.setText(""+insumo.getNombre());

        java.awt.Color butColor;
        javax.swing.ImageIcon icono;
        if(insumo.getRecordatorio()==null){
            butColor=new java.awt.Color(153,255,153);
            icono= new javax.swing.ImageIcon(getClass().getResource("/Img/iconfinder_done-01_186405.png"));
        }else{
            butColor=new java.awt.Color(19,157,236);
            icono= new javax.swing.ImageIcon(getClass().getResource("/Img/clock.png"));
        }
        button_crear_recordatorio.setBackground(butColor);
        button_crear_recordatorio.setIcon(icono);
        button_crear_recordatorio.setPreferredSize(new java.awt.Dimension(45, 45));
        button_crear_recordatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_crear_recordatorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(titulo_insumo_subPanel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addComponent(button_crear_recordatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(button_crear_recordatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo_insumo_subPanel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
    // TODO add your handling code here:
    }//GEN-LAST:event_formFocusGained

    private void button_crear_recordatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_crear_recordatorioActionPerformed
        Recordatorio_insumo recordatorio= new Recordatorio_insumo(insumo);
        recordatorio.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_button_crear_recordatorioActionPerformed


    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_crear_recordatorio;
    private javax.swing.JLabel titulo_insumo_subPanel;
    // End of variables declaration//GEN-END:variables
}
