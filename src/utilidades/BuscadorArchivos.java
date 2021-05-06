package utilidades;

import java.awt.HeadlessException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * Clase para buscar y guardar archivos
 *
 * @author Harold Campo Morales
 */
public class BuscadorArchivos extends JFileChooser {
    
    FileNameExtensionFilter filtroExcel;
    FileNameExtensionFilter filtroPdf;
    FileNameExtensionFilter filtroExcelPdf;

    public BuscadorArchivos() {
        /*CREAMOS EL FILTRO PARA EXCEL, el primero es el nombre del filtro
         y el segundo, tercero etc... son las extensiones de archivo*/
        filtroExcel = new FileNameExtensionFilter("EXCEL .xlsx .xls", "xlsx", "xls");
        filtroExcelPdf = new FileNameExtensionFilter("PDF .pdf", "pdf");
        filtroExcelPdf = new FileNameExtensionFilter("Excel - PDF", "xlsx", "pdf");
    }

    /**
     * Abre el buscador de archivos para selecionar el archivo que se abrira
     *
     * @return la ruta seleccionada o vacio si no escogieron nada
     */
    public String buscadorAbrir() {
        try {
            //Quitamos que se vean todos los archivos
            setAcceptAllFileFilterUsed(false);
            //mostramos solo archivos con extension xlsx y xls ->es solo para excel
            setFileFilter(filtroExcelPdf);
            if (showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                return String.valueOf(getSelectedFile());
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Ah ocurrido un error buscando el archivo!!!");
            Log.escribirLog(e);
        }
        return "";
    }

    /**
     * Abre el buscador de archivos para seleccionar la ruta para guardar
     *
     * @return la ruta seleccionada o vacio si no escogieron nada
     */
    public String buscadorGuardar() {
        try {
            //que se vean todos los archivos
            //setAcceptAllFileFilterUsed(true);
            //quitamos el filtro de excel
            //removeChoosableFileFilter(filtroExcel);
            //Quitamos que se vean todos los archivos
            setAcceptAllFileFilterUsed(false);
            setFileFilter(filtroExcelPdf);
            if (showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                return String.valueOf(getSelectedFile());
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Ah ocurrido un error buscando el archivo!!!");
            Log.escribirLog(e);
        }
        return "";
    }
}
