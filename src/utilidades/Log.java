package utilidades;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 *
 * @author Hcm
 */
public class Log {
    
    public static void escribirLog(String mensaje) {
        String rutaArchivo = "log.log";
        Logger logger = Logger.getLogger("MyLog");
        FileHandler fh = null;
        try {

            fh = new FileHandler(rutaArchivo, true);
            logger.addHandler(fh);

            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);

            logger.info(mensaje);

        } catch (SecurityException | IOException e) {
            System.out.println(e.getMessage());
        }finally{
            fh.close();
        }
    }
    
    public static void escribirLog(Exception e) {
        Log.escribirLog(Log.getStackTrace(e));
    }
    
    /**
    * Esta funcion nos permite convertir el stackTrace en un String, necesario para poder imprimirlos al log debido a
    * cambios en como Java los maneja internamente
    * @param e Excepcion de la que queremos el StackTrace
    * @return StackTrace de la excepcion en forma de String
    */
    private static String getStackTrace(Exception e) {
        StringWriter sWriter = new StringWriter();
        PrintWriter pWriter = new PrintWriter(sWriter);
        e.printStackTrace(pWriter);
        return sWriter.toString();
    }
    
}
