package vistas;

import conexiones.Conexion;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

public class Principal extends JFrame {

    Actualizar actualizar;
    Eliminar eliminar;
    Seleccionar seleccionar;
    
    Border entrar;
    
    Conexion conexion = Conexion.getInstancia();
    public DefaultTableModel modeloTabla;
    public DefaultTableModel modeloTablaResultado;
    Principal menuInvima;

    public Principal() {
        initComponents();
        
        entrar = javax.swing.BorderFactory.createLineBorder(new java.awt.Color(10, 40, 130));
        
        conexion.test();
        URL url = getClass().getResource("/Recursos/icons8_Supplement_Bottle_30px.png");
        ImageIcon img = new ImageIcon(url);
        setIconImage(img.getImage());
        setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        labelMenu = new javax.swing.JLabel();
        menuCrear = new javax.swing.JButton();
        menuRegistros = new javax.swing.JButton();
        menuActualizar = new javax.swing.JButton();
        menuEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelMenu.setBackground(new java.awt.Color(0, 153, 204));
        labelMenu.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        labelMenu.setForeground(new java.awt.Color(0, 153, 204));
        labelMenu.setText("EQUIPOS");
        jPanel2.add(labelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 170, 50));

        menuCrear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        menuCrear.setForeground(new java.awt.Color(10, 40, 130));
        menuCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Plus_60px.png"))); // NOI18N
        menuCrear.setText("Crear");
        menuCrear.setBorder(null);
        menuCrear.setContentAreaFilled(false);
        menuCrear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuCrear.setFocusable(false);
        menuCrear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuCrear.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Principal.this.mouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Principal.this.mouseExited(evt);
            }
        });
        menuCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCrearActionPerformed(evt);
            }
        });
        jPanel2.add(menuCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 150, 130));

        menuRegistros.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        menuRegistros.setForeground(new java.awt.Color(10, 40, 130));
        menuRegistros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Test_Passed_60px.png"))); // NOI18N
        menuRegistros.setText("Consultar");
        menuRegistros.setBorder(null);
        menuRegistros.setContentAreaFilled(false);
        menuRegistros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuRegistros.setFocusable(false);
        menuRegistros.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuRegistros.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuRegistros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Principal.this.mouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Principal.this.mouseExited(evt);
            }
        });
        menuRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegistrosActionPerformed(evt);
            }
        });
        jPanel2.add(menuRegistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 150, 130));

        menuActualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        menuActualizar.setForeground(new java.awt.Color(10, 40, 130));
        menuActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Refresh_60px.png"))); // NOI18N
        menuActualizar.setText("Actualizar");
        menuActualizar.setToolTipText("");
        menuActualizar.setContentAreaFilled(false);
        menuActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuActualizar.setFocusable(false);
        menuActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuActualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Principal.this.mouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Principal.this.mouseExited(evt);
            }
        });
        menuActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActualizarActionPerformed(evt);
            }
        });
        jPanel2.add(menuActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 150, 130));

        menuEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        menuEliminar.setForeground(new java.awt.Color(10, 40, 130));
        menuEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Trash_60px.png"))); // NOI18N
        menuEliminar.setText("Eliminar");
        menuEliminar.setContentAreaFilled(false);
        menuEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuEliminar.setFocusable(false);
        menuEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Principal.this.mouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Principal.this.mouseExited(evt);
            }
        });
        menuEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(menuEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 150, 130));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Conexion.getInstancia().cerrarConexionFinal();
    }//GEN-LAST:event_formWindowClosing

    private void menuCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCrearActionPerformed
        Crear crear = new Crear(null, true);
        crear.setLocationRelativeTo(null);
        crear.setVisible(true);
    }//GEN-LAST:event_menuCrearActionPerformed

    private void menuRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegistrosActionPerformed
        if (seleccionar == null) {
            seleccionar = new Seleccionar(null, true);
        }
        seleccionar.resetear();
        seleccionar.setLocationRelativeTo(null);
        seleccionar.setVisible(true);
    }//GEN-LAST:event_menuRegistrosActionPerformed

    private void menuActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActualizarActionPerformed
        if (actualizar == null) {
            actualizar = new Actualizar(null, true);
           // actualizar.tabla = new TablaSeleccionarItem(actualizar.tablaActualizarItem, actualizar.scrrolActualizar);
        }
       // actualizar.tabla = new TablaSeleccionarItem(actualizar.tablaActualizarItem, actualizar.scrrolActualizar);
        actualizar.resetear();
        actualizar.setLocationRelativeTo(null);
        actualizar.setVisible(true);
    }//GEN-LAST:event_menuActualizarActionPerformed

    private void menuEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEliminarActionPerformed
        if (eliminar == null) {
            eliminar = new Eliminar(null, true);
         //   eliminar.tabla = new TablaSeleccionarItem(eliminar.tablaEliminarRegistros, eliminar.scrollEliminar);
        }
      //  eliminar.tabla = new TablaSeleccionarItem(eliminar.tablaEliminarRegistros, eliminar.scrollEliminar);
        eliminar.resetear();
        eliminar.setLocationRelativeTo(null);
        eliminar.setVisible(true);
    }//GEN-LAST:event_menuEliminarActionPerformed

    private void mouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseEntered
        JButton boton = (JButton) evt.getSource();
        boton.setBorder(entrar);
    }//GEN-LAST:event_mouseEntered

    private void mouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseExited
       JButton boton = (JButton) evt.getSource();
       boton.setBorder(null);
    }//GEN-LAST:event_mouseExited

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelMenu;
    private javax.swing.JButton menuActualizar;
    private javax.swing.JButton menuCrear;
    private javax.swing.JButton menuEliminar;
    private javax.swing.JButton menuRegistros;
    // End of variables declaration//GEN-END:variables
}
