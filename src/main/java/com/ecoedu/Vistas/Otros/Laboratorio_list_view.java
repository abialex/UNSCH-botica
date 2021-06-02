package com.ecoedu.Vistas.Otros;




import com.ecoedu.Vistas.soloMayusculas;
import com.ecoedu.Vistas.vista_base.Principal;
import com.ecoedu.model.Laboratorio;
import com.ecoedu.model.Proveedor;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import com.ecoedu.model.Rol;
import com.ecoedu.model.Tipo_Roles;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.Collections;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;




/*Modficacion
1-agregar registrar un medicamento nuevo,cantidad,precio;
2-agregar cantidad a un medicamento ya existente;
3-Modificar precio Unitario de un Medicamento ya existente;
*/
public class Laboratorio_list_view extends javax.swing.JPanel{   
    List<Laboratorio> lista_laboratorio;
    EntityManager jpa;
    Principal objPrincipal;
    
    Laboratorio objLaboratorio=new Laboratorio();
    
    
    public Laboratorio_list_view(EntityManager objJPA,Principal OBJPrincipal) {
        initComponents();
        this.jpa=objJPA;
        this.objPrincipal=OBJPrincipal;
           
    }
    public void ConsultaBD(){
        Query query1=jpa.createQuery("SELECT p FROM Laboratorio p");
        lista_laboratorio=query1.getResultList();    
    }   
    public void principalEjecucion(){  
          jbtnGuardar.setEnabled(false);
        llenar_tabla_Medicamento(lista_laboratorio);
          jtfNombre.setDocument(new soloMayusculas());
          jbtnGuardar.setText("GUARDAR");
    }

    public void llenar_tabla_Medicamento(List<Laboratorio> list_laboratorio){
        DefaultTableModel modelo;
        Object[] fila_actividad;
             //.....................................TABLA......................................
                String [] lista={"Nombre","Abreviatura"}; 
             modelo=new DefaultTableModel(null,lista){
                 boolean[] canEdit = new boolean [] {false, false};
                 public boolean isCellEditable(int rowIndex, int columnIndex) {
                     return canEdit [columnIndex];
                     }
                 };
             //.....................................TABLA...........Fin......................          
             fila_actividad=new Object[modelo.getColumnCount()];  
             for (int i=list_laboratorio.size()-1;i>=0;i--){
                 fila_actividad[0]=list_laboratorio.get(i);
                 fila_actividad[1]=list_laboratorio.get(i).getAbreviatura();
                 modelo.addRow(fila_actividad);//agregando filas
                 }             
            jbtlLaboratorio.setModel(modelo); 
            jbtlLaboratorio.setGridColor(Color.black);
            DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
            tcr.setHorizontalAlignment(SwingConstants.CENTER);
            jbtlLaboratorio.getColumnModel().getColumn(0).setCellRenderer(tcr);
            jbtlLaboratorio.getColumnModel().getColumn(1).setCellRenderer(tcr);

   
            jbtlLaboratorio.setFont(new java.awt.Font("Tahoma", 0, 15));
            jbtlLaboratorio.getTableHeader().setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 20));
            jbtlLaboratorio.getTableHeader().setBackground(Color.BLUE);
            jbtlLaboratorio.getTableHeader().setPreferredSize(new java.awt.Dimension(0, 30));
            jbtlLaboratorio.getColumnModel().getColumn(0).setPreferredWidth(100);
            jbtlLaboratorio.getColumnModel().getColumn(1).setPreferredWidth(150); 
            ((DefaultTableCellRenderer)jbtlLaboratorio.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
            //864-550=64                  
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        head = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        bodyCard = new javax.swing.JPanel();
        vistaLlenar = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jbtlLaboratorio = new javax.swing.JTable();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaDescripcion = new javax.swing.JTextArea();
        jtfNombre = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtfAbreviatura = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jbtnGuardar = new javax.swing.JButton();
        jlblAsteriscoNombre = new javax.swing.JLabel();
        jlblMensaje = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 255, 204));
        setInheritsPopupMenu(true);
        setMaximumSize(new java.awt.Dimension(6666, 6504));
        setMinimumSize(new java.awt.Dimension(5555, 6502));
        setPreferredSize(new java.awt.Dimension(900, 650));
        setLayout(new java.awt.BorderLayout());

        head.setBackground(new java.awt.Color(255, 51, 51));
        head.setPreferredSize(new java.awt.Dimension(900, 70));

        jLabel12.setBackground(new java.awt.Color(255, 102, 102));
        jLabel12.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("LABORATORIOS");
        jLabel12.setPreferredSize(new java.awt.Dimension(900, 70));
        head.add(jLabel12);

        add(head, java.awt.BorderLayout.PAGE_START);

        bodyCard.setLayout(new java.awt.CardLayout());

        vistaLlenar.setBackground(new java.awt.Color(255, 255, 255));
        vistaLlenar.setLayout(new java.awt.BorderLayout());

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new java.awt.BorderLayout());

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setLayout(new java.awt.BorderLayout());

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jScrollPane4.setPreferredSize(new java.awt.Dimension(452, 200));

        jbtlLaboratorio.setBorder(new javax.swing.border.MatteBorder(null));
        jbtlLaboratorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Fecha", "Producto Farmaceutico"
            }
        ));
        jbtlLaboratorio.setFocusable(false);
        jbtlLaboratorio.setGridColor(new java.awt.Color(0, 0, 0));
        jbtlLaboratorio.setMaximumSize(new java.awt.Dimension(2147483647, 32312310));
        jbtlLaboratorio.setMinimumSize(new java.awt.Dimension(500, 100));
        jbtlLaboratorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtlLaboratorioMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jbtlLaboratorio);

        jPanel10.add(jScrollPane4, java.awt.BorderLayout.CENTER);

        jLabel29.setPreferredSize(new java.awt.Dimension(10, 14));
        jPanel10.add(jLabel29, java.awt.BorderLayout.LINE_START);

        jLabel30.setPreferredSize(new java.awt.Dimension(10, 10));
        jPanel10.add(jLabel30, java.awt.BorderLayout.LINE_END);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jLabel33.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("LIsta de laboratorios");
        jLabel33.setPreferredSize(new java.awt.Dimension(300, 30));
        jPanel11.add(jLabel33);

        jPanel10.add(jPanel11, java.awt.BorderLayout.PAGE_START);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setPreferredSize(new java.awt.Dimension(100, 35));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Doble click para Modificar");
        jLabel7.setPreferredSize(new java.awt.Dimension(330, 25));
        jPanel12.add(jLabel7);

        jPanel10.add(jPanel12, java.awt.BorderLayout.PAGE_END);

        jPanel9.add(jPanel10, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 200));

        jtaDescripcion.setColumns(20);
        jtaDescripcion.setRows(5);
        jScrollPane1.setViewportView(jtaDescripcion);

        jPanel7.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 730, -1));

        jtfNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtfNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfNombreKeyReleased(evt);
            }
        });
        jPanel7.add(jtfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 290, 25));

        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Nombre: ");
        jLabel9.setPreferredSize(new java.awt.Dimension(330, 25));
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 70, -1));

        jLabel10.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Abreviatura");
        jLabel10.setPreferredSize(new java.awt.Dimension(330, 25));
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 100, -1));

        jtfAbreviatura.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtfAbreviatura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfAbreviatura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfAbreviaturaKeyReleased(evt);
            }
        });
        jPanel7.add(jtfAbreviatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, 290, 25));

        jLabel11.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Descripción");
        jLabel11.setPreferredSize(new java.awt.Dimension(330, 25));
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 90, -1));

        jLabel28.setText("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        jLabel28.setPreferredSize(new java.awt.Dimension(700, 14));
        jPanel7.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 900, 10));

        jLabel31.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Laboratorio");
        jLabel31.setPreferredSize(new java.awt.Dimension(300, 30));
        jPanel7.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 230, -1));

        jbtnGuardar.setBackground(new java.awt.Color(0, 0, 0));
        jbtnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnGuardar.setText("GUARDAR");
        jbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarActionPerformed(evt);
            }
        });
        jbtnGuardar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnGuardarKeyPressed(evt);
            }
        });
        jPanel7.add(jbtnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, 180, -1));

        jlblAsteriscoNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblAsteriscoNombre.setForeground(new java.awt.Color(255, 0, 0));
        jlblAsteriscoNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblAsteriscoNombre.setText("*");
        jPanel7.add(jlblAsteriscoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 10, 25));

        jlblMensaje.setForeground(new java.awt.Color(153, 0, 0));
        jlblMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblMensaje.setAutoscrolls(true);
        jlblMensaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel7.add(jlblMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, 180, 30));

        jPanel13.add(jPanel7, java.awt.BorderLayout.CENTER);

        vistaLlenar.add(jPanel13, java.awt.BorderLayout.CENTER);

        bodyCard.add(vistaLlenar, "card3");

        add(bodyCard, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtlLaboratorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtlLaboratorioMouseClicked

        objLaboratorio=(Laboratorio)jbtlLaboratorio.getValueAt(jbtlLaboratorio.getSelectedRow(),0);
        jbtnGuardar.setEnabled(true);
        jtfNombre.setText(objLaboratorio.getNombre());
        jtfAbreviatura.setText(objLaboratorio.getAbreviatura());
        jtaDescripcion.setText(objLaboratorio.getDescripcion());
        jbtnGuardar.setText("MODIFICAR");
        jlblAsteriscoNombre.setText("");
  

    }//GEN-LAST:event_jbtlLaboratorioMouseClicked

    private void jtfNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreKeyReleased
            jbtnGuardar.setEnabled(true);
        if(jtfNombre.getText().isEmpty()){
            jlblAsteriscoNombre.setText("*");
        }
        else{
            jlblAsteriscoNombre.setText("");
        }
    }//GEN-LAST:event_jtfNombreKeyReleased

    private void jtfAbreviaturaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfAbreviaturaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfAbreviaturaKeyReleased

    private void jbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarActionPerformed
        guardar_laboratorio();

    }//GEN-LAST:event_jbtnGuardarActionPerformed
     public void guardar_laboratorio(){
        if(!jtfNombre.getText().isEmpty()){
        
        Laboratorio objLaboratorioNew=new Laboratorio();
        objLaboratorioNew.setNombre(jtfNombre.getText());
        objLaboratorioNew.setAbreviatura(jtfAbreviatura.getText());
        objLaboratorioNew.setDescripcion(jtaDescripcion.getText());
            
        objLaboratorio.setNombre(jtfNombre.getText());
        objLaboratorio.setAbreviatura(jtfAbreviatura.getText());
        objLaboratorio.setDescripcion(jtaDescripcion.getText());
        jpa.getTransaction().begin();
            if(jbtnGuardar.getText().equals("GUARDAR")){
                 jpa.persist(objLaboratorioNew);
            }
            else{
                 jpa.persist(objLaboratorio);
            }
        jpa.getTransaction().commit();
        jtfNombre.setText("");
        jtfAbreviatura.setText("");
        jtaDescripcion.setText("");
        ConsultaBD();
        llenar_tabla_Medicamento(lista_laboratorio);
        jbtnGuardar.setEnabled(false);
        jbtnGuardar.setText("GUARDAR");
        jlblMensaje.setText("guardó con éxito");
        }
        else{
            JOptionPane.showMessageDialog(jPanel7, "ingrese un nombre");
        }
        
    }
    private void jbtnGuardarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnGuardarKeyPressed
   
    }//GEN-LAST:event_jbtnGuardarKeyPressed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodyCard;
    private javax.swing.JPanel head;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jbtlLaboratorio;
    private javax.swing.JButton jbtnGuardar;
    private javax.swing.JLabel jlblAsteriscoNombre;
    private javax.swing.JLabel jlblMensaje;
    private javax.swing.JTextArea jtaDescripcion;
    private javax.swing.JTextField jtfAbreviatura;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JPanel vistaLlenar;
    // End of variables declaration//GEN-END:variables

    
    
    

}
