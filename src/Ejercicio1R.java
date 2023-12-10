/**
*Copyright (C) 2K23, grupo2
*(grupo2 - Opus Geeks), matthewcedeno92@gmail.com
*@Version 1.0.
*@author: Matthew Cedeno.
*FECHA: 01/12/2023.

*/
public class Ejercicio1R {
    public static void main(String[] args) {
        int n = 5; // Puedes cambiar este valor según tu necesidad
        long resultado = factorial(n);
        System.out.println("Factorial de " + n + " es: " + resultado);
    }

    // Método recursivo para calcular el factorial
    private static long factorial(int n) {
        // Caso base: factorial de 0 es 1
        if (n == 0) {
            return 1;
        } else {
            // Llamada recursiva para calcular factorial(n-1)
            return n * factorial(n - 1);
        }
    }
}