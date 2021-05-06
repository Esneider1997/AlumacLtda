package vistas;

import dao.ItemDAO;
import java.awt.event.KeyEvent;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import utilidades.Cadenas;
import tablas.TablaSeleccionarItem;
import static vistas.Seleccionar.scrollSeleccionar;

public class Eliminar extends JDialog {

    TablaSeleccionarItem tabla;

    public Eliminar(Principal parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        tabla = new TablaSeleccionarItem(tablaEliminarRegistros, scrollEliminar);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        scrollEliminar = new javax.swing.JScrollPane();
        tablaEliminarRegistros = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        botonEliminar = new javax.swing.JButton();
        botonBuscar = new javax.swing.JButton();

        setTitle("Consultar");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(800, 450));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 450));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 450));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Eliminar Item", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(36, 63, 139))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaEliminarRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Item", "Equipo", "Marca", "Modelo", "Caracteristicas", "Costo", "Iva", "Lista 003", "Lista 004", "Lista 005", "F.Vigencia", "Proveedor", "T.Entrega", "Garantia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaEliminarRegistros.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaEliminarRegistros.getTableHeader().setReorderingAllowed(false);
        tablaEliminarRegistros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEliminarRegistrosMouseClicked(evt);
            }
        });
        scrollEliminar.setViewportView(tablaEliminarRegistros);
        if (tablaEliminarRegistros.getColumnModel().getColumnCount() > 0) {
            tablaEliminarRegistros.getColumnModel().getColumn(0).setMinWidth(0);
            tablaEliminarRegistros.getColumnModel().getColumn(0).setPreferredWidth(0);
            tablaEliminarRegistros.getColumnModel().getColumn(0).setMaxWidth(0);
            tablaEliminarRegistros.getColumnModel().getColumn(1).setMinWidth(60);
            tablaEliminarRegistros.getColumnModel().getColumn(1).setPreferredWidth(60);
            tablaEliminarRegistros.getColumnModel().getColumn(1).setMaxWidth(60);
            tablaEliminarRegistros.getColumnModel().getColumn(7).setMinWidth(35);
            tablaEliminarRegistros.getColumnModel().getColumn(7).setPreferredWidth(35);
            tablaEliminarRegistros.getColumnModel().getColumn(7).setMaxWidth(35);
        }

        jPanel2.add(scrollEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 1280, 440));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(36, 63, 139));
        jLabel18.setText("Buscar:");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, -1, 30));

        txtBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
        });
        jPanel2.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 290, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Trash_100px_1.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 106, 106));

        botonEliminar.setBackground(new java.awt.Color(0, 194, 232));
        botonEliminar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botonEliminar.setForeground(new java.awt.Color(255, 255, 255));
        botonEliminar.setText("Eliminar");
        botonEliminar.setBorderPainted(false);
        botonEliminar.setContentAreaFilled(false);
        botonEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonEliminar.setFocusPainted(false);
        botonEliminar.setOpaque(true);
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 610, 110, 30));

        botonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Search_30px.png"))); // NOI18N
        botonBuscar.setBorderPainted(false);
        botonBuscar.setContentAreaFilled(false);
        botonBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonBuscar.setDefaultCapable(false);
        botonBuscar.setFocusPainted(false);
        botonBuscar.setFocusable(false);
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 120, 40, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 650));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            buscarEnTabla();
        }
    }//GEN-LAST:event_txtBuscarKeyPressed

    private void tablaEliminarRegistrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEliminarRegistrosMouseClicked

    }//GEN-LAST:event_tablaEliminarRegistrosMouseClicked

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        int fila = tablaEliminarRegistros.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione el ITEM que desea eliminar!!!");
        } else if (fila != -1) {
            int id = (int) tablaEliminarRegistros.getValueAt(fila, 0);
            if (new ItemDAO().eliminar(id)) {
                javax.swing.JOptionPane.showMessageDialog(null, "El codigo Item ha sido eliminado");
                buscarEnTabla();
            } else {
                javax.swing.JOptionPane.showMessageDialog(null, "Error al eliminar el item");
            }
        }

    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        buscarEnTabla();
    }//GEN-LAST:event_botonBuscarActionPerformed

    public void buscarEnTabla() {
        String busqueda = txtBuscar.getText();
        switch (Cadenas.validarAlfanumerico(busqueda)) {
            case -1:
                tabla.busquedaTabla("");
                break;
            case 0:
                JOptionPane.showMessageDialog(null, "Busqueda no valida");
                txtBuscar.requestFocus();
                break;
            default:
                tabla.busquedaTabla(Cadenas.quitaEspacios(busqueda));
        }
    }

    public void limpiarCampos() {
        txtBuscar.setText("");
        txtBuscar.requestFocus();
    }
    
    public void resetear(){
        if (tabla == null) {
            tabla = new TablaSeleccionarItem(tablaEliminarRegistros, scrollSeleccionar);
        }else{
            txtBuscar.setText("");
            buscarEnTabla();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    public javax.swing.JButton botonEliminar;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JScrollPane scrollEliminar;
    public javax.swing.JTable tablaEliminarRegistros;
    public javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

}
