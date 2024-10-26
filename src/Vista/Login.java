
package Vista;
import com.jtattoo.plaf.luna.LunaLookAndFeel;
import java.awt.BorderLayout;
import static java.awt.event.KeyEvent.VK_ENTER;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


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

        JP1.setBackground(new java.awt.Color(50, 140, 250));
        JP1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JP1.setPreferredSize(new java.awt.Dimension(230, 0));
        JP1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Inicio de sesión:");
        JP1.add(jLabel1);
        jLabel1.setBounds(50, 20, 143, 26);

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario:");
        JP1.add(jLabel2);
        jLabel2.setBounds(20, 80, 60, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña:");
        JP1.add(jLabel3);
        jLabel3.setBounds(20, 140, 120, 20);

        user.setFont(new java.awt.Font("DejaVu Sans Light", 1, 15)); // NOI18N
        user.setToolTipText("Inserte su usuario");
        user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                userKeyReleased(evt);
            }
        });
        JP1.add(user);
        user.setBounds(20, 100, 180, 24);

        pass.setFont(new java.awt.Font("DejaVu Sans Light", 1, 14)); // NOI18N
        pass.setToolTipText("Inserte su contraseña");
        pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passKeyReleased(evt);
            }
        });
        JP1.add(pass);
        pass.setBounds(20, 160, 177, 23);

        look.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ver.png"))); // NOI18N
        look.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lookMouseClicked(evt);
            }
        });
        JP1.add(look);
        look.setBounds(200, 150, 21, 40);

        nolook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ocultar.png"))); // NOI18N
        nolook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nolookMouseClicked(evt);
            }
        });
        JP1.add(nolook);
        nolook.setBounds(200, 160, 20, 20);

        inis.setBackground(new java.awt.Color(50, 140, 250));
        inis.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        inis.setForeground(new java.awt.Color(255, 255, 255));
        inis.setText("Login");
        inis.setToolTipText("Iniciar sesión");
        inis.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        inis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inisActionPerformed(evt);
            }
        });
        JP1.add(inis);
        inis.setBounds(50, 220, 120, 21);

        Muestra.add(JP1);

        JP2.setBackground(new java.awt.Color(245, 245, 245));
        JP2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JP2.setPreferredSize(new java.awt.Dimension(470, 370));
        JP2.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Nimbus Mono PS", 0, 48)); // NOI18N
        jLabel6.setText("¡Bienvenido!");
        JP2.add(jLabel6);
        jLabel6.setBounds(60, 20, 348, 60);

        jSeparator1.setBackground(new java.awt.Color(150, 150, 150));
        jSeparator1.setPreferredSize(new java.awt.Dimension(0, 4));
        JP2.add(jSeparator1);
        jSeparator1.setBounds(-10, 70, 480, 10);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logot.png"))); // NOI18N
        JP2.add(jLabel4);
        jLabel4.setBounds(110, 110, 250, 150);

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
