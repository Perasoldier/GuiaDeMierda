/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Extra;

import java.util.Scanner;

/**
 * 3. Elaborar un algoritmo en el cuál se ingrese 
 * una letra y se detecte si se trata de una vocal.
 * Caso contrario mostrar un mensaje.
 * Nota: investigar la función equals() de la clase String.
 * @author peras
 */
public class Ejercicio3Extra {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese letra a comparar");
        String letra = scan.nextLine().toUpperCase();
        System.out.println("La letra que se ingreso es: "+letra);
        
        comparacion(letra);
        
    }
    public static void comparacion(String letra){
        boolean vocal= false;
        if ("A".equals(letra)){
            vocal= true;
        }
        if ("E".equals(letra)){
            vocal= true;
        }
        if ("I".equals(letra)){
        vocal= true;
        }
        if ("O".equals(letra)){
            vocal= true;
        }
        if ("U".equals(letra)){
            vocal= true;
        }
        if (vocal) {
            System.out.println("La letra es una vocal!");
        }else{
            System.out.println("La letra ingresada no es una Vocal!");
        }
        
        
}
}
