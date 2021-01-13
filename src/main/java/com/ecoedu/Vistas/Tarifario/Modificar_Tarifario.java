package com.ecoedu.Vistas.Tarifario;



import com.ecoedu.Vistas.Herramienta;
import com.ecoedu.Vistas.soloMayusculas;
import com.ecoedu.model.Detalle_Medicamentos;
import com.ecoedu.model.Rol;
import com.ecoedu.model.Tarifario;
import java.awt.Color;

import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yrma
 */
public class Modificar_Tarifario extends javax.swing.JPanel {  
    EntityManager jpa;
    Tarifario objTarifarioGet;
    List<Tarifario> Lista_Tarifario;
    List<Rol> Lista_RolTipo;
    public Modificar_Tarifario(EntityManager objJPA) {
        initComponents();
        this.jpa=objJPA;
        jtfServicioNombre.setDocument(new soloMayusculas());
   
    }
    public void ConsultaBD(){
        Lista_Tarifario=jpa.createQuery("SELECT p FROM Tarifario p").getResultList();
        Lista_RolTipo=jpa.createQuery("Select p from Rol p where id_tipo_Roles=6").getResultList();
        
        
    }
    public void principalEjecucion(){
        
        llenarTabla(Lista_Tarifario);
        jcbTipo.removeAllItems();
        for (Rol rolTipo : Lista_RolTipo){
            jcbTipo.addItem(rolTipo);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        head = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        body2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtblServiciosDisponibles = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jtfCosto = new javax.swing.JTextField();
        jtfServicioNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfSigla = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jcbTipo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jlblAsteriscoCosto = new javax.swing.JLabel();
        jlblAsteriscoSigla = new javax.swing.JLabel();
        jlblAsteriscoServicio = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 255, 204));
        setInheritsPopupMenu(true);
        setMaximumSize(new java.awt.Dimension(6666, 6504));
        setMinimumSize(new java.awt.Dimension(5555, 6502));
        setPreferredSize(new java.awt.Dimension(990, 650));
        setLayout(new java.awt.BorderLayout());

        head.setBackground(new java.awt.Color(207, 48, 72));
        head.setPreferredSize(new java.awt.Dimension(100, 70));

        jLabel12.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("MODIFICAR TARIFA");
        jLabel12.setPreferredSize(new java.awt.Dimension(900, 70));
        head.add(jLabel12);

        add(head, java.awt.BorderLayout.PAGE_START);

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new java.awt.BorderLayout());

        body2.setBackground(new java.awt.Color(255, 255, 255));
        body2.setMaximumSize(new java.awt.Dimension(1990, 650));
        body2.setMinimumSize(new java.awt.Dimension(200, 200));
        body2.setPreferredSize(new java.awt.Dimension(9900, 520));
        body2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtblServiciosDisponibles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtblServiciosDisponibles.setMinimumSize(new java.awt.Dimension(0, 0));
        jtblServiciosDisponibles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblServiciosDisponiblesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtblServiciosDisponibles);
        if (jtblServiciosDisponibles.getColumnModel().getColumnCount() > 0) {
            jtblServiciosDisponibles.getColumnModel().getColumn(0).setResizable(false);
            jtblServiciosDisponibles.getColumnModel().getColumn(3).setResizable(false);
        }

        body2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 900, 180));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Servicios Disponibles");
        body2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 80));

        jtfCosto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtfCosto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfCosto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtfCosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfCostoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfCostoKeyTyped(evt);
            }
        });
        body2.add(jtfCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 160, 25));

        jtfServicioNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtfServicioNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfServicioNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtfServicioNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfServicioNombreKeyReleased(evt);
            }
        });
        body2.add(jtfServicioNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 750, 25));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel6.setText("SERVICIO:");
        body2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 90, 25));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel5.setText("COSTO:");
        body2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 70, 25));

        jtfSigla.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtfSigla.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfSigla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtfSigla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfSiglaKeyReleased(evt);
            }
        });
        body2.add(jtfSigla, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 160, 25));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setText("C�DIGO:");
        body2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 70, 25));

        jButton1.setText("GUARDAR CAMBIOS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        body2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, -1, 25));

        jcbTipo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        body2.add(jcbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 350, 180, 25));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setText("TIPO:");
        body2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 350, 50, 25));

        jlblAsteriscoCosto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblAsteriscoCosto.setForeground(new java.awt.Color(255, 0, 0));
        jlblAsteriscoCosto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblAsteriscoCosto.setText("*");
        body2.add(jlblAsteriscoCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 15, 25));

        jlblAsteriscoSigla.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblAsteriscoSigla.setForeground(new java.awt.Color(255, 0, 0));
        jlblAsteriscoSigla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblAsteriscoSigla.setText("*");
        body2.add(jlblAsteriscoSigla, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, 15, 25));

        jlblAsteriscoServicio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblAsteriscoServicio.setForeground(new java.awt.Color(255, 0, 0));
        jlblAsteriscoServicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblAsteriscoServicio.setText("*");
        body2.add(jlblAsteriscoServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 290, 15, 25));

        body.add(body2, java.awt.BorderLayout.CENTER);

        add(body, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jtblServiciosDisponiblesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblServiciosDisponiblesMouseClicked
                objTarifarioGet=(Tarifario)jtblServiciosDisponibles.getValueAt(jtblServiciosDisponibles.getSelectedRow(),1);
                jtfServicioNombre.setText(objTarifarioGet.getDescripcion());
                jtfCosto.setText(objTarifarioGet.getPrecio()+"");
                jtfSigla.setText(objTarifarioGet.getCodigo());
                jcbTipo.setSelectedItem((Rol)objTarifarioGet.getRolTipo_asistencial());
                jlblAsteriscoCosto.setText("");
                jlblAsteriscoServicio.setText("");
                jlblAsteriscoSigla.setText("");
    }//GEN-LAST:event_jtblServiciosDisponiblesMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      if(jlblAsteriscoCosto.getText().isEmpty()&&jlblAsteriscoServicio.getText().isEmpty() && jlblAsteriscoSigla.getText().isEmpty()){         
        objTarifarioGet.setCodigo(jtfSigla.getText());
        objTarifarioGet.setDescripcion(jtfServicioNombre.getText());
        objTarifarioGet.setPrecio(Float.parseFloat(jtfCosto.getText()));
        objTarifarioGet.setRolTipo_asistencial((Rol)jcbTipo.getSelectedItem());
        jpa.getTransaction().begin();
        jpa.persist(objTarifarioGet);
        jpa.createQuery("update Tarifario set id_RolTipo_asistencial="+( (Rol)jcbTipo.getSelectedItem()).getId()+"where id_Tarifario="+objTarifarioGet.getId()).executeUpdate();
        jpa.flush();
        ConsultaBD();
        principalEjecucion();
        JOptionPane.showMessageDialog(jLabel1, "Guardado con Exito");
        limpiar();
        jpa.getTransaction().commit();}
      else{
          JOptionPane.showMessageDialog(jLabel1, "LLENE LOS ESPACIOS CON *");
      }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtfCostoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCostoKeyTyped
        char validar=evt.getKeyChar();
        if(!Character.isDigit(validar)){
            if(validar!='.'){
                evt.consume();  
                }
            }     
        
        if (jtfCosto.getText().length()>=6){ 
         evt.consume(); 
         }
        if(' '==evt.getKeyChar()){
            evt.consume();
        }
    }//GEN-LAST:event_jtfCostoKeyTyped

    private void jtfServicioNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfServicioNombreKeyReleased
        if(jtfServicioNombre.getText().isEmpty()){
            jlblAsteriscoServicio.setText("*");
        }
        else{
            jlblAsteriscoServicio.setText("");
        }
    }//GEN-LAST:event_jtfServicioNombreKeyReleased

    private void jtfCostoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCostoKeyReleased
        if(jtfCosto.getText().isEmpty()){
            jlblAsteriscoCosto.setText("*");
        }
        else{
            jlblAsteriscoCosto.setText("");
        }
    }//GEN-LAST:event_jtfCostoKeyReleased

    private void jtfSiglaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfSiglaKeyReleased
        if(jtfSigla.getText().isEmpty()){
            jlblAsteriscoSigla.setText("*");
        }
        else{
            jlblAsteriscoSigla.setText("");
        }
    }//GEN-LAST:event_jtfSiglaKeyReleased

    public void limpiar(){
        jlblAsteriscoCosto.setText("*");
        jlblAsteriscoServicio.setText("*");
        jlblAsteriscoSigla.setText("*");
        jtfCosto.setText("");
        jtfServicioNombre.setText("");
        jtfSigla.setText("");
    }
    public void llenarTabla(List<Tarifario> list_tarifario){ 
        DefaultTableModel modelo;
        Object[] fila_actividad;
             //.....................................TABLA......................................
             String [] lista={"C�digo","Descripci�n","Precio","Tipo"};
             modelo=new DefaultTableModel(null,lista){
                 boolean[] canEdit = new boolean [] {
                     false, false, false, false};
                 @Override
                 public boolean isCellEditable(int rowIndex, int columnIndex) {
                     return canEdit [columnIndex];
                     }
                 };
             //.....................................TABLA...........Fin......................
            
             fila_actividad=new Object[modelo.getColumnCount()];  
             for(Tarifario objTarifa: Lista_Tarifario){   
                 fila_actividad[0]=objTarifa.getCodigo();
                 fila_actividad[1]=objTarifa;
                 fila_actividad[2]=objTarifa.getPrecio();
                 fila_actividad[3]=objTarifa.getRolTipo_asistencial().getNombre_rol();
                 modelo.addRow(fila_actividad);//agregando filas
                 }
            jtblServiciosDisponibles.setModel(modelo); 
            jtblServiciosDisponibles.setGridColor(Color.black);
            //jTable1.setBackground(Color.red);
            //jTable1.setForeground(Color.blue);
            DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
            tcr.setHorizontalAlignment(SwingConstants.CENTER);
            jtblServiciosDisponibles.getColumnModel().getColumn(0).setCellRenderer(tcr);
            jtblServiciosDisponibles.getColumnModel().getColumn(1).setCellRenderer(tcr);
            jtblServiciosDisponibles.getColumnModel().getColumn(2).setCellRenderer(tcr);
            jtblServiciosDisponibles.getColumnModel().getColumn(3).setCellRenderer(tcr);

            
            jtblServiciosDisponibles.setFont(new java.awt.Font("Tahoma", 0, 15));
            jtblServiciosDisponibles.getTableHeader().setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 20));
            jtblServiciosDisponibles.getTableHeader().setBackground(Color.BLUE);
            jtblServiciosDisponibles.getTableHeader().setPreferredSize(new java.awt.Dimension(0, 30));
            jtblServiciosDisponibles.getColumnModel().getColumn(0).setPreferredWidth(10);
            jtblServiciosDisponibles.getColumnModel().getColumn(1).setPreferredWidth(320);
            jtblServiciosDisponibles.getColumnModel().getColumn(2).setPreferredWidth(10);
            jtblServiciosDisponibles.getColumnModel().getColumn(3).setPreferredWidth(40);
      
            
            ((DefaultTableCellRenderer)jtblServiciosDisponibles.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
            //864-550=64
            

    
           
    }   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JPanel body2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel head;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<Rol> jcbTipo;
    private javax.swing.JLabel jlblAsteriscoCosto;
    private javax.swing.JLabel jlblAsteriscoServicio;
    private javax.swing.JLabel jlblAsteriscoSigla;
    private javax.swing.JTable jtblServiciosDisponibles;
    private javax.swing.JTextField jtfCosto;
    private javax.swing.JTextField jtfServicioNombre;
    private javax.swing.JTextField jtfSigla;
    // End of variables declaration//GEN-END:variables

    
    
    
    

}
