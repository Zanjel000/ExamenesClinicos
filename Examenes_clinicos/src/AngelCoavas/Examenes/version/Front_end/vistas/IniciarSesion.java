/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AngelCoavas.Examenes.version.Front_end.vistas;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author HP5
 */
public class IniciarSesion extends javax.swing.JFrame {

    /**
     * Creates new form IniciarSesion
     */
    public IniciarSesion() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        TextPrompt txt1 = new TextPrompt("Ingresa el usuario", txtUsuario);
        TextPrompt txt2 = new TextPrompt("Ingresa la contraseña", txtContraseña);
    }
    
     public Connection Conectar() {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/examenes_clinicos","root","");
        } catch (SQLException e) {
            System.err.print(e.toString());
            JOptionPane.showMessageDialog(this, "Ocurrio un error inesperado.\nFavor comunicarse con el administrador.");
        }
        return con;
    }
    
    public void ingresar() {
        Connection con1 = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        String User = txtUsuario.getText();
        String Pass = txtContraseña.getText();
        if (User.equals("") || Pass.equals("")) {
            JOptionPane.showMessageDialog(this, "Uno o mas campos estan vacios. Favor de llenarlos.");
        } else {
            try {
                con1 = Conectar();
                pst = con1.prepareStatement("select usuario, contraseña from login where usuario='" + User
                        + "' and contraseña ='" + Pass + "'");
                rs = pst.executeQuery();
                if (rs.next()) {
                     this.dispose();
                    new home().setVisible(true);
                } else {
                    txtUsuario.setText("");
                    txtContraseña.setText("");
                    JOptionPane.showMessageDialog(this, "Credenciales incorrectas. Vuelve a intentar de nuevo.");
                }
            } catch (SQLException e) {
                System.err.print(e.toString());
                JOptionPane.showMessageDialog(this, "Ocurrio un error inesperado.\nFavor comunicarse con el administrador.");
            }
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        btnRegistrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BIENVENIDO USUARIO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 107, -1, -1));

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 193, -1, -1));

        btnIniciar.setBackground(new java.awt.Color(51, 51, 255));
        btnIniciar.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btnIniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnIniciar.setText("Iniciar Sesion");
        btnIniciar.setOpaque(true);
        btnIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIniciarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIniciarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIniciarMouseExited(evt);
            }
        });
        jPanel1.add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 239, 200, 50));

        txtUsuario.setBackground(new java.awt.Color(153, 153, 255));
        txtUsuario.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(0, 0, 204));
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 283, 42));

        txtContraseña.setBackground(new java.awt.Color(153, 153, 255));
        txtContraseña.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        txtContraseña.setForeground(new java.awt.Color(0, 0, 204));
        txtContraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtContraseña.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 283, 42));

        btnRegistrar.setBackground(new java.awt.Color(51, 51, 255));
        btnRegistrar.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRegistrar.setText("Registrar");
        btnRegistrar.setName(""); // NOI18N
        btnRegistrar.setOpaque(true);
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseExited(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 239, 140, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarMouseClicked
 
            ingresar(); 
        
    }//GEN-LAST:event_btnIniciarMouseClicked

    private void btnRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseClicked
        String User = txtUsuario.getText();
        String Pass = txtContraseña.getText();
        if ( User.equals("") && Pass.equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor llenar todos los campos");
            
        } else {
             try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/examenes_clinicos","root","");
            PreparedStatement pst = con.prepareStatement("insert into login values(?,?,?)");
            
            pst.setString(1, "0");
            pst.setString(2, txtUsuario.getText());
            pst.setString(3, txtContraseña.getText().trim());
            pst.executeUpdate();
            txtUsuario.setText("");
            txtContraseña.setText("");
            JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO");
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "no pudimos conectar con la base de datos" + e.getMessage());
        }
        }
       
    }//GEN-LAST:event_btnRegistrarMouseClicked

    private void btnIniciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarMouseEntered
         btnIniciar.setBackground(new Color(175,0,219));
    }//GEN-LAST:event_btnIniciarMouseEntered

    private void btnIniciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarMouseExited
        btnIniciar.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_btnIniciarMouseExited

    private void btnRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseEntered
        btnRegistrar.setBackground(new Color(175,0,219));
    }//GEN-LAST:event_btnRegistrarMouseEntered

    private void btnRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseExited
        btnRegistrar.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_btnRegistrarMouseExited

    //Colores de efectos
    //51,51,255
    //175,0,219
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IniciarSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnIniciar;
    private javax.swing.JLabel btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
