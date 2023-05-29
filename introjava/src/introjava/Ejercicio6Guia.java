/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introjava;

import java.util.Scanner;

/**
 *EJERCICIO 6
 *Implementar un programa que le pida dos números enteros
 * a usuario y determine si ambos o alguno de ellos es mayor a 25.
 * @author peras
 */
public class Ejercicio6Guia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1,num2;
        System.out.println("Ingrese numero 1:");
        num1 = scan.nextInt();
        System.out.println("Ingrese numero 2:");
        num2 = scan.nextInt();
        
        if (num1>25 && num2>25) {
            System.out.println("Los dos numeros son  mayores que 25");
        } else if (num1>25 || num2>25) {
                System.out.println("Solo uno de los dos es mayor a 25");
                } else {
            System.out.println("Ninguno es mayor a 25");
        }
        
    }
    
}
