/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.logica;
        
import javax.swing.JOptionPane;


/**
 *
 * @author eleaz
 */
public class RegisterEmpleado extends javax.swing.JFrame {
public static String id="";
 public static String Ruta="no";
    public static GestionEmpleados ge=new GestionEmpleados();

    public RegisterEmpleado() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        OpenFiles = new javax.swing.JDialog();
        chooser = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        acountIcon = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtApellidoP = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtApellidoM = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnOKID = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtAnio = new javax.swing.JTextField();
        txtMes = new javax.swing.JTextField();
        txtDia = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        comboArea = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        comboEstado = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        txtUbi = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtFechaIngreso = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        comboPuesto = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        txtIDEmpresa = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        comboHoraEntrada = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        comboHoraSalida = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        comboHoraComida = new javax.swing.JComboBox<>();
        jPanel9 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnDescartar = new javax.swing.JButton();

        OpenFiles.setLocation(new java.awt.Point(0, 0));
        OpenFiles.setModal(true);
        OpenFiles.setSize(new java.awt.Dimension(667, 365));

        javax.swing.GroupLayout OpenFilesLayout = new javax.swing.GroupLayout(OpenFiles.getContentPane());
        OpenFiles.getContentPane().setLayout(OpenFilesLayout);
        OpenFilesLayout.setHorizontalGroup(
            OpenFilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OpenFilesLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(chooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        OpenFilesLayout.setVerticalGroup(
            OpenFilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OpenFilesLayout.createSequentialGroup()
                .addComponent(chooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 37, Short.MAX_VALUE))
        );

        OpenFiles.setLocationRelativeTo(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setSize(new java.awt.Dimension(1000, 700));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(140, 162, 192));
        jPanel2.setPreferredSize(new java.awt.Dimension(50, 669));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 669, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.LINE_END);

        jPanel3.setBackground(new java.awt.Color(140, 162, 192));
        jPanel3.setPreferredSize(new java.awt.Dimension(50, 669));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 669, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.LINE_START);

        jPanel4.setBackground(new java.awt.Color(140, 162, 192));
        jPanel4.setPreferredSize(new java.awt.Dimension(943, 45));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 1, -8);
        flowLayout1.setAlignOnBaseline(true);
        jPanel4.setLayout(flowLayout1);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Images/vuel.png"))); // NOI18N
        jLabel3.setText("   ");
        jLabel3.setToolTipText("Volver");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel3);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Images/Hous.png"))); // NOI18N
        jLabel5.setText("        ");
        jLabel5.setToolTipText("Ir al inicio");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel5);

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(230, 230, 230));
        jLabel1.setText("Alta de empleados    ");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel1);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jPanel5.setMinimumSize(new java.awt.Dimension(600, 50));
        jPanel5.setPreferredSize(new java.awt.Dimension(600, 50));
        jPanel5.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel2.setText("Recursos humanos");
        jLabel2.setPreferredSize(new java.awt.Dimension(120, 16));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.insets = new java.awt.Insets(13, 0, 0, 0);
        jPanel5.add(jLabel2, gridBagConstraints);

        acountIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Images/usuarioGrande.png"))); // NOI18N
        acountIcon.setText("Eleazar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 250, 0, 0);
        jPanel5.add(acountIcon, gridBagConstraints);

        jPanel4.add(jPanel5);

        jPanel1.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel10.setBackground(new java.awt.Color(140, 162, 192));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 250, 250), 8));
        jPanel10.setMinimumSize(new java.awt.Dimension(750, 680));
        jPanel10.setPreferredSize(new java.awt.Dimension(750, 680));
        jPanel10.setVerifyInputWhenFocusTarget(false);
        jPanel10.setLayout(new java.awt.GridLayout(0, 1));

        jPanel6.setBackground(new java.awt.Color(140, 162, 192));
        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255)));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel11.setBackground(new java.awt.Color(140, 162, 192));
        jPanel11.setMinimumSize(new java.awt.Dimension(125, 20));
        jPanel11.setPreferredSize(new java.awt.Dimension(981, 20));
        jPanel11.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 2, 0));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Datos personales");
        jPanel11.add(jLabel6);

        jPanel6.add(jPanel11, java.awt.BorderLayout.PAGE_START);

        jPanel12.setBackground(new java.awt.Color(140, 162, 192));
        jPanel12.setLayout(new java.awt.GridLayout(6, 2));

        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("    Nombre:");
        jPanel12.add(jLabel7);

        txtNombre.setToolTipText("Inserte nombre");
        txtNombre.setMinimumSize(new java.awt.Dimension(180, 24));
        txtNombre.setPreferredSize(new java.awt.Dimension(180, 24));
        jPanel12.add(txtNombre);

        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("    Apellido paterno:");
        jPanel12.add(jLabel8);

        txtApellidoP.setToolTipText("Inserte apellido paterno");
        txtApellidoP.setMinimumSize(new java.awt.Dimension(180, 24));
        txtApellidoP.setPreferredSize(new java.awt.Dimension(180, 24));
        jPanel12.add(txtApellidoP);

        jLabel12.setForeground(java.awt.Color.white);
        jLabel12.setText("    Apellido materno:");
        jPanel12.add(jLabel12);

        txtApellidoM.setToolTipText("Inserte  apellido materno");
        txtApellidoM.setMinimumSize(new java.awt.Dimension(180, 24));
        txtApellidoM.setPreferredSize(new java.awt.Dimension(180, 24));
        jPanel12.add(txtApellidoM);

        jLabel9.setForeground(java.awt.Color.white);
        jLabel9.setText("    e-mail");
        jPanel12.add(jLabel9);

        txtEmail.setToolTipText("Inserte apellido paterno");
        txtEmail.setMinimumSize(new java.awt.Dimension(180, 24));
        txtEmail.setPreferredSize(new java.awt.Dimension(180, 24));
        jPanel12.add(txtEmail);

        jLabel14.setForeground(java.awt.Color.white);
        jLabel14.setText("    Telefono:");
        jPanel12.add(jLabel14);

        txtTelefono.setMinimumSize(new java.awt.Dimension(180, 24));
        txtTelefono.setPreferredSize(new java.awt.Dimension(180, 24));
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyReleased(evt);
            }
        });
        jPanel12.add(txtTelefono);

        jPanel6.add(jPanel12, java.awt.BorderLayout.CENTER);

        jPanel13.setBackground(new java.awt.Color(140, 162, 192));
        jPanel13.setPreferredSize(new java.awt.Dimension(669, 20));
        jPanel13.setLayout(new java.awt.GridLayout(1, 7));

        jLabel24.setForeground(java.awt.Color.white);
        jLabel24.setText("  Curp o ID:");
        jPanel13.add(jLabel24);

        txtID.setFont(new java.awt.Font("Liberation Sans", 2, 10)); // NOI18N
        txtID.setToolTipText("Inserte fecha de nacimiento");
        txtID.setMinimumSize(new java.awt.Dimension(70, 24));
        txtID.setPreferredSize(new java.awt.Dimension(70, 24));
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        jPanel13.add(txtID);

        btnOKID.setText("Ok ID");
        btnOKID.setToolTipText("Confirmar ID");
        btnOKID.setFocusPainted(false);
        btnOKID.setMinimumSize(new java.awt.Dimension(42, 24));
        btnOKID.setPreferredSize(new java.awt.Dimension(42, 24));
        btnOKID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKIDActionPerformed(evt);
            }
        });
        jPanel13.add(btnOKID);

        jLabel13.setForeground(java.awt.Color.white);
        jLabel13.setText("  F. Nacimiento");
        jLabel13.setToolTipText("Fecha de nacimiento");
        jPanel13.add(jLabel13);

        txtAnio.setToolTipText("Inserte ID");
        txtAnio.setMinimumSize(new java.awt.Dimension(180, 24));
        txtAnio.setPreferredSize(new java.awt.Dimension(180, 24));
        txtAnio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAnioKeyReleased(evt);
            }
        });
        jPanel13.add(txtAnio);

        txtMes.setToolTipText("Inserte fecha de nacimiento");
        txtMes.setMinimumSize(new java.awt.Dimension(40, 24));
        txtMes.setPreferredSize(new java.awt.Dimension(40, 24));
        jPanel13.add(txtMes);

        txtDia.setToolTipText("Inserte fecha de nacimiento");
        txtDia.setMinimumSize(new java.awt.Dimension(40, 24));
        txtDia.setPreferredSize(new java.awt.Dimension(40, 24));
        jPanel13.add(txtDia);

        jPanel6.add(jPanel13, java.awt.BorderLayout.PAGE_END);

        jPanel10.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(140, 162, 192));
        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255)));
        jPanel7.setPreferredSize(new java.awt.Dimension(727, 102));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel14.setBackground(new java.awt.Color(140, 162, 192));
        jPanel14.setPreferredSize(new java.awt.Dimension(821, 20));
        jPanel14.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jLabel10.setForeground(java.awt.Color.white);
        jLabel10.setText("Información de empresa");
        jPanel14.add(jLabel10);

        jPanel7.add(jPanel14, java.awt.BorderLayout.PAGE_START);

        jPanel15.setBackground(new java.awt.Color(140, 162, 192));
        jPanel15.setPreferredSize(new java.awt.Dimension(821, 130));
        jPanel15.setLayout(new java.awt.GridLayout(6, 2));

        jLabel17.setForeground(java.awt.Color.white);
        jLabel17.setText("    Área:");
        jPanel15.add(jLabel17);

        comboArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir...", "Contabilidad", "Punto de venta", "Administración" }));
        comboArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAreaActionPerformed(evt);
            }
        });
        jPanel15.add(comboArea);

        jLabel11.setForeground(java.awt.Color.white);
        jLabel11.setText("    Estado:");
        jPanel15.add(jLabel11);

        comboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir...", "Aguascalientes", "Baja California", "Baja California Sur", "Campeche", "Chiapas", "Chihuahua", "Ciudad de México", "Coahuila de Zaragoza", "Colima", "Durango", "Guanajuato", "Guerrero", "Hidalgo", "Jalisco", "Estado de México", "Michoacán de Ocampo", "Morelos", "Nayarit", "Nuevo León", "Oaxaca", "Puebla", "Querétaro", "Quintana Roo", "San Luis Potosí", "Sinaloa", "Sonora", "Tabasco", "Tamaulipas", "Tlaxcala", "Veracruz de Ignacio de la Llave", "Yucatán", "Zacatecas" }));
        jPanel15.add(comboEstado);

        jLabel19.setForeground(java.awt.Color.white);
        jLabel19.setText("    Ubicación:");
        jPanel15.add(jLabel19);
        jPanel15.add(txtUbi);

        jLabel16.setForeground(java.awt.Color.white);
        jLabel16.setText("    Fecha de ingreso:");
        jPanel15.add(jLabel16);

        txtFechaIngreso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFechaIngresoKeyReleased(evt);
            }
        });
        jPanel15.add(txtFechaIngreso);

        jLabel18.setForeground(java.awt.Color.white);
        jLabel18.setText("    Puesto:");
        jPanel15.add(jLabel18);

        comboPuesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir...", "Vendedor", "Administrador", "Contador" }));
        comboPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPuestoActionPerformed(evt);
            }
        });
        jPanel15.add(comboPuesto);

        jLabel15.setForeground(java.awt.Color.white);
        jLabel15.setText("    Id de empleado:");
        jPanel15.add(jLabel15);

        txtIDEmpresa.setEditable(false);
        txtIDEmpresa.setEnabled(false);
        txtIDEmpresa.setFocusable(false);
        txtIDEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIDEmpresaKeyReleased(evt);
            }
        });
        jPanel15.add(txtIDEmpresa);

        jPanel7.add(jPanel15, java.awt.BorderLayout.PAGE_END);

        jPanel10.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(140, 162, 192));
        jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255)));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jPanel16.setBackground(new java.awt.Color(140, 162, 192));
        jPanel16.setPreferredSize(new java.awt.Dimension(821, 20));
        jPanel16.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jLabel20.setForeground(java.awt.Color.white);
        jLabel20.setText("Información para el puesto:");
        jPanel16.add(jLabel20);

        jPanel8.add(jPanel16, java.awt.BorderLayout.PAGE_START);

        jPanel17.setBackground(new java.awt.Color(140, 162, 192));
        jPanel17.setLayout(new java.awt.GridLayout(3, 2));

        jLabel21.setForeground(java.awt.Color.white);
        jLabel21.setText("Hora de entrada:");
        jPanel17.add(jLabel21);

        comboHoraEntrada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir...", "6:00:00", "8:00:00", "10:00:00" }));
        comboHoraEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboHoraEntradaActionPerformed(evt);
            }
        });
        jPanel17.add(comboHoraEntrada);

        jLabel22.setForeground(java.awt.Color.white);
        jLabel22.setText("Hora de salida:");
        jPanel17.add(jLabel22);

        comboHoraSalida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir...", "13:00:00", "15:00:00", "17:00:00" }));
        comboHoraSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboHoraSalidaActionPerformed(evt);
            }
        });
        jPanel17.add(comboHoraSalida);

        jLabel23.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Hora de comida:");
        jPanel17.add(jLabel23);

        comboHoraComida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir...", "9:00:00", "11:00:00", "13:00:00" }));
        comboHoraComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboHoraComidaActionPerformed(evt);
            }
        });
        jPanel17.add(comboHoraComida);

        jPanel8.add(jPanel17, java.awt.BorderLayout.CENTER);

        jPanel10.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(140, 162, 192));
        jPanel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255)));
        jPanel9.setMinimumSize(new java.awt.Dimension(0, 50));
        jPanel9.setPreferredSize(new java.awt.Dimension(827, 50));
        jPanel9.setLayout(new java.awt.GridLayout(5, 2, 20, 6));

        btnGuardar.setBackground(new java.awt.Color(100, 250, 100));
        btnGuardar.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(102, 102, 102));
        btnGuardar.setText("Guardar");
        btnGuardar.setToolTipText("Registrar alta de empleado");
        btnGuardar.setFocusPainted(false);
        btnGuardar.setMinimumSize(new java.awt.Dimension(90, 35));
        btnGuardar.setPreferredSize(new java.awt.Dimension(90, 35));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel9.add(btnGuardar);

        btnDescartar.setBackground(new java.awt.Color(150, 80, 80));
        btnDescartar.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        btnDescartar.setForeground(new java.awt.Color(255, 255, 255));
        btnDescartar.setText("Descartar");
        btnDescartar.setToolTipText("Descartar alta de empleado");
        btnDescartar.setFocusPainted(false);
        btnDescartar.setMinimumSize(new java.awt.Dimension(90, 35));
        btnDescartar.setPreferredSize(new java.awt.Dimension(90, 35));
        btnDescartar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescartarActionPerformed(evt);
            }
        });
        jPanel9.add(btnDescartar);

        jPanel10.add(jPanel9);

        jPanel1.add(jPanel10, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        InicioFrame inicio = new InicioFrame();
        inicio.setVisible(true);
        inicio.setSize(this.getSize());
        this.setVisible(false);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        ge.setVisible(true);
        ge.setSize(this.getSize());
        this.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int answ=JOptionPane.showConfirmDialog(this,"¿Estas seguro de salir?","!?",JOptionPane.YES_NO_OPTION);
        if(answ==0){
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void txtTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyReleased

    }//GEN-LAST:event_txtTelefonoKeyReleased

    private void btnOKIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKIDActionPerformed
        String id=txtID.getText();
        if(!id.isEmpty()&&!(id.length()<10)){
              txtIDEmpresa.setText(id);
        }else{
            JOptionPane.showMessageDialog(null, "El id debe tener por lo menos 10 caracteres","Advertencia!!",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnOKIDActionPerformed

    private void txtAnioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnioKeyReleased

    }//GEN-LAST:event_txtAnioKeyReleased

    private void comboAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboAreaActionPerformed

    private void txtFechaIngresoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaIngresoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaIngresoKeyReleased

    private void txtIDEmpresaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDEmpresaKeyReleased

    }//GEN-LAST:event_txtIDEmpresaKeyReleased

    private void comboPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPuestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboPuestoActionPerformed

    private void comboHoraEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboHoraEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboHoraEntradaActionPerformed

    private void comboHoraComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboHoraComidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboHoraComidaActionPerformed

    private void comboHoraSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboHoraSalidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboHoraSalidaActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
          String idocurp=txtIDEmpresa.getText(),  nombre=txtNombre.getText(),
             apellidoP=txtApellidoP.getText(),  apellidoM=txtApellidoM.getText(),
                  fechaN=txtAnio.getText()+"-"+txtMes.getText()+"-"+txtDia.getText(),
                  fechaI=txtFechaIngreso.getText(), estado=(String) comboEstado.getSelectedItem(),
                  telefono=txtTelefono.getText(), mail=txtEmail.getText(),ubi=txtUbi.getText(),
                  horaEntrada=(String) comboHoraEntrada.getSelectedItem(), horaSalida=(String )comboHoraSalida.getSelectedItem(),
                  horaComida=(String) comboHoraComida.getSelectedItem(); 
                int idpuesto=(int) comboPuesto.getSelectedIndex(),  idarea=(int)comboArea.getSelectedIndex();
                logica.insertaE(idocurp, nombre, apellidoP, apellidoM, fechaN, fechaI, estado, telefono, mail, idarea, ubi, horaEntrada, horaSalida, horaComida, idpuesto);
        GestionEmpleados gee= new GestionEmpleados();
        gee.setVisible(true);
        super.setVisible(false);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnDescartarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescartarActionPerformed
        
                GestionEmpleados gee= new GestionEmpleados();
                gee.setVisible(true);
                super.setVisible(false);
    }//GEN-LAST:event_btnDescartarActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        btnOKID.doClick();
    }//GEN-LAST:event_txtIDActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDialog OpenFiles;
    public static javax.swing.JLabel acountIcon;
    private javax.swing.JButton btnDescartar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnOKID;
    public static javax.swing.JFileChooser chooser;
    private javax.swing.JComboBox<String> comboArea;
    private javax.swing.JComboBox<String> comboEstado;
    private javax.swing.JComboBox<String> comboHoraComida;
    private javax.swing.JComboBox<String> comboHoraEntrada;
    private javax.swing.JComboBox<String> comboHoraSalida;
    private javax.swing.JComboBox<String> comboPuesto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextField txtApellidoM;
    private javax.swing.JTextField txtApellidoP;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFechaIngreso;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIDEmpresa;
    private javax.swing.JTextField txtMes;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUbi;
    // End of variables declaration//GEN-END:variables
}
