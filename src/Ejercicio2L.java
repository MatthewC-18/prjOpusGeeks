import java.util.Scanner;

public class Ejercicio2L {
     /**
      *     L02) Pedir un caracter para la simular la carga y la logitud de la barra es de 20 caracteres 
        [###         ] 20%
     *Copyright (C) 2K23, grupo2
     *(grupo2 - Opus Geeks), brandon.freire@epn.edu.ec
     * @autor Ismael Freire
     * @version 2.0
     * @date 03/12/2023
    */
    public static void loading2(){
        char[] barra;
        barra = new char[20];
        System.out.println("Ingrese un caracter:");
        Scanner sc = new Scanner(System.in);
        char caracter = sc.next().charAt(0);

        for (int longitud=1 ; longitud <= barra.length ; longitud++){
            int porcentaje=(longitud*5);
            System.out.print("[");
            for(int i=0 ; i<barra.length ; i++){
                if (i < longitud) {
                    System.out.print(caracter);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("] " + porcentaje + "%\r");
            try {Thread.sleep(70);} catch (InterruptedException ie){}
        }
    }    
}
