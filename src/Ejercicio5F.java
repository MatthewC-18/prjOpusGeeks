/**
*Copyright (C) 2K23, grupo2
*(grupo2 - Opus Geeks), freddyjimenez2003@gmail.com
*@Version 1.0.
*@author: Freddy Jimenez.
*FECHA: 11/12/2023.
*/
public class Ejercicio5F {

    public static void imprimirPatronAsteriscos(int numeroLineasFJ) {
        for (int i = 0; i < numeroLineasFJ; i++) {
            // Imprimir espacios en blanco
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }

            // Imprimir asteriscos en forma descendente
            for (int k = 0; k < (2 * (numeroLineasFJ - i) - 1); k++) {
                System.out.print("*");
            }

            System.out.println(); // Nueva línea para la siguiente fila
        }
    }
}
