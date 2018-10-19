package MOD.USER;

public class Ticket extends javax.swing.JFrame {

    public Ticket() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTicket = new javax.swing.JPanel();
        labelTicket = new javax.swing.JLabel();
        labelIdTicket = new javax.swing.JLabel();
        labelFechaHora = new javax.swing.JLabel();
        labelTotalSinIva = new javax.swing.JLabel();
        labelIva = new javax.swing.JLabel();
        labelFactura = new javax.swing.JLabel();
        txtIdTicket = new javax.swing.JTextField();
        txtFechaHora = new javax.swing.JTextField();
        txtTotalSinIva = new javax.swing.JTextField();
        txtIva = new javax.swing.JTextField();
        txtFactura = new javax.swing.JTextField();
        botonAgregar = new javax.swing.JButton();
        botonEditar = new javax.swing.JButton();
        botonBuscar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        botonAceptar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTicket = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TICKET");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/MOD/ICONO/intelisoft.png")).getImage());

        panelTicket.setBackground(new java.awt.Color(153, 153, 255));

        labelTicket.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelTicket.setText("TICKET");

        labelIdTicket.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        labelIdTicket.setText("ID TICKET: ");

        labelFechaHora.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        labelFechaHora.setText("FECHA Y HORA: ");

        labelTotalSinIva.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        labelTotalSinIva.setText("TOTAL SIN IVA");

        labelIva.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        labelIva.setText("IVA %: ");

        labelFactura.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        labelFactura.setText("FACTURA: ");

        txtIdTicket.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtIdTicket.setForeground(new java.awt.Color(204, 255, 255));

        txtFechaHora.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        txtTotalSinIva.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        txtIva.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        txtFactura.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        botonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MOD/ICONO/AGREGAR.png"))); // NOI18N
        botonAgregar.setToolTipText("Agregar");

        botonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MOD/ICONO/EDITAR.png"))); // NOI18N
        botonEditar.setToolTipText("Editar");

        botonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MOD/ICONO/BUSCAR.png"))); // NOI18N
        botonBuscar.setToolTipText("Buscar");

        botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MOD/ICONO/ELIMINAR.png"))); // NOI18N
        botonEliminar.setToolTipText("Eliminar");

        botonAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MOD/ICONO/ACEPTAR.png"))); // NOI18N
        botonAceptar.setToolTipText("Aceptar");

        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MOD/ICONO/SALIR.png"))); // NOI18N
        botonSalir.setToolTipText("Salir");

        tablaTicket.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaTicket);

        javax.swing.GroupLayout panelTicketLayout = new javax.swing.GroupLayout(panelTicket);
        panelTicket.setLayout(panelTicketLayout);
        panelTicketLayout.setHorizontalGroup(
            panelTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTicketLayout.createSequentialGroup()
                .addGroup(panelTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTicketLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelTicketLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelTicketLayout.createSequentialGroup()
                                .addGroup(panelTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelFechaHora)
                                    .addComponent(labelTotalSinIva)
                                    .addComponent(labelIdTicket)
                                    .addComponent(labelIva)
                                    .addComponent(labelFactura))
                                .addGap(18, 18, 18)
                                .addGroup(panelTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelTicketLayout.createSequentialGroup()
                                        .addGroup(panelTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtIdTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(panelTicketLayout.createSequentialGroup()
                                        .addGroup(panelTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtFechaHora, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTotalSinIva, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtIva, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                        .addComponent(botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(botonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(botonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap())
            .addGroup(panelTicketLayout.createSequentialGroup()
                .addGap(353, 353, 353)
                .addComponent(labelTicket)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTicketLayout.setVerticalGroup(
            panelTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTicketLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTicket)
                .addGap(37, 37, 37)
                .addGroup(panelTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelIdTicket))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTicketLayout.createSequentialGroup()
                        .addGroup(panelTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFechaHora, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelFechaHora))
                        .addGap(16, 16, 16)
                        .addGroup(panelTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTotalSinIva)
                            .addComponent(txtTotalSinIva, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIva, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelIva)))
                    .addGroup(panelTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(botonAceptar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(botonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFactura))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTicket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTicket, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonEditar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelFactura;
    private javax.swing.JLabel labelFechaHora;
    private javax.swing.JLabel labelIdTicket;
    private javax.swing.JLabel labelIva;
    private javax.swing.JLabel labelTicket;
    private javax.swing.JLabel labelTotalSinIva;
    private javax.swing.JPanel panelTicket;
    private javax.swing.JTable tablaTicket;
    private javax.swing.JTextField txtFactura;
    private javax.swing.JTextField txtFechaHora;
    private javax.swing.JTextField txtIdTicket;
    private javax.swing.JTextField txtIva;
    private javax.swing.JTextField txtTotalSinIva;
    // End of variables declaration//GEN-END:variables
}
