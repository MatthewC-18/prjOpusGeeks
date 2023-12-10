import java.util.Scanner;
/**
*Copyright (C) 2K23, grupo2
*(grupo2 - Opus Geeks), matthewcedeno92@gmail.com
*/
/**
*@Version 1.0.
*@author: Matthew Cedeno.
*@DATE: 01/12/2023.
 */
public class Ejercicio2F {
    public static void figura2(int tamano) {
        
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                // Verificar si estamos en los bordes
                if (i == 0 || i == tamano  - 1 || j == 0 || j == tamano - 1) {
                    if ((i + j) % 2 == 0) {
                        System.out.print("* ");
                    } else {
                        System.out.print("+ ");
                    }
                } else {
                    System.out.print("  "); // Espacio en blanco para el interior
                }
            }
            System.out.println(); // Cambiar de línea después de cada fila
        }
    }
}
