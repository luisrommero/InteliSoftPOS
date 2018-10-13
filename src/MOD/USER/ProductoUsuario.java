package MOD.USER;

public class ProductoUsuario extends javax.swing.JFrame {

    public ProductoUsuario() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelProductoUsuario = new javax.swing.JPanel();
        labelListaDeProductos = new javax.swing.JLabel();
        labelBienvenidoUsuario = new javax.swing.JLabel();
        labelFecha = new javax.swing.JLabel();
        txtBienvenidoUsuario = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        botonSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaListaDeProductos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LISTADO DE PRODUCTOS");
        setBackground(new java.awt.Color(153, 153, 255));
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/MOD/ICONO/intelisoft.png")).getImage());

        panelProductoUsuario.setBackground(new java.awt.Color(153, 153, 255));

        labelListaDeProductos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelListaDeProductos.setText("LISTADO DE PRODUCTOS");

        labelBienvenidoUsuario.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        labelBienvenidoUsuario.setText("BIENVENIDO USUARIO:");

        labelFecha.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        labelFecha.setText("FECHA:");

        txtBienvenidoUsuario.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        txtFecha.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MOD/ICONO/SALIR.png"))); // NOI18N
        botonSalir.setToolTipText("Salir");
        botonSalir.setPreferredSize(new java.awt.Dimension(50, 50));

        tablaListaDeProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaListaDeProductos);

        javax.swing.GroupLayout panelProductoUsuarioLayout = new javax.swing.GroupLayout(panelProductoUsuario);
        panelProductoUsuario.setLayout(panelProductoUsuarioLayout);
        panelProductoUsuarioLayout.setHorizontalGroup(
            panelProductoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductoUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelProductoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProductoUsuarioLayout.createSequentialGroup()
                        .addComponent(labelBienvenidoUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBienvenidoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(labelFecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 265, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProductoUsuarioLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProductoUsuarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelListaDeProductos)
                .addGap(264, 264, 264))
        );
        panelProductoUsuarioLayout.setVerticalGroup(
            panelProductoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductoUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelListaDeProductos)
                .addGap(34, 34, 34)
                .addGroup(panelProductoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBienvenidoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBienvenidoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFecha)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelProductoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelProductoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelBienvenidoUsuario;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelListaDeProductos;
    private javax.swing.JPanel panelProductoUsuario;
    private javax.swing.JTable tablaListaDeProductos;
    private javax.swing.JTextField txtBienvenidoUsuario;
    private javax.swing.JTextField txtFecha;
    // End of variables declaration//GEN-END:variables
}
