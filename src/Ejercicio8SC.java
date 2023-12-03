/**
*Copyright (C) 2K23, grupo2
*(grupo2 - Opus Geeks), matthewcedeno92@gmail.com
*@Version 1.0.
*@author: Matthew Cedeno.
*FECHA: 01/12/2023.

*/
public class Ejercicio8SC {
    public static void main(String[] args) {

    }

    public static void ejercicio8SCFOR(int nPosiciones) {
        for (int i = 0; i < nPosiciones; i++) {
            char letra = (char) ('a' + i);
            String repetir = repetirCaracter(letra, i + 1);
            System.out.print(repetir + " ");
        }
    }

    public static String repetirCaracter(char caracter, int veces) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < veces; i++) {
            resultado.append(caracter);
        }
        return resultado.toString();
    }
}
