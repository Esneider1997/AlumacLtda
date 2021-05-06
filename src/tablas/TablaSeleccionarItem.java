package tablas;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

public class TablaSeleccionarItem {

    private final TablaScrollableImpl modeloTabla;
    private final String sqlInicial;
    
    public TablaSeleccionarItem(JTable tabla, JScrollPane scrollTabla) {
        sqlInicial = "SELECT id,codigo_item,equipo,marca,modelo,caracteristicas,costo,porcentaje_iva,valor_003,valor_004,valor_005,fecha_vigencia,proveedor,tiempo_entrega,garantia,cum,invima,valor_002,valor_006 FROM maestra_items order by equipo";
        modeloTabla = new TablaScrollableImpl(sqlInicial, tabla, scrollTabla, 100);
        //ESTO ES PARA OCULTAR LA PRIMERA COLUMNAS
        TableColumnModel modeloColumnas = tabla.getColumnModel();
        modeloColumnas.getColumn(0).setPreferredWidth(0);
        modeloColumnas.getColumn(0).setMinWidth(0);
        modeloColumnas.getColumn(0).setMaxWidth(0);
    }

    /**
     *
     * Busca en la tabla
     *
     * @param txtBuscar
     */
    public void busquedaTabla(String txtBuscar) {
        if (txtBuscar.isEmpty()) {
            modeloTabla.cambiarConsulta(sqlInicial);
            return;
        }
        modeloTabla.cambiarConsulta(sqlInicial.replace("order by equipo", "") + " WHERE CONCAT_WS(' ',codigo_item,equipo,marca,modelo,caracteristicas,proveedor) LIKE '%" + txtBuscar + "%' order by equipo");
    }

    public void cerrarStatement() {
        modeloTabla.cerrarStatement();
    }
}
