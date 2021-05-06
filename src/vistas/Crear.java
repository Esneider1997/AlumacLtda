package vistas;

import dao.ItemDAO;
import java.awt.HeadlessException;
import vo.ItemVO;
import java.awt.event.KeyEvent;
import java.io.File;
import javax.swing.JOptionPane;
import utilidades.BuscadorArchivos;
import utilidades.Cadenas;
import utilidades.Fechas;

public final class Crear extends javax.swing.JDialog {

    public Crear(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        limpiarCampos();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBusqueda = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtCodigoItem = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        botonAgregarItem = new javax.swing.JButton();
        botonCancelarAgregar = new javax.swing.JButton();
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
        txtinvima = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtTiempoEntrega = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtGarantia = new javax.swing.JTextField();
        botonRutaExcel = new javax.swing.JButton();
        txtRutaFichaTecnica = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jLabel21 = new javax.swing.JLabel();
        porcentajeIva = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        txtFechaVigencia = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        txtProveedor1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtCum = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Creacion Items", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(36, 63, 139))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));
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
        jPanel1.add(txtCodigoItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 170, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(36, 63, 139));
        jLabel8.setText("Codigo item");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, 30));

        botonAgregarItem.setBackground(new java.awt.Color(0, 194, 232));
        botonAgregarItem.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botonAgregarItem.setForeground(new java.awt.Color(255, 255, 255));
        botonAgregarItem.setText("Crear");
        botonAgregarItem.setBorderPainted(false);
        botonAgregarItem.setContentAreaFilled(false);
        botonAgregarItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAgregarItem.setFocusPainted(false);
        botonAgregarItem.setOpaque(true);
        botonAgregarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarItemActionPerformed(evt);
            }
        });
        jPanel1.add(botonAgregarItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 480, 110, 30));

        botonCancelarAgregar.setBackground(new java.awt.Color(0, 194, 232));
        botonCancelarAgregar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botonCancelarAgregar.setForeground(new java.awt.Color(255, 255, 255));
        botonCancelarAgregar.setText("Cancelar");
        botonCancelarAgregar.setBorderPainted(false);
        botonCancelarAgregar.setContentAreaFilled(false);
        botonCancelarAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCancelarAgregar.setFocusPainted(false);
        botonCancelarAgregar.setOpaque(true);
        botonCancelarAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(botonCancelarAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, 120, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(36, 63, 139));
        jLabel9.setText("Descripción");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, 30));

        txtEquipo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtEquipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEquipoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEquipoKeyTyped(evt);
            }
        });
        jPanel1.add(txtEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 330, 30));

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
        jPanel1.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 330, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(36, 63, 139));
        jLabel11.setText("<html><center>Caracteristicas Tecnicas");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 280, 30));

        txtModelo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtModeloKeyPressed(evt);
            }
        });
        jPanel1.add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 330, 30));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 490, 110));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(36, 63, 139));
        jLabel12.setText("Modelo");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(36, 63, 139));
        jLabel13.setText("Iva");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 160, -1, 30));

        txtCosto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCostoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCostoKeyTyped(evt);
            }
        });
        jPanel1.add(txtCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, 230, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(36, 63, 139));
        jLabel16.setText("Fecha Vigencia");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, 150, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(36, 63, 139));
        jLabel17.setText("Registro Invima");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, 30));

        txtinvima.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtinvima.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtinvimaKeyPressed(evt);
            }
        });
        jPanel1.add(txtinvima, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 330, 30));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(36, 63, 139));
        jLabel18.setText("Tiempo Entrega");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 220, -1, 30));

        txtTiempoEntrega.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTiempoEntrega.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTiempoEntregaKeyPressed(evt);
            }
        });
        jPanel1.add(txtTiempoEntrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 250, 230, 30));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(36, 63, 139));
        jLabel19.setText("Ficha Tecnica");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 280, -1, 30));

        txtGarantia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtGarantia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtGarantiaKeyPressed(evt);
            }
        });
        jPanel1.add(txtGarantia, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, 230, 30));

        botonRutaExcel.setText("...");
        botonRutaExcel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRutaExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRutaExcelActionPerformed(evt);
            }
        });
        jPanel1.add(botonRutaExcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 310, 30, 30));

        txtRutaFichaTecnica.setEditable(false);
        txtRutaFichaTecnica.setEnabled(false);
        jPanel1.add(txtRutaFichaTecnica, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 310, 190, 30));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(36, 63, 139));
        jLabel20.setText("Listas de precios");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, -1, 30));

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Lista 005");
        jCheckBox1.setEnabled(false);
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 400, -1, -1));

        jCheckBox2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCheckBox2.setSelected(true);
        jCheckBox2.setText("Lista 003");
        jCheckBox2.setEnabled(false);
        jPanel1.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 400, -1, -1));

        jCheckBox3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCheckBox3.setSelected(true);
        jCheckBox3.setText("Lista 004");
        jCheckBox3.setEnabled(false);
        jPanel1.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 400, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(36, 63, 139));
        jLabel21.setText("Garantia");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, -1, 30));

        porcentajeIva.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        porcentajeIva.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "19" }));
        porcentajeIva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                porcentajeIvaKeyPressed(evt);
            }
        });
        jPanel1.add(porcentajeIva, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 190, 230, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(36, 63, 139));
        jLabel14.setText("Costo");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, -1, 30));

        txtFechaVigencia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtFechaVigencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFechaVigenciaKeyPressed(evt);
            }
        });
        jPanel1.add(txtFechaVigencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 310, 230, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("DDMMAAAA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 340, 80, -1));

        txtProveedor1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtProveedor1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtProveedor1KeyPressed(evt);
            }
        });
        jPanel1.add(txtProveedor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 330, 30));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(36, 63, 139));
        jLabel22.setText("Proveedor");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, 30));

        txtCum.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCumKeyPressed(evt);
            }
        });
        jPanel1.add(txtCum, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 330, 30));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(36, 63, 139));
        jLabel23.setText("Codigo CUM");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 610));
        jPanel1.getAccessibleContext().setAccessibleName("Creación Items");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarItemActionPerformed
        crearItem();
    }//GEN-LAST:event_botonAgregarItemActionPerformed

    private void txtCodigoItemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoItemKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtEquipo.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_TAB) {
            txtEquipo.requestFocus();
        }
    }//GEN-LAST:event_txtCodigoItemKeyPressed

    private void txtEquipoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEquipoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtMarca.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_TAB) {
            txtMarca.requestFocus();
        }
    }//GEN-LAST:event_txtEquipoKeyPressed

    private void txtMarcaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarcaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtModelo.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_TAB) {
            txtModelo.requestFocus();
        }
    }//GEN-LAST:event_txtMarcaKeyPressed

    private void txtModeloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModeloKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtCosto.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_TAB) {
            txtCosto.requestFocus();
        }
    }//GEN-LAST:event_txtModeloKeyPressed

    private void txtCostoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCostoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            porcentajeIva.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_TAB) {
            porcentajeIva.requestFocus();
        }
    }//GEN-LAST:event_txtCostoKeyPressed

    private void porcentajeIvaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_porcentajeIvaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtFechaVigencia.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_TAB) {
            txtFechaVigencia.requestFocus();
        }
    }//GEN-LAST:event_porcentajeIvaKeyPressed

    private void txtTiempoEntregaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTiempoEntregaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtGarantia.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_TAB) {
            txtGarantia.requestFocus();
        }
    }//GEN-LAST:event_txtTiempoEntregaKeyPressed

    private void txtGarantiaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGarantiaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            botonAgregarItem.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_TAB) {
            botonAgregarItem.requestFocus();
        }
    }//GEN-LAST:event_txtGarantiaKeyPressed

    private void botonRutaExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRutaExcelActionPerformed
        BuscadorArchivos buscador = new BuscadorArchivos();
        txtRutaFichaTecnica.setText(buscador.buscadorAbrir());
    }//GEN-LAST:event_botonRutaExcelActionPerformed

    private void txtCodigoItemKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoItemKeyTyped
        char c = evt.getKeyChar();
        String cadena = String.valueOf(c);
        int validar = Cadenas.validarNumero(cadena);
        if (validar == 0) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo numeros");
            txtCodigoItem.requestFocus();
        }
        if (Character.isSpaceChar(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCodigoItemKeyTyped

    private void txtCostoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCostoKeyTyped
        char c = evt.getKeyChar();
        String cadena = String.valueOf(c);
        int validar = Cadenas.validarNumero(cadena);
        if (validar == 0) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo numeros");
            txtCosto.requestFocus();
        }
        if (Character.isSpaceChar(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCostoKeyTyped

    private void txtCaracteristicasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCaracteristicasKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtTiempoEntrega.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_TAB) {
            txtTiempoEntrega.requestFocus();
        }
    }//GEN-LAST:event_txtCaracteristicasKeyPressed

    private void txtFechaVigenciaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaVigenciaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtinvima.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_TAB) {
            txtinvima.requestFocus();
        }
    }//GEN-LAST:event_txtFechaVigenciaKeyPressed

    private void txtEquipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEquipoKeyTyped

    }//GEN-LAST:event_txtEquipoKeyTyped

    private void botonCancelarAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarAgregarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_botonCancelarAgregarActionPerformed

    private void txtinvimaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtinvimaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtCaracteristicas.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_TAB) {
            txtCaracteristicas.requestFocus();
        }
    }//GEN-LAST:event_txtinvimaKeyPressed

    private void txtProveedor1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProveedor1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProveedor1KeyPressed

    private void txtCumKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCumKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCumKeyPressed

    public boolean crearItem() {
        if (validarFormulario()) {
            int costo = (Integer.parseInt((txtCosto.getText())));
            int iva = Integer.parseInt((String) porcentajeIva.getSelectedItem());

            ItemVO vo = new ItemVO(costo, iva);
            vo.setCodigoitem(Cadenas.quitaEspacios(txtCodigoItem.getText()));
            vo.setEquipo(Cadenas.primeraAMayuscula(txtEquipo.getText()));
            vo.setMarca(Cadenas.primeraAMayuscula(txtMarca.getText()));
            vo.setModelo(Cadenas.primeraAMayuscula(txtModelo.getText()));
            vo.setCaracteristicas(Cadenas.primeraAMayuscula(txtCaracteristicas.getText()));
            vo.setFechavigencia(Fechas.obtenerFecha(txtFechaVigencia.getDate()));
            vo.setProveedor(Cadenas.primeraAMayuscula(txtProveedor1.getText()));
            vo.setTiempoentrega(Cadenas.primeraAMayuscula(txtTiempoEntrega.getText()));
            vo.setRutaFichaTecnica(txtRutaFichaTecnica.getText());
            vo.setGarantia(Cadenas.primeraAMayuscula(txtGarantia.getText()));
            vo.setCum(Cadenas.primeraAMayuscula(txtCum.getText()));
            vo.setInvima(Cadenas.primeraAMayuscula(txtinvima.getText()));
            
            

            ItemDAO dao = new ItemDAO();
          /*  if (dao.verificarItem(txtCodigoItem.getText())) {
                JOptionPane.showMessageDialog(null, "El código del item: " + txtCodigoItem.getText() + " se encuentra registrado");
                //  limpiarCampos();
                return false;
            }*/
            if (dao.crear(vo)) {
                JOptionPane.showMessageDialog(null, "Item Creado Correctamente!!!");
                limpiarCampos();
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Error creando item");
            }
        }
        return true;
    }

    public void limpiarCampos() {
        txtCodigoItem.setText("");
        txtEquipo.setText("");
        txtMarca.setText("");
        txtModelo.setText("");
        txtCaracteristicas.setText("");
        txtCosto.setText("");
        txtFechaVigencia.setCalendar(null);
        txtinvima.setText("");
        txtTiempoEntrega.setText("");
        txtRutaFichaTecnica.setText("");
        txtGarantia.setText("");
        txtCodigoItem.requestFocus();
        txtCum.setText("");
        txtinvima.setText("");
        txtProveedor1.setText("");
    }

    public boolean validarFormulario() {
        int valida;
        if (txtEquipo.getText().equalsIgnoreCase("")) {
            javax.swing.JOptionPane.showMessageDialog(this, "Digite la descripción del item !!!");
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
    public javax.swing.JButton botonAgregarItem;
    public javax.swing.JButton botonCancelarAgregar;
    public javax.swing.JButton botonRutaExcel;
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
    private javax.swing.JComboBox porcentajeIva;
    private javax.swing.JTextArea txtCaracteristicas;
    public javax.swing.JTextField txtCodigoItem;
    public javax.swing.JTextField txtCosto;
    public javax.swing.JTextField txtCum;
    public javax.swing.JTextField txtEquipo;
    public com.toedter.calendar.JDateChooser txtFechaVigencia;
    public javax.swing.JTextField txtGarantia;
    public javax.swing.JTextField txtMarca;
    public javax.swing.JTextField txtModelo;
    public javax.swing.JTextField txtProveedor1;
    public static javax.swing.JTextField txtRutaFichaTecnica;
    public javax.swing.JTextField txtTiempoEntrega;
    public javax.swing.JTextField txtinvima;
    // End of variables declaration//GEN-END:variables
}
