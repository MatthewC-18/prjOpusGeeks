/**
 * Copyright (C) 2K23, grupo 2
 * (grupo2 - Opus Geeks), brandon.freire@epn.edu.ec
 * 
 * @author Ismael Freire
 * @version 1.0
 *          Fecha: 21/11/2023
 */
public class Ejercicio6 {
    /**
     * Este codigo utiliza un bucle "for" para imprimir una serie de numeros
     */
    public void Ejercicio6For(int nPosiciones) {
        int a = 1;
        for (int contador1 = 1; contador1 < nPosiciones + 1; contador1 += a) {
            System.out.print(contador1);
            System.out.print(" ");
            a += 2;
        }
    }

    /**
     * Este codigo utiliza un bucle "do while"
     */
    public void Ejercicio6Do(int nPosiciones) {
        int contador2 = 1;
        int b = 1;
        do {
            System.out.print(contador2);
            System.out.print(" ");
            b += 2;
            contador2 += b;
        } while (contador2 < nPosiciones + 1);
    }

    /**
     * Este codigo utiliza un bucle "while"
     */
    public void Ejercicio6While(int nPosiciones) {
        int contador3 = 1;
        int c = 1;
        while (contador3 < nPosiciones + 1) {
            System.out.print(contador3);
            System.out.print(" ");
            c += 2;
            contador3 += c;
        }
    }
}
