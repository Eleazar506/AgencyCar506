
package Vista;

//import Vista.Inicio;
//import static Vista.Login.Muestra;

import java.awt.BorderLayout;
import java.awt.Color;
import static java.awt.event.KeyEvent.VK_ENTER;
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
        group.add(Sbrand);
        group.add(Smodel);
//        
//       this.muestraPanel(ini);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        config = new javax.swing.JDialog();
        jPanel10 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        group = new javax.swing.ButtonGroup();
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
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();

        config.setFocusTraversalPolicyProvider(true);
        config.setModal(true);
        config.setSize(new java.awt.Dimension(245, 550));
        config.getContentPane().setLayout(new java.awt.FlowLayout());

        jPanel10.setBackground(new java.awt.Color(100, 100, 250));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 10));
        jPanel10.setPreferredSize(new java.awt.Dimension(235, 520));
        jPanel10.setLayout(new java.awt.GridLayout(13, 1));

        jButton2.setText("Nueva venta");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 100, 250), 5));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton2);

        jButton3.setText("Administración");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 100, 250), 5));
        jPanel10.add(jButton3);

        jButton4.setText("Terminar dia");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 100, 250), 5));
        jPanel10.add(jButton4);

        jButton5.setText("Reportes de venta");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 100, 250), 5));
        jPanel10.add(jButton5);

        jButton1.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Ensesion.png"))); // NOI18N
        jButton1.setText("Cerrar sesión");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 100, 250), 5));
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1101, 656));
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        Muestra.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(100, 100, 250));
        jPanel2.setPreferredSize(new java.awt.Dimension(990, 80));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 6, 25);
        flowLayout1.setAlignOnBaseline(true);
        jPanel2.setLayout(flowLayout1);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Images/Hous.png"))); // NOI18N
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

        Smodel.setText("Modelo");
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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("|");
        jPanel2.add(jLabel1);

        Sbrand.setText("Marca");
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

        Search.setPreferredSize(new java.awt.Dimension(500, 22));
        Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchKeyReleased(evt);
            }
        });
        jPanel2.add(Search);

        BtnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/zoom.png"))); // NOI18N
        BtnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSearchActionPerformed(evt);
            }
        });
        jPanel2.add(BtnSearch);

        jLabel3.setText("              ");
        jPanel2.add(jLabel3);

        jLabel4.setText("Bienvenido x");
        jPanel2.add(jLabel4);

        Muestra.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(100, 100, 250));
        jPanel3.setPreferredSize(new java.awt.Dimension(180, 446));

        jPanel7.setPreferredSize(new java.awt.Dimension(140, 520));
        jPanel7.setLayout(new javax.swing.BoxLayout(jPanel7, javax.swing.BoxLayout.LINE_AXIS));

        jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel8.setMinimumSize(new java.awt.Dimension(140, 535));
        jPanel8.setPreferredSize(new java.awt.Dimension(140, 565));

        jLabel2.setText("Cantidad: ");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addContainerGap(40, Short.MAX_VALUE))
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

        jPanel5.setBackground(new java.awt.Color(100, 100, 250));
        jPanel5.setPreferredSize(new java.awt.Dimension(180, 446));

        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setPreferredSize(new java.awt.Dimension(140, 535));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 134, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 529, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel6);

        Muestra.add(jPanel5, java.awt.BorderLayout.LINE_END);

        jPanel4.setBackground(new java.awt.Color(100, 100, 250));
        jPanel4.setPreferredSize(new java.awt.Dimension(1101, 50));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1101, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        Muestra.add(jPanel4, java.awt.BorderLayout.PAGE_END);

        jPanel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 721, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 506, Short.MAX_VALUE)
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
        config.setLocation(150, 115);
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//        FormEmpleado nuevoemp = new FormEmpleado();
//        this.muestraPanel(nuevoemp);
//        config.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        logS.muestraPanel(log);
        logS.setVisible(true);
        logS.user.requestFocus();
//        logS.Muestra.setSize(691, 570);
        config.setVisible(false);
        this.setVisible(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        InicioFrame inicio = new InicioFrame();
        this.setVisible(false);
        inicio.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Principal().setVisible(true);
//            }
//        });
//    }

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    public static javax.swing.JLabel tp;
    // End of variables declaration//GEN-END:variables
}