package dunab;

import javax.swing.JOptionPane;
import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;

public class Registraracontecimientos extends javax.swing.JFrame {

    private boolean modoOscuro = false;
    private final Color colorOriginal = new Color(134, 0, 221);
    private HashMap<String, ArrayList<String>> insigniasPorUsuario = new HashMap<>();

    public Registraracontecimientos() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Volver = new javax.swing.JButton();
        registrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        oscuro = new javax.swing.JButton();
        verInsignias = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(134, 0, 221));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRAR ACONTECIMINETOS ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura de pantalla 2025-05-06 123538.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 386, -1));

        Volver.setBackground(new java.awt.Color(0, 134, 190));
        Volver.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Volver.setForeground(new java.awt.Color(255, 255, 255));
        Volver.setText("VOLVER");
        Volver.setBorder(null);
        Volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VolverMouseClicked(evt);
            }
        });
        jPanel1.add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, 90, 30));

        registrar.setBackground(new java.awt.Color(0, 134, 190));
        registrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        registrar.setForeground(new java.awt.Color(255, 255, 255));
        registrar.setText("REGISTRAR");
        registrar.setBorder(null);
        registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrarMouseClicked(evt);
            }
        });
        jPanel1.add(registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 90, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura de pantalla 2025-05-18 152220.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 350, 320));

        oscuro.setBackground(new java.awt.Color(255, 255, 255));
        oscuro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5064965.png"))); // NOI18N
        oscuro.setBorder(null);
        oscuro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                oscuroMouseClicked(evt);
            }
        });
        jPanel1.add(oscuro, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, 30, 30));

        verInsignias.setBackground(new java.awt.Color(0, 134, 190));
        verInsignias.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        verInsignias.setForeground(new java.awt.Color(255, 255, 255));
        verInsignias.setText("INSIGNIAS");
        verInsignias.setBorder(null);
        verInsignias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verInsigniasMouseClicked(evt);
            }
        });
        jPanel1.add(verInsignias, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, 90, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverMouseClicked
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VolverMouseClicked

    private void registrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarMouseClicked
        String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre:", "Registro de Evento", JOptionPane.PLAIN_MESSAGE);
        String evento = JOptionPane.showInputDialog(null, "Ingrese el nombre del evento que desea registrar:", "Registro de Evento", JOptionPane.PLAIN_MESSAGE);

        if (nombre != null && evento != null && !nombre.trim().isEmpty() && !evento.trim().isEmpty()) {
            String insignia = "🎖 Participante en \"" + evento + "\"";
            if (!insigniasPorUsuario.containsKey(nombre)) {
                insigniasPorUsuario.put(nombre, new ArrayList<>());
            }
            insigniasPorUsuario.get(nombre).add(insignia);

            JOptionPane.showMessageDialog(null,
                    "¡Registro exitoso!\nNombre: " + nombre
                    + "\nEvento: " + evento
                    + "\n\n🏅 Has ganado una nueva insignia:\n" + insignia,
                    "Confirmación",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Registro cancelado o datos incompletos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_registrarMouseClicked

    private void mostrarInsignias(String nombre) {
        if (insigniasPorUsuario.containsKey(nombre)) {
            ArrayList<String> lista = insigniasPorUsuario.get(nombre);
            StringBuilder mensaje = new StringBuilder("Insignias de " + nombre + ":\n\n");
            for (String ins : lista) {
                mensaje.append("- ").append(ins).append("\n");
            }
            JOptionPane.showMessageDialog(null, mensaje.toString(), "Insignias", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Este usuario aún no tiene insignias.", "Insignias", JOptionPane.INFORMATION_MESSAGE);
        }
    }


    private void oscuroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oscuroMouseClicked
        if (!modoOscuro) {
            jPanel1.setBackground(new Color(54, 57, 63));
        } else {
            jPanel1.setBackground(colorOriginal);
        }
        modoOscuro = !modoOscuro;
    }//GEN-LAST:event_oscuroMouseClicked

    private void verInsigniasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verInsigniasMouseClicked
        String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre para ver sus insignias:", "Ver Insignias", JOptionPane.PLAIN_MESSAGE);

        if (nombre != null && !nombre.trim().isEmpty()) {
            if (insigniasPorUsuario.containsKey(nombre)) {
                ArrayList<String> lista = insigniasPorUsuario.get(nombre);
                StringBuilder mensaje = new StringBuilder("Insignias de " + nombre + ":\n\n");
                for (String ins : lista) {
                    mensaje.append("- ").append(ins).append("\n");
                }
                JOptionPane.showMessageDialog(null, mensaje.toString(), "Insignias", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Este usuario aún no tiene insignias.", "Insignias", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nombre inválido o cancelado.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_verInsigniasMouseClicked

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(Registraracontecimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registraracontecimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registraracontecimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registraracontecimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registraracontecimientos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton oscuro;
    private javax.swing.JButton registrar;
    private javax.swing.JButton verInsignias;
    // End of variables declaration//GEN-END:variables
}
