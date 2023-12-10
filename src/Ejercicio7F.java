/**
*Copyright (C) 2K23, grupo2
*(grupo2 - Opus Geeks), freddyjimenez2003@gmail.com
*@Version 1.0.
*@author: Freddy Jimenez.
*FECHA: 11/12/2023.
*/
public class Ejercicio7F {

    public static void imprimirPatronColumnas(int numeroColumnasFJ) {
        String barra = "|_ _ _";

        for (int i = 0; i < numeroColumnasFJ; i++) {
            // Imprimir espacios en blanco
            for (int j = 0; j < i; j++) {
                System.out.print("     ");
            }

            // Imprimir la barra
            System.out.print(barra);

            System.out.println(); // Nueva línea para la siguiente fila
        }
    }
}
