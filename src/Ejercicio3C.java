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