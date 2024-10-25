
package Vista;


public class Inventario extends javax.swing.JFrame {

    /**
     * Creates new form Inventario
     */
    public Inventario() {
        initComponents();
        this.setLocationRelativeTo(null);
       panel1.setVisible(false);
       grupo2.add(Sname);
       grupo2.add(Smodel);
       grupo2.add(Sserie);
       Sname.doClick();

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        grupo2 = new javax.swing.ButtonGroup();
        updateV = new javax.swing.JDialog();
        jLabel13 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        panButtons = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        modifica = new javax.swing.JButton();
        elimina = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        panel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Pan2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Sname = new javax.swing.JToggleButton();
        Smodel = new javax.swing.JToggleButton();
        Sserie = new javax.swing.JToggleButton();
        Search2 = new javax.swing.JTextField();
        Searching2 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        updateV.setSize(new java.awt.Dimension(1000, 110));
        updateV.getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel13.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        jLabel13.setText("Nombre");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 8, 20, 9);
        updateV.getContentPane().add(jLabel13, gridBagConstraints);

        jTextField10.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        jTextField10.setPreferredSize(new java.awt.Dimension(110, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 4.0;
        updateV.getContentPane().add(jTextField10, gridBagConstraints);

        jLabel14.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        jLabel14.setText("Modelo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 8, 20, 9);
        updateV.getContentPane().add(jLabel14, gridBagConstraints);

        jTextField11.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        jTextField11.setPreferredSize(new java.awt.Dimension(110, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 4.0;
        updateV.getContentPane().add(jTextField11, gridBagConstraints);

        jLabel15.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        jLabel15.setText("Marca");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 8, 20, 9);
        updateV.getContentPane().add(jLabel15, gridBagConstraints);

        jTextField12.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        jTextField12.setPreferredSize(new java.awt.Dimension(110, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 4.0;
        updateV.getContentPane().add(jTextField12, gridBagConstraints);

        jLabel16.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        jLabel16.setText("Precio");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 8, 20, 9);
        updateV.getContentPane().add(jLabel16, gridBagConstraints);

        jTextField13.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        jTextField13.setPreferredSize(new java.awt.Dimension(110, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 4.0;
        updateV.getContentPane().add(jTextField13, gridBagConstraints);

        jLabel17.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        jLabel17.setText("No. serie");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 8, 20, 9);
        updateV.getContentPane().add(jLabel17, gridBagConstraints);

        jTextField14.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        jTextField14.setPreferredSize(new java.awt.Dimension(110, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 4.0;
        updateV.getContentPane().add(jTextField14, gridBagConstraints);

        jLabel18.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        jLabel18.setText("Tipo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 8, 20, 9);
        updateV.getContentPane().add(jLabel18, gridBagConstraints);

        jTextField15.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        jTextField15.setPreferredSize(new java.awt.Dimension(110, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 4.0;
        updateV.getContentPane().add(jTextField15, gridBagConstraints);

        jLabel19.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        jLabel19.setText("Descripción");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 8, 20, 9);
        updateV.getContentPane().add(jLabel19, gridBagConstraints);

        jTextField16.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        jTextField16.setPreferredSize(new java.awt.Dimension(110, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 4.0;
        updateV.getContentPane().add(jTextField16, gridBagConstraints);

        jLabel20.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        jLabel20.setText("Cantidad");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 13;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        updateV.getContentPane().add(jLabel20, gridBagConstraints);

        jTextField17.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        jTextField17.setPreferredSize(new java.awt.Dimension(110, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 4.0;
        updateV.getContentPane().add(jTextField17, gridBagConstraints);

        jTextField18.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        jTextField18.setPreferredSize(new java.awt.Dimension(110, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 13;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 4.0;
        updateV.getContentPane().add(jTextField18, gridBagConstraints);

        jButton5.setBackground(new java.awt.Color(100, 250, 100));
        jButton5.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        jButton5.setText("Actualizar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        updateV.getContentPane().add(jButton5, gridBagConstraints);

        jButton3.setBackground(new java.awt.Color(250, 80, 80));
        jButton3.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        jButton3.setText("Cancelar  ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 1;
        updateV.getContentPane().add(jButton3, gridBagConstraints);

        updateV.setModal(true);
        updateV.setLocationRelativeTo(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1180, 600));
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(50, 140, 250));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Images/Hous.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2);

        jLabel1.setText("  ");
        jPanel2.add(jLabel1);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        jPanel6.setMinimumSize(new java.awt.Dimension(700, 60));
        jPanel6.setPreferredSize(new java.awt.Dimension(700, 60));
        jPanel6.setLayout(new java.awt.GridBagLayout());

        jLabel3.setText("Inventario");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 200);
        jPanel6.add(jLabel3, gridBagConstraints);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Images/usuarioGrande.png"))); // NOI18N
        jLabel4.setText("Eleazar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 100, 0, 0);
        jPanel6.add(jLabel4, gridBagConstraints);

        jPanel2.add(jPanel6);

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(50, 140, 250));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setMinimumSize(new java.awt.Dimension(106, 16));
        jPanel3.setPreferredSize(new java.awt.Dimension(200, 556));

        panButtons.setBackground(new java.awt.Color(255, 255, 255));
        panButtons.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        panButtons.setPreferredSize(new java.awt.Dimension(190, 150));
        panButtons.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 10));

        jButton1.setBackground(new java.awt.Color(50, 140, 250));
        jButton1.setFont(new java.awt.Font("DejaVu Serif Condensed", 0, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Images/add.png"))); // NOI18N
        jButton1.setText("Nuevo vehiculo");
        jButton1.setPreferredSize(new java.awt.Dimension(185, 35));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panButtons.add(jButton1);

        modifica.setBackground(new java.awt.Color(50, 140, 250));
        modifica.setFont(new java.awt.Font("DejaVu Serif Condensed", 0, 15)); // NOI18N
        modifica.setForeground(new java.awt.Color(255, 255, 255));
        modifica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Images/note_edit.png"))); // NOI18N
        modifica.setText("Actualizar vehiculo");
        modifica.setPreferredSize(new java.awt.Dimension(185, 35));
        modifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificaActionPerformed(evt);
            }
        });
        panButtons.add(modifica);

        elimina.setBackground(new java.awt.Color(50, 140, 250));
        elimina.setFont(new java.awt.Font("DejaVu Serif Condensed", 0, 15)); // NOI18N
        elimina.setForeground(new java.awt.Color(255, 255, 255));
        elimina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Images/delete.png"))); // NOI18N
        elimina.setText("Eliminar vehiculo");
        elimina.setPreferredSize(new java.awt.Dimension(185, 35));
        panButtons.add(elimina);

        jPanel3.add(panButtons);

        jPanel1.add(jPanel3, java.awt.BorderLayout.LINE_START);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.Y_AXIS));

        panel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        panel1.setPreferredSize(new java.awt.Dimension(920, 70));
        panel1.setLayout(new java.awt.GridBagLayout());

        jLabel5.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        jLabel5.setText("Nombre");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 8, 20, 9);
        panel1.add(jLabel5, gridBagConstraints);

        jTextField1.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        jTextField1.setPreferredSize(new java.awt.Dimension(110, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 4.0;
        panel1.add(jTextField1, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        jLabel6.setText("Modelo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 8, 20, 9);
        panel1.add(jLabel6, gridBagConstraints);

        jTextField2.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        jTextField2.setPreferredSize(new java.awt.Dimension(110, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 4.0;
        panel1.add(jTextField2, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        jLabel7.setText("Marca");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 8, 20, 9);
        panel1.add(jLabel7, gridBagConstraints);

        jTextField3.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        jTextField3.setPreferredSize(new java.awt.Dimension(110, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 4.0;
        panel1.add(jTextField3, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        jLabel8.setText("Precio");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 8, 20, 9);
        panel1.add(jLabel8, gridBagConstraints);

        jTextField4.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        jTextField4.setPreferredSize(new java.awt.Dimension(110, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 4.0;
        panel1.add(jTextField4, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        jLabel9.setText("No. serie");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 8, 20, 9);
        panel1.add(jLabel9, gridBagConstraints);

        jTextField5.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        jTextField5.setPreferredSize(new java.awt.Dimension(110, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 4.0;
        panel1.add(jTextField5, gridBagConstraints);

        jLabel10.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        jLabel10.setText("Tipo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 8, 20, 9);
        panel1.add(jLabel10, gridBagConstraints);

        jTextField6.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        jTextField6.setPreferredSize(new java.awt.Dimension(110, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 4.0;
        panel1.add(jTextField6, gridBagConstraints);

        jLabel11.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        jLabel11.setText("Descripción");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 8, 20, 9);
        panel1.add(jLabel11, gridBagConstraints);

        jTextField7.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        jTextField7.setPreferredSize(new java.awt.Dimension(110, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 4.0;
        panel1.add(jTextField7, gridBagConstraints);

        jLabel12.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        jLabel12.setText("Cantidad");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 13;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        panel1.add(jLabel12, gridBagConstraints);

        jTextField8.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        jTextField8.setPreferredSize(new java.awt.Dimension(110, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 4.0;
        panel1.add(jTextField8, gridBagConstraints);

        jTextField9.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        jTextField9.setPreferredSize(new java.awt.Dimension(110, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 13;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 4.0;
        panel1.add(jTextField9, gridBagConstraints);

        jButton4.setBackground(new java.awt.Color(100, 250, 100));
        jButton4.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        jButton4.setText("Registrar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        panel1.add(jButton4, gridBagConstraints);

        jButton2.setBackground(new java.awt.Color(250, 80, 80));
        jButton2.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 1;
        panel1.add(jButton2, gridBagConstraints);

        jPanel5.add(panel1);

        Pan2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Pan2.setLayout(new java.awt.BorderLayout());

        jPanel4.setPreferredSize(new java.awt.Dimension(964, 60));

        Sname.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        Sname.setText("Nombre");
        jPanel4.add(Sname);

        Smodel.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        Smodel.setText("Modelo");
        jPanel4.add(Smodel);

        Sserie.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        Sserie.setText("No. serie");
        jPanel4.add(Sserie);

        Search2.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        Search2.setPreferredSize(new java.awt.Dimension(600, 24));
        jPanel4.add(Search2);

        Searching2.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        Searching2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Images/zoom.png"))); // NOI18N
        jPanel4.add(Searching2);

        Pan2.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel8.setLayout(new javax.swing.OverlayLayout(jPanel8));

        jTable1.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Modelo", "Marca", "Precio", "No.serie", "Tipo", "Descripción", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
            jTable1.getColumnModel().getColumn(7).setResizable(false);
        }

        jPanel8.add(jScrollPane1);

        Pan2.add(jPanel8, java.awt.BorderLayout.CENTER);

        jPanel5.add(Pan2);

        jPanel1.add(jPanel5, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       InicioFrame inicio = new InicioFrame();
       inicio.setVisible(true);
       inicio.setSize(this.getSize());
        this.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        panel1.setVisible(true);
        modifica.setVisible(false);
        elimina.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       panel1.setVisible(false);
       modifica.setVisible(true);
       elimina.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        panel1.setVisible(false);
       modifica.setVisible(true);
       elimina.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        updateV.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        updateV.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void modificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificaActionPerformed
        updateV.setVisible(true);
        
    }//GEN-LAST:event_modificaActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel Pan2;
    public static javax.swing.JTextField Search2;
    public static javax.swing.JButton Searching2;
    public static javax.swing.JToggleButton Smodel;
    public static javax.swing.JToggleButton Sname;
    public static javax.swing.JToggleButton Sserie;
    private javax.swing.JButton elimina;
    public static javax.swing.ButtonGroup grupo2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JButton modifica;
    public static javax.swing.JPanel panButtons;
    public static javax.swing.JPanel panel1;
    public static javax.swing.JDialog updateV;
    // End of variables declaration//GEN-END:variables
}
