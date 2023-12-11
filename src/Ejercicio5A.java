/**
*Copyright (C) 2K23, grupo2
*(grupo2 - Opus Geeks), freddyjimenez2003@gmail.com
*@Version 1.0.
*@author: Freddy Jimenez.
*FECHA: 11/12/2023.
*/
import java.util.Random;
class Ejercicio5A {

    public void generarMatrizAleatoria(String nombreCompleto) {
        int tamanoMatriz = nombreCompleto.length();

        char[][] matriz = new char[tamanoMatriz][tamanoMatriz];
        for (int i = 0; i < tamanoMatriz; i++) {
            for (int j = 0; j < tamanoMatriz; j++) {
                matriz[i][j] = ' ';
            }
        }
        Random random = new Random();

        for (int i = 0; i < nombreCompleto.length(); i++) {
            char letra = nombreCompleto.charAt(i);

            int fila, columna;
            do {
                fila = random.nextInt(tamanoMatriz);
                columna = random.nextInt(tamanoMatriz);
            } while (matriz[fila][columna] != ' ');

            matriz[fila][columna] = letra;
        }
        imprimirMatriz(matriz);
    }

    private static void imprimirMatriz(char[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}