/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
 *en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en
 *Java.
 * @author peras
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese Frase:");
        String frase;
        frase = sc.nextLine();
        
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
        
        
    }
}
