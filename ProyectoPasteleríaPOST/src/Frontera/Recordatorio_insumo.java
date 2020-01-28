/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontera;

import Entidad.Insumo;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class Recordatorio_insumo extends javax.swing.JFrame {

    /**
     * Creates new form Recordatorio_insumo
     */
    protected Insumo insumo;
    public Recordatorio_insumo(Insumo insumo) {
        this.insumo=insumo;
        
        initComponents();
        setSize(new java.awt.Dimension(450, 300));
        
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
        button_aceptar = new javax.swing.JButton();
        button_cancelar = new javax.swing.JButton();
        label_cantidad = new javax.swing.JLabel();
        label_proximo = new javax.swing.JLabel();
        tx_cantidad = new javax.swing.JTextField();
        label_unidad = new javax.swing.JLabel();
        selector_fecha = new com.toedter.calendar.JDateChooser();
        jButton_eliminar_recordatorio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setPreferredSize(new java.awt.Dimension(450, 300));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        panel_titulo_Insumos.setBackground(new java.awt.Color(153, 153, 153));
        panel_titulo_Insumos.setPreferredSize(new java.awt.Dimension(300, 89));

        titulo_insumos.setFont(new java.awt.Font("Giddyup Std", 1, 55)); // NOI18N
        titulo_insumos.setForeground(new java.awt.Color(255, 255, 255));
        titulo_insumos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_insumos.setText("Recordatorio "+insumo.getNombre());
        titulo_insumos.setToolTipText("");

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
            .addGroup(panel_titulo_InsumosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo_insumos, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
        );

        button_aceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/iconfinder_done-01_186405.png"))); // NOI18N
        button_aceptar.setBorder(null);
        button_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_aceptarActionPerformed(evt);
            }
        });

        button_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/iconfinder_arrow-back_216437.png"))); // NOI18N
        button_cancelar.setBorder(null);
        button_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_cancelarActionPerformed(evt);
            }
        });

        label_cantidad.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label_cantidad.setForeground(new java.awt.Color(255, 255, 255));
        label_cantidad.setText("Cantidad:");
        label_cantidad.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        label_proximo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label_proximo.setForeground(new java.awt.Color(255, 255, 255));
        label_proximo.setText("Fecha:");
        label_proximo.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        if(insumo.getCantidad()>0)tx_cantidad.setText(""+insumo.getCantidad());
        tx_cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tx_cantidadKeyTyped(evt);
            }
        });

        label_unidad.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label_unidad.setForeground(new java.awt.Color(255, 255, 255));
        label_unidad.setText(insumo.getUnidad());
        label_unidad.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        String fecha_inicial=insumo.getRecordatorio();
        if(fecha_inicial!=null){
            try{
                selector_fecha.setDate(new SimpleDateFormat("dd/MM/yyyy").parse(fecha_inicial));
            }catch(Exception e ){
                e.printStackTrace();
            }
        }

        jButton_eliminar_recordatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/trash_can.png"))); // NOI18N
        jButton_eliminar_recordatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_eliminar_recordatorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_titulo_Insumos, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label_proximo)
                            .addComponent(label_cantidad))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selector_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tx_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(button_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(16, 16, 16)))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(label_unidad, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton_eliminar_recordatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(button_aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panel_titulo_Insumos, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(selector_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_unidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tx_cantidad, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label_proximo, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label_cantidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(button_aceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                    .addComponent(button_cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                    .addComponent(jButton_eliminar_recordatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );

        label_unidad.getAccessibleContext().setAccessibleName("asdasd");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_cancelarActionPerformed
        dispose();
    }//GEN-LAST:event_button_cancelarActionPerformed

    private void button_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_aceptarActionPerformed
        Date date=selector_fecha.getDate();
        
       
        String fecha=date.getDate()+"/"+(date.getMonth()+1)+"/"+(date.getYear()+1900);
       
        int cantidad=Integer.parseInt(tx_cantidad.getText());
        insumo.setRecordatorio(fecha, cantidad);
        insumo.upFreq();
        
            if(Gestion_Insumos.gi.editInsumo(insumo)){
                     JOptionPane.showMessageDialog(null, "Exito al crear recordatorio " + insumo);
                    dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "Algo salió mal");
                }
    }//GEN-LAST:event_button_aceptarActionPerformed

    private void tx_cantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tx_cantidadKeyTyped
        char c = evt.getKeyChar();
        if(c < '0' || c > '9') evt.consume();
    }//GEN-LAST:event_tx_cantidadKeyTyped

    private void jButton_eliminar_recordatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_eliminar_recordatorioActionPerformed
        int input = JOptionPane.showConfirmDialog(null, "Desea eliminar el recordatorio?");
        if(input==0){
            insumo.setRecordatorio(null, 0);
            if(Gestion_Insumos.gi.editInsumo(insumo)){
                     JOptionPane.showMessageDialog(null, "Exito al eliminar recordatorio " + insumo);
                    dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "Algo salió mal");
                }
        }
        // 0=yes, 1=no, 2=cancel
    }//GEN-LAST:event_jButton_eliminar_recordatorioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Recordatorio_insumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recordatorio_insumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recordatorio_insumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recordatorio_insumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recordatorio_insumo(new Insumo(new Long(2),"Harina","lb")).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_aceptar;
    private javax.swing.JButton button_cancelar;
    private javax.swing.JButton jButton_eliminar_recordatorio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_cantidad;
    private javax.swing.JLabel label_proximo;
    private javax.swing.JLabel label_unidad;
    private javax.swing.JPanel panel_titulo_Insumos;
    private com.toedter.calendar.JDateChooser selector_fecha;
    private javax.swing.JLabel titulo_insumos;
    private javax.swing.JTextField tx_cantidad;
    // End of variables declaration//GEN-END:variables
}
