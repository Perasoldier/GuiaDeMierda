/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introjava;

import java.util.Scanner;

/**
 * Realizar un algoritmo que rellene un vector de 
 * tamaño N con valores aleatorios y le pida
 * al usuario un numero a buscar en el vector. 
 * El programa mostrará donde se encuentra el
 * numero y si se encuentra repetido
 * @author peras
 */
public class Ejercicio16 {
    public static void main(String[] args) {
       
       Scanner scan = new Scanner(System.in);
       int n,contador;
       contador = 0;
       System.out.println("Ingrese tamaño del vector:");
       n = scan.nextInt();

        int[] vector = new int[n] ;
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 10) ;
        }
        for (int i = 0; i < n; i++) {
        System.out.print("["+vector[i]+"]");
        }
        System.out.println("");
        System.out.println("Ingrese numero a buscar");
        int x = scan.nextInt();
        
        for (int i = 0; i < n; i++) {
            if (vector[i] == x) {
                System.out.println("El numero ingresado se encontro en la posicion:" + (i+1));
                contador++ ;
            }                
        }
        if (contador==0) {
                System.out.println("El numero no se encontro en ninguna posicion!");
            } 
        
    }  
    }
   

