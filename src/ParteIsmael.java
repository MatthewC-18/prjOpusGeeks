/**
 * @autor Ismael Freire
 * @version 2.0
 * @date 03/12/2023
 */
import java.util.Scanner;

/*public class ParteIsmael {
    public static void main(String[] args) {
        int numFilas = 5; // Puedes ajustar este valor según tus necesidades
        int longitudLinea = 2 * numFilas - 1;

        for (int fila = 0; fila < numFilas; fila++) {
            // Imprimir espacios en blanco
            for (int espacioBlanco = 0; espacioBlanco < fila; espacioBlanco++) {
                System.out.print("        "); // Ajusta el número de espacios según tu necesidad
            }

            // Imprimir el carácter "|"
            System.out.print("|");

            // Imprimir caracteres "_"
            for (int i = 0; i < longitudLinea - 2 * fila; i++) {
                System.out.print(" _");
            }

            System.out.println(); // Nueva línea para la siguiente fila
        }
    }
}*/

public class ParteIsmael {
    public static void main(String[] args) {
        System.out.println("Ingrese el numero de posiciones: ");
        Scanner sc = new Scanner(System.in);
        int nPosiciones = sc.nextInt();
        figura11(nPosiciones);
    }
    /**F11:
            | _ 
               | _ _
                    | _ _ _
                           | _ _ _ _
                                    | _ _ _ _ _
    */
    public static void figura11(int numFilas){
        String vacio="  ";
        for(int i=0 ; i<numFilas ; i++){
            System.out.print("|");
            for(int j=0 ; j<=i ; j++){
                System.out.print("_");
            }
            System.out.println();
            System.out.print(vacio);
            vacio+=" ";
        }
    } 
}
    


    /*public static void figura11(int numFilas){
        int espacios = numFilas;
        for(int filas=0 ; filas<numFilas ; filas++){
            for(int espacioBlanco=0 ; espacioBlanco< espacios  ; espacioBlanco++){
                System.out.print(" ");
            }
            
            System.out.print("|");
            int variable=1;

            for(int i=0 ; i<=filas ; i++ ){
                String serieChar = "_".repeat(variable);
                System.out.print(serieChar + " ");          
            }
            System.out.println();
            espacios--;
            variable++;
        }

    }*/

/*4*filas2*filas*/
