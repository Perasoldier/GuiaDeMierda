/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;



/**
 *Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
 * @author peras
 */
public class Ejercicio13 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese numero a dibujar");
        int n = scan.nextInt();   
        
        for (int i = 0; i < (n); i++) {
            for (int j = 0; j < (n) ; j++) {
                if (((i==0)|| (i==(n-1))) ||((j==0)||(j==(n-1)))) {
                    System.out.print("* ");
               // } else if () {
                    
                 //    System.out.print("$") ;
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
            
            
        }
        
        
        
        
        
    }
}
