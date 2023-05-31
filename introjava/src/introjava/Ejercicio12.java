/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introjava;

import java.util.Scanner;

/**
 *s
 * @author peras
*/
public class Ejercicio12 {
   public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese una frase que empiece con X y termine con O"); 
       int salida = 1;
       int contadorCorrecto = 0;
       int contadorGlobal = 0;
       String frase, aux1, aux2;
       frase = " ";
       
       while (salida == 1) {

       do {            
        if (frase.equals("&&&&&")) {
            salida = 0;
            break ;
        }
       frase = leer.nextLine();

       frase = frase.toUpperCase();

       aux1 = frase.substring(0,1);

       aux2 =  frase.substring(frase.length()-1,frase.length());
       
       contadorGlobal++ ;
        

       } while ((!"O".equals(aux2))|| (!"X".equals(aux1)) || frase.length()>5);

       contadorCorrecto++ ;


}
       System.out.println("Intentos correctos: " + (contadorCorrecto-1)); 
       System.out.println("Intentos fallidos: " + (contadorGlobal-contadorCorrecto)); 
       
}
}