/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;


/**
 *Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
 *pantalla.
 * @author peras
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String nombre;
        nombre = sc.nextLine();
        
        System.out.println("Usted se llama: "+nombre);
        
    }
}
