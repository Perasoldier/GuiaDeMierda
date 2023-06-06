/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Extra;

import java.util.Scanner;

/**
 *10. Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 * @author peras
 */
public class Ejercicio10Extra {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String continuar;
        do{
        double numA =(Math.random()*10);
        double numB =(Math.random()*10);
        int multiplicacion= (int)numA*(int)numB;
//        System.out.println(numA);
//        System.out.println(numB);
//        System.out.println((int)numA);
//        System.out.println((int)numB);
//        System.out.println(multiplicacion);

        System.out.println("Adivine el resultado de la \nsiguiente multiplicacion:");
        System.out.print((int)numA+"*"+(int)numB+" = ");
        int respuesta = scan.nextInt();
            System.out.println("");
            if (respuesta==multiplicacion) {
                System.out.println("ACERTASTE");
            }else{
                System.out.println("INCORRECTO");
            }
        System.out.println("Desea reiniciar?");
            do{
                System.out.println("Y/N");
            continuar = scan.next().toUpperCase();
            }   while((!"N".equals(continuar))&&!"Y".equals(continuar));
        } while("Y".equals(continuar));
        
        }        
        
        
   
}

        

