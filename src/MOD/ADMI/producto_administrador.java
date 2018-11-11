/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MOD.ADMI;

import API.ADMI.Producto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class producto_administrador extends javax.swing.JFrame {

    public producto_administrador() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelProductosAdmi = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableProducto = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldAdministrador = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldFecha = new javax.swing.JTextField();
        jButtonAgregar = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtclasif = new javax.swing.JTextField();
        txtdescrip = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtupc = new javax.swing.JTextField();
        txtprecio = new javax.swing.JTextField();
        txtsat = new javax.swing.JTextField();
        txtexist = new javax.swing.JTextField();
        txttasa = new javax.swing.JTextField();
        txtcosto = new javax.swing.JTextField();
        txtbuscar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Productos del Administrador");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanelProductosAdmi.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Productos del Administrador");

        tableProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProductoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableProducto);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("BIENVENIDO ADMINISTRADOR:");

        jTextFieldAdministrador.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("FECHA:");

        jTextFieldFecha.setEnabled(false);

        jButtonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MOD/ICONO/AGREGAR.png"))); // NOI18N
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });

        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MOD/ICONO/BUSCAR.png"))); // NOI18N
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jButtonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MOD/ICONO/ELIMINAR.png"))); // NOI18N
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButtonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MOD/ICONO/SALIR.png"))); // NOI18N
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel5.setText("UPC:");

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel6.setText("NOMBRE:");

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel7.setText("DESCRIPCIÓN:");

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel8.setText("CLASIFICACIÓN:");

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel9.setText("EXISTENCIA:");

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel10.setText("SAT:");

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel12.setText("PRECIOS S/IVA:");

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel13.setText("TASA CERO:");

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel14.setText("COSTO:");

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel11.setText("BUSCAR POR ID:");

        javax.swing.GroupLayout jPanelProductosAdmiLayout = new javax.swing.GroupLayout(jPanelProductosAdmi);
        jPanelProductosAdmi.setLayout(jPanelProductosAdmiLayout);
        jPanelProductosAdmiLayout.setHorizontalGroup(
            jPanelProductosAdmiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanelProductosAdmiLayout.createSequentialGroup()
                .addGroup(jPanelProductosAdmiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelProductosAdmiLayout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(jLabel1))
                    .addGroup(jPanelProductosAdmiLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelProductosAdmiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelProductosAdmiLayout.createSequentialGroup()
                                .addGroup(jPanelProductosAdmiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelProductosAdmiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanelProductosAdmiLayout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtclasif, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                                        .addGroup(jPanelProductosAdmiLayout.createSequentialGroup()
                                            .addGroup(jPanelProductosAdmiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel6)
                                                .addComponent(jLabel5))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanelProductosAdmiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtupc)
                                                .addComponent(txtnombre)
                                                .addComponent(txtdescrip))))
                                    .addGroup(jPanelProductosAdmiLayout.createSequentialGroup()
                                        .addGap(104, 104, 104)
                                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(63, 63, 63)
                                .addGroup(jPanelProductosAdmiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanelProductosAdmiLayout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(49, 49, 49)
                                        .addComponent(txtcosto))
                                    .addGroup(jPanelProductosAdmiLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanelProductosAdmiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanelProductosAdmiLayout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanelProductosAdmiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txttasa, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                                    .addComponent(txtprecio)))
                                            .addGroup(jPanelProductosAdmiLayout.createSequentialGroup()
                                                .addGroup(jPanelProductosAdmiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProductosAdmiLayout.createSequentialGroup()
                                                        .addComponent(jLabel9)
                                                        .addGap(25, 25, 25))
                                                    .addGroup(jPanelProductosAdmiLayout.createSequentialGroup()
                                                        .addGroup(jPanelProductosAdmiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING))
                                                        .addGap(27, 27, 27)))
                                                .addGroup(jPanelProductosAdmiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtsat, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtexist, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelProductosAdmiLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(106, 106, 106)
                                .addComponent(jLabel3)))
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(91, Short.MAX_VALUE))
            .addGroup(jPanelProductosAdmiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtbuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonBuscar)
                .addGap(60, 60, 60)
                .addComponent(jButtonAgregar)
                .addGap(38, 38, 38)
                .addComponent(jButtonEliminar)
                .addGap(45, 45, 45)
                .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanelProductosAdmiLayout.setVerticalGroup(
            jPanelProductosAdmiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProductosAdmiLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanelProductosAdmiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanelProductosAdmiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtexist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelProductosAdmiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelProductosAdmiLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanelProductosAdmiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10)
                            .addComponent(txtupc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelProductosAdmiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelProductosAdmiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelProductosAdmiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12)
                                .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelProductosAdmiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelProductosAdmiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(txtdescrip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel13)
                            .addComponent(txttasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelProductosAdmiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelProductosAdmiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(txtclasif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel14)
                            .addComponent(txtcosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelProductosAdmiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelProductosAdmiLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelProductosAdmiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                                    .addComponent(jButtonAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanelProductosAdmiLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jButtonBuscar)))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProductosAdmiLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelProductosAdmiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(56, 56, 56))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelProductosAdmi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelProductosAdmi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    void mostrarTabla(){
        String[] nombres = {"ID","UPC","Producto","Descripcion","Clasificacion","Existencia","Codigo de SAT","Precio sin IVA","Tasa Cero","Costo"};  
        ArrayList<Producto> ListaDeProductos = new Producto().GetAllProducto();
        if (ListaDeProductos==null){
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setColumnIdentifiers(nombres);
            tableProducto.setModel(modelo);
        }else{
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setColumnIdentifiers(nombres);
            
   
            Object[] fila = new Object[modelo.getColumnCount()];

            for (int i = 0; i < ListaDeProductos.size(); i++) {

                fila[0] = ListaDeProductos.get(i).getIdProducto();
                fila[1] = ListaDeProductos.get(i).getUpc();
                fila[2] = ListaDeProductos.get(i).getNombreProd();
                fila[3] = ListaDeProductos.get(i).getDescripcion();
                fila[4] = ListaDeProductos.get(i).getClasificacion();
                fila[5] = ListaDeProductos.get(i).getExistencia();
                fila[6] = ListaDeProductos.get(i).getCodigoSat();
                fila[7] = ListaDeProductos.get(i).getPrecioSinIva();
                fila[8] = ListaDeProductos.get(i).getTasaCero();
                fila[9] = ListaDeProductos.get(i).getCosto();
                modelo.addRow(fila);
            }
            tableProducto.setModel(modelo);
        }
     }
    
    void mostrarRegistro(){
        String Id = txtbuscar.getText();
        String[] nombres = {"ID","UPC","Producto","Descripcion","Clasificacion","Existencia","Codigo de SAT","Precio sin IVA","Tasa Cero","Costo"};
        Producto Producto = new Producto().GetRegistro(Id);
        if (Producto==null){
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setColumnIdentifiers(nombres);
            tableProducto.setModel(modelo);
        }else{
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setColumnIdentifiers(nombres);
   
            Object[] fila = new Object[modelo.getColumnCount()];

            fila[0] = Producto.getIdProducto();
            fila[1] = Producto.getUpc();
            fila[2] = Producto.getNombreProd();
            fila[3] = Producto.getDescripcion();
            fila[4] = Producto.getClasificacion();
            fila[5] = Producto.getExistencia();
            fila[6] = Producto.getCodigoSat();
            fila[7] = Producto.getPrecioSinIva();
            fila[8] = Producto.getTasaCero();
            fila[9] = Producto.getCosto();
            modelo.addRow(fila);        
            tableProducto.setModel(modelo);
        }
    }
    
    private void limitarALetras(java.awt.event.KeyEvent evt){
        char c = evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A'|| c>'Z') && (c!='á') && (c!='é')
        && (c!='í') && (c!='ó') && (c!='ú') && (c!='Á') && (c!='É') && (c!='Í') 
        && (c!='Ó') && (c!='Ú') && (c!='ñ') && (c!='Ñ') && (c!=(char)KeyEvent.VK_SPACE)){
            evt.consume(); 
        }
    }
    
    public void limpiar(){
        txtid.setText("");
        txtupc.setText("");
        txtnombre.setText("");
        txtdescrip.setText("");
        txtclasif.setText("");
        txtexist.setText("");
        txtsat.setText("");
        txtprecio.setText("");
        txttasa.setText("");
        txtcosto.setText("");
    }
    
    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        // TODO add your handling code here:
        //String idProducto = txtid.getText();
        String upc = txtupc.getText();
        String nombreProd = txtnombre.getText();
        String descripcion = txtdescrip.getText();
        String clasificacion = txtclasif.getText();
        String existencia = txtexist.getText();
        String codigoSat = txtsat.getText();
        String precioSinIva = txtprecio.getText();
        String tasaCero = txttasa.getText();
        String costo = txtcosto.getText();
            if (/*idProducto.isEmpty() || */upc.isEmpty()|| nombreProd.isEmpty() || descripcion.isEmpty() || clasificacion.isEmpty() || existencia.isEmpty() || codigoSat.isEmpty() || precioSinIva.isEmpty() || tasaCero.isEmpty() || costo.isEmpty()){
                JOptionPane.showMessageDialog(null, "No se han llenado todos los campos", "Llenar campos", JOptionPane.ERROR_MESSAGE); 
            }else{

                Producto Producto = new Producto().getNuevo();
                //String idProducto = Producto.getIdProducto();
                Producto.setUpc(upc);
                Producto.setNombreProducto(nombreProd);
                Producto.setDescripcion(descripcion);
                Producto.setClasificacion(clasificacion);
                Producto.setExistencia(existencia);
                Producto.setCodigoSat(codigoSat);
                Producto.setPrecioSinIva(precioSinIva);
                Producto.setTasaCero(tasaCero);
                Producto.setCosto(costo);
        
                if(Producto.InsertRegistro(Producto)){
                    JOptionPane.showMessageDialog(null, "Usuario agregado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    mostrarTabla();
                    limpiar();
                }else{
                    JOptionPane.showMessageDialog(null, "Usuario no agregado", "Error al guardar", JOptionPane.ERROR_MESSAGE);
                }
            }
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        // TODO add your handling code here:
        int fila = 0;
        String id = txtid.getText();
        int aceptar = JOptionPane.showConfirmDialog(null, "¿Seguro de eliminar usuario?");
        if(aceptar==JOptionPane.OK_OPTION){
            if(new Producto().DeleteRegistro(id)){
                mostrarTabla();
                limpiar();
            }
        }else{
                JOptionPane.showMessageDialog(null, "Usuario no eliminado", "Cancelado",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void tableProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProductoMouseClicked
        // TODO add your handling code here:
        int fila = 0;
        fila = tableProducto.rowAtPoint(evt.getPoint());
        if (fila >= 0 ){
            txtid.setText(String.valueOf(tableProducto.getValueAt(fila,0)));
            txtupc.setText(String.valueOf(tableProducto.getValueAt(fila, 1)));
            txtnombre.setText(String.valueOf(tableProducto.getValueAt(fila, 2)));
            txtdescrip.setText(String.valueOf(tableProducto.getValueAt(fila, 3)));
            txtclasif.setText(String.valueOf(tableProducto.getValueAt(fila, 4)));
            txtexist.setText(String.valueOf(tableProducto.getValueAt(fila, 5)));
            txtsat.setText(String.valueOf(tableProducto.getValueAt(fila, 6)));
            txtprecio.setText(String.valueOf(tableProducto.getValueAt(fila, 7)));
            txttasa.setText(String.valueOf(tableProducto.getValueAt(fila, 8)));
            txtcosto.setText(String.valueOf(tableProducto.getValueAt(fila, 9)));
        }
    }//GEN-LAST:event_tableProductoMouseClicked

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        // TODO add your handling code here:
        mostrarRegistro();
        txtid.setVisible(false);
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        mostrarTabla();
        txtid.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
        PrincipalAdmin pa = new PrincipalAdmin();
        pa.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed

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
            java.util.logging.Logger.getLogger(producto_administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(producto_administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(producto_administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(producto_administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new producto_administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelProductosAdmi;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextFieldAdministrador;
    private javax.swing.JTextField jTextFieldFecha;
    private javax.swing.JTable tableProducto;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtclasif;
    private javax.swing.JTextField txtcosto;
    private javax.swing.JTextField txtdescrip;
    private javax.swing.JTextField txtexist;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JTextField txtsat;
    private javax.swing.JTextField txttasa;
    private javax.swing.JTextField txtupc;
    // End of variables declaration//GEN-END:variables
}
