/*Copyright (C)
 * chriscriollo2309@gmail.com
 * Christopher Criollo
 * Version 1.0
 */

 /* 
 * Suma progresiva en 3. 
 */
 
public class Ejercicio7 {
    /* 
     * Codigo que presenta una suma progresiva de 3 en 3 utilizando el ciclo "for".
     */
    public void Ejercicio7For (int nPosiciones){
        /* 
         * Inicio de la progresion, final de la progresion y la instruccion de la progresion dentro del "for". 
         */
        for (int a = 1; a <= nPosiciones; a+=3) {
            /* 
             * impresion de la suma progresiva.
             */
            System.out.print(" "+a);
        }
    }
    /* 
     * Utilizacion del ciclo "do while" para representar la suma progresiva de 3 en 3. 
     */
    public void Ejercicio7Do (int nPosiciones){
        /* 
         * Asignacion de la variable y su inicio.
         */
        int a = 1;
        do {
            /* 
             * Impresion de la suma progresiva de 3 en 3.
             */
            System.out.print(" "+a);
            a+=3;
            /* 
             * Condicion y final de la progresion.
             */
        } while (a<=nPosiciones);
    }
    /* 
     * Codigo con el ciclo "While" generando una suma progresiva de 3 en 3.
     */
    public void Ejercicio7While (int nPosiciones){
        /* 
         * Declaracion de la variable y su inicio.
         */
        int a = 1;
        /* 
         * Condicion de hasta donde llega la progresion.
         */
        while (a<=nPosiciones) {
            /* 
             * Instrucciones de la suma progresiva y representacion de la misma.
             */
            System.out.print(" "+a);
            a+=3;
        }
    }
}
