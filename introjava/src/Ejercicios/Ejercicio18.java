/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *Realizar un programa que rellene un matriz de 4 x 4 
 * de valores aleatorios y muestre la
 * traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se
 * obtiene cambiando sus filas por columnas (o viceversa).
 * @author peras
 */
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[][] matrizA,matrizB ;
        matrizA = new int[4][4];
        matrizB = new int[4][4];

        System.out.println("MATRIZ A:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizA[i][j] = (int) (Math.random()*10);
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("["+matrizA[i][j]+"}");
            }
            System.out.println("  ");
        }
        System.out.println("MATRIZ B:");
        
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                matrizB[j][i] = matrizA[i][j];
            }
        }
        for ( int i = 0; i < 4; i++) {
            for ( int j = 0; j < 4; j++) {
                System.out.print("["+matrizB[i][j]+"}");
            }
            System.out.println("  ");
        }
        
    
}
}