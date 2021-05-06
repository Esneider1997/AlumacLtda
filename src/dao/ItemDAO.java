package dao;

import vo.ItemVO;
import java.sql.ResultSet;
import java.sql.SQLException;
import conexiones.Conexion;
import java.sql.PreparedStatement;
import utilidades.Log;

public class ItemDAO {

    private final Conexion conexion = Conexion.getInstancia();

    public ItemDAO() {

    }

    public boolean crear(ItemVO o) {
        try {
            conexion.abrirConexion();
            String sql = "INSERT INTO maestra_items (codigo_item, equipo, marca, modelo, caracteristicas, costo, porcentaje_iva, fecha_vigencia, lista_003, valor_003, lista_004, valor_004, lista_005, valor_005, proveedor, tiempo_entrega, ficha_tecnica, garantia, cum, invima,lista_002,valor_002,lista_006,valor_006) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            conexion.prepararSql(sql);
            PreparedStatement ps = conexion.getSentenciaPreparada();
            ps.setString(1, o.getCodigoitem());
            ps.setString(2, o.getEquipo());
            ps.setString(3, o.getMarca());
            ps.setString(4, o.getModelo());
            ps.setString(5, o.getCaracteristicas());
            ps.setDouble(6, o.getCosto());
            ps.setInt(7, o.getPorcentajeiva());
            ps.setDate(8, o.getFechavigencia());
            ps.setDouble(9, o.getLista003());
            ps.setDouble(10, o.getValor003());
            ps.setDouble(11, o.getLista004());
            ps.setDouble(12, o.getValor004());
            ps.setDouble(13, o.getLista005());
            ps.setDouble(14, o.getValor005());
            ps.setString(15, o.getProveedor());
            ps.setString(16, o.getTiempoentrega());
            ps.setBytes(17, o.getFichaTecnicaPDF());
            ps.setString(18, o.getGarantia());
            ps.setString(19, o.getCum());
            ps.setString(20, o.getInvima());   
            ps.setDouble(21, o.getLista002());
            ps.setDouble(22, o.getValor002());
            ps.setDouble(23, o.getLista006());
            ps.setDouble(24, o.getValor006());
            return conexion.ejecutarSentencia();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            Log.escribirLog(e);
            return false;
        } finally {
            conexion.cerrarConexion();
        }
    }

    public ItemVO obtener(int campoUnico) {
        try {
            conexion.abrirConexion();
            String sql = "SELECT * FROM maestra_items WHERE id = ? LIMIT 1";
            conexion.prepararSql(sql);
            PreparedStatement ps = conexion.getSentenciaPreparada();
            ps.setInt(1, campoUnico);
            ResultSet rs = conexion.getConsulta();
            if (rs.next()) {
                ItemVO o = new ItemVO();
                o.setId(rs.getInt("id"));
                o.setCodigoitem(rs.getString("codigo_item"));
                o.setEquipo(rs.getString("equipo"));
                o.setMarca(rs.getString("marca"));
                o.setModelo(rs.getString("modelo"));
                o.setCaracteristicas(rs.getString("caracteristicas"));
                o.setCosto(rs.getInt("costo"));
                o.setPorcentajeiva(rs.getInt("porcentaje_iva"));
                o.setFechavigencia(rs.getDate("fecha_vigencia"));
                o.setLista003(rs.getDouble("lista_003"));
                o.setValor003(rs.getDouble("valor_003"));
                o.setLista004(rs.getDouble("lista_004"));
                o.setValor004(rs.getDouble("valor_004"));
                o.setLista005(rs.getDouble("lista_005"));
                o.setValor005(rs.getDouble("valor_005"));
                o.setProveedor(rs.getString("proveedor"));
                o.setTiempoentrega(rs.getString("tiempo_entrega"));
                o.setRutaFichaTecnica("");
                o.setFichaTecnicaPDF(rs.getBytes("ficha_tecnica"));
                o.setGarantia(rs.getString("garantia"));
                o.setCum(rs.getString("cum"));
                o.setInvima(rs.getString("invima"));
                return o;
            }
            return null;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            Log.escribirLog(e);
            return null;
        } finally {
            conexion.cerrarConexion();
        }
    }

    public boolean actualizar(ItemVO o, int campoUnico) {
        try {
            conexion.abrirConexion();
            String sql;
            if (o.getRutaFichaTecnica().isEmpty()) {
                sql = "UPDATE maestra_items SET codigo_item = ?, equipo = ?, marca = ?, modelo = ?, caracteristicas = ?, costo = ?, porcentaje_iva = ?, fecha_vigencia = ?, lista_003 = ?, valor_003 = ?, lista_004 = ?, valor_004 = ?, lista_005 = ?, valor_005 = ?, proveedor = ?, tiempo_entrega = ?, garantia = ?, cum = ?, invima = ?, lista_002 = ?, valor_002 = ?, lista_006 = ?, valor_006  = ? WHERE id = ? LIMIT 1";
            } else {
                sql = "UPDATE maestra_items SET codigo_item = ?, equipo = ?, marca = ?, modelo = ?, caracteristicas = ?, costo = ?, porcentaje_iva = ?, fecha_vigencia = ?, lista_003 = ?, valor_003 = ?, lista_004 = ?, valor_004 = ?, lista_005 = ?, valor_005 = ?, proveedor = ?, tiempo_entrega = ?, garantia = ?, cum = ?, invima = ?, lista_002 = ?, valor_002 = ?, lista_006 = ?, valor_006  = ?, ficha_tecnica = ? WHERE id = ? LIMIT 1";
            }
            conexion.prepararSql(sql);
            PreparedStatement ps = conexion.getSentenciaPreparada();
            ps.setString(1, o.getCodigoitem());
            ps.setString(2, o.getEquipo());
            ps.setString(3, o.getMarca());
            ps.setString(4, o.getModelo());
            ps.setString(5, o.getCaracteristicas());
            ps.setDouble(6, o.getCosto());
            ps.setInt(7, o.getPorcentajeiva());
            ps.setDate(8, o.getFechavigencia());
            ps.setDouble(9, o.getLista003());
            ps.setDouble(10, o.getValor003());
            ps.setDouble(11, o.getLista004());
            ps.setDouble(12, o.getValor004());
            ps.setDouble(13, o.getLista005());
            ps.setDouble(14, o.getValor005());
            ps.setString(15, o.getProveedor());
            ps.setString(16, o.getTiempoentrega());
            ps.setString(17, o.getGarantia());
            ps.setString(18, o.getCum());
            ps.setString(19, o.getInvima());
            ps.setDouble(20, o.getLista002());
            ps.setDouble(21, o.getValor002());
            ps.setDouble(22, o.getLista006());
            ps.setDouble(23, o.getValor006());
            
            if (o.getRutaFichaTecnica().isEmpty()) {
                ps.setInt(24, campoUnico);
            } else {
                ps.setBytes(24, o.getFichaTecnicaPDF());
                ps.setInt(25, campoUnico);
            }

            return conexion.ejecutarSentencia();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            Log.escribirLog(e);
            return false;
        } finally {
            conexion.cerrarConexion();
        }
    }

    public boolean eliminar(int campoUnico) {
        try {
            conexion.abrirConexion();
            String sql = "DELETE FROM maestra_items WHERE id = ? LIMIT 1";
            conexion.prepararSql(sql);
            PreparedStatement ps = conexion.getSentenciaPreparada();
            ps.setInt(1, campoUnico);
            return conexion.ejecutarSentencia();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            Log.escribirLog(e);
            return false;
        } finally {
            conexion.cerrarConexion();
        }
    }

    public boolean verificarItem(String item) {
        try {
            conexion.abrirConexion();
            String sql = "SELECT codigo_item FROM maestra_items WHERE codigo_item = ? LIMIT 1";
            conexion.prepararSql(sql);
            PreparedStatement ps = conexion.getSentenciaPreparada();
            ps.setString(1, item);
            return conexion.getConsulta().next();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            Log.escribirLog(ex);
            return false;
        } finally {
            conexion.cerrarConexion();
        }
    }
}
