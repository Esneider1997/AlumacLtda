package vistas;

import dao.ItemDAO;
import java.awt.HeadlessException;
import vo.ItemVO;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Date;
import javax.swing.JOptionPane;
import utilidades.BuscadorArchivos;
import utilidades.Cadenas;
import utilidades.Fechas;

public final class TablaActualizar extends javax.swing.JDialog {

    int id;
    Actualizar ventana;
    ItemVO o;
    public TablaActualizar(java.awt.Frame parent, ItemVO vo, int id, Actualizar ventana) {
        super(parent, true);
        initComponents();
        this.id = id;
        this.ventana = ventana;
        cargarDatos(vo);
        this.o = vo;
        setLocationRelativeTo(null);
    }

    public void cargarDatos(ItemVO o) {
        txtCodigoItem.setText(o.getCodigoitem());
        txtEquipo.setText(o.getEquipo());
        txtMarca.setText(o.getMarca());
        txtModelo.setText(o.getModelo());
        txtCaracteristicas.setText(o.getCaracteristicas());
        txtCosto.setText(String.valueOf(o.getCosto()));
        txtPorcentajeIva.setSelectedItem(o.getPorcentajeiva());
        txtFechaVigencia.setDate(o.getFechavigencia());
        txtProveedor.setText(o.getProveedor());
        txtTiempoEntrega.setText(o.getTiempoentrega());
        txtGarantia.setText(o.getGarantia());
        txtCum.setText(o.getCum());
        txtInvima.setText(o.getInvima());
        txtPorcentajeIva.setSelectedItem(o.getPorcentajeiva() + "");
        if (o.getFichaTecnicaPDF() == null) {
            txtInfoPdf.setText("No tiene PDF");
        }else{
            txtInfoPdf.setText("Tiene PDF");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBusqueda = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtCodigoItem = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        botonActualizarItem = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtEquipo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCaracteristicas = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtCosto = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtProveedor = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtTiempoEntrega = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtGarantia = new javax.swing.JTextField();
        botonRuta = new javax.swing.JButton();
        txtRutaFichaTecnica = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jLabel21 = new javax.swing.JLabel();
        txtPorcentajeIva = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        txtFechaVigencia = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        txtInfoPdf = new javax.swing.JLabel();
        verPdf = new javax.swing.JButton();
        txtCum = new javax.swing.JTextField();
        txtInvima = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Actualizar Items", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(36, 63, 139))); // NOI18N
        jPanel1.setMaximumSize(new java.awt.Dimension(900, 450));
        jPanel1.setMinimumSize(new java.awt.Dimension(900, 450));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 450));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCodigoItem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCodigoItem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoItemKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoItemKeyTyped(evt);
            }
        });
        jPanel1.add(txtCodigoItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 100, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(36, 63, 139));
        jLabel8.setText("Codigo item");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, 30));

        botonActualizarItem.setBackground(new java.awt.Color(0, 194, 232));
        botonActualizarItem.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botonActualizarItem.setForeground(new java.awt.Color(255, 255, 255));
        botonActualizarItem.setText("Actualizar");
        botonActualizarItem.setBorderPainted(false);
        botonActualizarItem.setContentAreaFilled(false);
        botonActualizarItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonActualizarItem.setFocusPainted(false);
        botonActualizarItem.setOpaque(true);
        botonActualizarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarItemActionPerformed(evt);
            }
        });
        jPanel1.add(botonActualizarItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 500, 130, 30));

        botonCancelar.setBackground(new java.awt.Color(0, 194, 232));
        botonCancelar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        botonCancelar.setText("Cancelar");
        botonCancelar.setBorderPainted(false);
        botonCancelar.setContentAreaFilled(false);
        botonCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCancelar.setFocusPainted(false);
        botonCancelar.setOpaque(true);
        jPanel1.add(botonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, 120, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(36, 63, 139));
        jLabel9.setText("Equipo");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, 30));

        txtEquipo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtEquipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEquipoKeyPressed(evt);
            }
        });
        jPanel1.add(txtEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 230, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(36, 63, 139));
        jLabel10.setText("Marca");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, 30));

        txtMarca.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMarcaKeyPressed(evt);
            }
        });
        jPanel1.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 230, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(36, 63, 139));
        jLabel11.setText("<html><center>Caracteristicas Tecnicas");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 210, 30));

        txtModelo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtModeloKeyPressed(evt);
            }
        });
        jPanel1.add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 230, 30));

        txtCaracteristicas.setColumns(20);
        txtCaracteristicas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCaracteristicas.setLineWrap(true);
        txtCaracteristicas.setRows(5);
        txtCaracteristicas.setWrapStyleWord(true);
        txtCaracteristicas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCaracteristicasKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(txtCaracteristicas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 510, 120));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(36, 63, 139));
        jLabel12.setText("Modelo");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(36, 63, 139));
        jLabel13.setText("Iva");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 180, -1, 30));

        txtCosto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCostoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCostoKeyTyped(evt);
            }
        });
        jPanel1.add(txtCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 200, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(36, 63, 139));
        jLabel16.setText("F.Vigencia");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 100, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(36, 63, 139));
        jLabel17.setText("Proveedor");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, 30));

        txtProveedor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtProveedorKeyPressed(evt);
            }
        });
        jPanel1.add(txtProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 230, 30));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(36, 63, 139));
        jLabel18.setText("Tiempo Entrega");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 240, -1, 30));

        txtTiempoEntrega.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTiempoEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTiempoEntregaActionPerformed(evt);
            }
        });
        txtTiempoEntrega.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTiempoEntregaKeyPressed(evt);
            }
        });
        jPanel1.add(txtTiempoEntrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 270, 280, 30));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(36, 63, 139));
        jLabel19.setText("Ficha Tecnica");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 300, -1, 30));

        txtGarantia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtGarantia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtGarantiaKeyPressed(evt);
            }
        });
        jPanel1.add(txtGarantia, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 200, 30));

        botonRuta.setText("...");
        botonRuta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRutaActionPerformed(evt);
            }
        });
        jPanel1.add(botonRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 330, 20, 22));

        txtRutaFichaTecnica.setEditable(false);
        txtRutaFichaTecnica.setBackground(new java.awt.Color(153, 153, 153));
        txtRutaFichaTecnica.setEnabled(false);
        jPanel1.add(txtRutaFichaTecnica, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 330, 140, 25));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(36, 63, 139));
        jLabel20.setText("Listas de precios:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, -1, 30));

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Lista 005");
        jCheckBox1.setEnabled(false);
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, -1, -1));

        jCheckBox2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCheckBox2.setSelected(true);
        jCheckBox2.setText("Lista 003");
        jCheckBox2.setEnabled(false);
        jPanel1.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, -1, -1));

        jCheckBox3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCheckBox3.setSelected(true);
        jCheckBox3.setText("Lista 004");
        jCheckBox3.setEnabled(false);
        jPanel1.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(36, 63, 139));
        jLabel21.setText("Garantia");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, -1, 30));

        txtPorcentajeIva.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtPorcentajeIva.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "19" }));
        txtPorcentajeIva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPorcentajeIvaKeyPressed(evt);
            }
        });
        jPanel1.add(txtPorcentajeIva, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 210, 280, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(36, 63, 139));
        jLabel14.setText("Costo");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, -1, 30));

        txtFechaVigencia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtFechaVigencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 110, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("DDMMAAAA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, -1, -1));

        txtInfoPdf.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtInfoPdf.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(txtInfoPdf, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 300, 140, 30));

        verPdf.setBackground(new java.awt.Color(0, 255, 204));
        verPdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-visible-24.png"))); // NOI18N
        verPdf.setToolTipText("Ver opciones creadas");
        verPdf.setContentAreaFilled(false);
        verPdf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        verPdf.setFocusPainted(false);
        verPdf.setFocusable(false);
        verPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verPdfActionPerformed(evt);
            }
        });
        jPanel1.add(verPdf, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 330, 30, 25));

        txtCum.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCumKeyPressed(evt);
            }
        });
        jPanel1.add(txtCum, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 230, 30));

        txtInvima.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtInvima.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtInvimaKeyPressed(evt);
            }
        });
        jPanel1.add(txtInvima, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 230, 30));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(36, 63, 139));
        jLabel22.setText("Codigo CUM");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 90, 30));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(36, 63, 139));
        jLabel23.setText("Codigo CUM");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 90, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonActualizarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarItemActionPerformed
        actualizarItem();
    }//GEN-LAST:event_botonActualizarItemActionPerformed

    private void txtCodigoItemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoItemKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtEquipo.requestFocus();
        }
    }//GEN-LAST:event_txtCodigoItemKeyPressed

    private void txtEquipoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEquipoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtMarca.requestFocus();
        }
    }//GEN-LAST:event_txtEquipoKeyPressed

    private void txtMarcaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarcaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtModelo.requestFocus();
        }
    }//GEN-LAST:event_txtMarcaKeyPressed

    private void txtModeloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModeloKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtCosto.requestFocus();
        }
    }//GEN-LAST:event_txtModeloKeyPressed

    private void txtCostoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCostoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtPorcentajeIva.requestFocus();
        }
    }//GEN-LAST:event_txtCostoKeyPressed

    private void txtPorcentajeIvaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPorcentajeIvaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtFechaVigencia.requestFocus();
        }
    }//GEN-LAST:event_txtPorcentajeIvaKeyPressed

    private void txtProveedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProveedorKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtCaracteristicas.requestFocus();
        }
    }//GEN-LAST:event_txtProveedorKeyPressed

    private void txtCaracteristicasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCaracteristicasKeyPressed
        /*  if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
         txtTiempoEntrega.requestFocus();
         }*/
    }//GEN-LAST:event_txtCaracteristicasKeyPressed

    private void txtTiempoEntregaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTiempoEntregaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtGarantia.requestFocus();
        }
    }//GEN-LAST:event_txtTiempoEntregaKeyPressed

    private void txtGarantiaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGarantiaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            botonActualizarItem.requestFocus();
        }
    }//GEN-LAST:event_txtGarantiaKeyPressed

    private void botonRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRutaActionPerformed
        BuscadorArchivos buscador = new BuscadorArchivos();
        txtRutaFichaTecnica.setText(buscador.buscadorAbrir());
    }//GEN-LAST:event_botonRutaActionPerformed

    private void txtCodigoItemKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoItemKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9' || c == KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCodigoItemKeyTyped

    private void txtCostoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCostoKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9' || c == KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCostoKeyTyped

    private void verPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verPdfActionPerformed
        if (o.getFichaTecnicaPDF() == null) {
            JOptionPane.showMessageDialog(null, "No tiene PDF");
        }else{
            o.abrirPdf();
        }
    }//GEN-LAST:event_verPdfActionPerformed

    private void txtCumKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCumKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCumKeyPressed

    private void txtInvimaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInvimaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInvimaKeyPressed

    private void txtTiempoEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTiempoEntregaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTiempoEntregaActionPerformed
    public boolean actualizarItem() {
        if (validarFormulario()) {
            int costo = (Integer.parseInt((txtCosto.getText())));
            int iva = Integer.parseInt((String) txtPorcentajeIva.getSelectedItem());

            ItemVO vo = new ItemVO(costo, iva);
            vo.setCodigoitem(Cadenas.quitaEspacios(txtCodigoItem.getText()));
            vo.setEquipo(txtEquipo.getText());
            vo.setMarca(txtMarca.getText());
            vo.setModelo(txtModelo.getText());
            vo.setCaracteristicas(txtCaracteristicas.getText());
            vo.setFechavigencia(Fechas.obtenerFecha(txtFechaVigencia.getDate()));
            vo.setProveedor(txtProveedor.getText());
            vo.setTiempoentrega(txtTiempoEntrega.getText());
            vo.setRutaFichaTecnica(txtRutaFichaTecnica.getText());
            vo.setGarantia(txtGarantia.getText());
            vo.setCum(txtCum.getText());
            vo.setInvima(txtInvima.getText());
            
            ItemDAO dao = new ItemDAO();
            if (dao.actualizar(vo, id)) {
                JOptionPane.showMessageDialog(null, "Item actualizado Correctamente!!!");
                ventana.resetear();
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Error actualizando item");
            }
        }
        return true;
    }

    public void limpiarCampos() {
        txtCodigoItem.setText("");
        txtCodigoItem.requestFocus();
        txtEquipo.setText("");
        txtMarca.setText("");
        txtModelo.setText("");
        txtCaracteristicas.setText("");
        txtCosto.setText("");
        txtFechaVigencia.setCalendar(null);
        txtProveedor.setText("");
        txtTiempoEntrega.setText("");
        txtRutaFichaTecnica.setText("");
        txtGarantia.setText("");
    }

    public boolean validarFormulario() {
        int valida;
        if (txtEquipo.getText().equalsIgnoreCase("")) {
            javax.swing.JOptionPane.showMessageDialog(this, "Digite el nombre del equipo !!!");
            txtEquipo.requestFocus();
            return false;
        }
        if (txtModelo.getText().equalsIgnoreCase("")) {
            javax.swing.JOptionPane.showMessageDialog(this, "Digite el modelo !!!");
            txtModelo.requestFocus();
            return false;
        }
        if (txtCosto.getText().equalsIgnoreCase("")) {
            javax.swing.JOptionPane.showMessageDialog(this, "Digite el costo !!!");
            txtCosto.requestFocus();
            return false;
        }
        valida = Cadenas.validarEnteroDouble(txtCosto.getText());
        if (valida == 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "Ingrese un costo valido !!!");
            txtCosto.requestFocus();
            return false;
        }
        if (txtCaracteristicas.getText().equalsIgnoreCase("")) {
            javax.swing.JOptionPane.showMessageDialog(this, "Digite las caracteristicas !!!");
            txtCaracteristicas.requestFocus();
            return false;
        }
        String ruta = txtRutaFichaTecnica.getText();
        if (!ruta.isEmpty()) {
            try {
            File a = new File(ruta);
                if (!a.exists()) {
                    javax.swing.JOptionPane.showMessageDialog(this, "El pdf no existe");
                    return false;
                }
            } catch (HeadlessException e) {
                javax.swing.JOptionPane.showMessageDialog(this, "Error leyendo pdf");
                return false;
            }
        }
        return true;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton botonActualizarItem;
    public javax.swing.JButton botonCancelar;
    public javax.swing.JButton botonRuta;
    private javax.swing.ButtonGroup grupoBusqueda;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextArea txtCaracteristicas;
    public javax.swing.JTextField txtCodigoItem;
    public javax.swing.JTextField txtCosto;
    public javax.swing.JTextField txtCum;
    public javax.swing.JTextField txtEquipo;
    public com.toedter.calendar.JDateChooser txtFechaVigencia;
    public javax.swing.JTextField txtGarantia;
    private javax.swing.JLabel txtInfoPdf;
    public javax.swing.JTextField txtInvima;
    public javax.swing.JTextField txtMarca;
    public javax.swing.JTextField txtModelo;
    public javax.swing.JComboBox txtPorcentajeIva;
    public javax.swing.JTextField txtProveedor;
    public static javax.swing.JTextField txtRutaFichaTecnica;
    public javax.swing.JTextField txtTiempoEntrega;
    private javax.swing.JButton verPdf;
    // End of variables declaration//GEN-END:variables
}
