public class Ejercicio7F {

    public static void imprimirPatronColumnas(int numeroColumnasFJ) {
        String barra = "|_ _ _";

        for (int i = 0; i < numeroColumnasFJ; i++) {
            // Imprimir espacios en blanco
            for (int j = 0; j < i; j++) {
                System.out.print("     ");
            }

            // Imprimir la barra
            System.out.print(barra);

            System.out.println(); // Nueva línea para la siguiente fila
        }
    }
}