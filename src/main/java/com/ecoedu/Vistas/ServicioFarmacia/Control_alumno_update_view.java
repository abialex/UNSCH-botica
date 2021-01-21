/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecoedu.Vistas.ServicioFarmacia;

import com.ecoedu.Vistas.ServicioAsistencial.Servicio_Asistencial;
import com.ecoedu.Vistas.vista_base.Cuadro_Mediano;
import com.ecoedu.model.Control_paciente;
import com.ecoedu.model.Estudiante;
import com.ecoedu.model.Semestre;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

/**
 *
 * @author alexis
 */
public class Control_alumno_update_view extends javax.swing.JDialog {
    EntityManager jpa;

    ServicioFarmacia objServicioFarmacia;
    Servicio_Asistencial objServicio_Asistencial;
    Estudiante objEstudiante;
    Semestre objSemestre;
    
    public Control_alumno_update_view(java.awt.Frame parent, boolean modal,EntityManager objJpa,Estudiante objEstudiante,
            ServicioFarmacia objServicioFarmacia,Semestre objSemestre) {
        super(parent, modal);
        this.objEstudiante=objEstudiante;
        this.jpa=objJpa;
        this.objServicioFarmacia=objServicioFarmacia;
        this.objSemestre=objSemestre;
        initComponents();
        principalEjecucion();
        this.setLocationRelativeTo(null);
    }
    
     public void principalEjecucion(){
        jlblEstEscuela.setText(objEstudiante.getEscuela().getNombre());
        jlblEstCodigo.setText(objEstudiante.getCodigo());
        jlblEstCondicion.setText(objEstudiante.getCondicion().getNombre_rol());
        jlblEstNombres.setText(objEstudiante.getPersona().getInfoPersona());
        jcbSerie.setSelectedItem((String)objEstudiante.getSerie());
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        contenedor = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jlblCondicion = new javax.swing.JLabel();
        jlblPrecioTotal2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jlblSerie = new javax.swing.JLabel();
        jlblCodigo = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jbtnAgregar = new javax.swing.JButton();
        jcbSerie = new javax.swing.JComboBox<>();
        jlblEscuela = new javax.swing.JLabel();
        jlblEstSeguro = new javax.swing.JLabel();
        head = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jlblNombre1 = new javax.swing.JLabel();
        jlblEstNombres = new javax.swing.JLabel();
        jlblEstEscuela = new javax.swing.JLabel();
        jlblEstCodigo = new javax.swing.JLabel();
        jlblEstCondicion = new javax.swing.JLabel();
        jbtnAgregar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 251, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setMaximumSize(new java.awt.Dimension(100, 176));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 350));
        jPanel1.setLayout(new java.awt.BorderLayout());

        contenedor.setBackground(new java.awt.Color(255, 255, 255));
        contenedor.setMaximumSize(new java.awt.Dimension(700, 300));
        contenedor.setMinimumSize(new java.awt.Dimension(700, 300));
        contenedor.setName(""); // NOI18N
        contenedor.setPreferredSize(new java.awt.Dimension(700, 300));
        contenedor.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(700, 345));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblCondicion.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlblCondicion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlblCondicion.setText("Condición:");
        jlblCondicion.setPreferredSize(new java.awt.Dimension(330, 20));
        jPanel2.add(jlblCondicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 80, 25));

        jlblPrecioTotal2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlblPrecioTotal2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblPrecioTotal2.setText("S/");
        jlblPrecioTotal2.setPreferredSize(new java.awt.Dimension(90, 20));
        jPanel2.add(jlblPrecioTotal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 20, 25));

        jLabel6.setText("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        jLabel6.setPreferredSize(new java.awt.Dimension(700, 14));
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 680, 10));

        jlblSerie.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlblSerie.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlblSerie.setText("Serie:");
        jlblSerie.setPreferredSize(new java.awt.Dimension(330, 20));
        jPanel2.add(jlblSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 100, 25));

        jlblCodigo.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlblCodigo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlblCodigo.setText("Código:");
        jlblCodigo.setPreferredSize(new java.awt.Dimension(330, 20));
        jPanel2.add(jlblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 60, 25));

        jLabel10.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Seguro de:");
        jLabel10.setPreferredSize(new java.awt.Dimension(330, 20));
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 75, 25));

        jbtnAgregar.setBackground(new java.awt.Color(0, 0, 0));
        jbtnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnAgregar.setText("ACTUALIZAR");
        jbtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregarActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 210, -1));

        jcbSerie.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jcbSerie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "100", "200", "300", "400", "500", "600", "700" }));
        jPanel2.add(jcbSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 110, 25));

        jlblEscuela.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlblEscuela.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlblEscuela.setText("Escuela:");
        jlblEscuela.setPreferredSize(new java.awt.Dimension(330, 20));
        jPanel2.add(jlblEscuela, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 60, 25));

        jlblEstSeguro.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N
        jlblEstSeguro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlblEstSeguro.setText("110");
        jlblEstSeguro.setPreferredSize(new java.awt.Dimension(330, 20));
        jPanel2.add(jlblEstSeguro, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 30, 25));

        head.setBackground(new java.awt.Color(204, 102, 0));
        head.setPreferredSize(new java.awt.Dimension(900, 70));

        jLabel12.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Renovación de control del Estudiante");
        jLabel12.setPreferredSize(new java.awt.Dimension(900, 70));
        head.add(jLabel12);

        jPanel2.add(head, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, -1));

        jlblNombre1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlblNombre1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlblNombre1.setText("Apellidos y Nombres:");
        jlblNombre1.setPreferredSize(new java.awt.Dimension(330, 20));
        jPanel2.add(jlblNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 150, 25));

        jlblEstNombres.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 20)); // NOI18N
        jlblEstNombres.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlblEstNombres.setPreferredSize(new java.awt.Dimension(330, 20));
        jPanel2.add(jlblEstNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 210, 25));

        jlblEstEscuela.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 20)); // NOI18N
        jlblEstEscuela.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlblEstEscuela.setPreferredSize(new java.awt.Dimension(330, 20));
        jPanel2.add(jlblEstEscuela, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 210, 25));

        jlblEstCodigo.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 20)); // NOI18N
        jlblEstCodigo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlblEstCodigo.setPreferredSize(new java.awt.Dimension(330, 20));
        jPanel2.add(jlblEstCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 150, 25));

        jlblEstCondicion.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 20)); // NOI18N
        jlblEstCondicion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlblEstCondicion.setPreferredSize(new java.awt.Dimension(330, 20));
        jPanel2.add(jlblEstCondicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 150, 25));

        jbtnAgregar1.setBackground(new java.awt.Color(0, 0, 0));
        jbtnAgregar1.setForeground(new java.awt.Color(255, 255, 255));
        jbtnAgregar1.setText("NO TIENE SU FICHA DE MATRÍCULA");
        jbtnAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregar1ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnAgregar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        contenedor.add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel1.add(contenedor, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarActionPerformed
        Control_paciente objControlNuevo=new Control_paciente();
        objControlNuevo.setEstudiante(objEstudiante);
        objControlNuevo.setLimite_control(110);
        objControlNuevo.setMonto_total(0);
        objControlNuevo.setSemestre(objSemestre);
        objControlNuevo.setFecha_registro(new Date());
        objControlNuevo.setIsActivo(true);
        jpa.getTransaction().begin();
        objEstudiante.setSerie((String)jcbSerie.getSelectedItem());
        jpa.persist(objEstudiante);//he descubierto que ya no es necesario el persist, con tan solo que detecte
        //que el objeto cambió algún atributo, este lo actualiza en la BD
        jpa.persist(objControlNuevo);
        JOptionPane.showMessageDialog(jLabel12, "Se actualizó y se renovó el control con exito");
        if(true){//cambiar a una variable para al acceso dependiendo si es asistencia o farmacia
            objServicioFarmacia.ConsultaBD();
            objServicioFarmacia.principalEjecucion();
            objServicioFarmacia.llenarControlAlumno();}
        else{
            objServicio_Asistencial.ConsultaBD();
            objServicio_Asistencial.principalEjecucion();
            objServicio_Asistencial.llenarControlAlumno();}
        this.setVisible(false);
        jpa.getTransaction().commit();
    }//GEN-LAST:event_jbtnAgregarActionPerformed

    private void jbtnAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregar1ActionPerformed

        this.setVisible(false);
    }//GEN-LAST:event_jbtnAgregar1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenedor;
    private javax.swing.JPanel head;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbtnAgregar;
    private javax.swing.JButton jbtnAgregar1;
    private javax.swing.JComboBox<String> jcbSerie;
    private javax.swing.JLabel jlblCodigo;
    private javax.swing.JLabel jlblCondicion;
    private javax.swing.JLabel jlblEscuela;
    private javax.swing.JLabel jlblEstCodigo;
    private javax.swing.JLabel jlblEstCondicion;
    private javax.swing.JLabel jlblEstEscuela;
    private javax.swing.JLabel jlblEstNombres;
    private javax.swing.JLabel jlblEstSeguro;
    private javax.swing.JLabel jlblNombre1;
    private javax.swing.JLabel jlblPrecioTotal2;
    private javax.swing.JLabel jlblSerie;
    // End of variables declaration//GEN-END:variables
}
