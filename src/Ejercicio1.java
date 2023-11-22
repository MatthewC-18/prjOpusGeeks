/*Copyrigh  (C) 
 * matthewcedeno92@gmail.com
 * Matthew Cedeno
 * Version 2.0
 */

public class Ejercicio1{
    public void  Ejercicio1For (int nPosiciones){
        /*
         * Declaracion de variables
         */
        int a = 0, b = 1;
        /*
         * Inicializacion de variables
         */
        for (int i = 1; i <= nPosiciones; i++) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }
    
    }
    public void  Ejercicio1Do (int nPosiciones){
        /*
         * Declaracion de variables
         */
        int j = 0;
        int c = 0, d = 1;
        /*
         * Inicializacion de variables
         */
        do {
            System.out.print(c + " ");
            int temp = c;
            c = d;
            d = temp + d;
            j++;
        } while (j < nPosiciones);
        System.out.println();
    }
    public void  Ejercicio1While (int nPosiciones){
        /*
         * Declaracion de variables
         */
        int a = 0, b = 1;
        /*
         * Inicializacion de variables
         */
        int i = 1;
        while (i <= nPosiciones) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
            i++;
        }
    }


}