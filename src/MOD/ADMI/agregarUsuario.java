package MOD.ADMI;

import API.ADMI.Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class agregarUsuario extends javax.swing.JFrame {

    public agregarUsuario() {
        initComponents();
        mostrarTabla();
        txtId.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelAgregarUsuario = new javax.swing.JPanel();
        labelAgregarUsuario = new javax.swing.JLabel();
        labelClaveDeEmpleado = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        labelNombreEmpleado = new javax.swing.JLabel();
        labelApellidoPaterno = new javax.swing.JLabel();
        labelApellidoMaterno = new javax.swing.JLabel();
        labelDireccion = new javax.swing.JLabel();
        labelTipoDeUsuario = new javax.swing.JLabel();
        txtClaveEmpleado = new javax.swing.JTextField();
        txtNombreEmpleado = new javax.swing.JTextField();
        txtApellidoPaterno = new javax.swing.JTextField();
        txtApellidoMaterno = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableUsuario = new javax.swing.JTable();
        botonAgregar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        txtPassword = new javax.swing.JTextField();
        cmbTipoUsuario = new javax.swing.JComboBox<>();
        txtId = new javax.swing.JTextField();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agregar usuario");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/MOD/ICONO/intelisoft.png")).getImage());

        panelAgregarUsuario.setBackground(new java.awt.Color(153, 153, 255));

        labelAgregarUsuario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelAgregarUsuario.setText("AGREGAR USUARIO");

        labelClaveDeEmpleado.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        labelClaveDeEmpleado.setText("Clave de Empleado");

        labelPassword.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        labelPassword.setText("Password:");

        labelNombreEmpleado.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        labelNombreEmpleado.setText("Nombre de Empleado");

        labelApellidoPaterno.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        labelApellidoPaterno.setText("Apellido Paterno");

        labelApellidoMaterno.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        labelApellidoMaterno.setText("Apellido Materno");

        labelDireccion.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        labelDireccion.setText("Dirección");

        labelTipoDeUsuario.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        labelTipoDeUsuario.setText("Tipo de usuario");

        txtClaveEmpleado.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtClaveEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtClaveEmpleadoKeyTyped(evt);
            }
        });

        txtNombreEmpleado.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtNombreEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreEmpleadoKeyTyped(evt);
            }
        });

        txtApellidoPaterno.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtApellidoPaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoPaternoKeyTyped(evt);
            }
        });

        txtApellidoMaterno.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtApellidoMaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoMaternoKeyTyped(evt);
            }
        });

        txtDireccion.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
            }
        });

        tableUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableUsuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableUsuario);

        botonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MOD/ICONO/AGREGAR.png"))); // NOI18N
        botonAgregar.setToolTipText("Agregar");

        botonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MOD/ICONO/EDITAR.png"))); // NOI18N
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MOD/ICONO/ELIMINAR.png"))); // NOI18N
        botonEliminar.setToolTipText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        cmbTipoUsuario.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        cmbTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMINISTRADOR", "EMPLEADO" }));
        cmbTipoUsuario.setToolTipText("");

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MOD/ICONO/REGRESAR.png"))); // NOI18N
        btnRegresar.setToolTipText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAgregarUsuarioLayout = new javax.swing.GroupLayout(panelAgregarUsuario);
        panelAgregarUsuario.setLayout(panelAgregarUsuarioLayout);
        panelAgregarUsuarioLayout.setHorizontalGroup(
            panelAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgregarUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(panelAgregarUsuarioLayout.createSequentialGroup()
                        .addGroup(panelAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelAgregarUsuarioLayout.createSequentialGroup()
                                .addGap(326, 326, 326)
                                .addComponent(labelAgregarUsuario))
                            .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelAgregarUsuarioLayout.createSequentialGroup()
                                .addGroup(panelAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelAgregarUsuarioLayout.createSequentialGroup()
                                        .addComponent(botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addComponent(botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelAgregarUsuarioLayout.createSequentialGroup()
                                            .addComponent(labelNombreEmpleado)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(21, 21, 21)
                                            .addComponent(labelApellidoPaterno)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(labelApellidoMaterno)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panelAgregarUsuarioLayout.createSequentialGroup()
                                            .addComponent(labelDireccion)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(labelTipoDeUsuario)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cmbTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panelAgregarUsuarioLayout.createSequentialGroup()
                                            .addComponent(labelClaveDeEmpleado)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtClaveEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(labelPassword)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelAgregarUsuarioLayout.setVerticalGroup(
            panelAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAgregarUsuarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelAgregarUsuario)
                .addGroup(panelAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAgregarUsuarioLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAgregarUsuarioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelClaveDeEmpleado)
                                .addComponent(txtClaveEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelPassword))
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelApellidoPaterno)
                            .addComponent(txtApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelApellidoMaterno)
                            .addComponent(txtApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNombreEmpleado)
                            .addComponent(txtNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(panelAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelDireccion)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTipoDeUsuario)
                            .addComponent(cmbTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(panelAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(botonAgregar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonModificar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonEliminar, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegresar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAgregarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     void mostrarTabla(){
        String[] nombres = {"ID","Clave","Password","Nombre(s)","A. Paterno", "A. Materno","Dirección","Tipo Usuario"};  
        ArrayList<Usuario> ListaDeUsuarios = new Usuario().GetAllUsuario();
        if (ListaDeUsuarios==null){
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setColumnIdentifiers(nombres);
            tableUsuario.setModel(modelo);
        }else{
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setColumnIdentifiers(nombres);
            
   
            Object[] fila = new Object[modelo.getColumnCount()];

            for (int i = 0; i < ListaDeUsuarios.size(); i++) {

                fila[0] = ListaDeUsuarios.get(i).getIdUsuario();
                fila[1] = ListaDeUsuarios.get(i).getClaveEmpleado();
                fila[2] = ListaDeUsuarios.get(i).getPassword();
                fila[3] = ListaDeUsuarios.get(i).getNombreEmpleado();
                fila[4] = ListaDeUsuarios.get(i).getAPaterno();
                fila[5] = ListaDeUsuarios.get(i).getAMaterno();
                fila[6] = ListaDeUsuarios.get(i).getDireccion();
                fila[7] = ListaDeUsuarios.get(i).getTipoUsuario();
                modelo.addRow(fila);
            }
            tableUsuario.setModel(modelo);
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
        txtId.setText("");
        txtClaveEmpleado.setText("");
        txtNombreEmpleado.setText("");
        txtApellidoPaterno.setText("");
        txtApellidoMaterno.setText("");
        txtDireccion.setText("");
        txtPassword.setText("");
    }
    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        int fila = 0;
        String id = txtId.getText();
        int aceptar = JOptionPane.showConfirmDialog(null, "¿Seguro de eliminar usuario?");
        if(aceptar==JOptionPane.OK_OPTION){
            if(new Usuario().DeleteRegistro(id)){
                mostrarTabla();
                limpiar();
            }
        }else{
                JOptionPane.showMessageDialog(null, "Usuario no eliminado", "Cancelado",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        String idUsuario =txtId.getText();
        String claveEmpleado = txtClaveEmpleado.getText();
        String password = txtPassword.getText();
        String nombreEmpleado = txtNombreEmpleado.getText();
        String aPaterno = txtApellidoPaterno.getText();
        String aMaterno = txtApellidoMaterno.getText();
        String direccion = txtDireccion.getText();
        String tipo = (String) cmbTipoUsuario.getSelectedItem();
        if (claveEmpleado.isEmpty() || nombreEmpleado.isEmpty()|| aPaterno.isEmpty() || aMaterno.isEmpty() || direccion.isEmpty() || password.isEmpty() ){
                JOptionPane.showMessageDialog(null, "No se han llenado todos los campos", "Llenar campos", JOptionPane.ERROR_MESSAGE); 
        }else{
            Usuario Usuario = new Usuario().GetRegistro(idUsuario);
        
            if(Usuario != null)
            {
                Usuario.setClaveEmpleado(claveEmpleado);
                Usuario.setPassword(password);
                Usuario.setNombreEmpleado(nombreEmpleado);
                Usuario.setAPaterno(aPaterno);
                Usuario.setAMaterno(aMaterno);
                Usuario.setDireccion(direccion);
                Usuario.setTipoUsuario(tipo);

                if(Usuario.Update_Registro(Usuario.getIdUsuario(), Usuario)){
                    JOptionPane.showMessageDialog(null, "Usuario modificado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    limpiar();
                }else{
                    JOptionPane.showMessageDialog(null, "Usuario no modificado", "Error al guardar", JOptionPane.ERROR_MESSAGE);
                }
            }
            mostrarTabla();
        }
    }//GEN-LAST:event_botonModificarActionPerformed

    private void tableUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableUsuarioMouseClicked
        int fila = 0;
        fila = tableUsuario.rowAtPoint(evt.getPoint());
        if (fila >= 0 ){
            txtId.setText(String.valueOf(tableUsuario.getValueAt(fila,0)));
            txtClaveEmpleado.setText(String.valueOf(tableUsuario.getValueAt(fila, 1)));
            txtPassword.setText(String.valueOf(tableUsuario.getValueAt(fila, 2)));
            txtNombreEmpleado.setText(String.valueOf(tableUsuario.getValueAt(fila, 3)));
            txtApellidoPaterno.setText(String.valueOf(tableUsuario.getValueAt(fila, 4)));
            txtApellidoMaterno.setText(String.valueOf(tableUsuario.getValueAt(fila, 5)));
            txtDireccion.setText(String.valueOf(tableUsuario.getValueAt(fila, 6)));
            cmbTipoUsuario.setSelectedItem(String.valueOf(tableUsuario.getValueAt(fila, 7)));
        }
    }//GEN-LAST:event_tableUsuarioMouseClicked

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped
        if(txtDireccion.getText().length()>=100){
            evt.consume();
        }
    }//GEN-LAST:event_txtDireccionKeyTyped

    private void txtApellidoPaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoPaternoKeyTyped
        limitarALetras(evt);
        if(txtApellidoPaterno.getText().length()>=30){
            evt.consume();
        } // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoPaternoKeyTyped

    private void txtApellidoMaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoMaternoKeyTyped
        limitarALetras(evt);
        if(txtApellidoMaterno.getText().length()>=30){
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoMaternoKeyTyped

    private void txtNombreEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreEmpleadoKeyTyped
        limitarALetras(evt);
        if(txtNombreEmpleado.getText().length()>=30){
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreEmpleadoKeyTyped

    private void txtClaveEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClaveEmpleadoKeyTyped
        if(txtClaveEmpleado.getText().length()>=10){
            evt.consume();
        }
    }//GEN-LAST:event_txtClaveEmpleadoKeyTyped

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        PrincipalAdmin pa = new PrincipalAdmin();
        pa.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

  
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
            java.util.logging.Logger.getLogger(agregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(agregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(agregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(agregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new agregarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cmbTipoUsuario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAgregarUsuario;
    private javax.swing.JLabel labelApellidoMaterno;
    private javax.swing.JLabel labelApellidoPaterno;
    private javax.swing.JLabel labelClaveDeEmpleado;
    private javax.swing.JLabel labelDireccion;
    private javax.swing.JLabel labelNombreEmpleado;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelTipoDeUsuario;
    private javax.swing.JPanel panelAgregarUsuario;
    private javax.swing.JTable tableUsuario;
    private javax.swing.JTextField txtApellidoMaterno;
    private javax.swing.JTextField txtApellidoPaterno;
    private javax.swing.JTextField txtClaveEmpleado;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombreEmpleado;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables
}
