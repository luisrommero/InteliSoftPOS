package MOD.ADMI;


import API.SIST.BaseDeDatos;
import API.SIST.ConstantesDeBaseDeDatos;
import API.SIST.Utilities;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.net.URI;
import java.net.URL;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import net.sf.jasperreports.engine.JasperCompileManager;


public class Reportes extends javax.swing.JFrame {

    public Reportes() {
        initComponents();
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int height = pantalla.height;
        int width = pantalla.width;		
        setLocationRelativeTo(null);		
        setVisible(true);
    }
    
    BaseDeDatos bd = new BaseDeDatos();
    
    String Fecha1, Fecha2, Clasi, Clasi2, Titulo;
    
    //Reporte General
    void validar1(){
        if(jRadioResumen.isSelected()){
            Clasificacion2.clearSelection();
            jRadioDia.setEnabled(false);
            jRadioMes.setEnabled(false);
            jRadioSemana.setEnabled(false);
            
            txtDia2.setEnabled(false);
            txtMes2.setEnabled(false);
            txtAño2.setEnabled(false);
            txtDia.setEnabled(false);
            txtMes.setEnabled(false);
            txtAño.setEnabled(false);
            txtClasific.setEnabled(false);
        }
    }
    
    //ReportePerson
    void validar2(){
        if(jRadioPerson.isSelected()){
            Clasificacion2.clearSelection();
            jRadioDia.setEnabled(false);
            jRadioMes.setEnabled(false);
            jRadioSemana.setEnabled(false);
            
            txtDia2.setEnabled(true);
            txtMes2.setEnabled(true);
            txtAño2.setEnabled(true);
            txtDia.setEnabled(true);
            txtMes.setEnabled(true);
            txtAño.setEnabled(true);
            txtClasific.setEnabled(true);
        }
    }
    
    
    //ReporteClasificacion
    void validar3(){
        if(jRadioVentas.isSelected()){
            Clasificacion2.clearSelection();
            jRadioDia.setEnabled(true);
            jRadioMes.setEnabled(true);
            jRadioSemana.setEnabled(true);
            
            txtDia2.setEnabled(false);
            txtMes2.setEnabled(false);
            txtAño2.setEnabled(false);
            txtDia.setEnabled(false);
            txtMes.setEnabled(false);
            txtAño.setEnabled(false);
            txtClasific.setEnabled(false);
        }
    }
    
    
    void validarDia(){
        if(jRadioDia.isSelected()){
            txtDia2.setEnabled(false);
            txtMes2.setEnabled(false);
            txtAño2.setEnabled(false);
            txtDia.setEnabled(true);
            txtMes.setEnabled(true);
            txtAño.setEnabled(true);
            txtClasific.setEnabled(true);
        }
    }
    
    
    void validarSemana(){
        if(jRadioSemana.isSelected()){
            txtDia2.setEnabled(true);
            txtMes2.setEnabled(false);
            txtAño2.setEnabled(false);
            txtDia.setEnabled(true);
            txtMes.setEnabled(true);
            txtAño.setEnabled(true);
            txtClasific.setEnabled(true);
        }
    }
    
    void validarMes(){
        if(jRadioMes.isSelected()){
            txtDia2.setEnabled(false);
            txtMes2.setEnabled(false);
            txtAño2.setEnabled(false);
            txtDia.setEnabled(false);
            txtMes.setEnabled(true);
            txtAño.setEnabled(true);
            txtClasific.setEnabled(true);
        }
    }
    
    void GenerarReporte(){
        
        
        if(jRadioResumen.isSelected()){
            Fecha1 = "2018-01-01 00:00:00";
            Fecha2 = "2019-12-01 23:59:59";
            Clasi = "Ropa";
            Clasi2 = "Accesorios";
            Titulo = "General";
            Clasificacion2.clearSelection();
            Reporte();
        }
        if(jRadioDia.isSelected()){
            ClasificacionRopa();
            Fecha1 = txtAño.getSelectedItem() + "-" + txtMes.getSelectedItem() + "-" + txtDia.getSelectedItem() + " 00:00:00";
            Fecha2 = txtAño.getSelectedItem() + "-" + txtMes.getSelectedItem() + "-" + txtDia.getSelectedItem() + " 23:59:59";
            Titulo = "Por Dia";
            Reporte();
            //txtClave.setText(Fecha1);
        }
        if(jRadioSemana.isSelected()){
            ClasificacionRopa();
            Fecha1 = txtAño.getSelectedItem() + "-" + txtMes.getSelectedItem() + "-" + txtDia.getSelectedItem() + " 00:00:00";
            Fecha2 = txtAño.getSelectedItem() + "-" + txtMes.getSelectedItem() + "-" + txtDia2.getSelectedItem() + " 23:59:59";
            Titulo = "Por Semana";
            Reporte();
            //txtClave.setText(Fecha1);
        }
        if(jRadioMes.isSelected()){
            ClasificacionRopa();
            Fecha1 = txtAño.getSelectedItem() + "-" + txtMes.getSelectedItem() + "-" + "01" + " 00:00:00";
            Fecha2 = txtAño.getSelectedItem() + "-" + txtMes.getSelectedItem() + "-" + "31" + " 23:59:59";
            Titulo = "Por Mes";
            Reporte();
            //txtClave.setText(Fecha1);
        }
        if(jRadioPerson.isSelected()){
            ClasificacionRopa();
            Fecha1 = txtAño.getSelectedItem() + "-" + txtMes.getSelectedItem() + "-" + txtDia.getSelectedItem() + " 00:00:00";
            Fecha2 = txtAño2.getSelectedItem() + "-" + txtMes2.getSelectedItem() + "-" + txtDia2.getSelectedItem() + " 23:59:59";
            Titulo = "Personalizado";
            Reporte();
            //txtClave.setText(Fecha1);
        }
        
        
    }
    
    
    
    void Reporte(){
        bd.Conectar();
        
        JasperReport reporte;
       
        //String tel = txtTelefono.getText();
        
         try {
            URL  in = this.getClass().getResource("ReporteVentas.jasper");
            reporte = (JasperReport) JRLoader.loadObject(in);
            Map parametro = new HashMap();
            parametro.put("FechaIni", Fecha1);
            parametro.put("FechaFin", Fecha2);
            parametro.put("Clasi", Clasi);
            parametro.put("Clasi2", Clasi2);
            parametro.put("Titulo", Titulo);
            
            //parametro.put("TELEFONO", tel);
            
            JasperPrint j = JasperFillManager.fillReport(reporte, parametro, bd.ConexionActual);
            
            JasperViewer jv = new JasperViewer(j, false);
            
            jv.setTitle("Generar Reporte");
            jv.setVisible(true);
            
          
        } catch (JRException ex) {
            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex); 
            ex.printStackTrace();
        }
        
    }
    
    
    void ClasificacionRopa(){
        if(txtClasific.getSelectedItem()== "Ropa"){
            Clasi = "Ropa";
            Clasi2 =  null;
        }
        if(txtClasific.getSelectedItem()== "Accesorios"){
            Clasi = "Accesorios";
            Clasi2 = null;
        }
        if(txtClasific.getSelectedItem()== "Todos"){
            Clasi = "Ropa";
            Clasi2 = "Accesorios";
        }
    }
    
    

//    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Clasificacion1 = new javax.swing.ButtonGroup();
        Clasificacion2 = new javax.swing.ButtonGroup();
        panelReportes = new javax.swing.JPanel();
        panelReportes2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        botonAceptarReporte = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtClasific = new javax.swing.JComboBox<>();
        txtDia = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jRadioResumen = new javax.swing.JRadioButton();
        jRadioVentas = new javax.swing.JRadioButton();
        jRadioDia = new javax.swing.JRadioButton();
        jRadioSemana = new javax.swing.JRadioButton();
        jRadioMes = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jRadioPerson = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        txtMes = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        txtAño = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtDia2 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        txtMes2 = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        txtAño2 = new javax.swing.JComboBox<>();
        botonCancelar = new javax.swing.JButton();
        botonAyuda = new javax.swing.JButton();
        label1 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reportes");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/MOD/ICONO/intelisoft.png")).getImage());

        panelReportes.setBackground(new java.awt.Color(153, 153, 255));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Realizar reporte");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setText("Usuario");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setText("Clave de acceso");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setText("Cierre de  operaciones del dia");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setText("Fecha:");

        botonAceptarReporte.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botonAceptarReporte.setForeground(new java.awt.Color(0, 153, 51));
        botonAceptarReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MOD/ICONO/ACEPTAR.png"))); // NOI18N
        botonAceptarReporte.setToolTipText("Aceptar");
        botonAceptarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarReporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4))
                    .addComponent(jLabel1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel5)))
                .addContainerGap(138, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonAceptarReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonAceptarReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        jPanel4.setPreferredSize(new java.awt.Dimension(415, 332));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 204));
        jLabel6.setText("Reportes:");
        jPanel4.add(jLabel6);

        txtClasific.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtClasific.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona...", "Accesorios", "Ropa", "Todos" }));
        txtClasific.setEnabled(false);
        jPanel4.add(txtClasific);

        txtDia.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        txtDia.setEnabled(false);
        jPanel4.add(txtDia);

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Dia");
        jPanel4.add(jLabel7);

        Clasificacion1.add(jRadioResumen);
        jRadioResumen.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jRadioResumen.setText("Resumen de ventas");
        jRadioResumen.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioResumenStateChanged(evt);
            }
        });
        jRadioResumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioResumenActionPerformed(evt);
            }
        });
        jPanel4.add(jRadioResumen);

        Clasificacion1.add(jRadioVentas);
        jRadioVentas.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jRadioVentas.setText("Ventas por:");
        jRadioVentas.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioVentasStateChanged(evt);
            }
        });
        jRadioVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioVentasActionPerformed(evt);
            }
        });
        jPanel4.add(jRadioVentas);

        Clasificacion2.add(jRadioDia);
        jRadioDia.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jRadioDia.setText("Dia");
        jRadioDia.setEnabled(false);
        jRadioDia.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioDiaStateChanged(evt);
            }
        });
        jRadioDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioDiaActionPerformed(evt);
            }
        });
        jPanel4.add(jRadioDia);

        Clasificacion2.add(jRadioSemana);
        jRadioSemana.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jRadioSemana.setText("Semana");
        jRadioSemana.setEnabled(false);
        jRadioSemana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioSemanaActionPerformed(evt);
            }
        });
        jPanel4.add(jRadioSemana);

        Clasificacion2.add(jRadioMes);
        jRadioMes.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jRadioMes.setText("Mes");
        jRadioMes.setEnabled(false);
        jRadioMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioMesActionPerformed(evt);
            }
        });
        jPanel4.add(jRadioMes);

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Fecha Inicio");
        jLabel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.add(jLabel10);

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Fecha Cierre");
        jLabel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.add(jLabel11);

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Clasificacion");
        jLabel15.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.add(jLabel15);

        Clasificacion1.add(jRadioPerson);
        jRadioPerson.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jRadioPerson.setText("Personalizada");
        jRadioPerson.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioPersonStateChanged(evt);
            }
        });
        jRadioPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioPersonActionPerformed(evt);
            }
        });
        jPanel4.add(jRadioPerson);

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Mes");
        jPanel4.add(jLabel9);

        txtMes.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        txtMes.setEnabled(false);
        jPanel4.add(txtMes);

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Año");
        jPanel4.add(jLabel14);

        txtAño.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtAño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "2018", "2019", "2020", "2021", "2022" }));
        txtAño.setEnabled(false);
        jPanel4.add(txtAño);

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Dia");
        jPanel4.add(jLabel8);

        txtDia2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtDia2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        txtDia2.setEnabled(false);
        jPanel4.add(txtDia2);

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Mes");
        jPanel4.add(jLabel13);

        txtMes2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtMes2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        txtMes2.setEnabled(false);
        jPanel4.add(txtMes2);

        jLabel18.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Año");
        jPanel4.add(jLabel18);

        txtAño2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtAño2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "2018", "2019", "2020", "2021", "2022" }));
        txtAño2.setEnabled(false);
        txtAño2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAño2ActionPerformed(evt);
            }
        });
        jPanel4.add(txtAño2);

        botonCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botonCancelar.setForeground(new java.awt.Color(153, 0, 0));
        botonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MOD/ICONO/CANCELAR.png"))); // NOI18N
        botonCancelar.setToolTipText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        botonAyuda.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botonAyuda.setForeground(new java.awt.Color(0, 102, 102));
        botonAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MOD/ICONO/AYUDA.png"))); // NOI18N
        botonAyuda.setToolTipText("Ayuda");
        botonAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAyudaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelReportes2Layout = new javax.swing.GroupLayout(panelReportes2);
        panelReportes2.setLayout(panelReportes2Layout);
        panelReportes2Layout.setHorizontalGroup(
            panelReportes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReportes2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelReportes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelReportes2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelReportes2Layout.createSequentialGroup()
                        .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelReportes2Layout.setVerticalGroup(
            panelReportes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReportes2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelReportes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(panelReportes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        label1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        label1.setText("CROTE DE CAJA");

        javax.swing.GroupLayout panelReportesLayout = new javax.swing.GroupLayout(panelReportes);
        panelReportes.setLayout(panelReportesLayout);
        panelReportesLayout.setHorizontalGroup(
            panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReportesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelReportes2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelReportesLayout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelReportesLayout.setVerticalGroup(
            panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReportesLayout.createSequentialGroup()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelReportes2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelReportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelReportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        // TODO add your handling code here:
        PrincipalAdmin pa = new PrincipalAdmin();
        pa.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAyudaActionPerformed
        // TODO add your handling code here:
        try{
      
        Desktop.getDesktop().browse(new URI("file:///C:/Users/alexd/OneDrive/Documents/NetBeansProjects/InteliSoftPOS/Manual-De-Usuario.pdf"));
        
        } catch(Exception e){
            System.out.print(e.getMessage());
            }
    }//GEN-LAST:event_botonAyudaActionPerformed

    private void jRadioPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioPersonActionPerformed
        // TODO add your handling code here:
        validar2();
    }//GEN-LAST:event_jRadioPersonActionPerformed

    private void jRadioResumenStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioResumenStateChanged
       
    }//GEN-LAST:event_jRadioResumenStateChanged

    private void jRadioPersonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioPersonStateChanged
      
    }//GEN-LAST:event_jRadioPersonStateChanged

    private void jRadioVentasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioVentasStateChanged
        
    }//GEN-LAST:event_jRadioVentasStateChanged

    private void txtAño2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAño2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAño2ActionPerformed

    private void jRadioDiaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioDiaStateChanged
        
    }//GEN-LAST:event_jRadioDiaStateChanged

    private void jRadioResumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioResumenActionPerformed
        //
        validar1();
    }//GEN-LAST:event_jRadioResumenActionPerformed

    private void jRadioVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioVentasActionPerformed
        // TODO add your handling code here:
        validar3();
    }//GEN-LAST:event_jRadioVentasActionPerformed

    private void jRadioDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioDiaActionPerformed
        //ValidarDia
        validarDia();
    }//GEN-LAST:event_jRadioDiaActionPerformed

    private void jRadioSemanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioSemanaActionPerformed
        // TODO add your handling code here:
        validarSemana();
    }//GEN-LAST:event_jRadioSemanaActionPerformed

    private void jRadioMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioMesActionPerformed
        // TODO add your handling code here:
        validarMes();
    }//GEN-LAST:event_jRadioMesActionPerformed

    private void botonAceptarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarReporteActionPerformed
        GenerarReporte();
    }//GEN-LAST:event_botonAceptarReporteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Clasificacion1;
    private javax.swing.ButtonGroup Clasificacion2;
    private javax.swing.JButton botonAceptarReporte;
    private javax.swing.JButton botonAyuda;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioDia;
    private javax.swing.JRadioButton jRadioMes;
    private javax.swing.JRadioButton jRadioPerson;
    private javax.swing.JRadioButton jRadioResumen;
    private javax.swing.JRadioButton jRadioSemana;
    private javax.swing.JRadioButton jRadioVentas;
    private java.awt.Label label1;
    private javax.swing.JPanel panelReportes;
    private javax.swing.JPanel panelReportes2;
    private javax.swing.JComboBox<String> txtAño;
    private javax.swing.JComboBox<String> txtAño2;
    private javax.swing.JComboBox<String> txtClasific;
    private javax.swing.JComboBox<String> txtDia;
    private javax.swing.JComboBox<String> txtDia2;
    private javax.swing.JComboBox<String> txtMes;
    private javax.swing.JComboBox<String> txtMes2;
    // End of variables declaration//GEN-END:variables
}
