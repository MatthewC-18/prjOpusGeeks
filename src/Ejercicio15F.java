public class Ejercicio15F {

    public static void imprimirTrianguloPascal(int numRowsFJ) {
        for (int i = 0; i < numRowsFJ; i++) {
            int coeficiente = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(coeficiente + "  ");
                coeficiente = coeficiente * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}