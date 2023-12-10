import java.util.Scanner;
/**
*Copyright (C) 2K23, grupo2
*(grupo2 - Opus Geeks), matthewcedeno92@gmail.com


*/
/**
*@Version 1.0.
*@author: Matthew Cedeno.
*@Date: 01/12/2023.
 */
public class Ejercicio9CC {
    public static void cadena9() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();

        // Convertir una letra a mayúsculas y otra a minúsculas
        String resultado = convertirLetras(frase);

        System.out.println("Salida: " + resultado);

        // Cerrar el scanner al finalizar
        scanner.close();
    }

    // Método para convertir una letra a mayúsculas y otra a minúsculas
    private static String convertirLetras(String frase) {
        StringBuilder resultado = new StringBuilder();
        boolean mayusculas = true;

        for (char letra : frase.toCharArray()) {
            if (Character.isLetter(letra)) {
                if (mayusculas) {
                    resultado.append(Character.toUpperCase(letra));
                } else {
                    resultado.append(Character.toLowerCase(letra));
                }

                mayusculas = !mayusculas; // Alternar entre mayúsculas y minúsculas para cada letra
            } else {
                resultado.append(letra);
            }
        }

        return resultado.toString();
    }
}
