package dunab;

import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Registro extends javax.swing.JFrame {

    public Registro() {
        initComponents();
         this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        contraseña = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        Registrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(134, 0, 221));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/city.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 300, 510));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/favicon.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 50, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("REGISTRO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 90, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("USUARIO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 110, -1));

        usuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        usuario.setForeground(new java.awt.Color(204, 204, 204));
        usuario.setText("Ingrese su usuario");
        usuario.setBorder(null);
        usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usuarioMousePressed(evt);
            }
        });
        jPanel1.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 410, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CONTRASEÑA");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 130, -1));

        contraseña.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        contraseña.setForeground(new java.awt.Color(204, 204, 204));
        contraseña.setText("********");
        contraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                contraseñaMousePressed(evt);
            }
        });
        jPanel1.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 410, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("NOMBRE DEL USUARIO");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 210, -1));

        nombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nombre.setForeground(new java.awt.Color(204, 204, 204));
        nombre.setText("Ingrese su nombre ");
        nombre.setBorder(null);
        nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nombreMousePressed(evt);
            }
        });
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 410, 40));

        Registrar.setBackground(new java.awt.Color(0, 134, 190));
        Registrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Registrar.setForeground(new java.awt.Color(255, 255, 255));
        Registrar.setText("REGISTRAR");
        Registrar.setBorder(null);
        Registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrarMouseClicked(evt);
            }
        });
        jPanel1.add(Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 90, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limpiarCampoSiCoincide(JTextField campo, String textoPorDefecto) {
    if (campo.getText().trim().equals(textoPorDefecto)) {
        campo.setText("");
        campo.setForeground(Color.black);
        }
    }
    private void restaurarCampoSiVacio(JTextField campo, String textoPorDefecto) {
    if (campo.getText().isEmpty()) {
        campo.setText(textoPorDefecto);
        campo.setForeground(Color.gray);
        }
    }
    private void limpiarPasswordSiCoincide(JPasswordField campo, String textoPorDefecto) {
    if (new String(campo.getPassword()).equals(textoPorDefecto)) {
        campo.setText("");
        campo.setForeground(Color.black);
        }
    }
    private void restaurarPasswordSiVacio(JPasswordField campo, String textoPorDefecto) {
    if (new String(campo.getPassword()).isEmpty()) {
        campo.setText(textoPorDefecto);
        campo.setForeground(Color.gray);
        }
    }
    private void usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioMousePressed
    limpiarCampoSiCoincide(usuario, "Ingrese su usuario");
    restaurarPasswordSiVacio(contraseña, "********");
    restaurarCampoSiVacio(nombre, "Ingrese su nombre");
    }//GEN-LAST:event_usuarioMousePressed

    private void contraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contraseñaMousePressed
    limpiarPasswordSiCoincide(contraseña, "********");
    restaurarCampoSiVacio(usuario, "Ingrese su usuario");
    restaurarCampoSiVacio(nombre, "Ingrese su nombre");    
    }//GEN-LAST:event_contraseñaMousePressed

    private void nombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreMousePressed
    limpiarCampoSiCoincide(nombre, "Ingrese su nombre");
    restaurarPasswordSiVacio(contraseña, "********");
    restaurarCampoSiVacio(usuario, "Ingrese su usuario");    
        
    }//GEN-LAST:event_nombreMousePressed

    private void RegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarMouseClicked
            String nom = nombre.getText();
    String user = usuario.getText();
    String pass = String.valueOf(contraseña.getPassword());

    try (Connection conn = Conexion.getConexion()) {
        if (conn != null) {
            String sql = "INSERT INTO usuarios (nombre, usuario, contraseña) VALUES (?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nom);
            ps.setString(2, user);
            ps.setString(3, pass);
            ps.executeUpdate();
            javax.swing.JOptionPane.showMessageDialog(this, "Registro exitoso.");
            this.dispose();
            new Login().setVisible(true);
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "No se pudo establecer la conexión.");
        }
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Error al registrar: " + e.getMessage());
    }
        javax.swing.JOptionPane.showMessageDialog(this, "Registro de datos exitosos :\nNombre: "+nombre.getText()+"\nUsuario: "+usuario.getText()+"\nContraseña: "+ String.valueOf(contraseña.getPassword()),"REGISTRO",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
        Login login = new Login();
        login.setVisible(true);
       
       
    }//GEN-LAST:event_RegistrarMouseClicked
    
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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Registrar;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
