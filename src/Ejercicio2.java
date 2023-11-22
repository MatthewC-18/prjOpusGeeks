/**
*Copyright (C) 2K23, grupo2
*(grupo2 - Opus Geeks), matthewcedeno92@gmail.com
*Version 1.0.
*AUTOR: Matthew Cedeno.
*FECHA: 22/11/2023.
*/

public class Ejercicio2 {
    public void  Ejercicio2For (int nPosiciones){
        /*
         * Declarar los datos 
         */
        int n = 10;
        /*
         * Inicializar los datos
         */ 
        for (int i = 1; i <= n; i++) {
            System.out.print((2 * i - 1) + " 0 ");
        }  
    }
    public void  Ejercicio2Do (int nPosiciones){
        /*
         * Declarar los datos 
         */
        int n = 10;
        /*
         * Inicializar los datos
         */ 
        int i = 1;
        int j = 0;
        do {
            System.out.print((2 * i - 1) + " 0 ");
            i++;
        } while (i <= n);
    }
    public void  Ejercicio2While (int nPosiciones){
        /*
         * Declarar los datos 
         */
        int n = 10;
        /*
         * Inicializar los datos
         */ 
        int i = 1;
        int j = 0;
        while (i <= n) {
            System.out.print((2 * i - 1) + " 0 ");
            i++;
        }
    
    
    }
}
