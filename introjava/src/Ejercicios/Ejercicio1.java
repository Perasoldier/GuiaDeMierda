/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;


/**
 *
 * @author peras
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        
        
        System.out.println("Ingrese Primer numero");
        int numero1;
        numero1 = numeros.nextInt();
        //
        System.out.println("Ingrese Segundo numero");
        int numero2;
        numero2 = numeros.nextInt();
        //
        System.out.println("La suma de " + numero1 + " + " + numero2 + " es: " + (numero1+numero2));
        
        System.out.println("Hiciste bien el ejercicio gil");
        
        
    }
}
