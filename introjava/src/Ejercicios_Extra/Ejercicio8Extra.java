/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Extra;

import java.util.Scanner;

/**
 *8. Escriba un programa que lea números enteros. 
 * Si el número es múltiplo de cinco debe
 * detener la lectura y mostrar la cantidad de números leídos,
 * la cantidad de números pares
 * y la cantidad de números impares.
 * Al igual que en el ejercicio anterior los números negativos no deben sumarse.
 * Nota: recordar el uso de la sentencia break.
 * 
 * @author peras
 */
public class Ejercicio8Extra {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        int contador=0;
        int contadorPar=0;
        int contadorImpar=0;
        
        do {     
            System.out.println("Ingrese numero:");
            num = scan.nextInt();
            
                if (num==0) {
                    System.out.println("Solo se pueden ingresar numero mayores a 0");
                continue;
                }
                if (num%5==0) {
                    System.out.println("Ingresaste un multiplo de 5,\nHasta aca llegaste bandido;");
                    break;
                }
                contador++;
            if (num%2==0) {
                contadorPar++;
            }else{
                contadorImpar++;
            }         
        } while ((num<=0)||(num%5!=0));
        
        System.out.println("Se hizo la lectura de un total de "+contador+" numeros");
        System.out.println("Se encontraron "+contadorPar+" numero pares");
        System.out.println("Se encontraron "+contadorImpar+" numeros impares");
    }
}
