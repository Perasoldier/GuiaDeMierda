/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosTeoria;

import java.util.Scanner;

/**
 *
 * @author peras
 */

/*EJERCICIO 11
Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
vocales acentuadas) se mantienen sin cambios.

a e i o u
@ # $ % *

Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
correspondiente. Utilice la estructura “según” para la transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10. */


public class Ejercicio11Guia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese Frase:");
        String frase = scan.nextLine();
        
        reemplazo(frase);
        
        
    }
    
    public static void reemplazo(String frase) {
        frase = frase.replace('a','@') ;      
        frase = frase.replace('e','#') ;
        frase = frase.replace('i','$') ;
        frase = frase.replace('o','%') ;
        frase = frase.replace('u','*') ; 
        System.out.println(frase) ;
    }
    
}

