import java.util.Scanner;

public class Ejercicio7L {
    /**
     *Copyright (C) 2K23, grupo2
     *(grupo2 - Opus Geeks), brandon.freire@epn.edu.ec
     * @autor 
     * @version 2.0
     * @date 03/12/2023
     * 
     * L07) Crear una barra es de 20 caracteres, la barra avanza cambiando la punta con movimiento rotacional signos \|/-|
        [====/           ] 20%
    */

 
    
        public static void puntaRotacional(int loadingProgress) {
            String barraCargandoString[] = {"|", "/", "-", "\\"};
            String c = barraCargandoString[loadingProgress % 4];
            System.out.print("\r[" + c + "]");
            try {
                Thread.sleep(70);
            } catch (InterruptedException ie) {
            }
        }
    
        public static void loading7() {
            char[] barra = new char[20];
            String caracter = "=";
            for (int longitud = 1; longitud <= barra.length; longitud++) {
                int porcentaje = (longitud * 5);
                System.out.print("[");
                for (int i = 0; i < barra.length; i++) {
                    if (i < longitud - 1) {
                        System.out.print(caracter);
                    } else if (i == longitud - 1) {
                        System.out.println(caracter);
                        puntaRotacional(longitud);
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.print("] " + porcentaje + "%\r");
                try {
                    Thread.sleep(70);
                } catch (InterruptedException ie) {
                }
            }
        }
    
    
    /*public static void puntaRotacional (){
        String barraCargandoString[]={"|", "/", "-", "\\"};
        for(int i = 0; i <= 100; i++){
            String c = barraCargandoString[i%4];
            System.out.print("\r"+ c);
            try {Thread.sleep(70);} 
            catch (InterruptedException ie) {}
        }
        //System.out.println();
    }
    public static void loading7(){
        char[] barra = new char[20];
        String caracter = "=";
        for (int longitud=1 ; longitud <= barra.length ; longitud++){
            int porcentaje=(longitud*5);
            System.out.print("[");
            for(int i=0 ; i<barra.length ; i++){
                if (i < longitud) {
                System.out.print(caracter);              
                puntaRotacional();
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("] " + porcentaje + "%\r");
            try {Thread.sleep(70);} catch (InterruptedException ie){}
        }
    }        */  



    
}
