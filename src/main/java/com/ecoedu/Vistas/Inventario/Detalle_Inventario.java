package com.ecoedu.Vistas.Inventario;


import com.ecoedu.Vistas.Herramienta;
import com.ecoedu.Vistas.vista_base.Principal;
import com.ecoedu.model.Detalle_llenado;
import com.ecoedu.model.Usuario;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.JLabel;
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

/*
1-agregar registrar un medicamento nuevo,cantidad,precio;
2-agregar cantidad a un medicamento ya existente;
3-Modificar precio Unitario de un Medicamento ya existente;
*/
public class Detalle_Inventario extends javax.swing.JPanel {   
    List<Detalle_llenado> Lista_Detalle_Llenado;
    EntityManager jpa;
    Principal objPrincipal;
    List<Usuario> lista_Usuario=new ArrayList<>();
    public Detalle_Inventario(EntityManager objJPA,Principal OBJPrincipal) {
        initComponents();
        this.jpa=objJPA;
        this.objPrincipal=OBJPrincipal;
        ConsultaBD();
        principalEjecucion(); 
           
    }
    public void ConsultaBD(){
        Query query1=jpa.createQuery("SELECT p FROM Detalle_llenado p");
        Lista_Detalle_Llenado=query1.getResultList();      
    }   
    public void principalEjecucion(){
        for (Detalle_llenado detalle_llenado : Lista_Detalle_Llenado){
            boolean auxInventario=true;
            for (Usuario objUsuario : lista_Usuario){
                if(objUsuario==detalle_llenado.getUsuario()){
                    auxInventario=false;		
                    break;
                    }
                }
            if(auxInventario){
                lista_Usuario.add(detalle_llenado.getUsuario());
                }
            }
        for (Usuario usuario : lista_Usuario){
            jcbUsuarioLlenador.addItem(usuario);
            }
        llenar_tabla_de_inventario(Lista_Detalle_Llenado);
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        head = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        bodyCard = new javax.swing.JPanel();
        vista1 = new javax.swing.JPanel();
        head2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jlblDesde = new javax.swing.JLabel();
        jcbYearDesde = new rojeru_san.componentes.RSDateChooser();
        jlblHasta = new javax.swing.JLabel();
        jcbYearHasta = new rojeru_san.componentes.RSDateChooser();
        jlblQuimico = new javax.swing.JLabel();
        jcbUsuarioLlenador = new javax.swing.JComboBox<>();
        body2 = new javax.swing.JPanel();
        vista11 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblDetalle_Llenado = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 255, 204));
        setInheritsPopupMenu(true);
        setMaximumSize(new java.awt.Dimension(6666, 6504));
        setMinimumSize(new java.awt.Dimension(5555, 6502));
        setPreferredSize(new java.awt.Dimension(900, 650));
        setLayout(new java.awt.BorderLayout());

        head.setBackground(new java.awt.Color(0, 102, 102));
        head.setPreferredSize(new java.awt.Dimension(900, 70));

        jLabel12.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("DETALLE INVENTARIO");
        jLabel12.setPreferredSize(new java.awt.Dimension(900, 70));
        head.add(jLabel12);

        add(head, java.awt.BorderLayout.PAGE_START);

        bodyCard.setLayout(new java.awt.CardLayout());

        vista1.setBackground(new java.awt.Color(255, 255, 255));
        vista1.setLayout(new java.awt.BorderLayout());

        head2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setPreferredSize(new java.awt.Dimension(890, 100));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(880, 30));
        jPanel1.setRequestFocusEnabled(false);

        jLabel1.setPreferredSize(new java.awt.Dimension(50, 30));
        jPanel1.add(jLabel1);

        jLabel2.setPreferredSize(new java.awt.Dimension(50, 30));
        jPanel1.add(jLabel2);

        jPanel7.add(jPanel1);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setPreferredSize(new java.awt.Dimension(880, 40));

        jlblDesde.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jlblDesde.setText("Desde :");
        jPanel8.add(jlblDesde);

        jcbYearDesde.setFormatoFecha("dd/MM/yyyy ");
        jcbYearDesde.setPlaceholder("Desde ");
        jcbYearDesde.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel8.add(jcbYearDesde);

        jlblHasta.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jlblHasta.setText("Hasta :");
        jPanel8.add(jlblHasta);

        jcbYearHasta.setFormatoFecha("dd/MM/yyyy\n");
        jcbYearHasta.setPlaceholder("Hasta");
        jcbYearHasta.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel8.add(jcbYearHasta);

        jlblQuimico.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jlblQuimico.setText("Qu�mica(o):");
        jPanel8.add(jlblQuimico);

        jcbUsuarioLlenador.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jcbUsuarioLlenador.setPreferredSize(new java.awt.Dimension(260, 30));
        jPanel8.add(jcbUsuarioLlenador);

        jPanel7.add(jPanel8);

        head2.add(jPanel7);

        vista1.add(head2, java.awt.BorderLayout.PAGE_START);

        body2.setBackground(new java.awt.Color(255, 255, 255));
        body2.setMaximumSize(new java.awt.Dimension(1990, 650));
        body2.setMinimumSize(new java.awt.Dimension(200, 200));
        body2.setPreferredSize(new java.awt.Dimension(9900, 520));
        body2.setLayout(new java.awt.BorderLayout());

        vista11.setBackground(new java.awt.Color(255, 255, 255));
        vista11.setPreferredSize(new java.awt.Dimension(900, 350));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setPreferredSize(new java.awt.Dimension(900, 250));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jtblDetalle_Llenado.setBorder(new javax.swing.border.MatteBorder(null));
        jtblDetalle_Llenado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Fecha", "Producto Farmaceutico", "Cantidad", "Monto"
            }
        ));
        jtblDetalle_Llenado.setGridColor(new java.awt.Color(0, 0, 0));
        jtblDetalle_Llenado.setMinimumSize(new java.awt.Dimension(500, 100));
        jtblDetalle_Llenado.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(jtblDetalle_Llenado);

        jPanel9.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Consulta ");
        jPanel9.add(jLabel11, java.awt.BorderLayout.PAGE_END);

        jLabel14.setPreferredSize(new java.awt.Dimension(10, 14));
        jPanel9.add(jLabel14, java.awt.BorderLayout.LINE_END);

        jLabel18.setPreferredSize(new java.awt.Dimension(10, 14));
        jPanel9.add(jLabel18, java.awt.BorderLayout.LINE_START);

        vista11.add(jPanel9);

        body2.add(vista11, java.awt.BorderLayout.CENTER);

        vista1.add(body2, java.awt.BorderLayout.CENTER);

        bodyCard.add(vista1, "card2");

        add(bodyCard, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body2;
    private javax.swing.JPanel bodyCard;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JPanel head;
    private javax.swing.JPanel head2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<Usuario> jcbUsuarioLlenador;
    private rojeru_san.componentes.RSDateChooser jcbYearDesde;
    private rojeru_san.componentes.RSDateChooser jcbYearHasta;
    private javax.swing.JLabel jlblDesde;
    private javax.swing.JLabel jlblHasta;
    private javax.swing.JLabel jlblQuimico;
    private javax.swing.JTable jtblDetalle_Llenado;
    private javax.swing.JPanel vista1;
    private javax.swing.JPanel vista11;
    // End of variables declaration//GEN-END:variables

    public void llenar_tabla_de_inventario(List<Detalle_llenado> listaDetalleLlenado){
        Collections.sort(listaDetalleLlenado);
        DefaultTableModel modelo;
        Object[] fila_actividad;
             //.....................................TABLA......................................
             String [] lista={"Fecha de llenado","Qu�mica(o)","Producto Farmaceutico","Cant","P.U","P.V.R","C�digo lote"}; 
             modelo=new DefaultTableModel(null,lista){
                 boolean[] canEdit = new boolean [] {false, false, false, false,false,false,false};
                 public boolean isCellEditable(int rowIndex, int columnIndex) {
                     return canEdit [columnIndex];
                     }
                 };
             //.....................................TABLA...........Fin......................
            
             fila_actividad=new Object[modelo.getColumnCount()];  
             for (int i = 0; i < listaDetalleLlenado.size(); i++){
                 fila_actividad[0]=Herramienta.formatoFecha(listaDetalleLlenado.get(i).getFecha_de_registro());
                 fila_actividad[1]=listaDetalleLlenado.get(i).getUsuario().getPersona().getInfoPersona();
                 fila_actividad[2]=listaDetalleLlenado.get(i).getMedicamento().getNombre(); 
                 fila_actividad[3]=listaDetalleLlenado.get(i).getCantidad(); 
                 fila_actividad[4]=listaDetalleLlenado.get(i).getPrecio_unitario();
                 fila_actividad[5]=listaDetalleLlenado.get(i).getLote_detalle().getPrecio_Venta_Redondeado();
                 fila_actividad[6]=listaDetalleLlenado.get(i).getLote_detalle().getCodigo();  

                 
                 modelo.addRow(fila_actividad);//agregando filas
                 }
             
            jtblDetalle_Llenado.setModel(modelo); 
            jtblDetalle_Llenado.setGridColor(Color.black);
            //jTable1.setBackground(Color.red);
            //jTable1.setForeground(Color.blue);
            DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
            tcr.setHorizontalAlignment(SwingConstants.CENTER);
            jtblDetalle_Llenado.getColumnModel().getColumn(0).setCellRenderer(tcr);
            jtblDetalle_Llenado.getColumnModel().getColumn(1).setCellRenderer(tcr);
            jtblDetalle_Llenado.getColumnModel().getColumn(2).setCellRenderer(tcr);
            jtblDetalle_Llenado.getColumnModel().getColumn(3).setCellRenderer(tcr);
            jtblDetalle_Llenado.getColumnModel().getColumn(4).setCellRenderer(tcr);
            jtblDetalle_Llenado.getColumnModel().getColumn(5).setCellRenderer(tcr);
            jtblDetalle_Llenado.getColumnModel().getColumn(6).setCellRenderer(tcr);
   
        
   
            jtblDetalle_Llenado.setFont(new java.awt.Font("Tahoma", 0, 14));
            jtblDetalle_Llenado.getTableHeader().setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 16));
            jtblDetalle_Llenado.getTableHeader().setBackground(Color.BLUE);
            jtblDetalle_Llenado.getTableHeader().setPreferredSize(new java.awt.Dimension(0, 30));
            jtblDetalle_Llenado.getColumnModel().getColumn(0).setPreferredWidth(70);
            jtblDetalle_Llenado.getColumnModel().getColumn(1).setPreferredWidth(170);
            jtblDetalle_Llenado.getColumnModel().getColumn(2).setPreferredWidth(200);
            jtblDetalle_Llenado.getColumnModel().getColumn(3).setPreferredWidth(50);  
            jtblDetalle_Llenado.getColumnModel().getColumn(4).setPreferredWidth(50);  
            jtblDetalle_Llenado.getColumnModel().getColumn(5).setPreferredWidth(50);  
            jtblDetalle_Llenado.getColumnModel().getColumn(6).setPreferredWidth(100);
            
            ((DefaultTableCellRenderer)jtblDetalle_Llenado.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
            //864-550=64                  
    }
    
    
    
    

}
