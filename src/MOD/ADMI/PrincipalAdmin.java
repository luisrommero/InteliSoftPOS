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
                .addGroup(panelPrincipalAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelPrincipalAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPrincipalAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
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
