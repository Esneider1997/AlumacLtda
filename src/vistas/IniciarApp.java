package vistas;

import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 * Inicia la aplicacion con la ventana de bloqueo si es el primer inicio, sino
 * inicia con login
 *
 * @author Jesus Campo Morales
 */
public class IniciarApp {

    /**
     * variable para saber si puede o no iniciar la aplicación
     */
    public static boolean inicia = false;

    /**
     * nombre del archivo que comprobará
     */
    private final String nombreArchivo = "syswoapp_equipos";

    /**
     * inicia el validador de licencia
     */
    public IniciarApp() {
        String usser = System.getProperty("user.home");
        File r = new File(usser);
        File licen = new File(r.getAbsolutePath() + "\\AppData\\Roaming\\SysWow\\" + nombreArchivo + ".dll");
        if (licen.exists()) {
            inicia = true;
        } else {
            BloqueoInicial desbloquear = new BloqueoInicial(nombreArchivo);
            desbloquear.setModal(true);
            desbloquear.setLocationRelativeTo(null);
            desbloquear.setVisible(true);
        }
        if (inicia) {
            //AQUI INICIAN EL LOGIN QUE ABRIRAN
            Principal login = new Principal();
            login.setVisible(true);
        } else {
            System.exit(0);
        }
    }

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            IniciarApp inicia = new IniciarApp();

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException e) {
            JOptionPane.showMessageDialog(null, "Error iniciando..\n" + e.getMessage());
            System.exit(0);
        }
    }

}
