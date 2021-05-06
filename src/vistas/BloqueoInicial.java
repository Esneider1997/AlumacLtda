package vistas;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 * Formulario que pide clave de la aplicacion
 *
 * @author Harold Campo Morales
 */
public class BloqueoInicial extends javax.swing.JDialog {

    //cordenadas pulsada dentro del panel
    private int xm, ym;
    //clave de aplicación
    private final String clave = "jjm*syd*";
    //nombre del archivo de licencia que se creara
    private final String nombreArchivo;

    public BloqueoInicial(String nombreArchivo) {
        initComponents();
        this.nombreArchivo=nombreArchivo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtClave = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Desbloquear App");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel1MouseReleased(evt);
            }
        });
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Padlock_104px.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 120, 110));

        txtClave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtClaveKeyPressed(evt);
            }
        });
        jPanel1.add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 254, -1));

        jLabel2.setFont(new java.awt.Font("Tekton Pro", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DIGITE CLAVE PARA DESBLOQUEAR LA APLICACIÓN");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 35, -1, 20));

        btnEntrar.setBackground(new java.awt.Color(0, 71, 119));
        btnEntrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Ok_25px.png"))); // NOI18N
        btnEntrar.setText("ACEPTAR");
        btnEntrar.setToolTipText("Validar Clave");
        btnEntrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnEntrar.setContentAreaFilled(false);
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEntrarmouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEntrarmouseExited(evt);
            }
        });
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 130, 115, 35));

        btnCancelar.setBackground(new java.awt.Color(0, 71, 119));
        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Unavailable_25px.png"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setToolTipText("Cerrar aplicación");
        btnCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarmouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelarmouseExited(evt);
            }
        });
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 130, 115, 35));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 202));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtClaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClaveKeyPressed
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            validar();
        }
    }//GEN-LAST:event_txtClaveKeyPressed

    private void btnEntrarmouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarmouseEntered
        JButton boton = (JButton) evt.getSource();
        if (boton.isEnabled()) {
            boton.setOpaque(true);
        }
    }//GEN-LAST:event_btnEntrarmouseEntered

    private void btnEntrarmouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarmouseExited
        JButton boton = (JButton) evt.getSource();
        if (boton.isEnabled()) {
            boton.setOpaque(false);
        }
    }//GEN-LAST:event_btnEntrarmouseExited

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        validar();
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnCancelarmouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarmouseEntered
        JButton boton = (JButton) evt.getSource();
        if (boton.isEnabled()) {
            boton.setOpaque(true);
        }
    }//GEN-LAST:event_btnCancelarmouseEntered

    private void btnCancelarmouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarmouseExited
        JButton boton = (JButton) evt.getSource();
        if (boton.isEnabled()) {
            boton.setOpaque(false);
        }
    }//GEN-LAST:event_btnCancelarmouseExited

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xm = evt.getX();
        ym = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased
        setOpacity((float) 1);
    }//GEN-LAST:event_jPanel1MouseReleased

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        setOpacity((float) 0.8);
        int x = evt.getXOnScreen();//condenada en x de la posicion cuando se arrastra
        int y = evt.getYOnScreen();//condenada en y de la posicion cuando se arrastra
        this.setLocation(x - xm, y - ym);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void validar() {
        if (this.txtClave.getPassword().length > 0) {
            try {
                String usser = System.getProperty("user.home");
                File r = new File(usser);
                File folder = new File(r.getAbsolutePath() + "\\AppData\\Roaming\\SysWow");
                if (!folder.exists()) {
                    //Crea la Careta
                    folder.mkdirs();
                }
                String clave = String.valueOf(this.txtClave.getPassword());
                //comparo el password si es igual devuelvo true
                if (clave.equals(this.clave)) {
                    File licen = new File(r.getAbsolutePath() + "\\AppData\\Roaming\\SysWow\\" + nombreArchivo + ".dll");
                    //Acontinuacion declaro el objeto prinwrite para poder escribir en el archivo
                    PrintWriter grabador = new PrintWriter(licen);
                    String ver = "@@@????$?syswow";
                    //Escribo una linea
                    grabador.println(ver);
                    //Cierro el Grabador
                    grabador.close();
                    //Mensaje de Bienvenida
                    JOptionPane.showMessageDialog(this, "Bienvenido, Ya puede usar la App");
                    //le decimos al que inicia la app que la puede iniciar
                    IniciarApp.inicia = true;
                    //cierro la ventana
                    this.dispose();
                } else {
                    this.txtClave.requestFocus();
                    this.txtClave.setText("");
                    JOptionPane.showMessageDialog(this, "Clave invalida verifique");
                }
            } catch (FileNotFoundException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, "Error generando licencia");
            }
        } else {
            JOptionPane.showMessageDialog(this, "No ha digitado ninguna clave");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtClave;
    // End of variables declaration//GEN-END:variables

}
