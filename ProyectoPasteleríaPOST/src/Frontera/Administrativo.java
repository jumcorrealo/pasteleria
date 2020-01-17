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
public class Administrativo extends javax.swing.JFrame {
    private static GestionDeClientes clientes = new GestionDeClientes();
    private static Inicio volver = new Inicio();
  
    /**
     * Creates new form Administrativo
     */
    public Administrativo() {
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

        panelAdministrativoReemplazo = new javax.swing.JPanel();
        ClienteButton = new javax.swing.JButton();
        InventarioButton = new javax.swing.JButton();
        EstadisticasButton = new javax.swing.JButton();
        VolverButton = new javax.swing.JButton();
        CerrarButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelAdministrativoReemplazo.setBackground(new java.awt.Color(255, 255, 255));

        ClienteButton.setBackground(new java.awt.Color(77, 126, 168));
        ClienteButton.setText("Clientes");
        ClienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteButtonActionPerformed(evt);
            }
        });

        InventarioButton.setBackground(new java.awt.Color(77, 126, 168));
        InventarioButton.setText("Inventario");
        InventarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InventarioButtonActionPerformed(evt);
            }
        });

        EstadisticasButton.setBackground(new java.awt.Color(77, 126, 168));
        EstadisticasButton.setText("Estadísticas");
        EstadisticasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstadisticasButtonActionPerformed(evt);
            }
        });

        VolverButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/iconfinder_arrow-back_216437.png"))); // NOI18N
        VolverButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverButtonActionPerformed(evt);
            }
        });

        CerrarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/iconfinder_basics-22_296812.png"))); // NOI18N
        CerrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarButtonActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/stock-1863880_1280.jpg"))); // NOI18N

        javax.swing.GroupLayout panelAdministrativoReemplazoLayout = new javax.swing.GroupLayout(panelAdministrativoReemplazo);
        panelAdministrativoReemplazo.setLayout(panelAdministrativoReemplazoLayout);
        panelAdministrativoReemplazoLayout.setHorizontalGroup(
            panelAdministrativoReemplazoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdministrativoReemplazoLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(VolverButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CerrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(panelAdministrativoReemplazoLayout.createSequentialGroup()
                .addGap(416, 416, 416)
                .addGroup(panelAdministrativoReemplazoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ClienteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(InventarioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EstadisticasButton, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                .addContainerGap(454, Short.MAX_VALUE))
            .addGroup(panelAdministrativoReemplazoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, Short.MAX_VALUE))
        );
        panelAdministrativoReemplazoLayout.setVerticalGroup(
            panelAdministrativoReemplazoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdministrativoReemplazoLayout.createSequentialGroup()
                .addGroup(panelAdministrativoReemplazoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAdministrativoReemplazoLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(CerrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAdministrativoReemplazoLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(VolverButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(ClienteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(97, 97, 97)
                .addComponent(InventarioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(EstadisticasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(177, Short.MAX_VALUE))
            .addGroup(panelAdministrativoReemplazoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelAdministrativoReemplazoLayout.createSequentialGroup()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAdministrativoReemplazo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAdministrativoReemplazo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteButtonActionPerformed
        clientes.setVisible(true);
        dispose();
    }//GEN-LAST:event_ClienteButtonActionPerformed

    private void InventarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InventarioButtonActionPerformed
        Inventario inv = new Inventario();
        inv.setVisible(true);
        dispose();
    }//GEN-LAST:event_InventarioButtonActionPerformed

    private void VolverButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverButtonActionPerformed
        volver.setVisible(true);
        dispose();
    }//GEN-LAST:event_VolverButtonActionPerformed

    private void CerrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_CerrarButtonActionPerformed

    private void EstadisticasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstadisticasButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EstadisticasButtonActionPerformed

    
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
            java.util.logging.Logger.getLogger(Administrativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Administrativo().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CerrarButton;
    private javax.swing.JButton ClienteButton;
    private javax.swing.JButton EstadisticasButton;
    private javax.swing.JButton InventarioButton;
    private javax.swing.JButton VolverButton;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JPanel panelAdministrativoReemplazo;
    // End of variables declaration//GEN-END:variables
}
