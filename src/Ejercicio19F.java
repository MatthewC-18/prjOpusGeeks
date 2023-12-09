public class Ejercicio19F {
    public void figura19F(int filas){
        int[][] matriz = new int[filas][filas];
        // Llenar la matriz
        for (int i = 0; i < filas; i++) {
            matriz[i][0] = 1;
            matriz[i][i] = 2;

            for (int j = 1; j < i; j++) {
                matriz[i][j] = matriz[i - 1][j - 1] + matriz[i - 1][j];
            }
        }
        // Imprimir la matriz 
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j <= i; j++) {
                if (matriz[i][j] == 1) {
                    System.out.print("+   ");
                } else if (matriz[i][j] == 2) {
                    System.out.print("*   ");
                } else {
                    System.out.print(matriz[i][j] + "   ");
                }
            }
            System.out.println();
        }
    }
    
//    public static void main(String[] args) {
//        Ejercicio19F ejercicio = new Ejercicio19F();
//        ejercicio.figura19F(5);
//    }
}