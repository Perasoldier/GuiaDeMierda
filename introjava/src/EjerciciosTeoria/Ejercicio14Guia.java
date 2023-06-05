/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosTeoria;

import java.util.Scanner;

/**
 *EJERCICIO 14
 *Utilizando un Bucle for, aloja en el vector Equipo, los
 * nombres de tus compañeros de equipo
 * @author peras
 */
public class Ejercicio14Guia {
    public static void main(String[] args) {
        Scanner scan = new  Scanner(System.in);
        
        System.out.println("Ingrese cantidad de alumnos: ");
        int n = scan.nextInt() ;
        String vector[] = new String[n] ;
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese nombre a almacenar en la posicion "+(i+1)+":" );
            vector[i] = scan.next();
        }
        
        for (int i = 0; i < n ; i++) {
            System.out.println("Posicion "+(i+1)+": " + vector[i]);
        }
        
        
    }
    
}
