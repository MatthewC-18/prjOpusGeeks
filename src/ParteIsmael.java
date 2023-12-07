/**
 * @autor Ismael Freire
 * @version 2.0
 * @date 03/12/2023
 */
import java.util.Scanner;

public class ParteIsmael {

    /************************FIGURAS***************************/


     
    /**F11:
            | _ 
               | _ _
                    | _ _ _
                           | _ _ _ _
                                    | _ _ _ _ _
    * 
    */
    
    public void figura11(int numFilas){
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

            /*
            System.out.println("_");
            */
            //
            /*for (int k = 0 ; k < filas ; k++) {
                //System.out.print(" ");
                System.out.print("_");
            }
            System.out.println();*/
        
            /*if (filas%2==1){
                System.out.println(s);
            }else if(filas%2==0){
                for(int printguion=1; printguion<=numFilas ; printguion++){
                    String serieChar = "-".repeat(printguion);
                    System.out.print(serieChar);
                }
                System.out.print(" ");
                //variable++;
            }*/
        }

    }
}



    
    /**F17:
            1				1
                0		0
                    1
                0		0
            1				1
            ....
     * 
     */

    


    /*public static void main(String[] args) {
        System.out.println("Ingrese el numero de posiciones: ");
        Scanner sc = new Scanner(System.in);
        int nPosiciones = sc.nextInt();
        //serie1Char(nPosiciones);
        //serei2Char(nPosiciones);
        //serie7Char(nPosiciones);
        //----------------
        //Figuras: se debe pedir tamaño/niveles
        //figura9(nPosiciones);
        //figura10(nPosiciones);
        figura11(nPosiciones);
        //figura12(nPosiciones);
        //figura18(nPosiciones);
        //cadena4();
        //cadena5();
        //cadena6();
        //loading1();
        //loading2();
        //loading3();
        //int resultado = sumaRecurisva(0,120);
        //System.out.println(resultado);

        //int resultado = multiplicacionRecursiva(9, 23);
        //System.out.println(resultado);
        */  


    
