import java.util.Scanner;
/**
*Copyright (C) 2K23, grupo2
*(grupo2 - Opus Geeks), matthewcedeno92@gmail.com
*@Version 1.0.
*@author: Matthew Cedeno.
*FECHA: 01/12/2023.

*/
public class Figura13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de líneas de la pirámide: ");
        int n = scanner.nextInt();

        // Bucle externo para controlar el número de líneas
        for (int i = 1; i <= n; i++) {
            // Bucle interno para imprimir los números en cada línea
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Cambiar de línea después de imprimir los números
            System.out.println();
        }

        // Cerrar el scanner al finalizar
        scanner.close();
    }
}
