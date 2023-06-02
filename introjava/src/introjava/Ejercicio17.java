/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introjava;

import java.util.Scanner;

/**
 *Recorrer un vector de N enteros contabilizando 
 * cuántos números son de 1 dígito, cuántos
 * de 2 dígitos, etcétera (hasta 5 dígitos).
 * @author peras
 */
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner scan = new  Scanner(System.in);
        String longitud;
        int n , contador1, contador2, contador3, contador4, contador5;
        contador1=0;
        contador2=0;
        contador3=0;
        contador4=0;
        contador5=0;
        System.out.println("Ingrese tamaño del vector");
        n = scan.nextInt();
        int[] vector = new int[n];
        
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 99999) ;
        }
//        for (int i = 0; i < n; i++) {
//        System.out.print("["+vector[i]+"]");
//        }
        
        System.out.println("");
        
        for (int i = 0; i < n; i++) {
         longitud = String.valueOf(vector[i]);
//            System.out.println(i);
//            System.out.println(longitud.length());
          
            if (longitud.length()==1){
                contador1++;
            }
            if (longitud.length()==2){
                contador2++;
            }
            if (longitud.length()==3){
                contador3++;
            }
            if (longitud.length()==4){
                contador4++;
            }
            if (longitud.length()==5){
                contador5++;
            }
        }
        System.out.println("Con 1 de digitos: "+contador1);
        System.out.println("Con 2 de digitos: "+contador2);
        System.out.println("Con 3 de digitos: "+contador3);
        System.out.println("Con 4 de digitos: "+contador4);
        System.out.println("Con 5 de digitos: "+contador5);

        
        
        
        
    }
}
