import java.util.Scanner;
/**
*Copyright (C) 2K23, grupo2
*(grupo2 - Opus Geeks), matthewcedeno92@gmail.com
*/
/**
*@Version 1.0.
*@author: Matthew Cedeno.
*@Date 01/12/2023.
 */
public class Ejercicio2A {
    public static void ejercicio2A() {
        // Nombre predefinido
        String nombreCompleto = "Matthew Cedeno";

        // Ingrese el tamaño de la matriz
        Scanner Ejercicio2Aing = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de la matriz: ");
        int tamano = Ejercicio2Aing.nextInt();
        Ejercicio2Aing.nextLine(); // Consumir la nueva línea pendiente después del nextInt

        // Ingrese el caracter
        System.out.print("Ingrese el caracter para las iniciales: ");
        char caracter = Ejercicio2Aing.nextLine().charAt(0);

        // Crear e imprimir la matriz de iniciales
        imprimirMatrizIniciales(nombreCompleto, tamano, caracter);
    }

    static void imprimirMatrizIniciales(String nombreCompleto, int tamano, char caracter) {
        // Obtener las iniciales del nombre y apellido
        String iniciales = obtenerIniciales(nombreCompleto);

        // Definir el tamaño de la matriz según la longitud de las iniciales
        int tamanoMatriz = iniciales.length() * 2 + 1;
        char[][] matriz = new char[tamanoMatriz][tamanoMatriz];

        // Inicializar la matriz con espacios en blanco
        for (int i = 0; i < tamanoMatriz; i++) {
            for (int j = 0; j < tamanoMatriz; j++) {
                matriz[i][j] = ' ';
            }
        }

        // Colocar las iniciales en la matriz
        int fila = tamanoMatriz / 2;
        int columna = tamanoMatriz / 2 - iniciales.length();

        for (int i = 0; i < iniciales.length(); i++) {
            matriz[fila][columna] = iniciales.charAt(i);
            matriz[fila][columna + 2] = iniciales.charAt(i);
            fila += 2;
        }

        // Imprimir la matriz
        for (int i = 0; i < tamanoMatriz; i++) {
            for (int j = 0; j < tamanoMatriz; j++) {
                if (matriz[i][j] == ' ') {
                    System.out.print(caracter);
                } else {
                    System.out.print(matriz[i][j]);
                }
            }
            System.out.println();
        }
    }

    static String obtenerIniciales(String nombreCompleto) {
        StringBuilder iniciales = new StringBuilder();
        String[] palabras = nombreCompleto.split(" ");

        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {
                iniciales.append(palabra.charAt(0));
            }
        }

        return iniciales.toString();
    }
}
