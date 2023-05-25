/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introjava;

import java.util.Scanner;





/**
 *Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
  pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
  investigar la función equals() en Java.
 * @author peras
 */
public class Ejercicio7 {
        public static void main(String[] args) {
            Scanner frase = new Scanner(System.in);
            System.out.println("Ingrese Palabra:");
            String f = frase.nextLine();
            f=f.toUpperCase();
            System.out.println("Escribiste "+f);
            
            if (f.equals("EUREKA")) {
                System.out.println("EUREKA ES IGUAL A EUREKA");
            } else {
                System.out.println(f + " No es igual a EUREKA.");
        }
            
            
            
        }            
            
}

