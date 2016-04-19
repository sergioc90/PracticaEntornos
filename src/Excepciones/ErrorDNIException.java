
package Excepciones;

/**
 *
 * @author dam122
 */
public class ErrorDNIException extends Exception{
    
    private int error;
    
    public ErrorDNIException(int numero){
        error=numero;
    }

    @Override
    public String getMessage() {
        switch(error){
            case 1:return "La cadena no tiene letra en la posicion correcta";
            case 2:return "La letra no es la correspondiente al numero";
            case 3:return "La cadena es corta";
            case 4:return "La cadena es larga";
            case 5:return "No son todo numeros en los 8 primeros caracteres";
            case 6:return "El numero no es valido debe ser de 8 cifras sin 0 a la izquierda";
            default:return "No me esperaba esto";
        }
    }
    
    
}
