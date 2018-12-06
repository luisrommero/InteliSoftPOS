package MOD.INICIO;

import MOD.ADMI.PrincipalAdmin;
import MOD.USER.PrincipalUsuario;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.net.URI;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ClaveAcceso extends javax.swing.JFrame {

    public ClaveAcceso() {
        initComponents();
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int height = pantalla.height;
        int width = pantalla.width;		
        setLocationRelativeTo(null);		
        setVisible(true);
    }
    
    void Login(){
        //Usuarios
        String Usuario="Admin";
        String Contraseña="Admin18";
        
        String Usuario2="Empleado";
        String Contraseña2="Empleado";
        
        
        String Pass = new String(passContraseña.getText());
        
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
            passContraseña.setText(null);
            JOptionPane.showMessageDialog(this, " Usuario / Contraseña \n  Incorrecta");
            
        }
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
        botonAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAyudaActionPerformed(evt);
            }
        });

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
                        .addGroup(panelClaveAccesoLayout.createSequentialGroup()
                            .addComponent(labelContraseña)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(passContraseña)))
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
        );
        panelClaveAccesoLayout.setVerticalGroup(
            panelClaveAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClaveAccesoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelClaveAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelUsuario)
                    .addComponent(labelTitulo))
                .addGap(28, 28, 28)
                .addGroup(panelClaveAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelClaveAccesoLayout.createSequentialGroup()
                        .addGroup(panelClaveAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelContraseña)
                            .addComponent(passContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelClaveAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(labelLogotipo))
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
        Login();
    }//GEN-LAST:event_botonAceptarActionPerformed

    private void botonAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAyudaActionPerformed
        // TODO add your handling code here:
        try{
      
        Desktop.getDesktop().browse(new URI("file:///C:/Users/Manue/Documents/NetBeansProjects/InteliSoftPOS/Manual-De-Usuario.pdf"));
        
        } catch(Exception e){
            System.out.print(e.getMessage());
            } 
    }//GEN-LAST:event_botonAyudaActionPerformed

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
