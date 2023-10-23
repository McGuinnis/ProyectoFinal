/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package proyectofinal.Vistas;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import java.util.Calendar;

import javax.swing.table.DefaultTableModel;
import proyectofinal.AccesoaDatos.AlojamientoData;
import proyectofinal.AccesoaDatos.CiudadData;
import proyectofinal.AccesoaDatos.PaqueteData;
import proyectofinal.AccesoaDatos.PasajeData;
import proyectofinal.Entidades.Alojamiento;
import proyectofinal.Entidades.Ciudad;
import proyectofinal.Entidades.Paquete;
import proyectofinal.Entidades.Pasaje;
import proyectofinal.Entidades.TipoTransporte;

/**
 *
 * @author orell
 */
public class AgregarPaquete extends javax.swing.JInternalFrame {

    /**
     * Creates new form AgregarPaquete
     */
    
    private DefaultTableModel modelo;   
    
    public AgregarPaquete() {
        initComponents();
        cargarComboPaises();
        
        modelo = new DefaultTableModel();
        armarCabecera();

        
        //Calendar hoy=Calendar.getInstance();
        jfechaIn.setCalendar(Calendar.getInstance());
        jcomboProvincia.setEnabled(false);
        jcomboCiudad.setEnabled(false);
    }
private CiudadData cData = new CiudadData();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jcomboProvincia = new javax.swing.JComboBox<>();
        jcomboPais = new javax.swing.JComboBox<>();
        jcomboCiudad = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jfechaIn = new com.toedter.calendar.JDateChooser();
        jbBuscarTabla = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jcomboTransporte = new javax.swing.JComboBox<>();
        jtImporte = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jBotonGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        jLabel6.setText("Paises");

        jLabel7.setText("Provincias");

        jLabel8.setText("Ciudades");

        jcomboProvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomboProvinciaActionPerformed(evt);
            }
        });

        jcomboPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomboPaisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jcomboPais, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jcomboProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(133, 133, 133)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcomboCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jcomboProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcomboPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jcomboCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(51, 0, 51));

        jTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTabla);

        jLabel5.setText("Fecha Inicio");

        jbBuscarTabla.setText("Buscar");
        jbBuscarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarTablaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jfechaIn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jbBuscarTabla)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jfechaIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscarTabla))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setText("Cargar Paquete ");

        jPanel4.setBackground(new java.awt.Color(51, 0, 0));

        jLabel9.setText("Tipo de Transporte");

        jLabel10.setText("Importe");

        jcomboTransporte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Avion", "Tren", "Autobus", "Taxi" }));
        jcomboTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomboTransporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jcomboTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jtImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcomboTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(51, 51, 0));

        jBotonGuardar.setText("Agregar");
        jBotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonGuardarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jBotonGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(jbSalir)
                .addGap(64, 64, 64))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBotonGuardar)
                    .addComponent(jbSalir))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(88, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(186, 186, 186))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(241, 241, 241))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
        );

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

    private void jBotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonGuardarActionPerformed
        // TODO add your handling code here:
        Ciudad ciudadOrigen= new Ciudad();
        Ciudad ciudadDestino=new Ciudad();
        ciudadOrigen=cData.buscarCiudadPorNombre("Azul");
        ciudadDestino=cData.buscarCiudadPorNombre(jcomboCiudad.getSelectedItem().toString());
        System.out.println(ciudadDestino.getIdCiudad()+"importe "+Double.parseDouble(jtImporte.getText()));
        //Carga de Pasaje para paquete
        Pasaje pasaje1= new Pasaje(jcomboTransporte.getSelectedItem().toString(),
                Double.parseDouble(jtImporte.getText()), ciudadOrigen, true);
        PasajeData pData= new PasajeData();
        Pasaje pasaje=pData.agregarPasaje(pasaje1);
        
        
       
        
        
        //Obtener IdAlojamiento de la seleccion en tabla
        Alojamiento alojamiento=new Alojamiento();
        AlojamientoData aData=new AlojamientoData();
        int filaActual = jTabla.getSelectedRow();
        Integer idAlojamiento = (Integer) jTabla.getValueAt(filaActual, 0);
        alojamiento=aData.buscarAlojamiento(idAlojamiento);
        
        
        //Guardado Paquete
        Paquete paquete=new Paquete(ciudadOrigen, ciudadDestino, alojamiento, pasaje);
        PaqueteData paqData=new PaqueteData();
        paqData.agregarPaquete(paquete);
        
        
        
        
        
        
    }//GEN-LAST:event_jBotonGuardarActionPerformed

    private void jcomboPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomboPaisActionPerformed
        // TODO add your handling code here:
        jcomboProvincia.setEnabled(true);
        
        cargarComboProvincias();
    }//GEN-LAST:event_jcomboPaisActionPerformed

    private void jcomboProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomboProvinciaActionPerformed
        // TODO add your handling code here:
        jcomboCiudad.setEnabled(true);
        jcomboCiudad.removeAllItems();
        //jbBuscar.setEnabled(true);
        cargarComboCiudades();
    }//GEN-LAST:event_jcomboProvinciaActionPerformed

    private void jbBuscarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarTablaActionPerformed
        // TODO add your handling code here:
        CiudadData cd=new CiudadData();
        
        Ciudad c=cd.buscarCiudadPorNombre(jcomboCiudad.getSelectedItem().toString());
        cargarTabla(c.getIdCiudad(), jfechaIn.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        
    }//GEN-LAST:event_jbBuscarTablaActionPerformed

    private void jcomboTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomboTransporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcomboTransporteActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBotonGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabla;
    private javax.swing.JButton jbBuscarTabla;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<String> jcomboCiudad;
    private javax.swing.JComboBox<String> jcomboPais;
    private javax.swing.JComboBox<String> jcomboProvincia;
    private javax.swing.JComboBox<String> jcomboTransporte;
    private com.toedter.calendar.JDateChooser jfechaIn;
    private javax.swing.JTextField jtImporte;
    // End of variables declaration//GEN-END:variables

    private void cargarComboPaises() {
        List<String> pais = cData.listarPaises();        
        //jcomboCiudad.setEnabled(false);
        //jcomboCiudad.removeAllItems();
        
        for (String pai : pais) {
            jcomboPais.addItem(pai);

        }

    }

    private void cargarComboProvincias() {
        String pai = (String) jcomboPais.getSelectedItem();

        List<String> provincias = cData.listarProvinciasPorPaisC(pai);        
        //jcomboCiudad.setEnabled(false);
        jcomboProvincia.removeAllItems();        
        jcomboCiudad.removeAllItems();

        for (String provincia : provincias) {
            jcomboProvincia.addItem(provincia);
        }
    }
    
    private void cargarComboCiudades(){
        String pai =(String) jcomboPais.getSelectedItem();
        String prov=(String) jcomboProvincia.getSelectedItem();
        List<Ciudad> ciu =  cData.listarCiudadPorProvinciaypais(pai, prov);
        
        for (Ciudad ciudad : ciu) {
            String ciudadx = ciudad.getNombre();
            jcomboCiudad.addItem(ciudadx);
            
        }
        
    }
    private void cargarComboTransporte(){
        TipoTransporte[] tipos=TipoTransporte.values();
        for (TipoTransporte tipo:tipos){
        jcomboTransporte.addItem(tipo.toString());}
                
    }
    
        private void armarCabecera() {
        modelo.addColumn("Id");
        modelo.addColumn("Fecha Inicio");
        modelo.addColumn("Fecha Fin");
        modelo.addColumn("Tipo Alojamiento");
        modelo.addColumn("Servicios");
        modelo.addColumn("Importe Diario");
        jTabla.setModel(modelo);
    }
        
     private void borrarFilas() {

        int filas = jTabla.getRowCount() - 1;

        for (int i = filas; i >= 0; i--) {

            modelo.removeRow(i);
        }
    }
     private void cargarTabla (int ciudad, LocalDate fechaIn){
         AlojamientoData ad=new AlojamientoData();
         List<Alojamiento> al=ad.listarAlojamientoxCyF(ciudad, fechaIn);
         borrarFilas();
         for(Alojamiento al1:al){
         modelo.addRow(new Object[]{al1.getIdAlojamiento(), al1.getFechaing(), al1.getFechaOn(),al1.getTipoAlojam(),al1.getServicio(),al1.getImporteDiario()});
         }
         }
         
}

