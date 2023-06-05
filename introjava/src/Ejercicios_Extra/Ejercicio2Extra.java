/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Extra;

import java.util.Scanner;

/**
 *2. Declarar cuatro variables de tipo entero A, B, C y D 
 * y asignarle un valor diferente a cada
 * una. A continuación, realizar las instrucciones necesarias 
 * para que: B tome el valor de C,
 * C tome el valor de A, A tome el valor de D y D tome el valor de B. 
 * Mostrar los valores
 * iniciales y los valores finales de cada variable. 
 * Utilizar sólo una variable auxiliar.
 * @author peras
 */
public class Ejercicio2Extra {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int a,b,c,d,aux ;
        aux=0;
        System.out.println("Ingrese valor de A:");
        a = scan.nextInt();
        System.out.println("Ingrese valor de B:");
        b = scan.nextInt();
        System.out.println("Ingrese valor de C:");
        c = scan.nextInt();
        System.out.println("Ingrese valor de D:");
        d = scan.nextInt();
        
//        System.out.println("Las variables son: ");
//        System.out.println("Valor de la variable A: "+a);
//        System.out.println("Valor de la variable B: "+b);
//        System.out.println("Valor de la variable C: "+c);
//        System.out.println("Valor de la variable D: "+d);
        escritura(a,b,c,d);

        System.out.println("Pim Pam Pum........");
        System.out.println("..........");
        System.out.println(".........");
        System.out.println("........");
        System.out.println("Variables intercambiadas correctamente!");
        
        aux = b;
        b=c;
        c=a;
        a=d;
        d=aux;
        escritura(a,b,c,d);
//        System.out.println("Las variables son: ");
//        System.out.println("Valor de la variable A: "+a);
//        System.out.println("Valor de la variable B: "+b);
//        System.out.println("Valor de la variable C: "+c);
//        System.out.println("Valor de la variable D: "+d);
    }
    
    public static void escritura (int a,int b, int c, int d){
        System.out.println("Las variables son: ");
        System.out.println("Valor de la variable A: "+a);
        System.out.println("Valor de la variable B: "+b);
        System.out.println("Valor de la variable C: "+c);
        System.out.println("Valor de la variable D: "+d);
    }
    
}
