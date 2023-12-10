import java.util.Scanner;
/**
*Copyright (C) 2K23, grupo2
*(grupo2 - Opus Geeks), matthewcedeno92@gmail.com
* 1.0.
*@author: Matthew Cedeno.
*FECHA: 01/12/2023.

*/
/**
 * *@Version 1.0.
*@author: Matthew Cedeno.
 */
public class Ejercicio1F {
    
    public static void figura1(int size) {

        // Imprimir la figura
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // Verificar si estamos en los bordes o en el interior
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}