package dunab;

import javax.swing.JOptionPane;
import java.awt.Color;

public class Bolsillo extends javax.swing.JFrame {

    private boolean modoOscuro = false;
    private final Color colorOriginal = new Color(134, 0, 221);
    private double disponible = 1000;
    private double bolsillo = 0;

    public Bolsillo() {
        initComponents();
        actualizarLabels();
        this.setLocationRelativeTo(null);
    }

    private void actualizarLabels() {
        lblDisponible.setText(String.format("%.2f", disponible));
        lblBolsillo.setText(String.format("%.2f", bolsillo));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblDisponible = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblBolsillo = new javax.swing.JLabel();
        recarbolsillo = new javax.swing.JButton();
        retibolsillo = new javax.swing.JButton();
        Volver = new javax.swing.JButton();
        oscuro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(134, 0, 221));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MONEDERO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 33, 237, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("      Bolsillo:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 217, 108, 30));

        lblDisponible.setBackground(new java.awt.Color(255, 255, 255));
        lblDisponible.setForeground(new java.awt.Color(255, 255, 255));
        lblDisponible.setText("0");
        jPanel1.add(lblDisponible, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 145, 90, 20));
        lblDisponible.getAccessibleContext().setAccessibleName("");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Disponible:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 137, 108, 30));

        lblBolsillo.setBackground(new java.awt.Color(255, 255, 255));
        lblBolsillo.setForeground(new java.awt.Color(255, 255, 255));
        lblBolsillo.setText("0");
        jPanel1.add(lblBolsillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 227, 90, -1));

        recarbolsillo.setBackground(new java.awt.Color(0, 134, 190));
        recarbolsillo.setForeground(new java.awt.Color(255, 255, 255));
        recarbolsillo.setText("RECARGAR BOLSILLO");
        recarbolsillo.setBorder(null);
        recarbolsillo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                recarbolsilloMouseClicked(evt);
            }
        });
        jPanel1.add(recarbolsillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 301, 140, 33));

        retibolsillo.setBackground(new java.awt.Color(0, 134, 190));
        retibolsillo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        retibolsillo.setForeground(new java.awt.Color(255, 255, 255));
        retibolsillo.setText("RETIRAR BOLSILLO");
        retibolsillo.setBorder(null);
        retibolsillo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                retibolsilloMouseClicked(evt);
            }
        });
        jPanel1.add(retibolsillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 142, 33));

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
        jPanel1.add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 30, 89, 35));

        oscuro.setBackground(new java.awt.Color(255, 255, 255));
        oscuro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5064965.png"))); // NOI18N
        oscuro.setBorder(null);
        oscuro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                oscuroMouseClicked(evt);
            }
        });
        jPanel1.add(oscuro, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverMouseClicked
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VolverMouseClicked

    private void recarbolsilloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recarbolsilloMouseClicked
        String input = JOptionPane.showInputDialog(this, "¿Cuánto deseas mover al bolsillo?");
        try {
            double monto = Double.parseDouble(input);
            if (monto > 0 && monto <= disponible) {
                disponible -= monto;
                bolsillo += monto;
                JOptionPane.showMessageDialog(this, "Movimiento exitoso.");
            } else {
                JOptionPane.showMessageDialog(this, "Monto inválido o insuficiente.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        actualizarLabels();
    }//GEN-LAST:event_recarbolsilloMouseClicked

    private void retibolsilloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retibolsilloMouseClicked
        String input = JOptionPane.showInputDialog(this, "¿Cuánto deseas retirar del bolsillo?");
        try {
            double monto = Double.parseDouble(input);
            if (monto > 0 && monto <= bolsillo) {
                bolsillo -= monto;
                disponible += monto;
                JOptionPane.showMessageDialog(this, "Retiro exitoso.");
            } else {
                JOptionPane.showMessageDialog(this, "Monto inválido o insuficiente en el bolsillo.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        actualizarLabels();

    }//GEN-LAST:event_retibolsilloMouseClicked

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
            java.util.logging.Logger.getLogger(Bolsillo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bolsillo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bolsillo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bolsillo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bolsillo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBolsillo;
    private javax.swing.JLabel lblDisponible;
    private javax.swing.JButton oscuro;
    private javax.swing.JButton recarbolsillo;
    private javax.swing.JButton retibolsillo;
    // End of variables declaration//GEN-END:variables
}
