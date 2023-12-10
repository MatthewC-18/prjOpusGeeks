/**
*Copyright (C) 2K23, grupo2
*(grupo2 - Opus Geeks), freddyjimenez2003@gmail.com
*@Version 1.0.
*@author: Freddy Jimenez.
*FECHA: 11/12/2023.
*/
import java.util.Scanner;

public class Ejercicio3C {

     public static String eliminarVocal(String frase, char vocal) {
        String resultado = "";

        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            if (caracter != vocal && caracter != Character.toUpperCase(vocal)) {
                resultado += caracter;
            }
        }

        return resultado;
    }
}
