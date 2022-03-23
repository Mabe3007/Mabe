/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author byron_rigdkvz
 */
public class AsiloUltimoSuspiro extends javax.swing.JFrame {

    /**
     * Creates new form AsiloUltimoSuspiro
     */
    public AsiloUltimoSuspiro() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jguardar = new javax.swing.JButton();
        jlimpiar = new javax.swing.JButton();
        jsalir = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        jnombre = new javax.swing.JLabel();
        cedula = new javax.swing.JLabel();
        jcontactos = new javax.swing.JLabel();
        jpadecimientos = new javax.swing.JLabel();
        jmedicamentos = new javax.swing.JLabel();
        jequipaje = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jguardar.setBackground(new java.awt.Color(102, 204, 255));
        jguardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jguardar.setForeground(new java.awt.Color(0, 0, 204));
        jguardar.setText("GUARDAR");
        getContentPane().add(jguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, -1, -1));

        jlimpiar.setBackground(new java.awt.Color(102, 204, 255));
        jlimpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlimpiar.setForeground(new java.awt.Color(0, 0, 255));
        jlimpiar.setText("LIMPIAR");
        jlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(jlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 536, 90, 30));

        jsalir.setBackground(new java.awt.Color(255, 102, 255));
        jsalir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jsalir.setForeground(new java.awt.Color(51, 51, 255));
        jsalir.setText("SALIR");
        jsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsalirActionPerformed(evt);
            }
        });
        getContentPane().add(jsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 536, 90, 30));

        titulo.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("EL ÚLTIMO SUSPIRO");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        jnombre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jnombre.setForeground(new java.awt.Color(204, 204, 204));
        jnombre.setText("ABUELITO");
        getContentPane().add(jnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        cedula.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cedula.setForeground(new java.awt.Color(204, 204, 204));
        cedula.setText("CEDÚLA");
        getContentPane().add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jcontactos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jcontactos.setForeground(new java.awt.Color(204, 204, 204));
        jcontactos.setText("CONTACTOS DE EMERGENCIA");
        getContentPane().add(jcontactos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jpadecimientos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jpadecimientos.setForeground(new java.awt.Color(204, 204, 204));
        jpadecimientos.setText("PADECIMIENTOS");
        getContentPane().add(jpadecimientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jmedicamentos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jmedicamentos.setForeground(new java.awt.Color(204, 204, 204));
        jmedicamentos.setText("MEDICAMENTOS");
        getContentPane().add(jmedicamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        jequipaje.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jequipaje.setForeground(new java.awt.Color(204, 204, 204));
        jequipaje.setText("EQUIPAJE");
        getContentPane().add(jequipaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(51, 51, 255));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 370, -1));

        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(51, 51, 255));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 370, -1));

        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(51, 51, 255));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 220, -1));

        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(51, 51, 255));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 330, -1));

        jTextField5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(51, 51, 255));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 330, -1));

        jTextField6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(51, 51, 255));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 380, -1));

        jfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Abstract.jpg"))); // NOI18N
        jfondo.setText("jLabel1");
        getContentPane().add(jfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 560, 599));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsalirActionPerformed
    System.exit(0);
    }//GEN-LAST:event_jsalirActionPerformed

    private void jlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlimpiarActionPerformed
    jTextField1.setText("");
    jTextField2.setText("");
    jTextField3.setText("");
    jTextField4.setText("");
    jTextField5.setText("");
    jTextField6.setText("");
    }//GEN-LAST:event_jlimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(AsiloUltimoSuspiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AsiloUltimoSuspiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AsiloUltimoSuspiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AsiloUltimoSuspiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AsiloUltimoSuspiro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cedula;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel jcontactos;
    private javax.swing.JLabel jequipaje;
    private javax.swing.JLabel jfondo;
    private javax.swing.JButton jguardar;
    private javax.swing.JButton jlimpiar;
    private javax.swing.JLabel jmedicamentos;
    private javax.swing.JLabel jnombre;
    private javax.swing.JLabel jpadecimientos;
    private javax.swing.JButton jsalir;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
