package MOD.USER;

import API.SIST.Utilities;
import MOD.USER.ProductoUsuario;
import MOD.USER.TICKET1;
import java.awt.Dimension;
import java.awt.Toolkit;

public class PrincipalUsuario extends javax.swing.JFrame {

    public PrincipalUsuario() {
        initComponents();
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int height = pantalla.height;
        int width = pantalla.width;		
        setLocationRelativeTo(null);		
        setVisible(true);
        Utilities utilities = new Utilities();
        jtxtFecha.setText(utilities.GetFecha());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMenuPrincipal = new javax.swing.JPanel();
        labelMenuPrincipal = new javax.swing.JLabel();
        labelBienvenidoUsuario = new javax.swing.JLabel();
        labelFecha = new javax.swing.JLabel();
        jtxtFecha = new javax.swing.JTextField();
        botonProducto = new javax.swing.JButton();
        botonTicket = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/MOD/ICONO/intelisoft.png")).getImage());

        panelMenuPrincipal.setBackground(new java.awt.Color(155, 155, 255));

        labelMenuPrincipal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelMenuPrincipal.setText("MENÚ PRINCIPAL");

        labelBienvenidoUsuario.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        labelBienvenidoUsuario.setText("BIENVENIDO USUARIO");

        labelFecha.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        labelFecha.setText("FECHA:");

        jtxtFecha.setBackground(new java.awt.Color(155, 155, 255));
        jtxtFecha.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        botonProducto.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        botonProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MOD/ICONO/PRODUCTOS.png"))); // NOI18N
        botonProducto.setToolTipText("Productos");
        botonProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonProductoActionPerformed(evt);
            }
        });

        botonTicket.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        botonTicket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MOD/ICONO/TICKET.png"))); // NOI18N
        botonTicket.setToolTipText("Ticket");
        botonTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTicketActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMenuPrincipalLayout = new javax.swing.GroupLayout(panelMenuPrincipal);
        panelMenuPrincipal.setLayout(panelMenuPrincipalLayout);
        panelMenuPrincipalLayout.setHorizontalGroup(
            panelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuPrincipalLayout.createSequentialGroup()
                .addGroup(panelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenuPrincipalLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(panelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelBienvenidoUsuario)
                            .addGroup(panelMenuPrincipalLayout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(botonProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(botonTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelMenuPrincipalLayout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(labelFecha)
                                .addGap(18, 18, 18)
                                .addComponent(jtxtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelMenuPrincipalLayout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(labelMenuPrincipal)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        panelMenuPrincipalLayout.setVerticalGroup(
            panelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuPrincipalLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(labelMenuPrincipal)
                .addGap(33, 33, 33)
                .addComponent(labelBienvenidoUsuario)
                .addGap(18, 18, 18)
                .addGroup(panelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFecha)
                    .addComponent(jtxtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(panelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonProducto)
                    .addComponent(botonTicket))
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonProductoActionPerformed
        ProductoUsuario pu = new ProductoUsuario();
            pu.setVisible(true);
            dispose();
    }//GEN-LAST:event_botonProductoActionPerformed

    private void botonTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTicketActionPerformed
        // TODO add your handling code here:
        TICKET1 ti = new TICKET1("1");
        ti.setVisible(true);
            dispose();
    }//GEN-LAST:event_botonTicketActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonProducto;
    private javax.swing.JButton botonTicket;
    private javax.swing.JTextField jtxtFecha;
    private javax.swing.JLabel labelBienvenidoUsuario;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelMenuPrincipal;
    private javax.swing.JPanel panelMenuPrincipal;
    // End of variables declaration//GEN-END:variables
}
