/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *Crear un programa que dado un numero determine si es par o impar.
 * @author peras
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese numero para verificar:");
        int numero = scan.nextInt();
        
        if (numero%2==0) {
            System.out.println("El numero es Par"); 
        } else {
            System.out.println("El numero es Impar");
        }
        
    }
    
}
