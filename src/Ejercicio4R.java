/**
*Copyright (C) 2K23, grupo2
*(grupo2 - Opus Geeks), matthewcedeno92@gmail.com
*FECHA: 01/12/2023.

*/
/**
 *@Version 1.0.
*@author: Matthew Cedeno.
 */
public class Ejercicio4R{
    public static void main(String[] args) {
        int base = 2;  // Puedes cambiar este valor según tu necesidad
        int exponente = 5;  // Puedes cambiar este valor según tu necesidad

        long resultado = potencia(base, exponente);
        System.out.println(base + " elevado a la " + exponente + " es: " + resultado);
    }

    // Método recursivo para calcular la potencia
    private static long potencia(int base, int exponente) {
        // Caso base: cualquier número elevado a 0 es 1
        if (exponente == 0) {
            return 1;
        } else {
            // Llamada recursiva para calcular base^exponente-1
            return base * potencia(base, exponente - 1);
        }
    }
}