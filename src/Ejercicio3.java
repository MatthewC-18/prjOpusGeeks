/*
*Copyright (C) 2K23, grupo2
*(grupo2 - Opus Geeks), freddyjimenez2003@gmail.com
*Version 1.0.
*AUTOR: FREDDY JIMENEZ.
*FECHA: 21/11/2023.
*/


/**
*Este codigo utiliza un bucle llamado "for" para imprimir una serie de fracciones en formato "numerador/denominador".
*/
public class Ejercicio3 {                                                    
    public void Ejercicio3For (int nPosiciones){
        int numerador1   = 0;
        int numerador2   = 1;
        int denominador1 = 1;
        int salto = 2;
/**
*Este bucle se ejecutara "nPosiciones" veces.
*/
        for(int i = 0; i < nPosiciones; i++){
/**
*Imprime el numerador1 seguido de "/".
*Imprime el denominador1 seguido de un espacio.
*/
            System.out.print(numerador1+ "/");
            System.out.print(denominador1+ " ");
/**
*Calcula la suma de los dos numeradores y almacena el resultado en signumerador.
*Actualiza numerador1 con el valor actual de numerador2.
*Actualiza numerador2 con el nuevo valor calculado.
*Aumenta el denominador1 sumándole el valor de salto.
*/
            int signumerador = numerador1 + numerador2;
            numerador1 = numerador2;
            numerador2 = signumerador;
            denominador1 += salto;
        }
    }
    public void Ejercicio3Do (int nPosiciones){
        int numerador1 = 0;
        int numerador2 = 1;
        int denominador1 = 1;
        int salto = 2;
        int i = 0;
        do{
            System.out.print(numerador1+ "/");
            System.out.print(denominador1+ " ");
            int signumerador = numerador1 + numerador2;
            numerador1 = numerador2;
            numerador2 = signumerador;
            denominador1 += salto;
            i++;
            } while (i < nPosiciones);
        }
    public void Ejercicio3While (int nPosiciones){
        int numerador1 = 0;
        int numerador2 = 1;
        int denominador1 = 1;
        int salto = 2;
        int i = 0;
        while (i < nPosiciones ) {
            System.out.print(numerador1+ "/");
            System.out.print(denominador1+ " ");
            int signumerador = numerador1 + numerador2;
            numerador1 = numerador2;
            denominador1 += salto;
            i++;
        }   
    }
}
