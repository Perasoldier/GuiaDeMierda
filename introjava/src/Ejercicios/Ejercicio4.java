/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
 *Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 * @author peras
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner temperatura = new Scanner(System.in) ;
        System.out.println("Ingrese temperatura en grados celcius: ");
         
        double t = temperatura.nextDouble();
        
        double f;
        
        f = 32+(9*t/5);
        
        System.out.println(t+"°C a grados Fahrenheit son: " + f + "°F");
                     
    }
    
    
}
