/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introjava;

import java.util.Scanner;

/**
 * Crea una aplicación que a través de una función nos convierta una cantidad 
 * de euros introducida por teclado a otra moneda, estas pueden ser
 * a dólares, yenes o libras.
 * La función tendrá como parámetros, la cantidad de euros y la
 * moneda a converir que será
 * una cadena, este no devolverá ningún valor y mostrará 
 * un mensaje indicando el cambio (void).
 * El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €
 * @author peras
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        
        convertidor();
        
    }
    
    
    public static void convertidor() {
        Scanner scan = new Scanner(System.in);
        int opcion,convertido;
        System.out.println("Ingrese monto a convertir:");
        String monto = scan.nextLine();
        
        System.out.println("A que divisa lo va a cambiar:");
        System.out.println("1 Libra");
        System.out.println("2 Dolar");
        System.out.println("3 Yenes");
        System.out.println("4 SALIR");
       
        do {      
            System.out.println("INGRESE OPCION");
            opcion = scan.nextInt();
         } while ((opcion<1)||(opcion >4));
        convertido = Integer.parseInt(monto);
        switch (opcion) {
            case 1:
                System.out.println("El monto pasado a Libras es : ");
                System.out.println((convertido*0.86)+"libras");
                break;
            case 2: 
                System.out.println("El monto pasado a Dolares es : ");
                System.out.println((convertido*1.28611)+"Dolares");
                break;
            case 3:
                System.out.println("El monto pasado a Yenes es : ");
                System.out.println((convertido*129.852)+"Yenes");
                break;                
            default:
                System.out.println("Finalizo el programa. Muchas Gracias.");        }

        
        
}
}
