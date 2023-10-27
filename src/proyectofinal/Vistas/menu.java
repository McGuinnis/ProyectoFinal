/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectofinal.Vistas;

import desplazable.Desface;

import AppPackage.AnimationClass;
import java.awt.event.KeyEvent;
import java.io.IOException;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

 



/**
 *
 * @author orell
 */


public class menu extends javax.swing.JFrame {
    
    
    

    /**
     * Creates new form menu
     */
    public Clip clip;
    public String Ruta="/sonido/";
    
    
    
    public menu() {
        initComponents();
        setLocationRelativeTo(null);
        jlMenuCiudad.setEnabled(false);
        jlMenuAlojamiento.setEnabled(false);
        jlMenuPaquete.setEnabled(false);
        jlMenuModificarAlojamiento.setEnabled(false);
        jlMenuEliminar1.setEnabled(false);
    }
    
    public void Sonido(String archivo){
        try{
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream(Ruta+archivo+".wav")));
            clip.start();
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e){
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

        jdEscritorio = new javax.swing.JDesktopPane();
        menuLogin1 = new proyectofinal.Vistas.componentes.MenuLogin();
        menuPanel1 = new proyectofinal.Vistas.componentes.MenuPanel();
        jlMenuAlojamiento = new javax.swing.JLabel();
        jlMenuPaquete = new javax.swing.JLabel();
        jlMenuCiudad = new javax.swing.JLabel();
        jlMenuModificarAlojamiento = new javax.swing.JLabel();
        jlMenuConsultas = new javax.swing.JLabel();
        jlMenuEliminar1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jtfUsuario = new javax.swing.JTextField();
        jlUsuario = new javax.swing.JLabel();
        jpfContraseña = new javax.swing.JPasswordField();
        jlContrasena = new javax.swing.JLabel();
        jbLogin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlMenuAlojamiento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlMenuAlojamiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinal/Vistas/iconos/icons8-hotel-50.png"))); // NOI18N
        jlMenuAlojamiento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jlMenuAlojamiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMenuAlojamientoMouseClicked(evt);
            }
        });
        menuPanel1.add(jlMenuAlojamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 50, -1));

        jlMenuPaquete.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlMenuPaquete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinal/Vistas/iconos/icons8-worldwide-delivery-50.png"))); // NOI18N
        jlMenuPaquete.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jlMenuPaquete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMenuPaqueteMouseClicked(evt);
            }
        });
        menuPanel1.add(jlMenuPaquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 50, -1));

        jlMenuCiudad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlMenuCiudad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinal/Vistas/iconos/icons8-buildings-50.png"))); // NOI18N
        jlMenuCiudad.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jlMenuCiudad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMenuCiudadMouseClicked(evt);
            }
        });
        menuPanel1.add(jlMenuCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 50, -1));

        jlMenuModificarAlojamiento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlMenuModificarAlojamiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinal/Vistas/iconos/icons8-edit-property-50.png"))); // NOI18N
        jlMenuModificarAlojamiento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jlMenuModificarAlojamiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMenuModificarAlojamientoMouseClicked(evt);
            }
        });
        menuPanel1.add(jlMenuModificarAlojamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 50, -1));

        jlMenuConsultas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlMenuConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinal/Vistas/iconos/icons8-book-50.png"))); // NOI18N
        jlMenuConsultas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jlMenuConsultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMenuConsultasMouseClicked(evt);
            }
        });
        menuPanel1.add(jlMenuConsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 50, -1));

        jlMenuEliminar1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlMenuEliminar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinal/Vistas/iconos/icons8-delete-50.png"))); // NOI18N
        jlMenuEliminar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jlMenuEliminar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMenuEliminar1MouseClicked(evt);
            }
        });
        menuPanel1.add(jlMenuEliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 50, -1));

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51,90));

        jtfUsuario.setBackground(new java.awt.Color(51, 51, 51));
        jtfUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtfUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jtfUsuario.setText("admin");
        jtfUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jtfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfUsuarioActionPerformed(evt);
            }
        });

        jlUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jlUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinal/Vistas/iconos/icons8-user-30.png"))); // NOI18N
        jlUsuario.setText("Usuario");

        jpfContraseña.setBackground(new java.awt.Color(51, 51, 51));
        jpfContraseña.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jpfContraseña.setForeground(new java.awt.Color(255, 255, 255));
        jpfContraseña.setText("admin");
        jpfContraseña.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        jlContrasena.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlContrasena.setForeground(new java.awt.Color(255, 255, 255));
        jlContrasena.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinal/Vistas/iconos/icons8-lock-30.png"))); // NOI18N
        jlContrasena.setText("Contraseña");

        jbLogin.setBackground(new java.awt.Color(0, 51, 255));
        jbLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbLogin.setForeground(new java.awt.Color(255, 255, 255));
        jbLogin.setText("Login");
        jbLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jbLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlContrasena)
                            .addComponent(jlUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jpfContraseña)
                            .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(60, 60, 60))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlUsuario))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jpfContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlContrasena))
                .addGap(28, 28, 28)
                .addComponent(jbLogin)
                .addGap(40, 40, 40))
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinal/Vistas/iconos/icons8-user-50.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinal/Vistas/iconos/avion.png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        javax.swing.GroupLayout menuLogin1Layout = new javax.swing.GroupLayout(menuLogin1);
        menuLogin1.setLayout(menuLogin1Layout);
        menuLogin1Layout.setHorizontalGroup(
            menuLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLogin1Layout.createSequentialGroup()
                .addComponent(menuPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuLogin1Layout.setVerticalGroup(
            menuLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
            .addGroup(menuLogin1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jdEscritorio.setLayer(menuLogin1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdEscritorioLayout = new javax.swing.GroupLayout(jdEscritorio);
        jdEscritorio.setLayout(jdEscritorioLayout);
        jdEscritorioLayout.setHorizontalGroup(
            jdEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdEscritorioLayout.createSequentialGroup()
                .addComponent(menuLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jdEscritorioLayout.setVerticalGroup(
            jdEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuLogin1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jdEscritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdEscritorio)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfUsuarioActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jtfUsuarioActionPerformed

    private void jbLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLoginActionPerformed
        // TODO add your handling code here:

        String usuario = "admin";
        String pass = "admin";

        if (usuario.equals(jtfUsuario.getText()) && pass.equals(jpfContraseña.getText())) {
            
            jlMenuCiudad.setEnabled(true);
            jlMenuAlojamiento.setEnabled(true);
            jlMenuPaquete.setEnabled(true);
            jlMenuModificarAlojamiento.setEnabled(true);
            jlMenuEliminar1.setEnabled(true);
            

        } else {
            System.out.println("No entro al login");
        }

    }//GEN-LAST:event_jbLoginActionPerformed

    private void jlMenuConsultasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMenuConsultasMouseClicked
         // TODO add your handling code here:
            jdEscritorio.repaint();
        Consultas c = new Consultas();
        c.setVisible(true);
        jdEscritorio.add(c);
        jdEscritorio.moveToFront(c);
    }//GEN-LAST:event_jlMenuConsultasMouseClicked

    private void jlMenuModificarAlojamientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMenuModificarAlojamientoMouseClicked
        // TODO add your handling code here:
        jdEscritorio.repaint();
        Modificar_Alojamiento mod = new Modificar_Alojamiento();
        mod.setVisible(true);
        jdEscritorio.add(mod);
        jdEscritorio.moveToFront(mod);
    }//GEN-LAST:event_jlMenuModificarAlojamientoMouseClicked

    private void jlMenuCiudadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMenuCiudadMouseClicked
        // TODO add your handling code here:
        CiudadAgregar ciudadA = new CiudadAgregar();

        ciudadA.setVisible(true);

    }//GEN-LAST:event_jlMenuCiudadMouseClicked

    private void jlMenuPaqueteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMenuPaqueteMouseClicked
        // TODO add your handling code here:
        AgregarPaquete ap = new AgregarPaquete();
        ap.setVisible(true);
        jdEscritorio.add(ap);
        jdEscritorio.moveToFront(ap);

    }//GEN-LAST:event_jlMenuPaqueteMouseClicked

    private void jlMenuAlojamientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMenuAlojamientoMouseClicked
        // TODO add your handling code here:
        AgregarAlojamiento aa=new AgregarAlojamiento();
        aa.setVisible(true);

    }//GEN-LAST:event_jlMenuAlojamientoMouseClicked

    private void jlMenuEliminar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMenuEliminar1MouseClicked
        // TODO add your handling code here:
        jdEscritorio.repaint();
        Eliminar elis = new Eliminar ();
        elis.setVisible(true);
        jdEscritorio.add(elis);
        jdEscritorio.moveToFront(elis);
    }//GEN-LAST:event_jlMenuEliminar1MouseClicked
    private boolean flechaVisible = true;
    //private boolean textVisible = false;
    
    public void keyPressed(KeyEvent e) {
                // Este método se llama cuando se presiona una tecla
                if (e.getKeyChar() == 'A' || e.getKeyChar() == 'a') {
                    // Abre la ventana cuando se presiona la tecla 'A' o 'a'
                    CiudadAgregar ciudadA = new CiudadAgregar();
                    ciudadA.setVisible(true);
                }
            }
    
    
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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbLogin;
    private javax.swing.JDesktopPane jdEscritorio;
    private javax.swing.JLabel jlContrasena;
    private javax.swing.JLabel jlMenuAlojamiento;
    private javax.swing.JLabel jlMenuCiudad;
    private javax.swing.JLabel jlMenuConsultas;
    private javax.swing.JLabel jlMenuEliminar1;
    private javax.swing.JLabel jlMenuModificarAlojamiento;
    private javax.swing.JLabel jlMenuPaquete;
    private javax.swing.JLabel jlUsuario;
    private javax.swing.JPasswordField jpfContraseña;
    private javax.swing.JTextField jtfUsuario;
    private proyectofinal.Vistas.componentes.MenuLogin menuLogin1;
    private proyectofinal.Vistas.componentes.MenuPanel menuPanel1;
    // End of variables declaration//GEN-END:variables
}
