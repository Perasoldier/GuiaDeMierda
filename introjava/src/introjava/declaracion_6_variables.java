/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author peras
 */
public class declaracion_6_variables {
    public static void main(String[] args) {
        int numero1;
        short numero2;
        byte numero3;
        String nombre1;
        boolean logico;
        double numero4;
        float numero5;
        char simbolo;
        
        numero1=20;
        numero2=30;
        numero3= 50;
        nombre1="santi";
        logico=true;
        numero4=20.5;
        numero5=(float) 12.5;
        simbolo ='e';
        
        System.out.println("(Santi)");//escribir o escribir sin saltar
        Scanner sc = new Scanner(System.in);//leer
        System.out.println("Entiendo un poco :) ");
        String nombre = sc.nextLine();
        System.out.println("Decime tu nombre: " + nombre);
        
        
       /* System.out.println("luchi"); // escribir o escribir sin saltar
        Scanner sc = new Scanner(System.in); // leer
        System.out.println("decime tu nombre :) "); // sout control tab para que me aparezca
        String nombre = sc.nextLine();
        System.out.println("nombre:" + nombre); */

    }
 
    
    
}
