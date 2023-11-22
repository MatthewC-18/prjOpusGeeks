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
    int contador=0;
    /**
     * Este codigo utiliza un bucle "for" para imprimir numeros primos 
     * Se inicializa el constructor para que con el parametro nPosiciones detecte e imprima los numeros primos 
     * @param nPosiciones
     */
    public void Ejercicio5For (int nPosiciones){
        /**
         * El ciclo for recorrera desde el 2 hasta el numero ingresado por consola
         */
        for(int i=2; i < nPosiciones; i++){
            /**
             * Luego el if determinará si es un numero primo y lo imprimirá 
             */
            if (esPrimo(i)) {
                System.out.print(i);
                System.out.print(" ");
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
        for(int contador=2; contador<numero; contador++){
            aux=numero%contador;
            if (aux==0) {
                return false;
            }
        }
        return true;
    }

    /**
    * Este codigo utiliza un bucle "do while"
    */

    /*public void Ejercicio5Do (int nPosiciones){
        int contador=0;
        //int numero=2;
        do{
            if(esPrimo(primerNum)){
                //System.out.print();
            }
            contador++;
        }while (contador < nPosiciones);
    }*/

    /*public boolean esPrimo1(int num){
        int aux;
        for(int contador=primerNum; contador<num-1; contador++){
            aux=num%contador;
            if (aux==0) {
                return false;
            }
        }
        return true;
    }*/
}
