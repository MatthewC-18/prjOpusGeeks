import java.util.Scanner;
/**
*Copyright (C) 2K23, grupo2
*(grupo2 - Opus Geeks), matthewcedeno92@gmail.com
*@Version 1.0.
*@author: Matthew Cedeno.
*FECHA: 01/12/2023.

*/
public class Figura1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del cuadrado: ");
        int size = scanner.nextInt();

        // Imprimir la figura
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // Verificar si estamos en los bordes o en el interior
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Espacio en blanco para el interior
                }
            }
            System.out.println(); // Cambiar de línea después de cada fila
        }

        scanner.close();
    }
    
}
