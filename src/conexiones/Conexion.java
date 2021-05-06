package conexiones;

import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import utilidades.Log;

public final class Conexion extends DatosConexion {

    private static Conexion instancia;

    private Conexion() {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            System.out.println("Error, driver no encontrado!!!");
            System.out.println(ex);
        }
    }

    public static Conexion getInstancia() {
        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }
    
    public void test() {
        try {
            conexion = DriverManager.getConnection(url, usuario, clave);
            conexion.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error mysql");
            System.exit(0);
        }
    }
    
    public boolean abrirConexion() {
        try {
            //si esta null la abre
            if (conexion == null) {
                conexion = DriverManager.getConnection(url, usuario, clave);
                sentencias = conexion.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            }
            //si no es null y esta cerrada, la abre
            if (conexion.isClosed()) {
                conexion = DriverManager.getConnection(url, usuario, clave);
                sentencias = conexion.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            }
            return true;
        } catch (java.sql.SQLException | java.awt.HeadlessException e) {
            System.out.println("Error al Conectar!!!");
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean prepararSql(String sql) {
        try {
            sentenciaPreparada = conexion.prepareStatement(sql);
            return true;
        } catch (SQLException e) {
            System.out.println("Error preparando la consulta: \n" + e);
            System.out.println(e.getMessage());
            return false;
        }
    }

    public ResultSet getConsulta() {
        try {
            ResultSet resultado = sentenciaPreparada.executeQuery();
            return resultado;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getErrorCode());
            return null;
        }
    }

    public ResultSet getConsulta(String msjError) {
        try {
            ResultSet resultado = sentenciaPreparada.executeQuery();
            return resultado;
        } catch (SQLException e) {
            switch (e.getErrorCode()) {
                case 1054:
                    JOptionPane.showMessageDialog(null, "Error:\n" + e.getMessage(), "Error", 0);
                    break;
                case 1064:
                    JOptionPane.showMessageDialog(null, "Error de sintaxis\n" + e.getMessage(), "Error", 0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, msjError, "Error", 0);
                    break;
            }
            return null;
        }
    }

    public boolean ejecutarSentencia() {
        try {
            sentenciaPreparada.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getErrorCode());
            return false;
        }
    }
    
    /**
     * se mantiene por compatibilidad, ya lo usaban bastantes clases
     */
    public void cerrarConexion() {
    }
    
    public boolean cerrarConexionFinal() {
        try {
            cerrarConnection();
            cerrarStatement();
            return true;
        } catch (HeadlessException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    private void cerrarConnection() {
        if (conexion != null) {
            try {
                if (!conexion.isClosed()) {
                    conexion.close();
                }
            } catch (SQLException ex) {
                System.out.println("Error cerrando conexión");
            }
        }
    }

    private void cerrarStatement() {
        if (sentenciaPreparada != null) {
            try {
                if (!sentenciaPreparada.isClosed()) {
                    sentenciaPreparada.close();
                }
            } catch (SQLException ex) {
                System.out.println("Error cerrando PreparedStatement");
            }
        }
        if (sentencias != null) {
            try {
                if (!sentencias.isClosed()) {
                    sentencias.close();
                }
            } catch (SQLException ex) {
                Log.escribirLog(ex);
            }
        }
    }

}
