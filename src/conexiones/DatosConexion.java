package conexiones;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 * Tiene los datos requeridos para hacer una conexión
 *
 * @author Harold Campo Morales
 */
public class DatosConexion {

    private final Configuracion configuracion;

    protected Connection conexion;
    protected Statement sentencias;
    protected final String driver = "com.mysql.jdbc.Driver";//driver de jdbc
    /**
     * Para poder acceder al objeto directo por la de la instancia,
     * no se puede acceder retornando en objeto porque sale error cuando esten agregando
     */
    public PreparedStatement sentenciaPreparada;
    /**
     * Nombre del servidor
     */
    public final String servidor;
    /**
     * Nombre de la base de datos
     */
    public final String db;
    /**
     * usuario de conexion
     */
    public final String usuario;
    /**
     * contraseña
     */
    public final String clave;
    /**
     * url de conexion
     */
    public final String url;
    

    public DatosConexion() {
        configuracion = Configuracion.getInstancia();
        servidor = configuracion.servidor;
        db = configuracion.db;
        usuario = configuracion.usuario;
        clave = configuracion.clave;
        url = configuracion.url;
    }

    /**
     * Obtiene el nombre de la base de datos
     *
     * @return db
     */
    public String getDb() {
        return db;
    }

    /**
     * Obtiene la conexion
     *
     * @return Objeto conexion
     */
    public Connection getConexion() {
        return conexion;
    }

    public PreparedStatement getSentenciaPreparada() {
        return sentenciaPreparada;
    }
}
