package MOD.INICIO;

<<<<<<< HEAD
import MOD.ADMI.PrincipalAdmin;
import MOD.USER.PrincipalUsuario;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alfredo Rangel Cruz
 */
=======
import MOD.USER.ProductoUsuario;
import MOD.USER.PrincipalUsuario;
import MOD.USER.Venta;
import MOD.USER.Ticket;
import MOD.ADMI.Reportes;
import MOD.ADMI.PrincipalAdmin;
>>>>>>> b18416fa86e23ddae3f266da5ec4b4738048e8cd
public class ClaveAcceso extends javax.swing.JFrame {

    public ClaveAcceso() {
        initComponents();
    }
    
    void Login(){
        //Usuarios
        String Usuario="Admin";
        String Contraseña="Admin18";
        
        String Usuario2="Empleado";
        String Contraseña2="Empleado";
        
        
        String Pass = new String(txtPass.getText());
        
        if(txtUsuario.getText().equals(Usuario) && Pass.equals(Contraseña)){
            PrincipalAdmin pa = new PrincipalAdmin();
            pa.setVisible(true);
            dispose();
        }
        
        else if(txtUsuario.getText().equals(Usuario2) && Pass.equals(Contraseña2)){
            PrincipalUsuario pu = new PrincipalUsuario();
            pu.setVisible(true);
            dispose();
        }
        
        else{
            txtUsuario.setText(null);
            txtPass.setText(null);
            JOptionPane.showMessageDialog(this, " Usuario / Contraseña \n  Incorrecta");
            
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

<<<<<<< HEAD
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtPass = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
=======
        panelClaveAcceso = new javax.swing.JPanel();
        labelUsuario = new javax.swing.JLabel();
        labelContraseña = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        labelLogotipo = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        passContraseña = new javax.swing.JPasswordField();
        botonAceptar = new javax.swing.JButton();
        botonAyuda = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
>>>>>>> b18416fa86e23ddae3f266da5ec4b4738048e8cd

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ACCESO AL SISTEMA");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/MOD/ICONO/intelisoft.png")).getImage());
        setLocation(new java.awt.Point(350, 250));
        setMaximumSize(new java.awt.Dimension(461, 183));
        setResizable(false);

        panelClaveAcceso.setBackground(new java.awt.Color(153, 153, 255));
        panelClaveAcceso.setMaximumSize(new java.awt.Dimension(461, 183));
        panelClaveAcceso.setName("CLAVE ACCESO"); // NOI18N
        panelClaveAcceso.setPreferredSize(new java.awt.Dimension(461, 183));

        labelUsuario.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        labelUsuario.setText("USUARIO");

        labelContraseña.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        labelContraseña.setText("CONTRASEÑA");

<<<<<<< HEAD
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MOD/ICONO/ACEPTAR.png")));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MOD/ICONO/AYUDA.png")));

        jButton3.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 102, 102));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MOD/ICONO/SALIR.png")));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel4.setText("Clave de acceso");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MOD/ICONO/intelisoft.png")));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
=======
        labelTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelTitulo.setText("ACCESO AL SISTEMA");
        labelTitulo.setToolTipText("");

        labelLogotipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MOD/ICONO/intelisoft.png"))); // NOI18N

        txtUsuario.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        passContraseña.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        passContraseña.setToolTipText("");

        botonAceptar.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        botonAceptar.setForeground(new java.awt.Color(0, 153, 51));
        botonAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MOD/ICONO/ACEPTAR.png"))); // NOI18N
        botonAceptar.setToolTipText("Ingresar al Sistema");
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });

        botonAyuda.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        botonAyuda.setForeground(new java.awt.Color(153, 0, 0));
        botonAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MOD/ICONO/AYUDA.png"))); // NOI18N
        botonAyuda.setToolTipText("Ayuda");

        botonSalir.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(0, 102, 102));
        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MOD/ICONO/SALIR.png"))); // NOI18N
        botonSalir.setToolTipText("Salir");

        javax.swing.GroupLayout panelClaveAccesoLayout = new javax.swing.GroupLayout(panelClaveAcceso);
        panelClaveAcceso.setLayout(panelClaveAccesoLayout);
        panelClaveAccesoLayout.setHorizontalGroup(
            panelClaveAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClaveAccesoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelClaveAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelClaveAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelClaveAccesoLayout.createSequentialGroup()
                            .addComponent(labelUsuario)
                            .addGap(36, 36, 36)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelClaveAccesoLayout.createSequentialGroup()
                            .addComponent(labelContraseña)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(passContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelClaveAccesoLayout.createSequentialGroup()
                        .addComponent(botonAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(panelClaveAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelClaveAccesoLayout.createSequentialGroup()
                        .addComponent(labelTitulo)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelClaveAccesoLayout.createSequentialGroup()
                        .addComponent(labelLogotipo)
                        .addGap(61, 61, 61))))
>>>>>>> b18416fa86e23ddae3f266da5ec4b4738048e8cd
        );
        panelClaveAccesoLayout.setVerticalGroup(
            panelClaveAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClaveAccesoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelClaveAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelUsuario)
                    .addComponent(labelTitulo))
                .addGap(29, 29, 29)
                .addGroup(panelClaveAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelClaveAccesoLayout.createSequentialGroup()
                        .addGroup(panelClaveAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelContraseña)
                            .addComponent(passContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
<<<<<<< HEAD
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
=======
                        .addGroup(panelClaveAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(labelLogotipo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
>>>>>>> b18416fa86e23ddae3f266da5ec4b4738048e8cd
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelClaveAcceso, 466, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelClaveAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

<<<<<<< HEAD
    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Boton entrar
        Login();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ClaveAcceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClaveAcceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClaveAcceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClaveAcceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClaveAcceso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtPass;
=======
    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        //Login al sistema.
        //Estos new´s los puse para que puedan visualizar estas ventanas.
        //Es un ejemplo por que aun no programamos movernos entre el sistema
        new ProductoUsuario().setVisible(true);
        new PrincipalUsuario().setVisible(true);
        new Venta().setVisible(true);
        new Ticket().setVisible(true);
        new Reportes().setVisible(true);
        new PrincipalAdmin().setVisible(true);
    }//GEN-LAST:event_botonAceptarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonAyuda;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel labelContraseña;
    private javax.swing.JLabel labelLogotipo;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JPanel panelClaveAcceso;
    private javax.swing.JPasswordField passContraseña;
>>>>>>> b18416fa86e23ddae3f266da5ec4b4738048e8cd
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
