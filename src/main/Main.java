
package main;

import Clases.DNI;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 *
 * @author dam122
 */
public class Main {

    public static void main(String[] args) {
        InputStreamReader objeto=new InputStreamReader(System.in);
        BufferedReader teclado=new BufferedReader(objeto);
        
        try{
            System.out.println("introduce un valor para el DNI");
            DNI dni1=new DNI(teclado.readLine());
        }catch(Exception ex){
            System.out.println("Error no contemplado");
        }
    }
    
}
