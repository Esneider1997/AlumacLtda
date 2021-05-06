package utilidades;

/**
 * Clase para manejar todo lo que sea cadenas de texto
 *
 * @author Harold Campo Morales
 */
public final class Cadenas {

    /**
     * Se define el constructor privado para que no pueda ser instanciado
     */
    private Cadenas() {
    }

    /**
     * Valida si una cadena es de solo letras
     *
     * @param cadena texto que se va ha validar
     * @return -1 si está vacio
     * <br>1 si es valido
     * <br>0 si no es valido
     */
    public static int validarCadena(String cadena) {
        String texto = cadena.trim();
        if (texto.isEmpty()) {
            return -1;
        }
        if (texto.matches("^[A-Za-zñÑáéíóúÁÉÍÓÚ ]*$")) {
            return 1;
        }
        return 0;
    }

    /**
     * Valida si una cadena es un nit
     *
     * @param nit cadena a validar
     * @return -1 si está vacio
     * <br>1 si es valido
     * <br>0 si no es valido
     */
    public static int validarNit(String nit) {
        String texto = nit.trim();
        if (texto.isEmpty()) {
            return -1;
        }
        if (texto.matches("^[0-9-.]*$")) {
            return 1;
        }
        return 0;
    }

    /**
     * Valida si una cadena tiene letras y/o numeros, para validar quita los
     * espacios de inicio y final
     *
     * @param cadena texto a validar
     * @return -1 si está vacio
     * <br>1 si es valido
     * <br>0 si no es valido
     */
    public static int validarAlfanumerico(String cadena) {
        String texto = cadena.trim();
        if (texto.isEmpty()) {
            return -1;
        }
        if (texto.matches("^[A-Za-z0-9ñÑáéíóúÁÉÍÓÚ ]*$")) {
            return 1;
        }
        return 0;
    }
    
    /**
     * Valida si una cadena tiene letras y/o numeros, y un quion, para validar quita los
     * espacios de inicio y final
     *
     * @param cadena texto a validar
     * @return -1 si está vacio
     * <br>1 si es valido
     * <br>0 si no es valido
     */
    public static int validarLote(String cadena) {
        String texto = cadena.trim();
        if (texto.isEmpty()) {
            return -1;
        }
        if (texto.matches("^[A-Za-zñÑáéíóúÁÉÍÓÚ0-9- ]*$")) {
            return 1;
        }
        return 0;
    }

    /**
     * Formatear la cadena cada
     *
     * @param cadena texto que se va ha formatear
     * @param condicion indica las condiciones del texto devuelto
     * <br>1 MAYUSCULAS
     * <br>2 minusculas
     * <br>3 Mayuscula la primera de la cadena
     * <br>4 Mayuscula Cada Palabra De Una Frase
     * <br>Cualquier otro numero retornara la cadena sin cambios
     * @return texto formateado segun la condicion indicada
     */
    public static String formatearCadena(String cadena, int condicion) {
        String texto = Cadenas.quitaEspacios(cadena);
        switch (condicion) {
            case 1://MAYUSCULAS
                return texto.toUpperCase();
            case 2://MINUSCULA
                return texto.toLowerCase();
            case 3://MAYUSCULA LA PRIMERA
                return primeraAMayuscula(texto);
            case 4://MAYUSCULA LA PRIMERA DE CADA PALABRA
                String[] cadena2 = texto.split(" ");
                StringBuilder cadenaFinal = new StringBuilder();
                int longitud = cadena2.length;
                for (int i = 0; i < longitud; i++) {
                    cadenaFinal.append(" ").append(primeraAMayuscula(cadena2[i]));
                }
                return String.valueOf(cadenaFinal).trim();
            default://NO CAMBIA NADA
                return texto;
        }
    }

    /**
     * Convierte la primera letra de una cadena a mayusculas
     *
     * @param texto cadena a convertir
     * @return cadena convertida o la cadena sin hacer nada si no es una cadena
     * valida
     */
    public static String primeraAMayuscula(String texto) {
        if (texto == null || texto.length() == 0) {
            return texto;
        }
        char chars[] = texto.toLowerCase().toCharArray();
        chars[0] = Character.toUpperCase(chars[0]);
        return String.copyValueOf(chars);
    }

    /**
     * Valida si una cadena es un numero, para validar quita los espacios de
     * inicio y final
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
     * Valida que una cadena dada sea un numero entero o un double
     *
     * @param numero texto a validar
     * @return -1 si está vacio
     * <br>1 si es valido
     * <br>0 si no es valido
     */
    public static byte validarEnteroDouble(String numero) {
        if (numero.trim().isEmpty()) {
            return -1;
        }
        if (numero.trim().matches("^[0-9]*$") || numero.trim().matches("^[0-9]+(\\.[0-9])*$")) {
            return 1;
        }
        return 0;
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
     * Formatea un número, quitando los espacios
     *
     * @param numero texto a validar
     * @return retorna la cadena dada como numero
     */
    public static long obtenerNumeroLong(String numero) {
        String texto = Cadenas.quitaEspacios(numero);
        return Long.parseLong(texto);
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

    /**
     * convierte una cadena numerica a double
     *
     * @param numero numero que convertira
     * @return numero en double
     */
    public static double obtenerDouble(String numero) {
        String texto = Cadenas.quitaEspacios(numero);
        return Double.parseDouble(texto);
    }

    /**
     * Quita los espacios de mas en una cadena dada
     *
     * @param cadena texto a formatear
     * @return texto sin espacios de mas
     */
    public static String quitaEspacios(String cadena) {
        String texto = cadena.trim();
        texto = texto.replaceAll(" {2,}", " ");
        return texto;
    }
}
