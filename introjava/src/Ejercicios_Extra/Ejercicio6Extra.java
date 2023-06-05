/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Extra;

import java.util.Scanner;

/**
 * 6. Leer la altura de N personas y determinar el 
 * promedio de estaturas que se encuentran
 * por debajo de 1.60 mts. y el promedio de estaturas en general.
 * @author peras
 */
public class Ejercicio6Extra {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String seguir="X";
        int altura = 0;
        int sumaBajo = 0;
        int contadorBajo = 0 ;
        int contadorTotal = 0;
        int sumaTotal = 0;
        do {            
            System.out.println("Ingrese Altura en cm :");
                do{
                    if (scan.hasNextInt()) {
                    altura = scan.nextInt();
                        break;
                       } else {
                        System.out.println("Por favor ingrese un numero!");
                        scan.next();
                    }
                } while (true) ;
            
            contadorTotal++;
            sumaTotal = sumaTotal+altura;
            
                if (altura<160) {
                    contadorBajo++;
                    sumaBajo = sumaBajo+altura;
                }
            
            System.out.println("Desea ingresar otra altura: ");
            do{
            System.out.println("Y / N?");            
            seguir = scan.nextLine().toUpperCase();
            }while ((!"Y".equals(seguir))&&(!"N".equals(seguir))) ;
            
        } while (!"N".equals(seguir));
        
        
        System.out.println("Se registraron "+contadorBajo+" personas con altura menor a 1.60mts");
        
        if (contadorBajo>0) {
           System.out.println("Su promedio de estatura fue de "+(sumaBajo/contadorBajo)+ " cm");   
        } else {
            System.out.println("No hay suficientes datos para promediar los menores a 160cm");
        }
        System.out.println("Se registraron en total "+contadorTotal+" alturas, promediando: "+(sumaTotal/contadorTotal)+" cm");
        
    }
}
