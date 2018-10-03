package MOD.INICIO;

import javax.swing.ImageIcon;

public class ClaveAcceso extends javax.swing.JFrame {

    public ClaveAcceso() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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

        labelTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelTitulo.setText("ACCESO AL SISTEMA");
        labelTitulo.setToolTipText("");

        labelLogotipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MOD/ICONO/intelisoft.png"))); // NOI18N

        txtUsuario.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        passContraseña.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        passContraseña.setToolTipText("");

        botonAceptar.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        botonAceptar.setForeground(new java.awt.Color(0, 153, 51));
        botonAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MOD/ICONO/ACEPTAR.png")));
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });

        botonAyuda.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        botonAyuda.setForeground(new java.awt.Color(153, 0, 0));
        botonAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MOD/ICONO/AYUDA.png"))); // NOI18N

        botonSalir.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(0, 102, 102));
        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MOD/ICONO/SALIR.png"))); // NOI18N

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelClaveAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelClaveAccesoLayout.createSequentialGroup()
                        .addComponent(labelTitulo)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelClaveAccesoLayout.createSequentialGroup()
                        .addComponent(labelLogotipo)
                        .addGap(65, 65, 65))))
        );
        panelClaveAccesoLayout.setVerticalGroup(
            panelClaveAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClaveAccesoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelClaveAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelUsuario)
                    .addComponent(labelTitulo))
                .addGroup(panelClaveAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelClaveAccesoLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(panelClaveAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelContraseña)
                            .addComponent(passContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelClaveAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelClaveAccesoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(labelLogotipo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        String contraseña= "Manuel01";
        String usuario= "Manuel";
        if (txtUsuario.getText().equalsIgnoreCase(usuario) && passContraseña.getText().equalsIgnoreCase(contraseña)){
            System.out.println("INGRESASTE AL SISTEMA");
            System.out.println(txtUsuario.getText().toString());
            System.out.println(passContraseña.getText().toString());
        }else{
            System.out.println("NO INGRESASTE AL SISTEMA");
            System.out.println(txtUsuario.getText().toString());
            System.out.println(passContraseña.getText().toString());
        }
    }//GEN-LAST:event_botonAceptarActionPerformed

    public static void main(String args[]) {
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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClaveAcceso().setVisible(true);
            }
        });
    }

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
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
