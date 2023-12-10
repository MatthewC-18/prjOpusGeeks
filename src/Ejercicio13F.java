import java.util.Scanner;
/**
*Copyright (C) 2K23, grupo2
*(grupo2 - Opus Geeks), matthewcedeno92@gmail.com
*/
/**
*@Version 1.0.
*@author: Matthew Cedeno.
*@DATE : 01/12/2023
 */
public class Ejercicio13F {
    public static void figura13(int n) {
  
        for (int i = 1; i <= n; i++) {
            // Bucle interno para imprimir los números en cada línea
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Cambiar de línea después de imprimir los números
            System.out.println();
        }
    }
}
