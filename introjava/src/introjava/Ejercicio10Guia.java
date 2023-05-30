/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author peras
 */
public class Ejercicio10Guia {
    
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int num = 0;
        int j = 0;

        for (int i = 0; i < 4; i++) {

            System.out.println("Ingrese un numero que esté comprendido entre 1 y 20");

            num = leer.nextInt();

            while (num < 1 || num > 20) {
                System.out.print("Che el numero este esta mal, ingresa un numero valido, no se cualquier cosa, tákate: ");
                num = leer.nextInt();

            }
            System.out.print(num + " ");
            for (j = 0; j < num; j++) {

                System.out.print("*");
            }

            System.out.println("");

        }
    }
}
   
