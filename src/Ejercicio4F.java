
/**
*Copyright (C) 2K23, grupo2
*(grupo2 - Opus Geeks), matthewcedeno92@gmail.com
*/
/**
*@Version 1.0.
*@author: Matthew Cedeno.
*@Date 01/12/2023.
 */
public class Ejercicio4F {
    public static void figura4(int size1) {
       
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size1 - i - 1; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println(); // Cambiar de línea después de cada fila
        }

    }
}