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
        int contadorElementos1=0;
        for (int contador1=1 ; contadorElementos1<nPosiciones ; contador1 += a) {
            System.out.print(contador1 + " ");
            a += 2;
            contadorElementos1++;
        }
    }
    /**
     * Este codigo utiliza un bucle "do while"
     */
    public void Ejercicio6Do(int nPosiciones) {
        int contador2 = 1;
        int b = 1;
        int contadorElementos2=0;
        do {
            System.out.print(contador2 + " ");
            b += 2;
            contador2 += b;
            contadorElementos2++;
        } while (contadorElementos2 < nPosiciones);
    }

    /**
     * Este codigo utiliza un bucle "while"
     */
    public void Ejercicio6While(int nPosiciones) {
        int contador3 = 1;
        int c = 1;
        int contadorElementos3=0;
        while (contadorElementos3 < nPosiciones) {
            System.out.print(contador3 + " ");
            c += 2;
            contador3 += c;
            contadorElementos3++;
        }
    }
}
