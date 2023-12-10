import java.util.Random;
import java.util.Scanner;
/**
*Copyright (C) 2K23, grupo2
*(grupo2 - Opus Geeks), matthewcedeno92@gmail.com
*@Version 1.0.
*@author: Matthew Cedeno.
*FECHA: 01/12/2023.

*/
public class Ejercicio8CC {
    public static void cadena8() {
        String[] conjunto = {"delira", "lidera", "Ballena", "llenaba", "Alondra", "Ladrona", "España", "apañes", "Enrique", "quieren"};

        Random random = new Random();
        int indicePalabra = random.nextInt(conjunto.length);

        String palabraSeleccionada = conjunto[indicePalabra];
        String anagramaEsperado = generarAnagrama(palabraSeleccionada);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Palabra: " + palabraSeleccionada);
        System.out.print("Ingrese el anagrama de la palabra: ");
        
        int intentos = 0;
        while (intentos < 3) {
            String intentoUsuario = scanner.nextLine();

            if (intentoUsuario.equalsIgnoreCase(anagramaEsperado)) {
                System.out.println("¡Correcto!");
                break;
            } else {
                intentos++;
                if (intentos < 3) {
                    System.out.println("Intento incorrecto. Inténtalo de nuevo.");
                } else {
                    System.out.println("Lo siento, has agotado tus intentos. La respuesta correcta es: " + anagramaEsperado);
                }
            }
        }

        // Cerrar el scanner al finalizar
        scanner.close();
    }

    private static String generarAnagrama(String palabra) {
        char[] letras = palabra.toCharArray();
        Random random = new Random();

        // Mezclar las letras para formar un anagrama
        for (int i = letras.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            char temp = letras[i];
            letras[i] = letras[j];
            letras[j] = temp;
        }

        return new String(letras);
    }
}
