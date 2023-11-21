/**
*Copyright (C) 2K23, grupo2
*(grupo2 - Opus Geeks), brandon.freire@epn.edu.ec
*@version_1.0.
*@author Ismael Freire
*FECHA: 21/11/2023. 
*/

/**
 * La serie presenta los numeros primos
*/

public class Ejercicio5 {
    int primerNum = 2;
    int contador=0;
    /**
     * Se inicializa el constructor para que con el parametro nPosiciones detecte e imprima los numeros primos 
     * @param nPosiciones
     */
    public void Ejercicio5For (int nPosiciones){
        /**
         * El ciclo for recorrera desde el 2 hasta el numero ingresado por consola
         */
        for(int i=primerNum; i < nPosiciones; i++){
            /**
             * Luego el if determinará si es un numero primo y lo imprimirá 
             */
            if (esPrimo(nPosiciones)) {
                System.out.println(i);
            }
        }
    }
    /**
     * 
     * @param numero
     * @return
     */
    public boolean esPrimo(int numero){
        int aux;
        for(int contador=primerNum; contador<numero-1; contador++){
            aux=numero%contador;
            if (aux==0) {
                return false;
            }
        }
        return true;
    }
}
