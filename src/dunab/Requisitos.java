package dunab;

import java.awt.Color;
import javax.swing.JOptionPane;

public class Requisitos extends javax.swing.JFrame {

    private boolean modoOscuro = false;
    private final Color colorOriginal = new Color(134, 0, 221);

    public Requisitos() {
        initComponents();
        this.setLocationRelativeTo(null);

        String input = JOptionPane.showInputDialog(this, "¿En qué semestre estás?");
        try {
            int semestre = Integer.parseInt(input);
            int totalSemestres = 10; 

            if (semestre >= 1 && semestre <= totalSemestres) {
                double progreso = (semestre / (double) totalSemestres) * 100;

                barraProgreso.setValue((int) progreso);
                barraProgreso.setStringPainted(true);

                lblEstado.setText("Has iniciado tu carrera" + String.format("%.2f", progreso) + " %");
            } else {
                JOptionPane.showMessageDialog(this, "Número de semestre inválido.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Debes ingresar un número válido.");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Volver = new javax.swing.JButton();
        barraProgreso = new javax.swing.JProgressBar();
        lblEstado = new javax.swing.JLabel();
        oscuro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(134, 0, 221));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura de pantalla 2025-05-06 105921_1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 70, 500, 280));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("REQUISITOS PARA GRADUAR");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 27, -1, -1));

        Volver.setBackground(new java.awt.Color(0, 134, 190));
        Volver.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Volver.setForeground(new java.awt.Color(255, 255, 255));
        Volver.setText("VOLVER");
        Volver.setAutoscrolls(true);
        Volver.setBorder(null);
        Volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VolverMouseClicked(evt);
            }
        });
        jPanel1.add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 90, 40));

        barraProgreso.setBackground(new java.awt.Color(0, 134, 190));
        barraProgreso.setStringPainted(true);
        jPanel1.add(barraProgreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 330, 40));
        jPanel1.add(lblEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 120, 20));

        oscuro.setBackground(new java.awt.Color(255, 255, 255));
        oscuro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5064965.png"))); // NOI18N
        oscuro.setBorder(null);
        oscuro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                oscuroMouseClicked(evt);
            }
        });
        jPanel1.add(oscuro, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverMouseClicked
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VolverMouseClicked

    private void oscuroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oscuroMouseClicked
        if (!modoOscuro) {
            jPanel1.setBackground(new Color(54, 57, 63));
        } else {
            jPanel1.setBackground(colorOriginal);
        }
        modoOscuro = !modoOscuro;
    }//GEN-LAST:event_oscuroMouseClicked

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
            java.util.logging.Logger.getLogger(Requisitos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Requisitos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Requisitos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Requisitos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Requisitos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Volver;
    private javax.swing.JProgressBar barraProgreso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JButton oscuro;
    // End of variables declaration//GEN-END:variables
}
