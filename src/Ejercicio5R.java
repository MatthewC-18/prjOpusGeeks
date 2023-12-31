/**
*Copyright (C) 2K23, grupo2
*(grupo2 - Opus Geeks), freddyjimenez2003@gmail.com
*@Version 1.0.
*@author: Freddy Jimenez.
*FECHA: 11/12/2023.
*/
public class Ejercicio5R {
    public static void conteoProgresivo(int n) {
        conteoRecursivo(1, n);
    }

    private static void conteoRecursivo(int actual, int n) {
        if (actual <= n) {
            System.out.println("Avance: " + actual);
            pausa(500); // Pausa de medio segundo para visualizar el avance

            conteoRecursivo(actual + 1, n);
        }
    }

    private static void pausa(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
