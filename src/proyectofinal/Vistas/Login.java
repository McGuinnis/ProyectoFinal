/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package proyectofinal.Vistas;

/**
 *
 * @author orell
 */
public class Login extends javax.swing.JInternalFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        
        jbCiudad.setEnabled(false);
        jbAlojamiento.setEnabled(false);
        jbPaquete.setEnabled(false);
        jbPasaje.setEnabled(false);
        
        
        
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpEscritorio2 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        menuLogin1 = new proyectofinal.Vistas.componentes.MenuLogin();
        jPanel2 = new javax.swing.JPanel();
        jtfUsuario = new javax.swing.JTextField();
        jlUsuario = new javax.swing.JLabel();
        jpfContraseña = new javax.swing.JPasswordField();
        jlContrasena = new javax.swing.JLabel();
        jbLogin = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jbCiudad = new javax.swing.JButton();
        jbAlojamiento = new javax.swing.JButton();
        jbPaquete = new javax.swing.JButton();
        jbPasaje = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

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

        jPanel4.setBackground(new java.awt.Color(61, 61, 61));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 2, new java.awt.Color(255, 255, 255)));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinal/Vistas/iconos/icons8-world-80.png"))); // NOI18N

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("Guardar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel1)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addComponent(jButton1)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(35, 35, 35)
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
                .addGap(35, 35, 35))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setOpaque(false);

        jbCiudad.setBackground(new java.awt.Color(51, 51, 51));
        jbCiudad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbCiudad.setForeground(new java.awt.Color(255, 255, 255));
        jbCiudad.setText("Agregar Ciudad");
        jbCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCiudadActionPerformed(evt);
            }
        });

        jbAlojamiento.setBackground(new java.awt.Color(51, 51, 51));
        jbAlojamiento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbAlojamiento.setForeground(new java.awt.Color(255, 255, 255));
        jbAlojamiento.setText("Agregar Alojamiento");
        jbAlojamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlojamientoActionPerformed(evt);
            }
        });

        jbPaquete.setBackground(new java.awt.Color(51, 51, 51));
        jbPaquete.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbPaquete.setForeground(new java.awt.Color(255, 255, 255));
        jbPaquete.setText("Agregar Paquete");
        jbPaquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPaqueteActionPerformed(evt);
            }
        });

        jbPasaje.setBackground(new java.awt.Color(51, 51, 51));
        jbPasaje.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbPasaje.setForeground(new java.awt.Color(255, 255, 255));
        jbPasaje.setText("Eliminar");
        jbPasaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPasajeActionPerformed(evt);
            }
        });

        jButton2.setText("Modificar Alojamiento");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbCiudad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jbAlojamiento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbPaquete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbPasaje, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCiudad)
                    .addComponent(jbAlojamiento)
                    .addComponent(jbPasaje)
                    .addComponent(jbPaquete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(0, 24, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinal/Vistas/iconos/icons8-user-50.png"))); // NOI18N

        javax.swing.GroupLayout menuLogin1Layout = new javax.swing.GroupLayout(menuLogin1);
        menuLogin1.setLayout(menuLogin1Layout);
        menuLogin1Layout.setHorizontalGroup(
            menuLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLogin1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(menuLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(menuLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLogin1Layout.createSequentialGroup()
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(50, 50, 50))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLogin1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(371, 371, 371)))))
        );
        menuLogin1Layout.setVerticalGroup(
            menuLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLogin1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(menuLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(menuLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jdpEscritorio2.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdpEscritorio2Layout = new javax.swing.GroupLayout(jdpEscritorio2);
        jdpEscritorio2.setLayout(jdpEscritorio2Layout);
        jdpEscritorio2Layout.setHorizontalGroup(
            jdpEscritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpEscritorio2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jdpEscritorio2Layout.setVerticalGroup(
            jdpEscritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpEscritorio2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpEscritorio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jdpEscritorio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLoginActionPerformed
        // TODO add your handling code here:

        String usuario = "admin";
        String pass = "admin";

        if (usuario.equals(jtfUsuario.getText()) && pass.equals(jpfContraseña.getText())) {

            jbCiudad.setEnabled(true);
            jbAlojamiento.setEnabled(true);
            jbPaquete.setEnabled(true);
            jbPasaje.setEnabled(true);

        } else {
            System.out.println("No entro al login");
        }


    }//GEN-LAST:event_jbLoginActionPerformed

    private void jbCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCiudadActionPerformed
        // TODO add your handling code here:
        CiudadAgregar ciudadA = new CiudadAgregar();

        ciudadA.setVisible(true);


    }//GEN-LAST:event_jbCiudadActionPerformed

    private void jbAlojamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlojamientoActionPerformed
        
        AgregarAlojamiento aa = new AgregarAlojamiento();
        aa.setVisible(true);

    }//GEN-LAST:event_jbAlojamientoActionPerformed

    private void jtfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfUsuarioActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_jtfUsuarioActionPerformed

    private void jbPasajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPasajeActionPerformed
        // TODO add your handling code here:
        
         Eliminar eli= new Eliminar();
         getParent().add(eli);
        eli.setVisible(true);
        
        
    }//GEN-LAST:event_jbPasajeActionPerformed

    private void jbPaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPaqueteActionPerformed
        // TODO add your handling code here:
        AgregarPaquete ap = new AgregarPaquete();
        getParent().add(ap);
        ap.setVisible(true);
        
    }//GEN-LAST:event_jbPaqueteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Modificar_Alojamiento ma = new Modificar_Alojamiento();
        getParent().add(ma);
        ma.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed


    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton jbAlojamiento;
    private javax.swing.JButton jbCiudad;
    private javax.swing.JButton jbLogin;
    private javax.swing.JButton jbPaquete;
    private javax.swing.JButton jbPasaje;
    private javax.swing.JDesktopPane jdpEscritorio2;
    private javax.swing.JLabel jlContrasena;
    private javax.swing.JLabel jlUsuario;
    private javax.swing.JPasswordField jpfContraseña;
    private javax.swing.JTextField jtfUsuario;
    private proyectofinal.Vistas.componentes.MenuLogin menuLogin1;
    // End of variables declaration//GEN-END:variables
}
