package conexiones;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import javax.swing.JOptionPane;
import utilidades.Log;

/**
 * Clase que contiene los parametros cargados de la conexion, Hecha con el
 * patron singleton
 *
 * @author Harold Campo Morales
 */
class Configuracion {

    /**
     * Instancia de la configuracion para las conexiones hacia la base de datos
     */
    private static Configuracion instancia;
    public String servidor;
    public String db;
    public String puerto;
    public String usuario;
    public String clave;
    public String url;

    /**
     * Inicializa los valores para las conexión
     */
    private Configuracion() {
        Properties propiedades = new Properties();
        InputStream entrada = null;
        try {
            entrada = new FileInputStream("config/mysql.properties");
            propiedades.load(entrada);
            servidor = propiedades.getProperty("servidor");
            db = propiedades.getProperty("base");
            puerto = propiedades.getProperty("puerto");
            usuario = propiedades.getProperty("usuario");
            clave = propiedades.getProperty("clave");
            //url de conexión
            url = "jdbc:mysql://" + servidor + ":"+puerto+"/" + db + "?useServerPrepStmts=true";
            System.out.println("Configuración - CREADA");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion: No se ha podido obtener los parametros de conexión");
            Log.escribirLog(ex);
        } finally {
            propiedades = null;
            if (entrada != null) {
                try {
                    entrada.close();
                    entrada = null;
                } catch (IOException ex) {
                    Log.escribirLog(ex);
                }
            }
        }
    }

    /**
     * Inicializa y devuelve una instancia de configuración, si está creada solo
     * la retorna
     * 
     * @return instancia de la clase configuración
     */
    public static Configuracion getInstancia() {
        if (instancia == null) {
            instancia = new Configuracion();
        }
        return instancia;
    }

    //EVITA QUE SE PUEDA CLONAR LA INSTANCIA DE CONEXION
    @Override
    public Configuracion clone(){
        try {
            throw new CloneNotSupportedException();
        } catch (CloneNotSupportedException ex) {
            JOptionPane.showMessageDialog(null, "No se puede clonar un objeto de la clase Configuración", "Notificación", 0);
        }
        return null;
    }

}
