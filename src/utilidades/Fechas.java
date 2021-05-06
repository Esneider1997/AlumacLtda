package utilidades;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase para manejar todo lo que sea fechas
 *
 * @author Harold Campo Morales
 */
public final class Fechas {

    /**
     * Obtiene la fecha actual
     *
     * @return fecha Actual
     */
    public static java.sql.Date obtenerFecha() {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE, 0);//OBTIENE LA FECHA ACTUAL
        Date d = c.getTime();//Obtiene la fecha del calendario
        return Fechas.obtenerFecha(d);
    }

    /**
     * Obtiene una fecha, sumando o restando dias a la fecha actual
     *
     * @param dias dias a sumar o restar a la fecha actual
     * @return fecha sumando o restando los dias dados a la fecha actual
     */
    public static java.sql.Date obtenerFecha(int dias) {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE, dias);//OBTIENE LA FECHA, RESTANDO O SUMANDO DIAS A LA FECHA ACTUAL
        Date d = c.getTime();//Obtiene la fecha del calendario
        return Fechas.obtenerFecha(d);
    }

    /**
     * Convierte una fecha de java.util.Date a java.sql.Date
     *
     * @param fecha fecha de tipo java.util.Date
     * @return una fecha convertida
     */
    public static java.sql.Date obtenerFecha(java.util.Date fecha) {
        return new java.sql.Date(fecha.getTime());
    }

    /**
     * Conviente una fecha para los campos de fecha de los formulario
     *
     * @param fecha
     * @return fecha en formato AÑO/MES/DIA
     */
    public static Calendar obtenerFechaCalendar(java.sql.Date fecha) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            //convertimos el String en un Date
            java.util.Date fechaFinal = sdf.parse(String.valueOf(fecha));
            //inicializamos el objeto Calendar
            Calendar calendario = Calendar.getInstance();
            //colocamos la fecha en nuestro objeto Calendar
            calendario.setTime(fechaFinal);
            return calendario;
        } catch (ParseException ex) {
            return null;
        }
    }

    /**
     * Convierte una fecha de java.util.Date a java.sql.Date
     *
     * @param fecha fecha de tipo java.util.Date
     * @return una fecha convertida
     */
    public static java.sql.Date obtenerFecha(String fecha) {
        try {
            SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");
            Date fechaDate1;
            fechaDate1 = formateador.parse(fecha);
            return new java.sql.Date(fechaDate1.getTime());
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
            return Fechas.obtenerFecha();
        }

    }

    /**
     * Obtiene la hora actual
     *
     * @return hora en formato HH:mm:ss
     */
    public static String obtenerHora() {
        Date date = new Date();
        DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
        return hourFormat.format(date);
    }

    /**
     * Obtiene la hora de una fecha dada
     *
     * @param date fecha con hora
     * @return hora en formato HH:mm:ss
     */
    public static String obtenerHora(java.sql.Date date) {
        DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
        return hourFormat.format(date);
    }

    /**
     * Obtiene la hora y fecha actual
     *
     * @return fecha y hora en formato HH:mm:ss dd/MM/yyyy
     */
    public static String obtenerFechaHora() {
        Date date = new Date();
        DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        return hourdateFormat.format(date);
    }

    /**
     * verifica si una fecha es menor, igual o mayor que la otra
     *
     * @param fecha1 fecha inicial
     * @param fecha2 fecha final
     * @return 1 si es menor
     * <br>-1 si es mayor
     * <br>0 si son iguales
     */
    public static int compararFechasConDate(String fecha1, String fecha2) {
        try {
            String resul = "";
            SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");
            Date fechaDate1 = formateador.parse(fecha1);
            Date fechaDate2 = formateador.parse(fecha2);
            if (fechaDate1.before(fechaDate2)) {
                resul = "La Fecha 1 es menor ";
                return 1;
            } else {
                if (fechaDate2.before(fechaDate1)) {
                    resul = "La Fecha 1 es Mayor ";
                    return -1;
                } else {
                    resul = "Las Fechas Son iguales ";
                    return 0;
                }
            }
        } catch (ParseException ex) {
            return -1;
        }
    }

    /**
     * Obtiene la clasificacion de un usuario según su fecha de nacimiento
     *
     * @param fechaNacimiento fecha de nacimiento
     * @return NEONATAL, PEDIATRICO, ADULTO
     */
    public static String clasificacion(java.util.Date fechaNacimiento) {
        final long MILISEGUNDOS_x_DIA = 24 * 60 * 60 * 1000; //Milisegundos al día 
        Date fechaInicial = fechaNacimiento;
        Date fechaFinal = obtenerFecha();
        int dias = (int) ((fechaFinal.getTime() - fechaInicial.getTime()) / MILISEGUNDOS_x_DIA);
        if (dias <= 30) {
            return "NEONATAL";
        } else if ((dias / 365) < 18) {
            return "PEDIATRICO";
        } else {
            return "ADULTO";
        }
    }

    /**
     * Obtiene transcurridos de una fecha dada
     *
     * @param fechaNacimiento fecha
     * @return total de dias
     */
    public static int getDias(java.util.Date fechaNacimiento) {
        final long MILISEGUNDOS_x_DIA = 24 * 60 * 60 * 1000; //Milisegundos al día 
        Date fechaInicial = fechaNacimiento;
        Date fechaFinal = obtenerFecha();
        int dias = (int) ((fechaFinal.getTime() - fechaInicial.getTime()) / MILISEGUNDOS_x_DIA);
        return dias;
    }

    /**
     * Obtiene una fecha, sumando o restando horas a la fecha actual
     *
     * @param horas a sumar o restar a la fecha actual
     * @return fecha sumando o restando los dias dados a la fecha actual
     */
    public static java.sql.Date obtenerFechaHoras(int horas) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.set(Calendar.HOUR, cal.get(Calendar.HOUR) + horas);
        Date d = cal.getTime();//Obtiene la fecha del calendario
        return Fechas.obtenerFecha(d);
    }

    /**
     * suma o resta minutos a un tiempo dado, pasar minutos en negativo para
     * restar
     *
     * @param time tiempo
     * @param minutes minutos
     * @return tiempo
     */
    public static java.sql.Time sumaHoras(java.sql.Time time, int minutes) {
        Calendar cal = new GregorianCalendar();
        cal.setTimeInMillis(time.getTime());
        cal.add(cal.MINUTE, minutes);
        return new Time(cal.getTimeInMillis());
    }

    /**
     * Sumarle dias a una fecha determinada
     *
     * @param fch La fecha para sumarle los dias
     * @param dias Numero de dias a agregar
     * @return La fecha agregando los dias
     */
    public static java.sql.Date sumarDiasAFecha(java.sql.Date fch, int dias) {
        Calendar cal = new GregorianCalendar();
        cal.setTimeInMillis(fch.getTime());
        cal.add(Calendar.DATE, dias);
        return new java.sql.Date(cal.getTimeInMillis());
    }

    /**
     * Sumarle dias a una fecha, desde 1900, usado para cuando se lean fechas de
     * excel en dias
     *
     * @param dias Numero de dias a agregar
     * @return La fecha agregando los dias
     */
    public static java.sql.Date sumarDiasAFecha(int dias) {
        java.sql.Date fechaInicio = new java.sql.Date(0000, 0, 0);//1900
        Calendar cal = new GregorianCalendar();
        cal.setTimeInMillis(fechaInicio.getTime());
        cal.add(Calendar.DATE, dias - 1);
        return new java.sql.Date(cal.getTimeInMillis());
    }
}
