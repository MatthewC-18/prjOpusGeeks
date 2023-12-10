public class Ejercicio6F {

    public static void imprimirPatronAsteriscos(int numLineasFJ) {
        for (int i = 0; i < numLineasFJ; i++) {
            // Imprimir espacios en blanco
            for (int j = 0; j < (numLineasFJ - i - 1); j++) {
                System.out.print("  ");
            }

            // Imprimir asteriscos
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }

            System.out.println(); // Nueva línea para la siguiente fila
        }
    }
}