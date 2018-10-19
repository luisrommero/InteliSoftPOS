package MOD.USER;

public class PrincipalUsuario extends javax.swing.JFrame {

    public PrincipalUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipalUsuario = new javax.swing.JPanel();
        labelMenuPrincipal = new javax.swing.JLabel();
        labelBienvenidoUsuario = new javax.swing.JLabel();
        labelFecha = new javax.swing.JLabel();
        txtBienvenidoUsuario = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        botonProducto = new javax.swing.JButton();
        botonTicket = new javax.swing.JButton();
        botonVenta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
<<<<<<< HEAD

        jPanel1.setBackground(new java.awt.Color(155, 155, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("MENÚ PRINCIPAL");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setText("BIENVENIDO USUARIO:");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setText("FECHA:");

        jButton1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MOD/ICONO/PRODUCTOS.png"))); // NOI18N
        jButton1.setText("PRODUCTOS");

        jButton2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MOD/ICONO/TICKET.png"))); // NOI18N
        jButton2.setText("TICKET");

        jButton3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MOD/ICONO/VENTA.png"))); // NOI18N
        jButton3.setText("VENTA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(63, 63, 63)
                                .addComponent(jButton2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton3))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(85, Short.MAX_VALUE))
=======
        setTitle("MENU PRINCIPAL");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/MOD/ICONO/intelisoft.png")).getImage());

        panelPrincipalUsuario.setBackground(new java.awt.Color(155, 155, 255));

        labelMenuPrincipal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelMenuPrincipal.setText("MENÚ PRINCIPAL");

        labelBienvenidoUsuario.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        labelBienvenidoUsuario.setText("BIENVENIDO USUARIO:");

        labelFecha.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        labelFecha.setText("FECHA:");

        txtBienvenidoUsuario.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        txtFecha.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        botonProducto.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        botonProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MOD/ICONO/PRODUCTOS.png"))); // NOI18N
        botonProducto.setToolTipText("Productos");

        botonTicket.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        botonTicket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MOD/ICONO/TICKET.png"))); // NOI18N
        botonTicket.setToolTipText("Ticket");

        botonVenta.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        botonVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MOD/ICONO/VENTA.png"))); // NOI18N
        botonVenta.setToolTipText("Venta");

        javax.swing.GroupLayout panelPrincipalUsuarioLayout = new javax.swing.GroupLayout(panelPrincipalUsuario);
        panelPrincipalUsuario.setLayout(panelPrincipalUsuarioLayout);
        panelPrincipalUsuarioLayout.setHorizontalGroup(
            panelPrincipalUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalUsuarioLayout.createSequentialGroup()
                .addGroup(panelPrincipalUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panelPrincipalUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelPrincipalUsuarioLayout.createSequentialGroup()
                            .addGap(211, 211, 211)
                            .addComponent(labelMenuPrincipal))
                        .addGroup(panelPrincipalUsuarioLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(labelBienvenidoUsuario)
                            .addGap(18, 18, 18)
                            .addComponent(txtBienvenidoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(67, 67, 67)
                            .addComponent(labelFecha)
                            .addGap(18, 18, 18)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelPrincipalUsuarioLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(botonVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPrincipalUsuarioLayout.setVerticalGroup(
            panelPrincipalUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelMenuPrincipal)
                .addGap(31, 31, 31)
                .addGroup(panelPrincipalUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBienvenidoUsuario)
                    .addComponent(labelFecha)
                    .addComponent(txtBienvenidoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(panelPrincipalUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelPrincipalUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(botonProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonTicket, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
>>>>>>> b18416fa86e23ddae3f266da5ec4b4738048e8cd
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipalUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipalUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonProducto;
    private javax.swing.JButton botonTicket;
    private javax.swing.JButton botonVenta;
    private javax.swing.JLabel labelBienvenidoUsuario;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelMenuPrincipal;
    private javax.swing.JPanel panelPrincipalUsuario;
    private javax.swing.JTextField txtBienvenidoUsuario;
    private javax.swing.JTextField txtFecha;
    // End of variables declaration//GEN-END:variables
}
