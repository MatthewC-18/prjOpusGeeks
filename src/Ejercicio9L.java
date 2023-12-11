/**
*Copyright (C) 2K23, grupo2
*(grupo2 - Opus Geeks), matthewcedeno92@gmail.com
*@Version 1.0.
*@author: Matthew Cedeno.
*FECHA: 01/12/2023.

*/
import java.util.Scanner;

public class Ejercicio9L {
    public static void loading9() {
        ejecutarLoading9();
    }

    public static void ejecutarLoading9() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre completo: ");
        String nombreCompleto = scanner.nextLine();

        System.out.println("Progreso de caracteres:");

        int longitudNombre = nombreCompleto.length();
        int porcentaje = 0;

        // Número deseado de letras a mostrar
        int letrasAMostrar = 5;

        for (int i = 0; i < longitudNombre; i++) {
            char letra = nombreCompleto.charAt(i);
            porcentaje = ((i + 1) * 100) / longitudNombre;

            // Mostrar letras equidistantes acercándose al porcentaje
            if (longitudNombre >= letrasAMostrar && (i + 1) % (longitudNombre / (letrasAMostrar + 1)) == 0) {
                // Añadir espacios para alinear correctamente los porcentajes
                for (int j = 0; j < porcentaje / 5; j++) {
                    System.out.print(" ");
                }

                System.out.print(letra);

                // Añadir espacios para acercar la letra al porcentaje
                for (int j = 0; j < 5 - porcentaje / 5; j++) {
                    System.out.print(" ");
                }

                System.out.println("\t" + porcentaje + "%");
            }
        }
    }
}
