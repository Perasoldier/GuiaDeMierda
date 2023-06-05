package Ejercicios_Extra;

import java.util.Scanner;


/**
Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento
para los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
 * @author peras
 */
public class Ejercicio5Extra {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     String letra;
     int monto;
     menu();
     
         do{
     System.out.println("Ingrese caracter correspondiente a la clase del socio:");
     letra = scan.next();
     letra= letra.toUpperCase();
        }while((letra.length()!=1)||(!"A".equals(letra))&&(!"B".equals(letra))&&(!"C".equals(letra)));
     
    System.out.println("Ingrese monto a Cobrar;");
        do {                              //ATENCION
            if (scan.hasNextInt()) {      //aca hago que repita el scan 
                monto = scan.nextInt();   //hasta que el usuario ingrese un numero
                break;  //aca salgo si es un numero valido
            }else{
                System.out.println("Por favor ingrese un numero!");
            scan.next();
            }
        } while (true) ;
        
     calculo (letra, monto);
        
        }
     
    
    public static void calculo(String letra, int monto){
        switch (letra) {
            case "A":
                System.out.println("El socio debera pagar : $"+(monto*0.5));
                break;
            case "B":
                System.out.println("El socio debera pagar : $"+(monto*0.65));
                break;
            case "C":
                System.out.println("El socio debera pagar : $"+monto);
                break;
           
        }
        
        
    }
    
    public static void menu() {
        System.out.println("Menu de socios:");
        System.out.println("A: Socio clase A");
        System.out.println("B: Socio clase B");
        System.out.println("C: Socio clase C");
        
    }
}

//
//if (scanner.hasNextInt()) {
//                numero = scanner.nextInt();
//                break; // Si se ingresa un número entero, salir del bucle
//            } else {
//                System.out.println("¡Error! Debes ingresar un número entero.");
//                scanner.next(); // Limpiar el buffer de entrada
//            }
//        } while (true);