/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecoedu.Vistas.vista_base;

import com.ecoedu.Vistas.Herramienta;
import com.ecoedu.model.Semestre;
import javax.swing.JOptionPane;
import com.ecoedu.model.Semestre;
import java.util.Date;
import javax.persistence.EntityManager;

/**
 *
 * @author alexis
 */
public class Semestre_add_update_view extends javax.swing.JDialog {
    Semestre objSemestre;
    Principal objPrincipal;
    EntityManager jpa;
    
    public Semestre_add_update_view(java.awt.Frame parent, boolean modal,Semestre objSemestre,EntityManager jpa) {
        super(parent, modal);
        initComponents();
        this.objSemestre=objSemestre;
        this.objPrincipal=(Principal) parent;
        this.jpa=jpa;
        principalEjecucion();
        this.setLocationRelativeTo(null);
    }
    public void principalEjecucion(){
           if(objSemestre!=null){
            jbtnCerrarSemestre.setEnabled(true);
            jlblAdvertencia.setText("Semestre Vigente");
            jcbDateInicio.setDatoFecha(objSemestre.getFecha_Inicio());
            jcbDateFin.setDatoFecha(objSemestre.getFecha_Fin());
            jbtnGuardar.setText("GUARDAR CAMBIOS");
            if(objSemestre.isSemestre_periodo()){
                jcbPeriodoSemestre.setSelectedItem("II");
            }
            else{
                jcbPeriodoSemestre.setSelectedItem("I");                
            }
        }
        else{
            jbtnCerrarSemestre.setEnabled(false);
            jlblAdvertencia.setText("");
            objSemestre=new Semestre();
        }        
        
    }
    public void consultaBD(){
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        contenedor1 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jlblSerie = new javax.swing.JLabel();
        jbtnCerrarSemestre = new javax.swing.JButton();
        jlblEscuela = new javax.swing.JLabel();
        head2 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jlblNombre1 = new javax.swing.JLabel();
        jlblEstCodigo = new javax.swing.JLabel();
        jlblCondicion1 = new javax.swing.JLabel();
        jcbPeriodoSemestre = new javax.swing.JComboBox<>();
        jcbDateFin = new rojeru_san.componentes.RSDateChooser();
        jcbDateInicio = new rojeru_san.componentes.RSDateChooser();
        jbtnSalir = new javax.swing.JButton();
        jbtnGuardar = new javax.swing.JButton();
        jlblAdvertencia = new javax.swing.JLabel();
        jlblMensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel7.setBackground(new java.awt.Color(255, 251, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setMaximumSize(new java.awt.Dimension(100, 176));
        jPanel7.setPreferredSize(new java.awt.Dimension(350, 250));
        jPanel7.setLayout(new java.awt.BorderLayout());

        contenedor1.setBackground(new java.awt.Color(255, 255, 255));
        contenedor1.setMaximumSize(new java.awt.Dimension(700, 300));
        contenedor1.setMinimumSize(new java.awt.Dimension(700, 300));
        contenedor1.setName(""); // NOI18N
        contenedor1.setPreferredSize(new java.awt.Dimension(700, 300));
        contenedor1.setLayout(new java.awt.BorderLayout());

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setPreferredSize(new java.awt.Dimension(700, 345));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel43.setText("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        jLabel43.setPreferredSize(new java.awt.Dimension(700, 14));
        jPanel9.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 680, 10));

        jlblSerie.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlblSerie.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlblSerie.setText("SEMESTRE:");
        jlblSerie.setPreferredSize(new java.awt.Dimension(330, 20));
        jPanel9.add(jlblSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 80, 25));

        jbtnCerrarSemestre.setBackground(new java.awt.Color(0, 0, 0));
        jbtnCerrarSemestre.setForeground(new java.awt.Color(255, 255, 255));
        jbtnCerrarSemestre.setText("CERRAR SEMESTRE");
        jbtnCerrarSemestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCerrarSemestreActionPerformed(evt);
            }
        });
        jPanel9.add(jbtnCerrarSemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 230, -1));

        jlblEscuela.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlblEscuela.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlblEscuela.setText("FECHA FIN:");
        jlblEscuela.setPreferredSize(new java.awt.Dimension(330, 20));
        jPanel9.add(jlblEscuela, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 80, 25));

        head2.setBackground(new java.awt.Color(0, 153, 102));
        head2.setPreferredSize(new java.awt.Dimension(900, 70));

        jLabel44.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText(" Semestre de Atención");
        jLabel44.setPreferredSize(new java.awt.Dimension(900, 70));
        head2.add(jLabel44);

        jPanel9.add(head2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, -1));

        jlblNombre1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlblNombre1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlblNombre1.setText("FECHA INICIO:");
        jlblNombre1.setPreferredSize(new java.awt.Dimension(330, 20));
        jPanel9.add(jlblNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 100, 25));

        jlblEstCodigo.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 20)); // NOI18N
        jlblEstCodigo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlblEstCodigo.setPreferredSize(new java.awt.Dimension(330, 20));
        jPanel9.add(jlblEstCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 150, 25));

        jlblCondicion1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlblCondicion1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlblCondicion1.setText("2020");
        jlblCondicion1.setPreferredSize(new java.awt.Dimension(330, 20));
        jPanel9.add(jlblCondicion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 40, 25));

        jcbPeriodoSemestre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jcbPeriodoSemestre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "I", "II" }));
        jcbPeriodoSemestre.setPreferredSize(new java.awt.Dimension(56, 25));
        jPanel9.add(jcbPeriodoSemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 50, -1));

        jcbDateFin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel9.add(jcbDateFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 160, 25));
        jPanel9.add(jcbDateInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 160, 25));

        jbtnSalir.setBackground(new java.awt.Color(0, 0, 0));
        jbtnSalir.setForeground(new java.awt.Color(255, 255, 255));
        jbtnSalir.setText("SALIR");
        jbtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalirActionPerformed(evt);
            }
        });
        jPanel9.add(jbtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 160, -1));

        jbtnGuardar.setBackground(new java.awt.Color(0, 0, 0));
        jbtnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnGuardar.setText("GUARDAR");
        jbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarActionPerformed(evt);
            }
        });
        jPanel9.add(jbtnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 160, -1));

        jlblAdvertencia.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jlblAdvertencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblAdvertencia.setText("Semestre vigente");
        jPanel9.add(jlblAdvertencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 700, 20));

        jlblMensaje.setBackground(new java.awt.Color(255, 51, 0));
        jlblMensaje.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlblMensaje.setForeground(new java.awt.Color(255, 0, 0));
        jlblMensaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel9.add(jlblMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 480, 30));

        contenedor1.add(jPanel9, java.awt.BorderLayout.CENTER);

        jPanel7.add(contenedor1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 700, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 427, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnCerrarSemestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCerrarSemestreActionPerformed
        objSemestre.setFecha_Fin_Real(new Date());
        jpa.getTransaction().begin();
        jpa.persist(objSemestre);
        objPrincipal.actulizarPeriodo();
        JOptionPane.showMessageDialog(jLabel44, "Semestre culminado");
        this.setVisible(false);
        jpa.getTransaction().commit();
        
    }//GEN-LAST:event_jbtnCerrarSemestreActionPerformed

    private void jbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jbtnSalirActionPerformed

    private void jbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarActionPerformed
        if(Herramienta.isMenor(jcbDateInicio.getDatoFecha(), jcbDateFin.getDatoFecha())){
            objSemestre.setFecha_Fin(jcbDateFin.getDatoFecha());
            objSemestre.setFecha_Inicio(jcbDateInicio.getDatoFecha());
            if(((String)jcbPeriodoSemestre.getSelectedItem()).equals("I")){
                objSemestre.setSemestre_periodo(false);
            }
            else{
                objSemestre.setSemestre_periodo(true);
            }
            jpa.getTransaction().begin();
            jpa.persist(objSemestre);
            objPrincipal.actulizarPeriodo();
            JOptionPane.showMessageDialog(jLabel43, "Guardado con exito");
            this.setVisible(false);
            jpa.flush();
            jpa.getTransaction().commit();
        }
        else{
            jlblMensaje.setText("la fecha de inicio no puede ser menor que la fecha fin");
        }
    }//GEN-LAST:event_jbtnGuardarActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenedor1;
    private javax.swing.JPanel head2;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton jbtnCerrarSemestre;
    private javax.swing.JButton jbtnGuardar;
    private javax.swing.JButton jbtnSalir;
    private rojeru_san.componentes.RSDateChooser jcbDateFin;
    private rojeru_san.componentes.RSDateChooser jcbDateInicio;
    private javax.swing.JComboBox<String> jcbPeriodoSemestre;
    private javax.swing.JLabel jlblAdvertencia;
    private javax.swing.JLabel jlblCondicion1;
    private javax.swing.JLabel jlblEscuela;
    private javax.swing.JLabel jlblEstCodigo;
    private javax.swing.JLabel jlblMensaje;
    private javax.swing.JLabel jlblNombre1;
    private javax.swing.JLabel jlblSerie;
    // End of variables declaration//GEN-END:variables
}
