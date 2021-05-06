package tablas;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import utilidades.Log;

class TablaScrollable extends AbstractTableModel {

    private Statement sentencias;
    private ResultSet rs = null;
    private JScrollPane scrollTabla;

    private String[] nombreColumnas;
    private boolean[] editables;
    private Class<?>[] tipos;

    private String consulta;
    private String sqlFinal;
    private int rango;
    private int limite;
    private int rowCount = -1;
    private int colNdx;

    /**
     * @param conexion una conexion abierta
     * @param consulta consulta que se ejecutara inicialmente
     * @param scrollTabla el scroll de la tabla para poder posicionarlo arriba
     * @param nombreColumnas nombre de columnas
     * @param editables si son editables
     * @param tipos tipos de datos
     * @param rango rango de la consulta, cuantos registro seleccionara y el
     * incremento
     */
    public TablaScrollable(Connection conexion, String consulta, JScrollPane scrollTabla, String[] nombreColumnas, boolean[] editables, Class[] tipos, int rango) {
        this.consulta = consulta;
        this.scrollTabla = scrollTabla;
        this.nombreColumnas = nombreColumnas;
        this.editables = editables;
        this.tipos = tipos;
        this.rango = rango;

        limite = rango;
        try {
            sentencias = conexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = consultar(getConsulta(rango));
        } catch (SQLException ex) {
            Log.escribirLog(ex);
        }
    }

    /**
     * @param conexion una conexion abierta
     * @param consulta consulta que se ejecutara inicialmente
     * @param tabla que tendra los datos
     * @param scrollTabla el scroll de la tabla para poder posicionarlo arriba
     * @param rango rango de la consulta, cuantos registro seleccionara y el
     * incremento
     */
    public TablaScrollable(Connection conexion, String consulta, JTable tabla, JScrollPane scrollTabla, int rango) {
        this.consulta = consulta;
        llenarArrays(tabla);
        this.scrollTabla = scrollTabla;
        this.rango = rango;

        limite = rango;
        try {
            sentencias = conexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = consultar(getConsulta(rango));
        } catch (SQLException ex) {
            Log.escribirLog(ex);
        }
    }

    /**
     * coloca el limite a la consulta
     *
     * @param fin cantidad de filas que seleccionara
     * @return consulta SQL completa
     */
    private String getConsulta(int fin) {
        return consulta + " LIMIT 0 , " + fin + "";
    }

    /**
     * Actualiza los datos de la tabla con la de la nueva consulta
     *
     * @param consulta select de los datos -> sin limit
     */
    public void setConsulta(String consulta) {
        this.consulta = consulta;
        limite = rango;
        rs = consultar(getConsulta(limite));
        rowCount = -1;
        scrollTabla.getVerticalScrollBar().setValue(0);
        fireTableDataChanged();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ++rowIndex;
        colNdx = columnIndex + 1;
        try {
            if (rowIndex == limite && colNdx == getColumnCount()) {
                limite += limite;
                rs = consultar(getConsulta(limite));
                rowCount = -1;
            }
            rs.absolute(rowIndex);
            return rs.getObject(colNdx, tipos[columnIndex]);
        } catch (SQLException e) {
            System.out.println("Error leyendo datos :\n" + e.getMessage() + "Error llenando tabla");
            Log.escribirLog(e);
            return null;
        }
    }

    @Override
    public int getRowCount() {
        if (rowCount == -1) {
            try {
                rs.last();
                rowCount = rs.getRow();
            } catch (SQLException e) {
                Log.escribirLog("Error obteniendo cantidad de registros :\n" + e.getMessage());
                Log.escribirLog(e);
            }
        }
        return rowCount;
    }

    @Override
    public int getColumnCount() {
        return nombreColumnas.length;
    }

    @Override
    public String getColumnName(int column) {
        return nombreColumnas[column];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return editables[columnIndex];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return tipos[columnIndex];
    }

    /**
     * Toma los nombres de las columnas, los valores de si son editable y el
     * tipo de dato de las columnas
     *
     * @param tabla
     */
    private void llenarArrays(JTable tabla) {
        TableModel modelo = tabla.getModel();
        int numColumans = modelo.getColumnCount();

        nombreColumnas = new String[numColumans];
        editables = new boolean[numColumans];
        tipos = new Class[numColumans];

        for (int i = 0; i < numColumans; i++) {
            nombreColumnas[i] = modelo.getColumnName(i);
            editables[i] = modelo.isCellEditable(0, i);
            tipos[i] = modelo.getColumnClass(i);
        }
    }

    /**
     * @return retorna la ultima consulta que se realizó
     */
    public String getSqlFinal() {
        return sqlFinal;
    }

    private ResultSet consultar(String SQL) {
        try {
            sqlFinal = SQL;
            ResultSet res = sentencias.executeQuery(SQL);
            return res;
        } catch (SQLException ex) {
            Log.escribirLog(ex);
            return null;
        }
    }

    public void cerrarStatement() {
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
