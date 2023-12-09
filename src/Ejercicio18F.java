public class Ejercicio18F {
     /**F18:
            2
            1   2
            1   3   2
            1   4   5   2
            1   5   9   7  2
            1   6   14  16  9  2
     *Copyright (C) 2K23, grupo2
     *(grupo2 - Opus Geeks), brandon.freire@epn.edu.ec
     * @autor Ismael Freire
     * @version 2.0
     * @date: 04/12/2023
     */
    public static void figura18(int filas){
        int[][] matriz = new int[filas][filas];
        // Llenar la matriz
        for (int i = 0; i < filas; i++) {
            matriz[i][0] = 1;
            matriz[i][i] = 2;

            for (int j = 1; j < i; j++) {
                matriz[i][j] = matriz[i - 1][j - 1] + matriz[i - 1][j];
            }
        }
        // Imprimir la matriz 
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(matriz[i][j] + "   ");
            }
            System.out.println();
        }
    } 
}
