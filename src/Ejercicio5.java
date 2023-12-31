/**
*Copyright (C) 2K23, grupo2
*(grupo2 - Opus Geeks), brandon.freire@epn.edu.ec
*@version 2.0.
*@author Ismael Freire
*FECHA: 21/11/2023. 
*/
/**
 * La serie presenta los numeros primos
 */
public class Ejercicio5 {
    int contador = 0;
    /**
     * Este codigo utiliza un bucle "for" para imprimir numeros primos
     * Se inicializa el constructor para que con el parametro nPosiciones detecte e
     * imprima los numeros primos
     * 
     * @param nPosiciones
     */
    public void Ejercicio5For(int nPosiciones) {
        /**
         * El ciclo for recorrera desde el 2 hasta el numero ingresado por consola
         */
        int contadorElementos1=0;
        for (int contador1 = 2; contadorElementos1 < nPosiciones; contador1++) {
            /**
             * Luego el if determinará si es un numero primo y lo imprimirá
             */
            if (esPrimo(contador1)) {
                contadorElementos1++;
                System.out.print(contador1 + " ");
            }
        }
    }
    /**
     * 
     * @param numero
     * @return
     */
    public boolean esPrimo(int numero) {
        int aux;
        for (int contador = 2; contador < numero; contador++) {
            aux = numero % contador;
            if (aux == 0) {
                return false;
            }
        }
        return true;
    }
    /**
     * Este codigo utiliza un bucle "do while"
     */
    
    public void Ejercicio5Do(int nPosiciones) {
        int contadorElementos2=0;
        int contador2 = 2;
        do {
            if (esPrimo(contador2)) {
                System.out.print(contador2 + " ");
                contadorElementos2++;
            }
            contador2++;
        } while (contadorElementos2 < nPosiciones);
    }
    /**
     * Este codigo utiliza un bluce "while"
     */
    public void Ejercicio5While(int nPosiciones) {
        int contadorElementos3=0;
        int contador3 = 2;
        while (contadorElementos3 < nPosiciones) {
            if (esPrimo(contador3)) {
                System.out.print(contador3 + " ");
                contadorElementos3++;
            }
            contador3++;
        }
    }
}
