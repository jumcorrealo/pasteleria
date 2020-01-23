/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontera;

import java.awt.Component;

/**
 *
 * @author Home
 */
public class GestionDeClientes extends javax.swing.JFrame {
    private static final ClientesCreados clientes = new ClientesCreados();
    private static final AgregarCliente nuevo = new AgregarCliente();
    private static final Administrativo adm = new Administrativo();
    /**
     * Creates new form GestionDeClientes
     */
    public GestionDeClientes() {
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
        GestionDeClienteReemplazo = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        NuevoClienteButton = new javax.swing.JButton();
        ClienteExistenteButton = new javax.swing.JButton();
        VolverButton = new javax.swing.JButton();
        CerrarButton = new javax.swing.JButton();
        HomeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GestionDeClienteReemplazo.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                GestionDeClienteReemplazoComponentAdded(evt);
            }
        });
        GestionDeClienteReemplazo.setLayout(new java.awt.BorderLayout());
        jPanel1.add(GestionDeClienteReemplazo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 540, 770));

        jPanel2.setBackground(new java.awt.Color(40, 43, 40));
        jPanel2.setLayout(null);

        NuevoClienteButton.setBackground(new java.awt.Color(124, 198, 254));
        NuevoClienteButton.setText("Nuevo Cliente");
        NuevoClienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoClienteButtonActionPerformed(evt);
            }
        });
        jPanel2.add(NuevoClienteButton);
        NuevoClienteButton.setBounds(180, 450, 200, 113);

        ClienteExistenteButton.setBackground(new java.awt.Color(124, 198, 254));
        ClienteExistenteButton.setText("Cliente Existente");
        ClienteExistenteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteExistenteButtonActionPerformed(evt);
            }
        });
        jPanel2.add(ClienteExistenteButton);
        ClienteExistenteButton.setBounds(180, 220, 200, 113);

        VolverButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/iconfinder_arrow-back_216437.png"))); // NOI18N
        VolverButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverButtonActionPerformed(evt);
            }
        });
        jPanel2.add(VolverButton);
        VolverButton.setBounds(10, 10, 80, 65);

        CerrarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/iconfinder_basics-22_296812.png"))); // NOI18N
        CerrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarButtonActionPerformed(evt);
            }
        });
        jPanel2.add(CerrarButton);
        CerrarButton.setBounds(440, 20, 80, 65);

        HomeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/iconfinder_home_126572.png"))); // NOI18N
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });
        jPanel2.add(HomeButton);
        HomeButton.setBounds(120, 10, 80, 65);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 770));

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
    }// </editor-fold>//GEN-END:initComponents

    private void NuevoClienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoClienteButtonActionPerformed
        GestionDeClienteReemplazo.setVisible(false);
        GestionDeClienteReemplazo.removeAll();
        GestionDeClienteReemplazo.add(nuevo);
        GestionDeClienteReemplazo.setVisible(true);
    }//GEN-LAST:event_NuevoClienteButtonActionPerformed

    private void ClienteExistenteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteExistenteButtonActionPerformed
        GestionDeClienteReemplazo.setVisible(false);
        GestionDeClienteReemplazo.removeAll();
        GestionDeClienteReemplazo.add(clientes);
        GestionDeClienteReemplazo.setVisible(true);
    }//GEN-LAST:event_ClienteExistenteButtonActionPerformed

    private void VolverButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverButtonActionPerformed
        adm.setVisible(true);
        dispose();
    }//GEN-LAST:event_VolverButtonActionPerformed

    private void CerrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_CerrarButtonActionPerformed

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed
        Inicio home = new Inicio();
        home.setVisible(true);
        dispose();
    }//GEN-LAST:event_HomeButtonActionPerformed

    private void GestionDeClienteReemplazoComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_GestionDeClienteReemplazoComponentAdded
        Component child = evt.getChild();
        if(clientes.equals(child)){
            clientes.agregarDatos();
        }
    }//GEN-LAST:event_GestionDeClienteReemplazoComponentAdded

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
            java.util.logging.Logger.getLogger(GestionDeClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionDeClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionDeClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionDeClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GestionDeClientes().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CerrarButton;
    private javax.swing.JButton ClienteExistenteButton;
    private javax.swing.JPanel GestionDeClienteReemplazo;
    private javax.swing.JButton HomeButton;
    private javax.swing.JButton NuevoClienteButton;
    private javax.swing.JButton VolverButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
