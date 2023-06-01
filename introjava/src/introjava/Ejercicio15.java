/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introjava;

/**
 *Realizar un algoritmo que rellene un vector con los 100 
 * primeros números enteros y los
 * muestre por pantalla en orden descendente.
 * @author peras
 */
public class Ejercicio15 {
    public static void main(String[] args) {
        
        int[] vector = new int[100];
                
        for (int i = 0; i < 100; i++) {
            vector[i] = i+1; 
        }
        
        for (int i = 99; i >= 0 ;i-- ) { 
            System.out.println(vector[i]);
        }
        
    }
}

