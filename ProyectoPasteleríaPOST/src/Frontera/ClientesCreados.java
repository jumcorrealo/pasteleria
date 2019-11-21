/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontera;
import Control.GestionCliente;
import Entidad.Cliente;
import static Frontera.ClientesCreados.agregarDatos;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Home
 */
public class ClientesCreados extends javax.swing.JPanel {
    private static final GestionCliente gc = new GestionCliente();
    private static  List<Cliente> clientes = gc.allClients();
    private static DefaultListModel modeloLista;
    private static int posList = -1;
    /**
     * Creates new form ClientesCreados
     */
    public ClientesCreados() {
        initComponents();
        modeloLista = new DefaultListModel();
        agregarDatos();
        listName.setModel(modeloLista);
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
        actualizarButton = new javax.swing.JButton();
        eliminarButton = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listName = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nombreS = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        casaS = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        telefonoS = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        puntajeS = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(40, 43, 40));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel1.setPreferredSize(new java.awt.Dimension(336, 431));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        actualizarButton.setText("Actualizar");
        actualizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarButtonActionPerformed(evt);
            }
        });
        jPanel2.add(actualizarButton);
        actualizarButton.setBounds(140, 590, 85, 85);

        eliminarButton.setText("Eliminar");
        eliminarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarButtonActionPerformed(evt);
            }
        });
        jPanel2.add(eliminarButton);
        eliminarButton.setBounds(310, 590, 85, 85);

        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/iconfinder_arrow-back_216437.png"))); // NOI18N
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        jPanel2.add(cancelar);
        cancelar.setBounds(10, 10, 80, 64);

        listName.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listName.setSelectionBackground(new java.awt.Color(124, 198, 254));
        listName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listNameMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listName);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(60, 140, 390, 178);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Nombre:");

        nombreS.setEditable(false);
        nombreS.setBackground(new java.awt.Color(255, 255, 255));
        nombreS.setBorder(null);
        nombreS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreSActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setText("Casa:");

        casaS.setEditable(false);
        casaS.setBackground(new java.awt.Color(255, 255, 255));
        casaS.setBorder(null);
        casaS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casaSActionPerformed(evt);
            }
        });
        casaS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                casaSKeyTyped(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setText("Telefono:");

        telefonoS.setEditable(false);
        telefonoS.setBackground(new java.awt.Color(255, 255, 255));
        telefonoS.setBorder(null);
        telefonoS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoSActionPerformed(evt);
            }
        });
        telefonoS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefonoSKeyTyped(evt);
            }
        });

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel4.setText("Puntos:");

        puntajeS.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreS, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(casaS)
                    .addComponent(jSeparator2)
                    .addComponent(jLabel3)
                    .addComponent(telefonoS)
                    .addComponent(jSeparator3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(puntajeS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator4))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreS, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(casaS, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(telefonoS, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(puntajeS, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3);
        jPanel3.setBounds(60, 330, 390, 250);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/iconfinder_look-find-search-magnify-glass_2203511.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4);
        jPanel4.setBounds(80, 80, 360, 60);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/bar-1846137_1280.jpg"))); // NOI18N
        jPanel2.add(jLabel5);
        jLabel5.setBounds(0, 0, 540, 730);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void actualizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarButtonActionPerformed
        if(posList == -1) {
            JOptionPane.showMessageDialog(null, "Seleccone un Cliente");
        }else {
            Cliente cliente = clientes.get(posList);
            cliente.setNombre(nombreS.getText());
            cliente.setCasa(casaS.getText());
            cliente.setTelefono(telefonoS.getText());
            JOptionPane.showMessageDialog(null, gc.upDateClient(cliente));
            clientes = gc.allClients();
            modeloLista.removeAllElements();
            agregarDatos();
            posList = -1;
        }
        nombreS.setEditable(false);
        telefonoS.setEditable(false);
        casaS.setEditable(false);
    }//GEN-LAST:event_actualizarButtonActionPerformed

    private void eliminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarButtonActionPerformed
        if(posList == -1){
            JOptionPane.showMessageDialog(null, "Seleccione un cliente");
        }else {
            Cliente cliente = clientes.get(posList);
            JOptionPane.showMessageDialog(null, gc.deleteClient(cliente));
            modeloLista.remove(posList);
            clientes.addAll(gc.allClients());
            nombreS.setText("");
            casaS.setText("");
            telefonoS.setText("");
            puntajeS.setText("");
            posList = -1;
        }
        nombreS.setEditable(false);
        casaS.setEditable(false);
        telefonoS.setEditable(false);
    }//GEN-LAST:event_eliminarButtonActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        GestionDeClientes volver = new GestionDeClientes();
        volver.setVisible(true);
    }//GEN-LAST:event_cancelarActionPerformed

    private void listNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listNameMouseClicked
        String selected = listName.getSelectedValue();
        posList = listName.getSelectedIndex();
        nombreS.setText(selected);
        nombreS.setEditable(true);
        casaS.setEditable(true);
        telefonoS.setEditable(true);
        casaS.setText(clientes.get(posList).getCasa());
        telefonoS.setText(clientes.get(posList).getTelefono());
        puntajeS.setText(clientes.get(posList).getPuntaje() + "");
    }//GEN-LAST:event_listNameMouseClicked
    
    private void formWindowActivated(java.awt.event.WindowEvent evt){
        clientes.clear();
        clientes.addAll(gc.allClients());
        modeloLista.removeAllElements();
        agregarDatos();
    }
    private void nombreSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreSActionPerformed

    private void casaSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casaSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casaSActionPerformed

    private void casaSKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_casaSKeyTyped
        char c = evt.getKeyChar();
        if(c < '0' || c > '9') evt.consume();
    }//GEN-LAST:event_casaSKeyTyped

    private void telefonoSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoSActionPerformed

    private void telefonoSKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoSKeyTyped
        char c = evt.getKeyChar();
        if(c < '0' || c > '9') evt.consume();
    }//GEN-LAST:event_telefonoSKeyTyped

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        modeloLista.clear();
        agregarDatos(gc.dynoSerch(jTextField1.getText()));
    }//GEN-LAST:event_jTextField1KeyTyped
    
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
            java.util.logging.Logger.getLogger(ClientesCreados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientesCreados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientesCreados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientesCreados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ClientesCreados().setVisible(true);
        });
    }
    
    public static void agregarDatos(List<Cliente> clientes) {
        for(Cliente cliente : clientes){
            System.out.println(cliente.getNombre());
            modeloLista.addElement(cliente.getNombre());
        }
    }
    
    public static void agregarDatos() {
        for(Cliente cliente : clientes){
            modeloLista.addElement(cliente.getNombre());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarButton;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField casaS;
    private javax.swing.JButton eliminarButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JList<String> listName;
    private javax.swing.JTextField nombreS;
    private javax.swing.JLabel puntajeS;
    private javax.swing.JTextField telefonoS;
    // End of variables declaration//GEN-END:variables
}
