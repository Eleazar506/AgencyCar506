
package Vista;


import com.jtattoo.plaf.acryl.AcrylLookAndFeel;
import com.jtattoo.plaf.aero.AeroLookAndFeel;
import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;
import com.jtattoo.plaf.bernstein.BernsteinLookAndFeel;
import com.jtattoo.plaf.fast.FastLookAndFeel;
import com.jtattoo.plaf.graphite.GraphiteLookAndFeel;
import com.jtattoo.plaf.hifi.HiFiLookAndFeel;
import com.jtattoo.plaf.luna.LunaLookAndFeel;
import com.jtattoo.plaf.mcwin.McWinLookAndFeel;
import com.jtattoo.plaf.mint.MintLookAndFeel;
import com.jtattoo.plaf.noire.NoireLookAndFeel;
import com.jtattoo.plaf.smart.SmartLookAndFeel;
import com.jtattoo.plaf.texture.TextureLookAndFeel;
import java.awt.BorderLayout;
import static java.awt.event.KeyEvent.VK_ENTER;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class Login extends javax.swing.JFrame {



    public Login() {
        initComponents();
        pass.setEchoChar('*');
        this.setLocationRelativeTo(null);
        nolook.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Muestra = new javax.swing.JPanel();
        JP1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        look = new javax.swing.JLabel();
        nolook = new javax.swing.JLabel();
        inis = new javax.swing.JButton();
        JP2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(670, 370));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        Muestra.setBackground(new java.awt.Color(150, 180, 255));
        Muestra.setLayout(new javax.swing.BoxLayout(Muestra, javax.swing.BoxLayout.LINE_AXIS));

        JP1.setBackground(new java.awt.Color(100, 100, 250));
        JP1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JP1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Inicio de sesión:");
        JP1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario:");
        JP1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 60, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña:");
        JP1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 80, -1));

        user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                userKeyReleased(evt);
            }
        });
        JP1.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 180, -1));

        pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passKeyReleased(evt);
            }
        });
        JP1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 177, -1));

        look.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ver.png"))); // NOI18N
        look.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lookMouseClicked(evt);
            }
        });
        JP1.add(look, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 21, 40));

        nolook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ocultar.png"))); // NOI18N
        nolook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nolookMouseClicked(evt);
            }
        });
        JP1.add(nolook, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 20, 20));

        inis.setBackground(new java.awt.Color(10, 10, 250));
        inis.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        inis.setForeground(new java.awt.Color(255, 255, 255));
        inis.setText("Login");
        inis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inisActionPerformed(evt);
            }
        });
        JP1.add(inis, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 120, -1));

        Muestra.add(JP1);

        JP2.setBackground(new java.awt.Color(200, 200, 200));
        JP2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JP2.setPreferredSize(new java.awt.Dimension(470, 370));
        JP2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("¡Bienvenido!");
        JP2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(150, 150, 150));
        jSeparator1.setPreferredSize(new java.awt.Dimension(0, 4));
        JP2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 70, 480, 10));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logot.png"))); // NOI18N
        JP2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 250, 150));

        Muestra.add(JP2);

        getContentPane().add(Muestra);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void inisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inisActionPerformed
//        Principal principal = new Principal();
        InicioFrame inif = new InicioFrame();
//SwingUtilities.invokeLater(new Runnable(){
//public void run(){
//    InicioFrame inif=new InicioFrame();
    inif.setVisible(true);
//}
//});
//        principal.setVisible(true);
    this.setVisible(false);

    }//GEN-LAST:event_inisActionPerformed

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
//        prin.tp.setVisible(true);
    }//GEN-LAST:event_formComponentResized

    private void lookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lookMouseClicked
        look.setVisible(false);
        nolook.setVisible(true);
        pass.setEchoChar((char)0);
       
    }//GEN-LAST:event_lookMouseClicked

    private void nolookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nolookMouseClicked
        nolook.setVisible(false);
        look.setVisible(true);
        pass.setEchoChar('*');
    }//GEN-LAST:event_nolookMouseClicked

    private void userKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userKeyReleased
        char keypress=evt.getKeyChar();
        
        if(keypress==VK_ENTER){
            pass.requestFocus();
        }
    }//GEN-LAST:event_userKeyReleased

    private void passKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passKeyReleased
        char key=evt.getKeyChar();
        if(key==VK_ENTER){
            inis.doClick();
        }
    }//GEN-LAST:event_passKeyReleased
public static void muestraPanel(JPanel p){
        Muestra.removeAll();
        Muestra.add(p,BorderLayout.CENTER);
        Muestra.revalidate();
        Muestra.repaint();
    
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
         try {
                    UIManager.setLookAndFeel(new LunaLookAndFeel()); // linea para cambiar LookAndFeel
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel JP1;
    public static javax.swing.JPanel JP2;
    public static javax.swing.JPanel Muestra;
    private javax.swing.JButton inis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel look;
    private javax.swing.JLabel nolook;
    private javax.swing.JPasswordField pass;
    public static javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
