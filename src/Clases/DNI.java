
package Clases;

import Excepciones.ErrorDNIException;

public class DNI {
    
    private String DNI;
    
    public DNI(String cadena){
        try{
            controlTamaño(cadena);
            todoDigitos(cadena);
            cadena=tieneLetra(cadena);
            letraCorrecta(cadena);
            this.DNI=cadena;
        }catch(ErrorDNIException ex){
            System.out.println(ex.getMessage());
        }
    }
    
    private void controlTamaño(String cadena) throws ErrorDNIException{
        if(cadena.length()==9){
            System.out.println("La cadena tiene 9 caracteres");
        }else if (cadena.length()<9){
            throw new ErrorDNIException(3);
        }else{
            throw new ErrorDNIException(4);
        }
        
    }
    
    private void todoDigitos(String cadena) throws ErrorDNIException{
        String numero=cadena.substring(0, 8);
        for(int i=0;i<numero.length();i++){
            if(Character.isDigit(numero.charAt(i))){
                
            }else{
                throw new ErrorDNIException(5);
            }
        }
        if (Integer.parseInt(numero)>9999999){
            System.out.println("El numero es correcto");
        }else{
            throw new ErrorDNIException(6);
        }
    }
    
    private String tieneLetra(String cadena) throws ErrorDNIException{
        char letra=cadena.charAt(8);
        if(Character.isAlphabetic(letra)){
            System.out.println("Es una letra: "+Character.toUpperCase(letra));
            return cadena.replace(letra, Character.toUpperCase(cadena.charAt(8)));
        }else{
            throw new ErrorDNIException(1);
        }
    }
    
    private void letraCorrecta(String cadena) throws ErrorDNIException{
        String letracorres="TRWAGMYFPDXBNJZSQVHLCKE";
        char letra=cadena.charAt(8);
        int numero=Integer.parseInt(cadena.substring(0, 8));
        if(letracorres.charAt(numero%23)==letra){
            System.out.println("La tetra es la correcta");
        }else{
            System.out.println("La letra no se corresponde con el numero.\nLa letra correcta seria: "+letracorres.charAt(numero%23));
            throw new ErrorDNIException(2);
        }
    }
}
