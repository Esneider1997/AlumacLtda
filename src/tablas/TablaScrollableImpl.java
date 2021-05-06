package tablas;

import conexiones.Conexion;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

class TablaScrollableImpl{
    
    private final TablaScrollable modeloTabla;
    
    public TablaScrollableImpl(String consulta, JTable tabla, JScrollPane scrollTabla, int rango) {
        Conexion conexion = Conexion.getInstancia();
        conexion.abrirConexion();
        //OBTENEMOS LOS ANCHOS DE LAS COLUMNAS
        TableColumnModel modeloColumnas = tabla.getColumnModel();
        int canColumnas = modeloColumnas.getColumnCount();
        
        int[] ancho = new int[canColumnas];
        for (int i = 0; i < canColumnas; i++) {
            ancho[i] = modeloColumnas.getColumn(i).getPreferredWidth();
        }
        
        modeloTabla = new TablaScrollable(conexion.getConexion(), consulta, tabla, scrollTabla, rango);
        tabla.setModel(modeloTabla);
        
        //LE COLOCAMOS LOS ANCHOS QUE TENIAN LAS COLUMNAS
        for (int i = 0; i < canColumnas; i++) {
             modeloColumnas.getColumn(i).setPreferredWidth(ancho[i]);
        }
    }
    
    /**
     * actualiza los datos de la tabla con el nuevo select
     * @param SQL sentencia de consulta
     */
    public void cambiarConsulta(String SQL){
        modeloTabla.setConsulta(SQL);
    }
    
    /**
     * @return retorna la ultima consulta que se realizó
     */
    public String getSqlFinal() {
        return modeloTabla.getSqlFinal();
    }
    
    public void cerrarStatement(){
        modeloTabla.cerrarStatement();
    }
    
}
