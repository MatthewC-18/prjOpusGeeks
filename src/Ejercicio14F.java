import java.util.Scanner;
/**
*Copyright (C) 2K23, grupo2
*(grupo2 - Opus Geeks), matthewcedeno92@gmail.com
*@Version 1.0.
*@author: Matthew Cedeno.
*FECHA: 01/12/2023.

*/
public class Ejercicio14F {
    public static void figura14(int n ) {
       
        // Imprimir el Triángulo de Pascal
        for (int i = 0; i < n; i++) {
            // Espacios en blanco para alinear los números
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }

            // Calcular y imprimir los coeficientes binomiales
            for (int j = 0; j <= i; j++) {
                System.out.print(coeficienteBinomial(i, j) + "    ");
            }

            // Cambiar de línea después de imprimir cada fila
            System.out.println();
        }
    }

    // Método para calcular el coeficiente binomial (n choose k)
    private static int coeficienteBinomial(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            return coeficienteBinomial(n - 1, k - 1) + coeficienteBinomial(n - 1, k);
        }
    }
}
