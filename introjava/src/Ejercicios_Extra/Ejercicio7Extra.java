/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Extra;


import java.util.Scanner;

/**
 * 7. Realice un programa que calcule y visualice
 * el valor máximo, el valor mínimo y el
 * promedio de n números (n>0). El valor de n se 
 * solicitará al principio del programa y los
 * números serán introducidos por el usuario. Realice dos 
 * versiones del programa, una
 * usando el bucle “while” y otra con el bucle “do - while”.
 * @author peras
 */
public class Ejercicio7Extra {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max,min;
        double sumatoria;
        max = 0;
        min = 0;
        sumatoria = 0;
        int n;
         
        do{
        System.out.println("Ingrese cantidad de numero a evaluar: ");
        n = scan.nextInt();
        }while(n<1);
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el "+(i+1)+" :");
            int numero = Integer.parseInt(scan.next());
            if (i==0) {
                max= numero;
                min= numero;
            }
            
            max= Math.max(max,numero);
            min= Math.min(min,numero);
            sumatoria= sumatoria+numero;
            
        }
        
        System.out.println("EL promedio de los numeros es: "+sumatoria/n);
        System.out.println("El numero mayor es : "+(int)Math.floor(max));
        System.out.println("El numero menor es : "+(int)Math.floor(min));

        
    }
}
