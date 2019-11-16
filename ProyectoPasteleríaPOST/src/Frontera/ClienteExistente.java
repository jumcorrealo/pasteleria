/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontera;
import Entidad.Cliente;
import Control.GestionCliente;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
/**
 *
 * @author Home
 */
public class ClienteExistente extends javax.swing.JFrame {
    
    private static final GestionCliente gc = new GestionCliente();
    private static  List<Cliente> clientes = gc.allClients();
    private static DefaultListModel modeloLista;
    private static int posList = -1;
    /**
     * Creates new form ClienteExistente
     */
    public ClienteExistente() {
        initComponents();
        modeloLista = new DefaultListModel();
        agregarDatos();
        listName.setModel(modeloLista);
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
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        actualizarButton = new javax.swing.JButton();
        eliminarButton = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listName = new javax.swing.JList<>();
        nombreS = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        puntajeS = new javax.swing.JLabel();
        telefonoS = new javax.swing.JTextField();
        casaS = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(124, 198, 254));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel1.setPreferredSize(new java.awt.Dimension(336, 431));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        actualizarButton.setText("Actualizar");
        actualizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarButtonActionPerformed(evt);
            }
        });
        jPanel2.add(actualizarButton);
        actualizarButton.setBounds(650, 340, 85, 85);

        eliminarButton.setText("Eliminar");
        eliminarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarButtonActionPerformed(evt);
            }
        });
        jPanel2.add(eliminarButton);
        eliminarButton.setBounds(640, 470, 85, 85);

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
        jScrollPane1.setBounds(140, 130, 500, 178);

        nombreS.setEditable(false);
        nombreS.setBackground(new java.awt.Color(255, 255, 255));
        nombreS.setBorder(null);
        nombreS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreSActionPerformed(evt);
            }
        });
        jPanel2.add(nombreS);
        nombreS.setBounds(140, 350, 360, 14);

        jLabel1.setText("Nombre:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(140, 330, 62, 14);

        jLabel2.setText("Casa:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(140, 380, 46, 14);

        jLabel3.setText("Telefono:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(140, 430, 46, 14);

        jLabel4.setText("Puntos:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(140, 490, 44, 18);

        puntajeS.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.add(puntajeS);
        puntajeS.setBounds(140, 510, 360, 19);

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
        jPanel2.add(telefonoS);
        telefonoS.setBounds(140, 450, 360, 14);

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
        jPanel2.add(casaS);
        casaS.setBounds(140, 400, 360, 14);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(140, 370, 62, 10);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator2);
        jSeparator2.setBounds(140, 420, 62, 10);

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator3);
        jSeparator3.setBounds(140, 470, 62, 10);

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator4);
        jSeparator4.setBounds(140, 530, 62, 10);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/bar-1846137_1280.jpg"))); // NOI18N
        jPanel2.add(jLabel5);
        jLabel5.setBounds(0, 0, 1060, 700);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 1055;
        gridBagConstraints.ipady = 699;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 12, 13, 12);
        jPanel1.add(jPanel2, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1084, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        GestionDeClientes volver = new GestionDeClientes();
        volver.setVisible(true);
        dispose();
    }//GEN-LAST:event_cancelarActionPerformed

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

    private void nombreSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreSActionPerformed

    private void telefonoSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoSActionPerformed

    private void casaSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casaSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casaSActionPerformed

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

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        clientes.clear();
        clientes.addAll(gc.allClients());
        modeloLista.removeAllElements();
        agregarDatos();
    }//GEN-LAST:event_formWindowActivated

    private void casaSKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_casaSKeyTyped
        char c = evt.getKeyChar();
        if(c < '0' || c > '9') evt.consume();
    }//GEN-LAST:event_casaSKeyTyped

    private void telefonoSKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoSKeyTyped
        char c = evt.getKeyChar();
        if(c < '0' || c > '9') evt.consume();
    }//GEN-LAST:event_telefonoSKeyTyped

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
            java.util.logging.Logger.getLogger(ClienteExistente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteExistente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteExistente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteExistente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ClienteExistente().setVisible(true);
        });
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JList<String> listName;
    private javax.swing.JTextField nombreS;
    private javax.swing.JLabel puntajeS;
    private javax.swing.JTextField telefonoS;
    // End of variables declaration//GEN-END:variables
}
