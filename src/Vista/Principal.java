
package Vista;

//import Vista.Inicio;
//import static Vista.Login.Muestra;

import java.awt.BorderLayout;
import java.awt.Color;
import static java.awt.event.KeyEvent.VK_ENTER;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
// * @author eleaz
 */
public class Principal extends javax.swing.JFrame {
public static Login logS=new Login();

//public static FormEmpleado nuevoemp = new FormEmpleado();
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        
//        this.setLocationRelativeTo(null);
        group.add(Sbrand);
        group.add(Smodel);
        config.setModal(true);
        Smodel.doClick();
        
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

        group = new javax.swing.ButtonGroup();
        config = new javax.swing.JDialog();
        jPanel10 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        venta = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        Muestra = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        tp = new javax.swing.JLabel();
        Smodel = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        Sbrand = new javax.swing.JToggleButton();
        Search = new javax.swing.JTextField();
        BtnSearch = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();

        config.setModal(true);
        config.setSize(new java.awt.Dimension(240, 160));
        config.getContentPane().setLayout(new javax.swing.OverlayLayout(config.getContentPane()));

        jPanel10.setBackground(new java.awt.Color(50, 140, 250));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 10));
        jPanel10.setMinimumSize(new java.awt.Dimension(146, 4));
        jPanel10.setPreferredSize(new java.awt.Dimension(235, 130));
        jPanel10.setLayout(new java.awt.GridLayout(0, 1));

        jButton3.setFont(new java.awt.Font("Liberation Serif", 1, 14)); // NOI18N
        jButton3.setText("Administración");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 140, 250), 5));
        jPanel10.add(jButton3);

        jButton4.setFont(new java.awt.Font("Liberation Serif", 1, 14)); // NOI18N
        jButton4.setText("Terminar dia");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 140, 250), 5));
        jPanel10.add(jButton4);

        jButton1.setFont(new java.awt.Font("Liberation Serif", 1, 14)); // NOI18N
        jButton1.setText("Cerrar sesión");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 140, 250), 5));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton1.setMinimumSize(new java.awt.Dimension(126, 20));
        jButton1.setPreferredSize(new java.awt.Dimension(126, 25));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton1);

        config.getContentPane().add(jPanel10);

        venta.setSize(new java.awt.Dimension(450, 350));
        venta.getContentPane().setLayout(new javax.swing.OverlayLayout(venta.getContentPane()));

        jPanel1.setBackground(new java.awt.Color(50, 140, 250));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 7));

        jLabel6.setText("Formulario de venta");

        jLabel7.setText("Nombre:");

        jLabel8.setText("Telefono:");

        jLabel9.setText("Correo:");

        jLabel10.setText("Por definir");

        jLabel11.setText("IDauto:");

        jLabel12.setText("Datos de cliente");

        jLabel13.setText("Datos de auto");

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(100, 250, 100));
        jButton6.setForeground(new java.awt.Color(153, 153, 153));
        jButton6.setText("Realizar venta");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(250, 80, 80));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Cancelar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                        .addGap(71, 71, 71)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextField3)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addGap(14, 14, 14))
        );

        venta.getContentPane().add(jPanel1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setSize(new java.awt.Dimension(900, 656));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        Muestra.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(113, 161, 166));
        jPanel2.setPreferredSize(new java.awt.Dimension(990, 80));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 6, 25);
        flowLayout1.setAlignOnBaseline(true);
        jPanel2.setLayout(flowLayout1);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("                    ");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel5);

        tp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/TresPWhiteN.png"))); // NOI18N
        tp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tpMouseExited(evt);
            }
        });
        jPanel2.add(tp);

        Smodel.setFont(new java.awt.Font("Liberation Serif", 1, 14)); // NOI18N
        Smodel.setText("Modelo");
        Smodel.setToolTipText("Buscar por modelo");
        Smodel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SmodelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SmodelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SmodelMouseExited(evt);
            }
        });
        Smodel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SmodelActionPerformed(evt);
            }
        });
        jPanel2.add(Smodel);

        jLabel1.setText("|");
        jPanel2.add(jLabel1);

        Sbrand.setFont(new java.awt.Font("Liberation Serif", 1, 14)); // NOI18N
        Sbrand.setText("Marca");
        Sbrand.setToolTipText("Buscar por marca");
        Sbrand.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SbrandMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SbrandMouseExited(evt);
            }
        });
        Sbrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SbrandActionPerformed(evt);
            }
        });
        jPanel2.add(Sbrand);

        Search.setFont(new java.awt.Font("Liberation Serif", 1, 14)); // NOI18N
        Search.setPreferredSize(new java.awt.Dimension(500, 22));
        Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchKeyReleased(evt);
            }
        });
        jPanel2.add(Search);

        BtnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Images/zoom.png"))); // NOI18N
        BtnSearch.setToolTipText("Buscar");
        BtnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSearchActionPerformed(evt);
            }
        });
        jPanel2.add(BtnSearch);

        jLabel3.setText("              ");
        jPanel2.add(jLabel3);

        Muestra.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(113, 161, 166));
        jPanel3.setPreferredSize(new java.awt.Dimension(180, 446));

        jPanel7.setPreferredSize(new java.awt.Dimension(140, 520));
        jPanel7.setLayout(new javax.swing.BoxLayout(jPanel7, javax.swing.BoxLayout.LINE_AXIS));

        jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel8.setMinimumSize(new java.awt.Dimension(140, 535));
        jPanel8.setPreferredSize(new java.awt.Dimension(140, 565));

        jLabel2.setText("empresa");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(507, Short.MAX_VALUE))
        );

        jPanel7.add(jPanel8);

        jPanel3.add(jPanel7);

        Muestra.add(jPanel3, java.awt.BorderLayout.LINE_START);

        jPanel5.setBackground(new java.awt.Color(113, 161, 166));
        jPanel5.setPreferredSize(new java.awt.Dimension(180, 446));

        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setPreferredSize(new java.awt.Dimension(140, 535));

        jLabel4.setText("Auto");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel4)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addContainerGap(484, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel6);

        Muestra.add(jPanel5, java.awt.BorderLayout.LINE_END);

        jPanel4.setBackground(new java.awt.Color(113, 161, 166));
        jPanel4.setPreferredSize(new java.awt.Dimension(1101, 50));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        jButton2.setText("OK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 590, 0, 0);
        jPanel4.add(jButton2, gridBagConstraints);

        jButton5.setText("Vender");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel4.add(jButton5, gridBagConstraints);

        Muestra.add(jPanel4, java.awt.BorderLayout.PAGE_END);

        jPanel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 735, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        Muestra.add(jPanel9, java.awt.BorderLayout.CENTER);

        getContentPane().add(Muestra);

        pack();
    }// </editor-fold>//GEN-END:initComponents
public static void muestraPanel(JPanel p){
        Muestra.removeAll();
        Muestra.add(p,BorderLayout.CENTER);
        Muestra.revalidate();
        Muestra.repaint();
    
}
    private void tpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tpMouseClicked
        config.setAlwaysOnTop(true); // Siempre encima
        config.setSize(300, 200);
        config.setLocationRelativeTo(null); // Centrar el diálogo
        config.setVisible(true);

    }//GEN-LAST:event_tpMouseClicked

    private void tpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tpMouseEntered
        tp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/TresPBlack.png")));
    }//GEN-LAST:event_tpMouseEntered

    private void tpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tpMouseExited
        tp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/TresPWhiteN.png")));
    }//GEN-LAST:event_tpMouseExited

    private void SmodelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SmodelMouseClicked

    }//GEN-LAST:event_SmodelMouseClicked

    private void SmodelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SmodelMouseEntered
        Smodel.setForeground(Color.blue);
    }//GEN-LAST:event_SmodelMouseEntered

    private void SmodelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SmodelMouseExited
        Smodel.setForeground(Color.black);
    }//GEN-LAST:event_SmodelMouseExited

    private void SmodelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SmodelActionPerformed
        Search.requestFocus();
    }//GEN-LAST:event_SmodelActionPerformed

    private void SbrandMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SbrandMouseEntered
        Sbrand.setForeground(Color.blue);
    }//GEN-LAST:event_SbrandMouseEntered

    private void SbrandMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SbrandMouseExited
        Sbrand.setForeground(Color.black);
    }//GEN-LAST:event_SbrandMouseExited

    private void SbrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SbrandActionPerformed
        Search.requestFocus();
    }//GEN-LAST:event_SbrandActionPerformed

    private void SearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchKeyReleased
        char key=evt.getKeyChar();
        String sea=Search.getText();

        if(!sea.isEmpty()){
            if(key==VK_ENTER){
                BtnSearch.doClick();

                //            Search.setText("");
            }
        }
    }//GEN-LAST:event_SearchKeyReleased

    private void BtnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSearchActionPerformed
        String Searched=Search.getText();
        Search.setText("");
        Search.requestFocus();
    }//GEN-LAST:event_BtnSearchActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        venta.setAlwaysOnTop(true); // Siempre encima
//        venta.setSize(300, 200);
        venta.setLocationRelativeTo(null); // Centrar el diálogo
        venta.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int answ=JOptionPane.showConfirmDialog(this,"¿Estas seguro de salir?","!?",JOptionPane.YES_NO_OPTION);
        if(answ==0){
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        venta.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        venta.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        InicioFrame inicio = new InicioFrame();
        inicio.setVisible(true);
        inicio.setSize(this.getSize());
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        InicioFrame inicio = new InicioFrame();
        inicio.setVisible(true);
        inicio.setSize(this.getSize());
        this.setVisible(false);

    }//GEN-LAST:event_jLabel5MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Login log=new Login();
        log.setVisible(true);
        config.setVisible(false);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton BtnSearch;
    public static javax.swing.JPanel Muestra;
    private javax.swing.JToggleButton Sbrand;
    public static javax.swing.JTextField Search;
    private javax.swing.JToggleButton Smodel;
    public static javax.swing.JDialog config;
    public static javax.swing.ButtonGroup group;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    public static javax.swing.JLabel tp;
    private javax.swing.JDialog venta;
    // End of variables declaration//GEN-END:variables
}
