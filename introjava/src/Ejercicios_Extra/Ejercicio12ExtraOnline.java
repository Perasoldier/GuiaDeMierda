/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Extra;

/**
 *
 * @author peras
 */
public class Ejercicio12ExtraOnline {
    public static void main(String[] args) {
        String resultado;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    resultado = (i + " - " + j + " - " + k);

                    if (resultado.contains("3")) {
                        resultado = resultado.replaceAll("3", "E");
                    }

                    System.out.println(resultado);
                }
            }
        }
    }
}
