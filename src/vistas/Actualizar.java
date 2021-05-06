package vistas;

import dao.ItemDAO;
import vo.ItemVO;
import java.awt.event.KeyEvent;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import utilidades.Cadenas;
import tablas.TablaSeleccionarItem;
import static vistas.Seleccionar.scrollSeleccionar;

public class Actualizar extends JDialog {

    TablaSeleccionarItem tabla;

    public Actualizar(Principal parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        tabla = new TablaSeleccionarItem(tablaActualizarItem, scrrolActualizar);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        scrrolActualizar = new javax.swing.JScrollPane();
        tablaActualizarItem = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        botonBuscar = new javax.swing.JButton();
        botonSeleccionar = new javax.swing.JButton();

        setTitle("Consultar");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(800, 450));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 450));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 450));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Actualizar Item", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(36, 63, 139))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaActualizarItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Item", "Equipo", "Marca", "Modelo", "Caracteristicas", "Costo", "Iva", "Lista 003", "Lista 004", "Lista 005", "F.Vigencia", "Proveedor", "T.Entrega", "Garantia", "cum", "Invima", "Lista 002", "Lista 006"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaActualizarItem.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaActualizarItem.getTableHeader().setReorderingAllowed(false);
        tablaActualizarItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaActualizarItemMouseClicked(evt);
            }
        });
        scrrolActualizar.setViewportView(tablaActualizarItem);
        if (tablaActualizarItem.getColumnModel().getColumnCount() > 0) {
            tablaActualizarItem.getColumnModel().getColumn(0).setMinWidth(0);
            tablaActualizarItem.getColumnModel().getColumn(0).setPreferredWidth(0);
            tablaActualizarItem.getColumnModel().getColumn(0).setMaxWidth(0);
            tablaActualizarItem.getColumnModel().getColumn(1).setMinWidth(60);
            tablaActualizarItem.getColumnModel().getColumn(1).setPreferredWidth(60);
            tablaActualizarItem.getColumnModel().getColumn(1).setMaxWidth(60);
            tablaActualizarItem.getColumnModel().getColumn(7).setMinWidth(35);
            tablaActualizarItem.getColumnModel().getColumn(7).setPreferredWidth(35);
            tablaActualizarItem.getColumnModel().getColumn(7).setMaxWidth(35);
        }

        jPanel2.add(scrrolActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 1280, 440));

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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Refresh_104px.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 106, 106));

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

        botonSeleccionar.setBackground(new java.awt.Color(0, 194, 232));
        botonSeleccionar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botonSeleccionar.setForeground(new java.awt.Color(255, 255, 255));
        botonSeleccionar.setText("Seleccionar");
        botonSeleccionar.setBorderPainted(false);
        botonSeleccionar.setContentAreaFilled(false);
        botonSeleccionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonSeleccionar.setFocusPainted(false);
        botonSeleccionar.setOpaque(true);
        botonSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeleccionarActionPerformed(evt);
            }
        });
        jPanel2.add(botonSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 610, 140, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 650));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            buscarEnTabla();
        }
    }//GEN-LAST:event_txtBuscarKeyPressed

    private void tablaActualizarItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaActualizarItemMouseClicked
        if (evt.getClickCount() == 2) {
            int fila = tablaActualizarItem.getSelectedRow();
            int id = (int) tablaActualizarItem.getValueAt(fila, 0);

            ItemDAO dao = new ItemDAO();
            ItemVO vo = dao.obtener(id);

            TablaActualizar tablaModificar = new TablaActualizar(null, vo, id, this);
            tablaModificar.setVisible(true);
        }
    }//GEN-LAST:event_tablaActualizarItemMouseClicked

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        buscarEnTabla();
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeleccionarActionPerformed
        int fila = tablaActualizarItem.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione el ITEM que desea actualizar!!!");
        } else if (fila != -1) {
            int id = (int) tablaActualizarItem.getValueAt(fila, 0);

            ItemDAO dao = new ItemDAO();
            ItemVO vo = dao.obtener(id);

            TablaActualizar tablaModificar = new TablaActualizar(null, vo, id, this);
            tablaModificar.setVisible(true);
        }
    }//GEN-LAST:event_botonSeleccionarActionPerformed

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

    public void resetear() {
        if (tabla == null) {
            tabla = new TablaSeleccionarItem(tablaActualizarItem, scrollSeleccionar);
        } else {
            txtBuscar.setText("");
            buscarEnTabla();
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    public javax.swing.JButton botonSeleccionar;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JScrollPane scrrolActualizar;
    public javax.swing.JTable tablaActualizarItem;
    public javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

}
