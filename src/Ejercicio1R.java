/**
*Copyright (C) 2K23, grupo2
*(grupo2 - Opus Geeks), matthewcedeno92@gmail.com
*/
/**
 @Version 1.0.
*@author: Matthew Cedeno.
*@Date: 01/12/2023.
 */
public class Ejercicio1R {
    public static void recursion1(String[] args) {
        int n = 5; 
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
