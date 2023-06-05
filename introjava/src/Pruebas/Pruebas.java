/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pruebas;

import java.util.Scanner;

/**
 *
 * @author peras
 */
public class Pruebas {
    public static void main(String[] args) {
        
    
    
     Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una Altura");
        int n = leer.nextInt();

        for (int i = 1; i < n; i++) {
            for(int j = 1; j< n; j++){
                  if ( (i == 1)||(j == 1)||(i == n) || (j== n)){
                      System.out.print("*" );

                    } else {
                      System.out.print(" " );}
            }
            System.out.println(" ");
            }
}
}