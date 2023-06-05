/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *Escribir un programa que lea un número entero por teclado y muestre por pantalla el
 *doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
 *Math.sqrt().
 * @author peras
 */
public class Ejercicio5 {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     
        System.out.println("Ingrese un numero: ");
        double numero = scan.nextDouble();
        
        System.out.println("El numero duplicado es: "+ (numero*2)) ;
        System.out.println("El numero triplicado es: "+(numero*3));
        System.out.println("La raiz cuadrada del numero es: " + Math.sqrt(numero));
        
        
    }
    
}
