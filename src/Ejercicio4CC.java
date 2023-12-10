import java.util.Scanner;

public class Ejercicio4CC {
        /**C04)    Pedir una frase y una letra, eliminar la letra ingresada de la frase. 
            Ejemplo, frase: ballena azul  
                    letra : l
                    salida: ba  ena azu 
     *Copyright (C) 2K23, grupo2
     *(grupo2 - Opus Geeks), brandon.freire@epn.edu.ec
     * @autor Ismael Freire
     * @version 2.0
     * @date 03/12/2023
     */
    public static void cadena4(){
        String cadena = new String();
        String letra = new String();
        System.out.println("Ingrese una frase");
        Scanner sc = new Scanner(System.in);
        cadena = sc.nextLine().toLowerCase();
        System.out.println("Ingrese la letra a eliminar:");
        letra = sc.nextLine().toLowerCase();
        String cadenaRem = cadena.replaceAll(letra, " ");
        System.out.println(cadenaRem);
    }

}
