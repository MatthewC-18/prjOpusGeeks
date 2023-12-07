import java.util.Scanner;

public class Ejercicio5CC {
    /**C05)    Pedir una frase y presentarla inverida con las vocales en mayusculas. 
            Ejemplo, frase: ballena
                    salida: AnEllAb 
     *Copyright (C) 2K23, grupo2
     *(grupo2 - Opus Geeks), brandon.freire@epn.edu.ec
     * @autor Ismael Freire
     * @version 2.0
     * @date 03/12/2023
    */
    public static void cadena5 (){
        String cadena = new String();
        System.out.println("Ingrese una frase");
        Scanner sc = new Scanner(System.in);
        cadena = sc.nextLine().toLowerCase();
        char[] cadenachars = cadena.toCharArray();
        for (int i=0 ; i<cadenachars.length ; i++){
            if ((cadenachars[i] == 'a') || (cadenachars[i]=='e')|| (cadenachars[i]=='i') || (cadenachars[i]=='o') || (cadenachars[i]=='u')){
                cadenachars[i]= Character.toUpperCase(cadenachars[i]);
            }
        }
        String nuevaCadenaString = String.valueOf(cadenachars);
        StringBuilder reversaCadena = new StringBuilder(nuevaCadenaString);
        reversaCadena.reverse();;
        System.out.println(reversaCadena);
    }
}
