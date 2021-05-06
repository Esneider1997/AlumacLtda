package vo;

import java.awt.Desktop;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import utilidades.Log;

public class ItemVO {

    private int id;
    private String codigoItem;
    private String equipo;
    private String marca;
    private String modelo;
    private String caracteristicas;
    private int costo;
    private int porcentajeIva;
    private Date fechaVigencia;
    private double lista002;
    private double valor002;
    private double lista003;
    private double valor003;
    private double lista004;
    private double valor004;
    private double lista005;
    private double valor005;
    private double lista006;
    private double valor006;
    private String proveedor;
    private String tiempoEntrega;
    private String rutaFichaTecnica;
    private byte[] fichaTecnicaPDF;
    private String garantia;
    private String cum;
    private String invima;

    public ItemVO() {
    }

    public ItemVO(int costo, int porcentajeIva) {
        this.costo = costo;
        this.porcentajeIva = porcentajeIva;
        calcular();
    }

    public void calcular(){
        
        double costoMasPorcentajeLista002 = (costo * 125) / 100;
        double valorBrutoLista002 = costoMasPorcentajeLista002;
        double valorBrutoMasiVALista002 = (valorBrutoLista002 * porcentajeIva) / 100;
        double totalLista002 = valorBrutoLista002 + valorBrutoMasiVALista002;
        setLista002(Math.round(valorBrutoLista002));
        setValor002(Math.round(totalLista002));
        
        double costoMasPorcentajeLista003 = (costo * 142.86) / 100;
        double valorBrutoLista003 = costoMasPorcentajeLista003;
        double valorBrutoMasiVALista003 = (valorBrutoLista003 * porcentajeIva) / 100;
        double totalLista003 = valorBrutoLista003 + valorBrutoMasiVALista003;
        setLista003(Math.round(valorBrutoLista003));
        setValor003(Math.round(totalLista003));

        double costoMasPorcentajeLista004 = (costo * 158.74) / 100;
        double valorBrutoLista004 =  costoMasPorcentajeLista004;
        double valorBrutoMasiVALista004 = (valorBrutoLista004 * porcentajeIva) / 100;
        double totalLista004 = valorBrutoLista004 + valorBrutoMasiVALista004;
        setLista004(Math.round(valorBrutoLista004));
        setValor004(Math.round(totalLista004));

        double costoMasPorcentajeLista005 = (costo * 178.58) / 100;
        double valorBrutoLista005 = costoMasPorcentajeLista005;
        double valorBrutoMasiVALista005 = (valorBrutoLista005 * porcentajeIva) / 100;
        double totalLista005 = valorBrutoLista005 + valorBrutoMasiVALista005;
        setLista005(Math.round(valorBrutoLista005));
        setValor005(Math.round(totalLista005));
        
        double costoMasPorcentajeLista006 = (costo * 185.19) / 100;
        double valorBrutoLista006 = costoMasPorcentajeLista006;
        double valorBrutoMasiVALista006 = (valorBrutoLista006 * porcentajeIva) / 100;
        double totalLista006 = valorBrutoLista006 + valorBrutoMasiVALista005;
        setLista006(Math.round(valorBrutoLista006));
        setValor006(Math.round(totalLista006));
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigoitem() {
        return codigoItem;
    }

    public void setCodigoitem(String codigoItem) {
        this.codigoItem = codigoItem;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getPorcentajeiva() {
        return porcentajeIva;
    }

    public void setPorcentajeiva(int porcentajeIva) {
        this.porcentajeIva = porcentajeIva;
    }

    public Date getFechavigencia() {
        return fechaVigencia;
    }

    public void setFechavigencia(Date fechaVigencia) {
        this.fechaVigencia = fechaVigencia;
    }

    public double getLista003() {
        return lista003;
    }

    public void setLista003(double lista003) {
        this.lista003 = lista003;
    }

    public double getValor003() {
        return valor003;
    }

    public void setValor003(double valor003) {
        this.valor003 = valor003;
    }

    public double getLista004() {
        return lista004;
    }

    public void setLista004(double lista004) {
        this.lista004 = lista004;
    }

    public double getValor004() {
        return valor004;
    }

    public void setValor004(double valor004) {
        this.valor004 = valor004;
    }

    public double getLista005() {
        return lista005;
    }

    public void setLista005(double lista005) {
        this.lista005 = lista005;
    }

    public double getValor005() {
        return valor005;
    }

    public void setValor005(double valor005) {
        this.valor005 = valor005;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getTiempoentrega() {
        return tiempoEntrega;
    }

    public void setTiempoentrega(String tiempoEntrega) {
        this.tiempoEntrega = tiempoEntrega;
    }

    public String getRutaFichaTecnica() {
        return rutaFichaTecnica;
    }

    public void setRutaFichaTecnica(String rutaFichaTecnica) {
        this.rutaFichaTecnica = rutaFichaTecnica;
        if (!rutaFichaTecnica.isEmpty()) {
            try {
                File archivo = new File(rutaFichaTecnica);
                byte[] pdf = new byte[(int) archivo.length()];
                InputStream input = new FileInputStream(archivo);
                input.read(pdf);
                setFichaTecnicaPDF(pdf);
            } catch (IOException ex) {
                setFichaTecnicaPDF(null);
                Log.escribirLog(ex);
            }
        }
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    public byte[] getFichaTecnicaPDF() {
        return fichaTecnicaPDF;
    }

    public void setFichaTecnicaPDF(byte[] fichaTecnicaPDF) {
        this.fichaTecnicaPDF = fichaTecnicaPDF;
    }

    public String getCum() {
        return cum;
    }

    public void setCum(String cum) {
        this.cum = cum;
    }

    public String getInvima() {
        return invima;
    }

    public void setInvima(String invima) {
        this.invima = invima;
    }

    public double getLista002() {
        return lista002;
    }

    public void setLista002(double lista002) {
        this.lista002 = lista002;
    }

    public double getValor002() {
        return valor002;
    }

    public void setValor002(double valor002) {
        this.valor002 = valor002;
    }

    public double getLista006() {
        return lista006;
    }

    public void setLista006(double lista006) {
        this.lista006 = lista006;
    }

    public double getValor006() {
        return valor006;
    }

    public void setValor006(double valor006) {
        this.valor006 = valor006;
    }
    
    

    public void abrirPdf(){
        try {
            InputStream bos = new ByteArrayInputStream(getFichaTecnicaPDF());
            
            int tamanoInput = bos.available();
            byte[] datosPDF = new byte[tamanoInput];
            bos.read(datosPDF, 0, tamanoInput);
            OutputStream out = new FileOutputStream("archivo.pdf");
            out.write(datosPDF);
            //abrir archivo
            out.close();
            bos.close();
            
            Desktop.getDesktop().open(new File("archivo.pdf"));
        } catch (IOException ex) {
            Logger.getLogger(ItemVO.class.getName()).log(Level.SEVERE, null, ex);
            Log.escribirLog(ex);
        }
    }
    
    @Override
    public String toString() {
        return "MaestraItemsDto{" + "id=" + id + ", codigoItem=" + codigoItem + ", equipo=" + equipo + ", marca=" + marca + ", modelo=" + modelo + ", caracteristicas=" + caracteristicas + ", costo=" + costo + ", porcentajeIva=" + porcentajeIva + ", fechaVigencia=" + fechaVigencia + ", lista002=" + lista002 + ", valor002=" + valor002 + ", lista003=" + lista003 + ", valor003=" + valor003 + ", lista004=" + lista004 + ", valor004=" + valor004 + ", lista005=" + lista005 + ", valor005=" + valor005 + ", lista006=" + lista006 + ", valor006=" + valor006 +", proveedor=" + proveedor + ", tiempoEntrega=" + tiempoEntrega + ", fichaTecnica=" + rutaFichaTecnica + ", garantia=" + garantia + ", cum=" + cum + ", invima=" + invima + '}';
    }

}
