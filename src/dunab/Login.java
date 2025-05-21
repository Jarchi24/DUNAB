package dunab;

import java.awt.Color;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        contraseña = new javax.swing.JPasswordField();
        entrar = new javax.swing.JButton();
        Registrarse = new javax.swing.JButton();
        cambiarcontra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(134, 0, 221));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/city.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 300, 510));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo (1).png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 100, 100));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("INICIAR SESIÓN");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 140, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("USUARIO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 110, -1));

        usuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usuario.setText("Ingrese su usuario");
        usuario.setBorder(null);
        usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usuarioMousePressed(evt);
            }
        });
        jPanel1.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 410, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CONTRASEÑA");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 130, -1));

        contraseña.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        contraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contraseña.setText("********");
        contraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                contraseñaMousePressed(evt);
            }
        });
        jPanel1.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 410, 40));

        entrar.setBackground(new java.awt.Color(0, 134, 190));
        entrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        entrar.setForeground(new java.awt.Color(255, 255, 255));
        entrar.setText("ENTRAR");
        entrar.setBorder(null);
        entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entrarMouseClicked(evt);
            }
        });
        jPanel1.add(entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 120, 30));

        Registrarse.setBackground(new java.awt.Color(0, 134, 190));
        Registrarse.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Registrarse.setForeground(new java.awt.Color(255, 255, 255));
        Registrarse.setText("REGISTRARSE");
        Registrarse.setBorder(null);
        Registrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrarseMouseClicked(evt);
            }
        });
        jPanel1.add(Registrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 440, 120, 30));

        cambiarcontra.setBackground(new java.awt.Color(0, 134, 190));
        cambiarcontra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cambiarcontra.setForeground(new java.awt.Color(255, 255, 255));
        cambiarcontra.setText("CAMBIAR CONTRASEÑA");
        cambiarcontra.setBorder(null);
        cambiarcontra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cambiarcontraMouseClicked(evt);
            }
        });
        jPanel1.add(cambiarcontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, 180, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioMousePressed
        if (usuario.getText().equals("Ingrese su usuario")) {
            usuario.setText("");
            usuario.setForeground(Color.gray);
        }
        if (String.valueOf(contraseña.getPassword()).isEmpty()) {
            contraseña.setText("********");
            contraseña.setForeground(Color.black);
        }
    }//GEN-LAST:event_usuarioMousePressed

    private void contraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contraseñaMousePressed
        if (String.valueOf(contraseña.getPassword()).equals("********")) {
            contraseña.setText("");
            contraseña.setForeground(Color.black);
        }
        if (usuario.getText().isEmpty()) {
            usuario.setText("Ingrese su usuario");
            usuario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_contraseñaMousePressed

    private void entrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarMouseClicked
        String user = usuario.getText();
        String pass = String.valueOf(contraseña.getPassword());

        try (Connection conn = Conexion.getConexion()) {
            String sql = "SELECT * FROM usuarios WHERE usuario = ? AND contraseña = ?";
            java.sql.PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, pass);
            java.sql.ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Bienvenido, " + rs.getString("nombre"));
                Menu menu = new Menu();
                menu.setVisible(true);
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos.");
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error al conectar: " + e.getMessage());
        }
        //javax.swing.JOptionPane.showMessageDialog(this, "Intento de login con los datos:\nUsuario: "+usuario.getText()+"\nContraseña: "+ String.valueOf(contraseña.getPassword()),"LOGIN",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
    }//GEN-LAST:event_entrarMouseClicked

    private void RegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarseMouseClicked
        Registro registro = new Registro();
        registro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RegistrarseMouseClicked

    private void cambiarcontraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cambiarcontraMouseClicked
        String user = JOptionPane.showInputDialog(this, "Ingrese su nombre de usuario:");
        if (user == null || user.trim().isEmpty()) {
            return;
        }

        String newPass = JOptionPane.showInputDialog(this, "Ingrese su nueva contraseña:");
        if (newPass == null || newPass.trim().isEmpty()) {
            return;
        }

        try (Connection conn = Conexion.getConexion()) {
            // Verificamos si el usuario existe
            String checkSql = "SELECT * FROM usuarios WHERE usuario = ?";
            java.sql.PreparedStatement checkPs = conn.prepareStatement(checkSql);
            checkPs.setString(1, user);
            java.sql.ResultSet rs = checkPs.executeQuery();

            if (rs.next()) {
                // Usuario válido, actualizamos contraseña
                String updateSql = "UPDATE usuarios SET contraseña = ? WHERE usuario = ?";
                java.sql.PreparedStatement updatePs = conn.prepareStatement(updateSql);
                updatePs.setString(1, newPass);
                updatePs.setString(2, user);
                updatePs.executeUpdate();

                JOptionPane.showMessageDialog(this, "Contraseña actualizada con éxito.");
            } else {
                JOptionPane.showMessageDialog(this, "El usuario no existe.");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al conectar: " + e.getMessage());
        }
    }//GEN-LAST:event_cambiarcontraMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Registrarse;
    private javax.swing.JButton cambiarcontra;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JButton entrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
