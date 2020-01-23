/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontera;

import Control.GestionCliente;
import Entidad.Cliente;
import com.sun.glass.events.KeyEvent;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Home
 */
public class ClientePedido extends javax.swing.JPanel {

    public static GestionCliente GC;
    public Cliente clienteObjetivo;
    public Calendar fechaRealización;
    public Calendar fechaEntrega;
    private final AddClienteVenta acv = new AddClienteVenta(this);
    
    String busqueda;
    private static DefaultTableModel dtm;
    private static int itemSelected = -1;
    private final DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
    
    private ArrayList<Integer> mapa;
    
    
    public ClientePedido(GestionCliente gestor_clientes) {
        this.GC=gestor_clientes;

        initComponents();
        busqueda="";
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        jTable1.getColumnModel().getColumn(1).setCellRenderer(tcr);
        if(dateChooser.getDate()==null)
            System.out.println("no date yet");
    }

    public void agregarDatos() {
        mapa = new ArrayList<Integer>();
        dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        
        String[] rows = new String[2];
        for(int i=0;i< GC.allClients().size();i++){
            Cliente c = GC.allClients().get(i);
            if(comparador(busqueda,c.getNombre().toUpperCase())){
                mapa.add(i);
                rows[0] = c.getNombre();
                rows[1] = c.getCasa();
                dtm.addRow(rows);
            }
            
        }
        jTable1.setModel(dtm);
    }
    
    private boolean comparador(String a, String b){
        boolean flag=true;
        for(int i=0;i<a.length() && i< b.length() && flag;i++){
            flag &= a.charAt(i)==b.charAt(i);
        }
        return flag;
    }
    
    public Cliente getCliente(){
        return this.clienteObjetivo;
    }
    
    //da como resultado un arreglo de dos fechas, la primera: fecha de realización del pedido,
    //la segunda: fecha para la entrega del pedido
    
    
    public Calendar[] getFechas(){
        Calendar[] fechasR_E = new Calendar[2];
        
        //toma la fecha y hora actual
        fechasR_E[0]=Calendar.getInstance();
        System.out.println(fechasR_E[0].toString());
        
        
        fechasR_E[1]=this.fechaRealización;
        
        return fechasR_E;
    }
    
    //verifica que todos los campos han sido llenados
    public boolean checkAllFilled(){
        return (
                    clienteObjetivo!=null &&
                    dateChooser.getCalendar()!=null &&
                    jcombo_hora.getSelectedIndex()!=0
                );
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_titulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_buscar_cliente = new javax.swing.JTextField();
        jButton_nuevoCliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        dateChooser = new com.toedter.calendar.JDateChooser();
        jcombo_hora = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(40, 43, 40));
        setPreferredSize(new java.awt.Dimension(540, 520));
        setLayout(null);

        label_titulo.setBackground(new java.awt.Color(255, 255, 255));
        label_titulo.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        label_titulo.setForeground(new java.awt.Color(255, 255, 255));
        label_titulo.setText("Detalles del Cliente");
        add(label_titulo);
        label_titulo.setBounds(140, 30, 282, 71);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cliente:");
        add(jLabel2);
        jLabel2.setBounds(90, 130, 72, 38);

        txt_buscar_cliente.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_buscar_cliente.setText("Buscar");
        txt_buscar_cliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_buscar_clienteFocusGained(evt);
            }
        });
        txt_buscar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buscar_clienteActionPerformed(evt);
            }
        });
        txt_buscar_cliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_buscar_clienteKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_buscar_clienteKeyTyped(evt);
            }
        });
        add(txt_buscar_cliente);
        txt_buscar_cliente.setBounds(180, 130, 260, 40);

        jButton_nuevoCliente.setLabel("+");
        jButton_nuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_nuevoClienteActionPerformed(evt);
            }
        });
        add(jButton_nuevoCliente);
        jButton_nuevoCliente.setBounds(450, 130, 41, 38);

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Casa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1);
        jScrollPane1.setBounds(90, 180, 400, 160);

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fecha/Hora:");
        add(jLabel3);
        jLabel3.setBounds(90, 360, 121, 38);
        add(dateChooser);
        dateChooser.setBounds(230, 360, 135, 38);

        jcombo_hora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hora:", "7:00 am", "8:00 am", "9:00 am", "10:00 am", "11:00 am", "12:00 m", "1:00 pm", "2:00 pm", "3:00 pm", "4:00 pm", "5:00 pm", "6:00 pm", "7:00 pm", "8:00 pm", "9:00 pm", "10:00 pm" }));
        jcombo_hora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcombo_horaMouseClicked(evt);
            }
        });
        add(jcombo_hora);
        jcombo_hora.setBounds(380, 360, 110, 38);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_buscar_clienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_buscar_clienteFocusGained
        
        if(txt_buscar_cliente.getText().equals("Buscar")){
            txt_buscar_cliente.setText(busqueda);
        }
        
        
    }//GEN-LAST:event_txt_buscar_clienteFocusGained
    static int count=0;
    private void txt_buscar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buscar_clienteActionPerformed
       
    }//GEN-LAST:event_txt_buscar_clienteActionPerformed

    private void txt_buscar_clienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscar_clienteKeyTyped
    
    }//GEN-LAST:event_txt_buscar_clienteKeyTyped

    private void txt_buscar_clienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscar_clienteKeyPressed
        int c=evt.getExtendedKeyCode();
        System.out.println("codigo tecla: "+c);
        if((c>= KeyEvent.VK_A && c<=KeyEvent.VK_Z)|| c==KeyEvent.VK_SPACE){
            busqueda+=(char)evt.getKeyCode();
        }
        else if(c==KeyEvent.VK_BACKSPACE){
            
            if(busqueda.length()==1){
                busqueda="";
            }
            if(busqueda.length()>1){
                busqueda=busqueda.substring(0, busqueda.length()-1);
            }
        }else if(c==10){
            Calendar fechaE=dateChooser.getCalendar();
            System.out.println(fechaE.toString());
        }
        System.out.println("busqueda:"+busqueda+","+busqueda.length()+
                ", texto:"+txt_buscar_cliente.getText()+","+txt_buscar_cliente.getText().length());
        agregarDatos();
    }//GEN-LAST:event_txt_buscar_clienteKeyPressed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        itemSelected=jTable1.getSelectedRow();
        System.out.println("selected item:"+itemSelected+"\nselected client:"+GC.allClients().get(mapa.get(itemSelected)).getNombre());
        this.clienteObjetivo=GC.allClients().get(mapa.get(itemSelected));
        System.out.println("item selected: "+jcombo_hora.getSelectedIndex());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jcombo_horaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcombo_horaMouseClicked
        System.out.println("mouse clicked in hour");
    }//GEN-LAST:event_jcombo_horaMouseClicked

    private void jButton_nuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_nuevoClienteActionPerformed
        acv.setVisible(true);
    }//GEN-LAST:event_jButton_nuevoClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JButton jButton_nuevoCliente;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> jcombo_hora;
    private javax.swing.JLabel label_titulo;
    private javax.swing.JTextField txt_buscar_cliente;
    // End of variables declaration//GEN-END:variables
}
