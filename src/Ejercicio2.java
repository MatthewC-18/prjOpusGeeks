/**
*Copyright (C) 2K23, grupo2
*(grupo2 - Opus Geeks), matthewcedeno92@gmail.com
*Version 3.0.
*AUTOR: Matthew Cedeno.
*FECHA: 22/11/2023.
*/

public class Ejercicio2 {
    public void  Ejercicio2For (int nPosiciones){
        /*
         * Declarar los datos 
         */
        /*
         * Inicializar los datos
         */ 
        for (int i = 1; i <= nPosiciones; i++) {
            System.out.print((2 * i - 1) + " 0 ");
        }  
    }
    public void  Ejercicio2Do (int nPosiciones){
        /*
         * Declarar los datos 
         */
        /*
         * Inicializar los datos
         */ 
        int i = 1;
        do {
            System.out.print((2 * i - 1) + " 0 ");
            i++;
        } while (i <= nPosiciones);
    }
    public void  Ejercicio2While (int nPosiciones){
        /*
         * Declarar los datos 
         */
        /*
         * Inicializar los datos
         */ 
        int i = 1;
<<<<<<< HEAD
        while (i <= n) {
=======
        int j = 0;
        while (i <= nPosiciones) {
>>>>>>> 8445de76b93983797f3495173968aa0d553b8324
            System.out.print((2 * i - 1) + " 0 ");
            i++;
        }
    }
}
