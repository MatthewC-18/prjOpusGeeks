/**
*Copyright (C) 2K23, grupo2
*(grupo2 - Opus Geeks), freddyjimenez2003@gmail.com
*@Version 1.0.
*@author: Freddy Jimenez.
*FECHA: 11/12/2023.
*/
import java.util.Scanner;

public class Ejercicio2C {

    // Método para contar las vocales y consonantes en una cadena
    public void contarVocalesConsonantes(String cadena) {
        int contadorVocales1 = 0;
        int contadorConsonantes = 0;

        // Convertir la cadena a minúsculas para contar las vocales y consonantes sin importar mayúsculas o minúsculas
        cadena = cadena.toLowerCase();

        // Iterar sobre cada caracter en la cadena
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);

            // Verificar si el caracter es una vocal
            if (esVocal(caracter)) {
                contadorVocales1++;
            } else if (Character.isLetter(caracter)) {
                // Verificar si el caracter es una letra (es decir, una consonante)
                contadorConsonantes++;
            }
        }

        // Mostrar los resultados
        System.out.println("La cadena: " + cadena + " tiene " + contadorConsonantes + " consonantes.");
    }

    // Método para verificar si un caracter es una vocal
    private boolean esVocal(char caracter) {
        return caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u';
    }

    public static void main(String[] args) {
        Ejercicio2C ejercicio = new Ejercicio2C();
        ejercicio.contarVocalesConsonantes("Hola Mundo");
    }
}
