package com.ecoedu.Vistas.Tarifario;




import com.ecoedu.Vistas.soloMayusculas;
import com.ecoedu.model.Rol;
import com.ecoedu.model.Tarifario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yrma
 */
public class Crear_Tarifario extends javax.swing.JPanel {  
    EntityManager jpa;
    List<Rol> Lista_RolTipoAsistencial;
    public Crear_Tarifario(EntityManager objJPA) {
        initComponents();
        this.jpa=objJPA;   
        jtfNombreServicio.setDocument(new soloMayusculas());        
    }
    public void ConsultaBD(){
        Lista_RolTipoAsistencial=jpa.createQuery("SELECT p FROM Rol p where id_tipo_Roles=6").getResultList();
        }
    public void principalEjecucion(){
        jcbTiposServicios.removeAllItems();
        for (Rol rol : Lista_RolTipoAsistencial) {
            jcbTiposServicios.addItem(rol);
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
        jLabel1 = new javax.swing.JLabel();
        jtfCodigoServicio = new javax.swing.JTextField();
        jtfCosto = new javax.swing.JTextField();
        jtfNombreServicio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jcbTiposServicios = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jlblAsteriscoCodigo = new javax.swing.JLabel();
        jlblAsteriscoServicio = new javax.swing.JLabel();
        jlblAsteriscoCosto = new javax.swing.JLabel();
        jbtnCrearServicio = new javax.swing.JButton();

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
        jLabel12.setText("CREAR TARIFA");
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ingrese los datos correspondientes");
        body2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 80));

        jtfCodigoServicio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtfCodigoServicio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfCodigoServicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfCodigoServicioKeyReleased(evt);
            }
        });
        body2.add(jtfCodigoServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 160, 25));

        jtfCosto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtfCosto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfCosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfCostoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfCostoKeyTyped(evt);
            }
        });
        body2.add(jtfCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 160, 25));

        jtfNombreServicio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtfNombreServicio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfNombreServicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfNombreServicioKeyReleased(evt);
            }
        });
        body2.add(jtfNombreServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 740, 25));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setText("TIPO:");
        body2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, 50, 25));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel5.setText("COSTO:");
        body2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 70, 25));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel6.setText("SERVICIO:");
        body2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 90, 25));

        jcbTiposServicios.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        body2.add(jcbTiposServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, 180, 25));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setText("C�DIGO:");
        body2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 80, 25));

        jlblAsteriscoCodigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblAsteriscoCodigo.setForeground(new java.awt.Color(255, 0, 0));
        jlblAsteriscoCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblAsteriscoCodigo.setText("*");
        body2.add(jlblAsteriscoCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 15, 25));

        jlblAsteriscoServicio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblAsteriscoServicio.setForeground(new java.awt.Color(255, 0, 0));
        jlblAsteriscoServicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblAsteriscoServicio.setText("*");
        body2.add(jlblAsteriscoServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 100, 15, 25));

        jlblAsteriscoCosto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblAsteriscoCosto.setForeground(new java.awt.Color(255, 0, 0));
        jlblAsteriscoCosto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblAsteriscoCosto.setText("*");
        body2.add(jlblAsteriscoCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 15, 25));

        jbtnCrearServicio.setBackground(new java.awt.Color(0, 0, 0));
        jbtnCrearServicio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtnCrearServicio.setForeground(new java.awt.Color(255, 255, 255));
        jbtnCrearServicio.setText("AGREGAR TARIFA");
        jbtnCrearServicio.setPreferredSize(new java.awt.Dimension(200, 25));
        jbtnCrearServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCrearServicioActionPerformed(evt);
            }
        });
        body2.add(jbtnCrearServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, -1, -1));

        body.add(body2, java.awt.BorderLayout.CENTER);

        add(body, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnCrearServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCrearServicioActionPerformed
        if(jlblAsteriscoCodigo.getText().isEmpty() && jlblAsteriscoCosto.getText().isEmpty() && jlblAsteriscoServicio.getText().isEmpty()){
        Tarifario objtTarifario=new Tarifario();
        objtTarifario.setCodigo(jtfCodigoServicio.getText());
        objtTarifario.setDescripcion(jtfNombreServicio.getText());
        objtTarifario.setPrecio(Float.parseFloat(jtfCosto.getText()));
        objtTarifario.setRolTipo_asistencial((Rol)jcbTiposServicios.getSelectedItem());
        jpa.getTransaction().begin();
        jpa.persist(objtTarifario);
        JOptionPane.showMessageDialog(jtfCosto, "Guardado con Exito");
        limpiar();
        jpa.getTransaction().commit();}
        else{
            JOptionPane.showMessageDialog(jLabel1, "LLENE LOS ESPACIOS CON *");
        }
    }//GEN-LAST:event_jbtnCrearServicioActionPerformed

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

    private void jtfNombreServicioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreServicioKeyReleased
        if(jtfNombreServicio.getText().isEmpty()){
            jlblAsteriscoServicio.setText("*");
        }else{
            jlblAsteriscoServicio.setText("");
        }
                
    }//GEN-LAST:event_jtfNombreServicioKeyReleased

    private void jtfCostoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCostoKeyReleased
        if(jtfCosto.getText().isEmpty()){
            jlblAsteriscoCosto.setText("*");
        }else{
            jlblAsteriscoCosto.setText("");
        }
    }//GEN-LAST:event_jtfCostoKeyReleased

    private void jtfCodigoServicioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCodigoServicioKeyReleased
        if(jtfCodigoServicio.getText().isEmpty()){
            jlblAsteriscoCodigo.setText("*");
        }else{
            jlblAsteriscoCodigo.setText("");
        }
    }//GEN-LAST:event_jtfCodigoServicioKeyReleased

    public void limpiar(){
        jtfCodigoServicio.setText("");
        jtfCosto.setText("");
        jtfNombreServicio.setText("");
        jlblAsteriscoCodigo.setText("*");
        jlblAsteriscoCosto.setText("*");
        jlblAsteriscoServicio.setText("*");
    }

    /*
    public void llenarTabla(List<Detalle_Medicamentos> listadetalleMedicamento){ 
        DefaultTableModel modelo;
        Object[] fila_actividad;
             //.....................................TABLA......................................
             String [] lista={"Cantidad","Producto Farmac�utico.","Conc.","F.F","Laboratorio.","Fecha Venc.","P.U","P.T"};
             modelo=new DefaultTableModel(null,lista){
                 boolean[] canEdit = new boolean [] {
                     false, false, false, false, false, false
                         };
                 @Override
                 public boolean isCellEditable(int rowIndex, int columnIndex) {
                     return canEdit [columnIndex];
                     }
                 };
             //.....................................TABLA...........Fin......................
            
             fila_actividad=new Object[modelo.getColumnCount()];  
             for (int i = 0; i < listadetalleMedicamento.size(); i++){                 
                 fila_actividad[0]=listadetalleMedicamento.get(i).getCantidad(); 
                 fila_actividad[1]=listadetalleMedicamento.get(i).getId_Medicamento().getNombre();
                 fila_actividad[2]=listadetalleMedicamento.get(i).getId_Medicamento().getConcentracion();             
                 fila_actividad[3]=listadetalleMedicamento.get(i).getId_Medicamento().getForma_farmaceutica();  
                 fila_actividad[4]=listadetalleMedicamento.get(i).getLote_detalle().getRolFabricante().getNombre_rol();   
                 fila_actividad[5]=Herramienta.formatoFecha(listadetalleMedicamento.get(i).getLote_detalle().getFecha_vencimiento());   
                 fila_actividad[6]=listadetalleMedicamento.get(i).getPrecio_Unitario();
                 fila_actividad[7]=listadetalleMedicamento.get(i).getPrecio_Total();
                 modelo.addRow(fila_actividad);//agregando filas
                 }
            jtblVentas.setModel(modelo); 
            jtblVentas.setGridColor(Color.black);
            //jTable1.setBackground(Color.red);
            //jTable1.setForeground(Color.blue);
            DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
            tcr.setHorizontalAlignment(SwingConstants.CENTER);
            jtblVentas.getColumnModel().getColumn(0).setCellRenderer(tcr);
            jtblVentas.getColumnModel().getColumn(1).setCellRenderer(tcr);
            jtblVentas.getColumnModel().getColumn(2).setCellRenderer(tcr);
            jtblVentas.getColumnModel().getColumn(3).setCellRenderer(tcr);
            jtblVentas.getColumnModel().getColumn(4).setCellRenderer(tcr);
            jtblVentas.getColumnModel().getColumn(5).setCellRenderer(tcr);
            jtblVentas.getColumnModel().getColumn(6).setCellRenderer(tcr);
            jtblVentas.getColumnModel().getColumn(7).setCellRenderer(tcr);
            
            jtblVentas.setFont(new java.awt.Font("Tahoma", 0, 15));
            jtblVentas.getTableHeader().setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 20));
            jtblVentas.getTableHeader().setBackground(Color.BLUE);
            jtblVentas.getTableHeader().setPreferredSize(new java.awt.Dimension(0, 30));
            jtblVentas.getColumnModel().getColumn(0).setPreferredWidth(75);
            jtblVentas.getColumnModel().getColumn(1).setPreferredWidth(200);
            jtblVentas.getColumnModel().getColumn(2).setPreferredWidth(50);
            jtblVentas.getColumnModel().getColumn(3).setPreferredWidth(50);
            jtblVentas.getColumnModel().getColumn(4).setPreferredWidth(100);
            jtblVentas.getColumnModel().getColumn(5).setPreferredWidth(80);
            jtblVentas.getColumnModel().getColumn(6).setPreferredWidth(50);
            jtblVentas.getColumnModel().getColumn(7).setPreferredWidth(50);
            
            ((DefaultTableCellRenderer)jtblVentas.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
            //864-550=64
            

    
           
    }   */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JPanel body2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel head;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbtnCrearServicio;
    private javax.swing.JComboBox<Rol> jcbTiposServicios;
    private javax.swing.JLabel jlblAsteriscoCodigo;
    private javax.swing.JLabel jlblAsteriscoCosto;
    private javax.swing.JLabel jlblAsteriscoServicio;
    private javax.swing.JTextField jtfCodigoServicio;
    private javax.swing.JTextField jtfCosto;
    private javax.swing.JTextField jtfNombreServicio;
    // End of variables declaration//GEN-END:variables

    
    
    
    

}
