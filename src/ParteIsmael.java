/**
 * @autor Ismael Freire
 * @version 2.0
 * @date 03/12/2023
 */
import java.util.Scanner;

public class ParteIsmael {

    /************************FIGURAS***************************/


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
    * 
    */
    
    


    public static void figura11(int numFilas){
        //String s = "|";
        int espacios = numFilas;
        for(int filas=0 ; filas<numFilas ; filas++){
            for(int espacioBlanco=0 ; espacioBlanco< espacios /*4*filas2*filas*/ ; espacioBlanco++){
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

    }
}
