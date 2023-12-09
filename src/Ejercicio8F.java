public class Ejercicio8F {

    public static void imprimirPatronAumentando(int numerLineasFJ) {
        String barra = "_ _ _|";

        for (int i = 0; i < numerLineasFJ; i++) {
            // Imprimir espacios en blanco
            for (int j = 0; j < 5 * (numerLineasFJ - i - 1); j++) {
                System.out.print(" ");
            }

            // Imprimir la barra
            System.out.print(barra);

            System.out.println(); // Nueva línea para la siguiente fila
        }
    }
}