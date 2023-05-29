/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introjava;

import java.util.Scanner;

/**
 * EJERCICIO 8
 * Escriba un programa que valide si una nota está entre 0 y 10, sino está 
 * entre 0 y 10 la nota se
 * pedirá de nuevo hasta que la nota sea correcta.
 * @author peras
 */
public class Ejercicio8Guia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero entre 0 y 10");
        numero = scan.nextInt();
        
         while (!(numero>=0 && numero<=10)) {
             System.out.println("Ingrese un numero valido,gil: ");
             numero = scan.nextInt();
         }
        
    }
        
        
    }
   
