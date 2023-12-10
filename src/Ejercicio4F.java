import java.util.Scanner;
/**
*Copyright (C) 2K23, grupo2
*(grupo2 - Opus Geeks), matthewcedeno92@gmail.com
*@Version 1.0.
*@author: Matthew Cedeno.
*FECHA: 01/12/2023.

*/
public class Figura4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de la pirámide: ");
        int size = scanner.nextInt();

        // Imprimir la pirámide que cae hacia la derecha
        for (int i = 0; i < size; i++) {
            // Imprimir espacios en blanco antes de los asteriscos
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print("  ");
            }

            // Imprimir asteriscos
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println(); // Cambiar de línea después de cada fila
        }

        scanner.close();
    }
}