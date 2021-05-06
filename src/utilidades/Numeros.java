package utilidades;

/**
 * Clase para manejar todo lo que sea numeros
 *
 * @author Harold Campo Morales
 */
public final class Numeros {

    /**
     * Se define el constructor privado para que no pueda ser instanciado
     */
    private Numeros() {
    }

    /**
     * Valida si una cadena es un numero
     *
     * @param numero texto a validar
     * @return -1 si está vacio
     * <br>1 si es valido
     * <br>0 si no es valido
     */
    public static int validarNumero(String numero) {
        String texto = numero.trim();
        if (texto.isEmpty()) {
            return -1;
        }
        if (texto.matches("^[0-9]*$")) {
            return 1;
        }
        return 0;
    }

    /**
     * Valida que una cadena dada sea un entero o un double
     *
     * @param numero
     * @return true si es entero o double, y false si no
     */
    public static boolean validarEnteroDouble(String numero) {
        String texto = numero.trim();
        if (texto.matches("^[0-9]*$")) {
            return true;
        }
        try {
            double retur = Double.valueOf(texto);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * Formatea un numero double dejando solo la cantidad de decimales que le
     * pasen
     *
     * @param numero número para formatear
     * @param decimales número de decimales que dejará
     * <br>1 un decimal
     * <br>2 dos decimales
     * <br>3 tres decimales
     * <br>4 cuatro decimales
     * <br>Cualquier otro numero retornara el numero sin cambios
     * @return numero formateado
     */
    public static double formatearDouble(double numero, int decimales) {
        switch (decimales) {
            case 1:
                return (double) Math.round(numero * 10d) / 10d;
            case 2:
                return (double) Math.round(numero * 100d) / 100d;
            case 3:
                return (double) Math.round(numero * 1000d) / 1000d;
            case 4:
                return (double) Math.round(numero * 10000d) / 10000d;
            default:
                return numero;
        }
    }

    /**
     * Formatea un número, quitando los espacios
     *
     * @param numero texto a validar
     * @return retorna la cadena dada como numero
     */
    public static int obtenerNumero(String numero) {
        String texto = Cadenas.quitaEspacios(numero);
        return Integer.parseInt(texto);
    }

    /**
     * convierte una cadena de texto a double
     *
     * @param numero numero que convertira
     * @return numero en double
     */
    public static double obtenerDouble(String numero) {
        String texto = Cadenas.quitaEspacios(numero);
        return Double.parseDouble(texto);
    }

    /**
     * Busca los numeros que estan en una cadena, ejemplo:<br>
     * si pasas esta cadena "f2,5.7-0", lo convierte a 2570 y lo retorna.
     *
     * @param texto texto donde buscaran
     * @return numeros que se encontraron, si no hay numeros retornara 0
     */
    public static int buscarNumero(String texto) {
        String numero = "0";
        char[] arreglo = texto.toCharArray();
        for (char caracter : arreglo) {
            if (Character.isDigit(caracter)) {
                numero += caracter;
            }
        }
        return Integer.valueOf(numero);
    }
}
