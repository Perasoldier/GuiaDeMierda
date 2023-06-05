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
public class Ejercicio9Guia {

        public static void main(String[] args) {
       

        Scanner leer = new Scanner(System.in);

        int num;
        int suma;
        int contador;
        contador = 0;
        suma = 0;
        do {
            System.out.println("Decime un número");
            num = leer.nextInt();
            contador++;

            if (num > 0) {
                suma = suma + num;
            }
           // System.out.println(contador);
        } while (num != 0 && contador != 19);

        System.out.println("Se capturó el numero cero");
        System.out.println(suma);
        
    }
    }

