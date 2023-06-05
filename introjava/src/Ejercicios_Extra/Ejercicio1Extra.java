/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Extra;

import java.util.Scanner;

/**
 * 1. Dado un tiempo en minutos, calcular su equivalente
 * en días y horas. Por ejemplo, si el
 * usuario ingresa 1600 minutos, el sistema debe calcular 
 * su equivalente: 1 día, 2 horas.
 * @author peras
 */
public class Ejercicio1Extra {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese una cantidad de minutos:");
        int minutos = scan.nextInt();
        System.out.println("Minutos registrados correctamente");
        
        int horas = (minutos / 60) ;
        System.out.println("Horas totales");
                
        System.out.println(horas);
        int dias = horas / 24;
        System.out.println("Dias totales");
        System.out.println(dias);
        System.out.println("Ahora el calculo de verdad:");
        if ((dias !=0)) {
            horas = horas - (24*dias);
        }
        System.out.println("La cantidad de dias es: "+ dias);
        System.out.println("La cantidad de horas es: "+horas);
        System.out.println("");
        System.out.println("Mas lindo asi:");
        
        System.out.println(minutos + "minutos son : " + dias + " dias y "+ horas + " horas");
        
    }
}

