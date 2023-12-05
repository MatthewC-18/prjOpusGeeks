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



    
    /**F17:
            1				1
                0		0
                    1
                0		0
            1				1
            ....
     * 
     */

    
    

    /************************CADENA DE CARACTERES***************************/

    
    /**C05)    Pedir una frase y presentarla inverida con las vocales en mayusculas. 
            Ejemplo, frase: ballena
                    salida: AnEllAb 
    * 
    */
    public void cadena5 (){
        String cadena = new String();
        System.out.println("Ingrese una frase");
        Scanner sc = new Scanner(System.in);
        cadena = sc.nextLine().toLowerCase();
        char[] cadenachars = cadena.toCharArray();
        for (int i=0 ; i<cadenachars.length ; i++){
            if ((cadenachars[i] == 'a') || (cadenachars[i]=='e')|| (cadenachars[i]=='i') || (cadenachars[i]=='o') || (cadenachars[i]=='u')){
                cadenachars[i]= Character.toUpperCase(cadenachars[i]);
            }
        }
        String nuevaCadenaString = String.valueOf(cadenachars);
        StringBuilder reversaCadena = new StringBuilder(nuevaCadenaString);
        reversaCadena.reverse();;
        System.out.println(reversaCadena);
    }

    /**	C06)    Pedir una frase y presentarla inverida con las letras en mayusculas. 
            Ejemplo, frase: ballena
                    salida: aNeLLaB 
    * 
    */
    public void cadena6(){
        String cadena = new String();
        System.out.println("Ingrese una frase:");
        Scanner sc = new Scanner(System.in);
        cadena = sc.nextLine().toLowerCase();
        char[] cadenachars = cadena.toCharArray();
        for (int i=0 ; i<cadenachars.length ; i++){
            if ((cadenachars[i] != 'a') && (cadenachars[i] !='e') && (cadenachars[i] !='i') && (cadenachars[i] !='o') && (cadenachars[i] !='u')){
                cadenachars[i]= Character.toUpperCase(cadenachars[i]);
            }
        }
        String nuevaCadenaString = String.valueOf(cadenachars);
        StringBuilder reversaCadena = new StringBuilder(nuevaCadenaString);
        reversaCadena.reverse();
        System.out.println(reversaCadena);
    }

    /************************LOADINGS***************************/
    /**    L01) Indicador de carga desde 0  a 100% usar los signos \|/-| para simular un movimiento rotacional de carga 0% hasta 100%  
    / 100%
    * 
    */
    public void loading1 (){
        String barraCargandoString[]={"|", "/", "-", "\\"};
        for(int i = 0; i <= 100; i++){
            String c = barraCargandoString[i%4];
            System.out.print("\r Loading "+ c +" "+ i +" %");
            try {Thread.sleep(70);} 
            catch (InterruptedException ie) {}
        }
        System.out.println();
    }


     /**
      *     L02) Pedir un caracter para la simular la carga y la logitud de la barra es de 20 caracteres 
        [###         ] 20%
      * @autor Ismael Freire
      * @version 2.0
      */
    public void loading2(){
        char[] barra;
        barra = new char[20];
        System.out.println("Ingrese un caracter:");
        Scanner sc = new Scanner(System.in);
        char caracter = sc.next().charAt(0);

        for (int longitud=1 ; longitud <= barra.length ; longitud++){
            int porcentaje=(longitud*5);
            System.out.print("[");
            for(int i=0 ; i<barra.length ; i++){
                if (i < longitud) {
                    System.out.print(caracter);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("] " + porcentaje + "%\r");
            try {Thread.sleep(70);} catch (InterruptedException ie){}
        }
    }

    /**
    *   L07) Crear una barra es de 20 caracteres, la barra avanza cambiando la punta con movimiento rotacional signos \|/-|
        [====/           ] 20%
        * @autor Ismael Freire
        version 2.0
        
    */
    public void loading7(){
        char[] barra;
        barra = new char[20];
        //System.out.println("Ingrese un caracter:");
        //Scanner sc = new Scanner(System.in);
        //char caracter = sc.next().charAt(0);
        char caracter = '=';

        for (int longitud=1 ; longitud <= barra.length ; longitud++){
            int porcentaje=(longitud*5);
            System.out.print("[");
            for(int i=0 ; i<barra.length ; i++){
                if (i < longitud) {
                    barra[i]=caracter;
                    System.out.print(barra[i]);
                    barra[i+1]=puntaRotacional();
                    System.out.print(barra[i+1]);
                }else{                   
                    System.out.print(" ");
                }
            }
            System.out.print("] " + porcentaje + "%\r");
            try {Thread.sleep(200);} catch (InterruptedException ie){}
        }
    }    
    private static char puntaRotacional() {
        String barraCargandoString[]={"|", "/", "-", "\\"};
        for(int i = 0; i <= 100; i++){
            String c = barraCargandoString[i%4];
            System.out.print("\r"+ c);
            try {Thread.sleep(100);} 
            catch (InterruptedException ie) {}
        }
        System.out.println();
        return puntaRotacional();
    }


    /************************RECURSIVIDAD***************************/
    /**
     * R02) crear un metodo recursivo para obtener la suma(a,b)
     */
    public int sumaRecursiva(int a, int b){
        if(a==0){
            return b;
        }else if (b==0){
            return a;
        }else{
            return 1+sumaRecursiva(a, b-1);
        }
        
    }

    /**
     * R03) crear un metodo recursivo para obtener la multiplicacion(a,b)  
     */
    public int multiplicacionRecursiva(int a, int b){
        if (a==0 || b==0) {
            return 0;
        } else{
            return a+multiplicacionRecursiva(a, b-1);
        }
    }
}


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


    
