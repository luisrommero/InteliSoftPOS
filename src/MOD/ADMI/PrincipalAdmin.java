package MOD.ADMI;

public class PrincipalAdmin extends javax.swing.JFrame {

    public PrincipalAdmin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipalAdmin = new javax.swing.JPanel();
        labelManuPrincipal = new javax.swing.JLabel();
        labelBienvenidoAdministrador = new javax.swing.JLabel();
        labelFecha = new javax.swing.JLabel();
        txtBienvenidoAdministrador = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        botonUsuario = new javax.swing.JButton();
        botonProducto = new javax.swing.JButton();
        botonTicket = new javax.swing.JButton();
        botonVenta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/MOD/ICONO/intelisoft.png")).getImage());

<<<<<<< HEAD
        jPanel1.setBackground(new java.awt.Color(155, 155, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("MENÚ PRINCIPAL");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setText("BIENVENIDO ADMINISTRADOR:");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setText("FECHA:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MOD/ICONO/USUARIOS.png"))); // NOI18N

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MOD/ICONO/PRODUCTOS.png"))); // NOI18N

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MOD/ICONO/TICKET.png"))); // NOI18N

        jBventa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MOD/ICONO/VENTA.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(110, 110, 110)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jBventa, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
=======
        panelPrincipalAdmin.setBackground(new java.awt.Color(155, 155, 255));

        labelManuPrincipal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelManuPrincipal.setText("MENÚ PRINCIPAL");

        labelBienvenidoAdministrador.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        labelBienvenidoAdministrador.setText("BIENVENIDO ADMINISTRADOR:");

        labelFecha.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        labelFecha.setText("FECHA:");

        txtBienvenidoAdministrador.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        txtFecha.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        botonUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MOD/ICONO/USUARIOS.png"))); // NOI18N
        botonUsuario.setToolTipText("Usuarios");

        botonProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MOD/ICONO/PRODUCTOS.png"))); // NOI18N
        botonProducto.setToolTipText("Productos");

        botonTicket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MOD/ICONO/TICKET.png"))); // NOI18N
        botonTicket.setToolTipText("Ticket");

        botonVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MOD/ICONO/VENTA.png"))); // NOI18N
        botonVenta.setToolTipText("Venta");

        javax.swing.GroupLayout panelPrincipalAdminLayout = new javax.swing.GroupLayout(panelPrincipalAdmin);
        panelPrincipalAdmin.setLayout(panelPrincipalAdminLayout);
        panelPrincipalAdminLayout.setHorizontalGroup(
            panelPrincipalAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalAdminLayout.createSequentialGroup()
                .addGroup(panelPrincipalAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalAdminLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelBienvenidoAdministrador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBienvenidoAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(labelFecha)
                        .addGap(18, 18, 18)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPrincipalAdminLayout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(labelManuPrincipal))
                    .addGroup(panelPrincipalAdminLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(botonUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(botonProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(botonTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(botonVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
>>>>>>> b18416fa86e23ddae3f266da5ec4b4738048e8cd
        );
        panelPrincipalAdminLayout.setVerticalGroup(
            panelPrincipalAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelManuPrincipal)
                .addGap(34, 34, 34)
                .addGroup(panelPrincipalAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBienvenidoAdministrador)
                    .addComponent(labelFecha)
                    .addComponent(txtBienvenidoAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
<<<<<<< HEAD
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBventa, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
=======
                .addGroup(panelPrincipalAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelPrincipalAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPrincipalAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
>>>>>>> b18416fa86e23ddae3f266da5ec4b4738048e8cd
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipalAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipalAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonProducto;
    private javax.swing.JButton botonTicket;
    private javax.swing.JButton botonUsuario;
    private javax.swing.JButton botonVenta;
    private javax.swing.JLabel labelBienvenidoAdministrador;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelManuPrincipal;
    private javax.swing.JPanel panelPrincipalAdmin;
    private javax.swing.JTextField txtBienvenidoAdministrador;
    private javax.swing.JTextField txtFecha;
    // End of variables declaration//GEN-END:variables
}
