/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontera;

import Control.GestionInsumos;
import Entidad.Insumo;
import java.awt.Dimension;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class Gestion_Insumos extends javax.swing.JFrame {

    static GestionInsumos gi=new GestionInsumos();
    /**
     * Creates new form Gestion_Insumos
     * @param gi
     */
    public Gestion_Insumos() {
     
        initComponents();
        setLocationRelativeTo(null);
        System.out.println("List size: "+gi.getInsumoList().size());
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_principal_Insumos = new javax.swing.JPanel();
        panel_titulo_Insumos = new javax.swing.JPanel();
        titulo_insumos = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        label_buscar = new javax.swing.JLabel();
        tx_buscar = new javax.swing.JTextField();
        boton_agregar_Insumo = new javax.swing.JButton();
        panel_scroll = new javax.swing.JScrollPane();
        panel_lista = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);

        panel_principal_Insumos.setBackground(new java.awt.Color(241, 198, 241));

        panel_titulo_Insumos.setBackground(new java.awt.Color(212, 17, 200));

        titulo_insumos.setFont(new java.awt.Font("Giddyup Std", 1, 72)); // NOI18N
        titulo_insumos.setForeground(new java.awt.Color(255, 255, 255));
        titulo_insumos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_insumos.setText("Insumos");
        titulo_insumos.setToolTipText("");

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_titulo_InsumosLayout = new javax.swing.GroupLayout(panel_titulo_Insumos);
        panel_titulo_Insumos.setLayout(panel_titulo_InsumosLayout);
        panel_titulo_InsumosLayout.setHorizontalGroup(
            panel_titulo_InsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_titulo_InsumosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo_insumos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        panel_titulo_InsumosLayout.setVerticalGroup(
            panel_titulo_InsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_titulo_InsumosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_titulo_InsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_titulo_InsumosLayout.createSequentialGroup()
                .addComponent(titulo_insumos)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        label_buscar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label_buscar.setText("Buscar");

        tx_buscar.setToolTipText("Ingrese el nombre del insumo que desea buscar");
        tx_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx_buscarActionPerformed(evt);
            }
        });

        boton_agregar_Insumo.setBackground(new java.awt.Color(217, 17, 200));
        boton_agregar_Insumo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        boton_agregar_Insumo.setForeground(new java.awt.Color(217, 17, 200));
        boton_agregar_Insumo.setText("+");
        boton_agregar_Insumo.setToolTipText("Añada un nuevo insumo");
        boton_agregar_Insumo.setPreferredSize(new java.awt.Dimension(80, 80));
        boton_agregar_Insumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_agregar_InsumoActionPerformed(evt);
            }
        });

        panel_scroll.setBackground(new java.awt.Color(217, 17, 200));
        panel_scroll.setForeground(new java.awt.Color(217, 17, 200));
        panel_scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        panel_scroll.setAutoscrolls(true);

        panel_lista.setBackground(new java.awt.Color(180, 19, 180));
        panel_lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_listaMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout panel_listaLayout = new javax.swing.GroupLayout(panel_lista);
        panel_lista.setLayout(panel_listaLayout);
        panel_listaLayout.setHorizontalGroup(
            panel_listaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 408, Short.MAX_VALUE)
        );
        panel_listaLayout.setVerticalGroup(
            panel_listaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 418, Short.MAX_VALUE)
        );

        panel_scroll.setViewportView(panel_lista);

        javax.swing.GroupLayout panel_principal_InsumosLayout = new javax.swing.GroupLayout(panel_principal_Insumos);
        panel_principal_Insumos.setLayout(panel_principal_InsumosLayout);
        panel_principal_InsumosLayout.setHorizontalGroup(
            panel_principal_InsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_titulo_Insumos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_principal_InsumosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panel_principal_InsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel_scroll)
                    .addGroup(panel_principal_InsumosLayout.createSequentialGroup()
                        .addComponent(label_buscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tx_buscar)
                        .addGap(18, 18, 18)
                        .addComponent(boton_agregar_Insumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        panel_principal_InsumosLayout.setVerticalGroup(
            panel_principal_InsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_principal_InsumosLayout.createSequentialGroup()
                .addComponent(panel_titulo_Insumos, javax.swing.GroupLayout.PREFERRED_SIZE, 63, Short.MAX_VALUE)
                .addGroup(panel_principal_InsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_principal_InsumosLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(boton_agregar_Insumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_principal_InsumosLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(panel_principal_InsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_buscar)
                            .addComponent(tx_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20)
                .addComponent(panel_scroll)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_principal_Insumos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_principal_Insumos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tx_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx_buscarActionPerformed

    private void boton_agregar_InsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_agregar_InsumoActionPerformed
        ag=new Agregar_insumo();
        ag.setVisible(true); 
    }//GEN-LAST:event_boton_agregar_InsumoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void panel_listaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_listaMouseEntered
        System.out.println(panel_lista.getComponentCount()+","+gi.getInsumoList().size());
        if(panel_lista.getComponentCount()!=gi.getInsumoList().size()){
            panel_lista.removeAll();
            addSubPanels();
            panel_scroll.setViewportView(panel_lista);
        }
    }//GEN-LAST:event_panel_listaMouseEntered

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.out.println("size:"+gi.getInsumoList().size());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void addSubPanels(){
        int altura=70;
        for(int i=0; i< gi.getInsumoList().size();i++ ){
                InfoInsumo subPanel = new InfoInsumo(gi.getInsumoList().get(i));
                
                subPanel.setBounds(10, 10+altura*i,368,altura-10);
                subPanel.setOpaque(false);
                panel_lista.add(subPanel);
           }
        panel_lista.setPreferredSize(new java.awt.Dimension(panel_lista.getWidth(), panel_lista.getComponentCount()*altura+10));
    }
    
  
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
            java.util.logging.Logger.getLogger(Gestion_Insumos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gestion_Insumos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gestion_Insumos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gestion_Insumos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gestion_Insumos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_agregar_Insumo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel label_buscar;
    private javax.swing.JPanel panel_lista;
    private javax.swing.JPanel panel_principal_Insumos;
    public static javax.swing.JScrollPane panel_scroll;
    private javax.swing.JPanel panel_titulo_Insumos;
    private javax.swing.JLabel titulo_insumos;
    private javax.swing.JTextField tx_buscar;
    // End of variables declaration//GEN-END:variables
    Agregar_insumo ag;

    
    /*
    ####################################################################################################
    ####################################################################################################
    ####################################################################################################
    
    */
    class Agregar_insumo extends javax.swing.JFrame {

       


        public Agregar_insumo() {
          
            initComponents();
        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
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
        }// </editor-fold>                        

        private void tx_unidadActionPerformed(java.awt.event.ActionEvent evt) {                                          
            System.out.println("enter pressed");        // TODO add your handling code here:
            button_aceptarActionPerformed(evt);
        }                                         

        private void button_aceptarActionPerformed(java.awt.event.ActionEvent evt) {                                               
            Long id=new Long( gi.getInsumoList().size()+1);
            Insumo ins=new Insumo(id,tx_nombre_insumo.getText(),tx_unidad.getText());
            if(gi.addInsumo(ins)){
                 JOptionPane.showMessageDialog(null, "Exito al crear insumo " + ins.getNombre());
                dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Algo salió mal");
            }
        }                                              

        private void button_cancelarActionPerformed(java.awt.event.ActionEvent evt) {                                                
            dispose();
        }                                               

        private void tx_unidadMouseClicked(java.awt.event.MouseEvent evt) {                                       
                 if (tx_unidad.getText().equals("Ingrese la unidad de medida")){
                     tx_unidad.setText("");
                 }
        }                                      

        private void tx_nombre_insumoActionPerformed(java.awt.event.ActionEvent evt) {                                                 
            tx_unidad.requestFocusInWindow();        // TODO add your handling code here:
        }                                                

        private void tx_nombre_insumoMouseClicked(java.awt.event.MouseEvent evt) {                                              
            if(tx_nombre_insumo.getText().equals("Ingrese el nombre del nuevo insumo")){
                tx_nombre_insumo.setText("");
            }// TODO add your handling code here:
        }                                             

        private void tx_unidadFocusGained(java.awt.event.FocusEvent evt) {                                      
            if (tx_unidad.getText().equals("Ingrese la unidad de medida")){
                     tx_unidad.setText("");
                 }
        }                                     

        private void tx_nombre_insumoFocusGained(java.awt.event.FocusEvent evt) {                                             
            if(tx_nombre_insumo.getText().equals("Ingrese el nombre del nuevo insumo")){
                tx_nombre_insumo.setText("");
            }
        }                                            

        // Variables declaration - do not modify                     
        private javax.swing.JButton button_aceptar;
        private javax.swing.JButton button_cancelar;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JLabel label_buscar;
        private javax.swing.JLabel label_buscar1;
        private javax.swing.JPanel panel_titulo_Insumos;
        private javax.swing.JLabel titulo_insumos;
        private java.awt.TextField tx_nombre_insumo;
        private java.awt.TextField tx_unidad;
        // End of variables declaration                   
    }

}
