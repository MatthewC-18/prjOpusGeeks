/**
*Copyright (C) 2K23, grupo2
*(grupo2 - Opus Geeks), freddyjimenez2003@gmail.com
*Version 1.0.
*AUTOR: FREDDY JIMENEZ.
*FECHA: 21/11/2023.
*/


/**
*Este codigo utiliza un bucle llamado "for" para imprimir una serie de fracciones en formato "numerador/denominador"
*/
public class Ejercicio4 {
    public void Ejercicio4For (int nPosiciones){
        int numerador1   = 0;
        int numerador2   = 1;
        int denominador1 = 2;
        int salto = 2;
/**
*Este bucle se ejecutará "nPosiciones" veces.
*/
        for(int i = 0; i < nPosiciones; i++){
/**
*Imprime el "numerador1" seguido de "/"
*Imprime el "denominador1" seguido de un espacio.
*/
            System.out.print(numerador1+ "/");
            System.out.print(denominador1+ " ");
/**
*Calcula la suma de los dos numeradores y almacena el resultado en "signumerador"
*Actualiza "numerador1" con el valor actual de "numerador2"
*Actualiza "numerador2" con el nuevo valor calculado
*Aumenta el "denominador1" sumándole el valor de "salto"
*/
            int signumerador = numerador1 + numerador2;
            numerador1 = numerador2;
            numerador2 = signumerador;
            denominador1 += salto;
        }
    }
/**
*Este codigo utiliza un bucle llamado "do" para imprimir una serie de fracciones en formato "numerador/denominador"
*/
    public void Ejercicio4Do (int nPosiciones){
        int numerador1 = 0;
        int numerador2 = 1;
        int denominador1 = 2;
        int salto = 2;
        int i = 0;
/**
*Este bucle ejecutará el bloque de código al menos una vez y seguirá haciéndolo mientras la condición "i < nPosiciones" sea verdadera.
*/
        do{
/**
*Imprime el "numerador1" seguido de "/"
*Imprime el "denominador1" seguido de un espacio.
*/
            System.out.print(numerador1+ "/");
            System.out.print(denominador1+ " ");
/**
*Calcula la suma de los dos numeradores y almacena el resultado en "signumerador"
*Actualiza "numerador1" con el valor actual de "numerador2"
*Actualiza "numerador2" con el nuevo valor calculado
*Aumenta el "denominador1" sumándole el valor de "salto"
* Incrementa la variable de control "i"
*/
            int signumerador = numerador1 + numerador2;
            numerador1 = numerador2;
            numerador2 = signumerador;
            denominador1 += salto;
            i++;
            } while (i < nPosiciones);
        }
/**
*Este codigo utiliza un bucle llamado "while" para imprimir una serie de fracciones en formato "numerador/denominador"
*/
    public void Ejercicio4While (int nPosiciones){
        int numerador1 = 0;
        int numerador2 = 1;
        int denominador1 = 2;
        int salto = 2;
        int i = 0;
/**
*Este bucle se ejecutará mientras la condición "i < nPosiciones" sea verdadera.
*/
        while (i < nPosiciones ) {
/**
*Imprime el "numerador1" seguido de "/"
*Imprime el "denominador1" seguido de un espacio
*/
            System.out.print(numerador1+ "/");
            System.out.print(denominador1+ " ");
/**
*Calcula la suma de los dos numeradores y almacena el resultado en "signumerador"
*Actualiza "numerador1" con el valor actual de "numerador2"
*Aumenta el "denominador1" sumándole el valor de "salto"
*Incrementa la variable de control "i"
*/
            int signumerador = numerador1 + numerador2;
            numerador1 = numerador2;
            denominador1 += salto;
            i++;
        }   
    }
}

