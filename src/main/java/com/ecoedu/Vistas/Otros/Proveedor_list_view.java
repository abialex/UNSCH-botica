package com.ecoedu.Vistas.Otros;




import com.ecoedu.Vistas.soloMayusculas;
import com.ecoedu.Vistas.vista_base.Principal;
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
public class Proveedor_list_view extends javax.swing.JPanel{   
    List<Proveedor> lista_proveedores;
    EntityManager jpa;
    Principal objPrincipal;    
    Proveedor objProveedor= new Proveedor();
    
    
    public Proveedor_list_view(EntityManager objJPA,Principal OBJPrincipal) {
        initComponents();
        this.jpa=objJPA;
        this.objPrincipal=OBJPrincipal;
           
    }
    public void ConsultaBD(){
        lista_proveedores=jpa.createQuery("SELECT p FROM Proveedor p ").getResultList();
        //Collections.sort(Lista_LabProv);
    }   
    public void principalEjecucion(){  
        jbtnGuardar.setEnabled(false);
        llenar_tabla_Medicamento(lista_proveedores);
        jtfNombre.setDocument(new soloMayusculas());
        jbtnGuardar.setText("GUARDAR");
        
    }

    public void llenar_tabla_Medicamento(List<Proveedor> lista_proveedor){
        DefaultTableModel modelo;
        Object[] fila_actividad;
             //.....................................TABLA......................................
                String [] lista={"Nombre","abreviatura","dirección"}; 
             modelo=new DefaultTableModel(null,lista){
                 boolean[] canEdit = new boolean [] {false, false, false};
                 public boolean isCellEditable(int rowIndex, int columnIndex) {
                     return canEdit [columnIndex];
                     }
                 };
             //.....................................TABLA...........Fin......................          
             fila_actividad=new Object[modelo.getColumnCount()];  
             for (int i=lista_proveedor.size()-1;i>=0;i--){
                 fila_actividad[0]=lista_proveedor.get(i);
                 fila_actividad[1]=lista_proveedor.get(i).getAbreviatura();
                 fila_actividad[2]=lista_proveedor.get(i).getDireccion();
                 modelo.addRow(fila_actividad);//agregando filas
                 }             
            jbtlProveedor.setModel(modelo); 
            jbtlProveedor.setGridColor(Color.black);
            DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
            tcr.setHorizontalAlignment(SwingConstants.CENTER);
            jbtlProveedor.getColumnModel().getColumn(0).setCellRenderer(tcr);
            jbtlProveedor.getColumnModel().getColumn(1).setCellRenderer(tcr);
            jbtlProveedor.getColumnModel().getColumn(2).setCellRenderer(tcr);
   

   
            jbtlProveedor.setFont(new java.awt.Font("Tahoma", 0, 15));
            jbtlProveedor.getTableHeader().setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 20));
            jbtlProveedor.getTableHeader().setBackground(Color.BLUE);
            jbtlProveedor.getTableHeader().setPreferredSize(new java.awt.Dimension(0, 30));
            
            jbtlProveedor.getColumnModel().getColumn(0).setPreferredWidth(100);
            jbtlProveedor.getColumnModel().getColumn(1).setPreferredWidth(50); 
            jbtlProveedor.getColumnModel().getColumn(2).setPreferredWidth(100); 
 
            
            ((DefaultTableCellRenderer)jbtlProveedor.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
            //864-550=64                  
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        head = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        bodyCard = new javax.swing.JPanel();
        vistaLlenar = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jbtlProveedor = new javax.swing.JTable();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jbtnGuardar = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jlblAsteriscoNombre = new javax.swing.JLabel();
        jtfAbreviatura = new javax.swing.JTextField();
        jtfDIrección = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaDescripcion = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
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
        jLabel12.setText("PROVEEDORES");
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

        jLabel28.setText("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        jLabel28.setPreferredSize(new java.awt.Dimension(700, 14));
        jPanel7.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 900, 10));

        jPanel9.setLayout(new java.awt.BorderLayout());

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jScrollPane4.setPreferredSize(new java.awt.Dimension(452, 200));

        jbtlProveedor.setBorder(new javax.swing.border.MatteBorder(null));
        jbtlProveedor.setModel(new javax.swing.table.DefaultTableModel(
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
        jbtlProveedor.setFocusable(false);
        jbtlProveedor.setGridColor(new java.awt.Color(0, 0, 0));
        jbtlProveedor.setMaximumSize(new java.awt.Dimension(2147483647, 32312310));
        jbtlProveedor.setMinimumSize(new java.awt.Dimension(500, 100));
        jbtlProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtlProveedorMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jbtlProveedor);

        jPanel10.add(jScrollPane4, java.awt.BorderLayout.CENTER);

        jLabel29.setPreferredSize(new java.awt.Dimension(10, 14));
        jPanel10.add(jLabel29, java.awt.BorderLayout.LINE_START);

        jLabel30.setPreferredSize(new java.awt.Dimension(10, 10));
        jPanel10.add(jLabel30, java.awt.BorderLayout.LINE_END);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jLabel33.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("LIsta de proveedores");
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

        jLabel32.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Lista Proveedor / Fabricante");
        jLabel32.setPreferredSize(new java.awt.Dimension(300, 30));
        jPanel7.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 280));

        jLabel31.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Proveedor ");
        jLabel31.setPreferredSize(new java.awt.Dimension(300, 30));
        jPanel7.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 230, -1));

        jlblAsteriscoNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblAsteriscoNombre.setForeground(new java.awt.Color(255, 0, 0));
        jlblAsteriscoNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblAsteriscoNombre.setText("*");
        jPanel7.add(jlblAsteriscoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 10, 25));

        jtfAbreviatura.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtfAbreviatura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfAbreviatura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfAbreviaturaKeyReleased(evt);
            }
        });
        jPanel7.add(jtfAbreviatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, 290, 25));

        jtfDIrección.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtfDIrección.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfDIrección.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfDIrecciónKeyReleased(evt);
            }
        });
        jPanel7.add(jtfDIrección, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 730, 25));

        jLabel11.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Descripción");
        jLabel11.setPreferredSize(new java.awt.Dimension(330, 25));
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 90, -1));

        jtaDescripcion.setColumns(20);
        jtaDescripcion.setRows(5);
        jScrollPane1.setViewportView(jtaDescripcion);

        jPanel7.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 730, -1));

        jLabel13.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Dirección");
        jLabel13.setPreferredSize(new java.awt.Dimension(330, 25));
        jPanel7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 90, -1));

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

    public void modificarProveedorOLaboratorio(){
        /*if(!jtfFabricanteProveedorCambio.getText().isEmpty()){
            jpa.getTransaction().begin();
        if(((String)jcbPROFaCambio.getSelectedItem()).equals("Laboratorio")){
            objFaPro.setNombre_rol(jtfFabricanteProveedorCambio.getText());
            jpa.persist(objFaPro);
            jpa.createNativeQuery("update Rol set id_tipo_Roles=3"+" where id_Rol="+objFaPro.getId()).executeUpdate();
        }
        else{
            jpa.persist(objFaPro);
            jpa.createNativeQuery("update Rol set id_tipo_Roles=2"+" where id_Rol="+objFaPro.getId()).executeUpdate();
            }
        jpa.getTransaction().commit();
        ConsultaBD();
        llenar_tabla_Medicamento(Lista_LabProv);
            
        }
        else{
            JOptionPane.showMessageDialog(jPanel7, "ingrese un nombre");
        }*/
        
    }
    private void jbtlProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtlProveedorMouseClicked
        objProveedor=(Proveedor)jbtlProveedor.getValueAt(jbtlProveedor.getSelectedRow(),0);
        jbtnGuardar.setEnabled(true);
        jtfNombre.setText(objProveedor.getNombre());
        jtfAbreviatura.setText(objProveedor.getAbreviatura());
        jtfDIrección.setText(objProveedor.getDireccion());
        jtaDescripcion.setText(objProveedor.getDescripcion());
        jlblAsteriscoNombre.setText("");
        jbtnGuardar.setText("MODIFICAR");
    }//GEN-LAST:event_jbtlProveedorMouseClicked

    private void jtfNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreKeyReleased
        jbtnGuardar.setEnabled(true);
        if(jtfNombre.getText().isEmpty()){
            jlblAsteriscoNombre.setText("*");
        }
        else{
            jlblAsteriscoNombre.setText("");
        }
    }//GEN-LAST:event_jtfNombreKeyReleased

    public void guardar_proveedor(){
        if(!jtfNombre.getText().isEmpty()){
        
        Proveedor objProveedorNew=new Proveedor();
        objProveedorNew.setNombre(jtfNombre.getText());
        objProveedorNew.setAbreviatura(jtfAbreviatura.getText());
        objProveedorNew.setDireccion(jtfDIrección.getText());
        objProveedorNew.setDescripcion(jtaDescripcion.getText());
            
        objProveedor.setNombre(jtfNombre.getText());
        objProveedor.setAbreviatura(jtfAbreviatura.getText());
        objProveedor.setDireccion(jtfDIrección.getText());
        objProveedor.setDescripcion(jtaDescripcion.getText());
        jpa.getTransaction().begin();
            if(jbtnGuardar.getText().equals("GUARDAR")){
                 jpa.persist(objProveedorNew);
            }
            else{
                 jpa.persist(objProveedor);
            }
        jpa.getTransaction().commit();
        jtfNombre.setText("");
        jtfAbreviatura.setText("");
        jtfDIrección.setText("");
        jtaDescripcion.setText("");
        ConsultaBD();
        llenar_tabla_Medicamento(lista_proveedores);
        jbtnGuardar.setEnabled(false);
        jbtnGuardar.setText("GUARDAR");
        jlblMensaje.setText("guardó con éxito");
        }
        else{
            JOptionPane.showMessageDialog(jPanel7, "ingrese un nombre");
        }
        
    }
    private void jbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarActionPerformed
        guardar_proveedor();
        
    }//GEN-LAST:event_jbtnGuardarActionPerformed

    private void jbtnGuardarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnGuardarKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            guardar_proveedor();
        }
    }//GEN-LAST:event_jbtnGuardarKeyPressed

    private void jtfAbreviaturaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfAbreviaturaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfAbreviaturaKeyReleased

    private void jtfDIrecciónKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfDIrecciónKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfDIrecciónKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodyCard;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JPanel head;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
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
    private javax.swing.JTable jbtlProveedor;
    private javax.swing.JButton jbtnGuardar;
    private javax.swing.JLabel jlblAsteriscoNombre;
    private javax.swing.JLabel jlblMensaje;
    private javax.swing.JTextArea jtaDescripcion;
    private javax.swing.JTextField jtfAbreviatura;
    private javax.swing.JTextField jtfDIrección;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JPanel vistaLlenar;
    // End of variables declaration//GEN-END:variables

    
    
    

}
