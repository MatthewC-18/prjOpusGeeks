import java.util.Scanner;
/**
*Copyright (C) 2K23, grupo2
*(grupo2 - Opus Geeks), matthewcedeno92@gmail.com
*@Version 1.0.
*@author: Matthew Cedeno.
*FECHA: 01/12/2023.

*/
public class Ejercicio7CC{
    public static void cadena7() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();

        // Convertir a mayúsculas y eliminar la letra 'J'
        String resultado = procesarFrase(frase);

        System.out.println("Salida: " + resultado);

        // Cerrar el scanner al finalizar
        scanner.close();
    }

    // Método para procesar la frase
    private static String procesarFrase(String frase) {
        // Convertir a mayúsculas
        String mayusculas = frase.toUpperCase();

        // Eliminar la letra 'J'
        String sinJ = mayusculas.replace("J", "");

        return sinJ;
    }
}
