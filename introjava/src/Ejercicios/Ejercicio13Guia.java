/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *EJERCICIO 13
 *Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
 *define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
 * @author peras
 */
public class Ejercicio13Guia {
    public static void main(String[] args) {
        Scanner scan = new  Scanner(System.in);
        //int n = scan.nextInt();
        
        String[] vector = new String[4] ;
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese nombre a Almacenar: ");
            vector[i] = scan.nextLine() ;
        }
        
        for (int i = 0; i < 4; i++) {
            System.out.println("En la posicion: " +(i+1)+ " se almaceno el nombre: " + vector[i] );
        }
        
    }
}
