
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ParteIsmael objParteIF = new ParteIsmael();
        System.out.println("*********************************");
        System.out.println("*                               *");
        System.out.println("*  GRUPO NUMERO 2 - Opus Geeks  *");
        System.out.println("*                               *");
        System.out.println("*********************************");
        System.out.println("   Integrantes: "+"\n - Matthew Cedeño"+"\n - Ismael Freire"+"\n - Freddy Jimenez");
        System.out.println("\n*********************************");
        System.out.println("INGRESE UN NUMERO: ");
        try (Scanner entrada = new Scanner(System.in)) {
            int nPosiciones = Integer.parseInt(entrada.nextLine());

            //Ejercicio 1
            Ejercicio1 oEjercicio1 =new Ejercicio1();
            System.out.println("\n Serie 1 con for:  ");
            oEjercicio1.Ejercicio1For(nPosiciones);
            System.out.println("\n Serie 1 con do:  ");
            oEjercicio1.Ejercicio1Do(nPosiciones);
            System.out.println("\n Serie 1 con while:  ");
            oEjercicio1.Ejercicio1While(nPosiciones);
            System.out.println();
            
            //Ejercicio 2
            Ejercicio2 oEjercicio2 = new Ejercicio2();
            System.out.println("\n Serie 2 con for:  ");
            oEjercicio2.Ejercicio2For(nPosiciones);
            System.out.println("\n Serie 2 con do:  ");
            oEjercicio2.Ejercicio2Do(nPosiciones);
            System.out.println("\n Serie 2 con while:  ");
            oEjercicio2.Ejercicio2While(nPosiciones);
            System.out.println();

            // Ejercicio 3
            Ejercicio3 oEjercicio3 = new Ejercicio3();
            System.out.println("\nSerie 3 con for: ");
            oEjercicio3.Ejercicio3For(nPosiciones);
            System.out.println("\nSerie 3 con do: ");
            oEjercicio3.Ejercicio3Do(nPosiciones);
            System.out.println("\nSerie 3 con while: ");
            oEjercicio3.Ejercicio3While(nPosiciones);
            System.out.println();

            // Ejercicio 4
            Ejercicio4 oEjercicio4 = new Ejercicio4();
            System.out.println("\nSerie 4 con for: ");
            oEjercicio4.Ejercicio4For(nPosiciones);
            System.out.println("\nSerie 4 con do: ");
            oEjercicio4.Ejercicio4Do(nPosiciones);
            System.out.println("\nSerie 4 con while: ");
            oEjercicio4.Ejercicio4While(nPosiciones);
            System.out.println();

            // Ejercicio 5
            Ejercicio5 oEjercicio5 = new Ejercicio5();
            System.out.println("\nSerie 5 con for: ");
            oEjercicio5.Ejercicio5For(nPosiciones);
            System.out.println("\nSerie 5 con do: ");
            oEjercicio5.Ejercicio5Do(nPosiciones);
            System.out.println("\nSerie 5 con while: ");
            oEjercicio5.Ejercicio5While(nPosiciones);
            System.out.println();

            // Ejercicio 6
            Ejercicio6 oEjercicio6 = new Ejercicio6();
            System.out.println("\nSerie 6 con for: ");
            oEjercicio6.Ejercicio6For(nPosiciones);
            System.out.println("\nSerie 6 con do: ");
            oEjercicio6.Ejercicio6Do(nPosiciones);
            System.out.println("\nSerie 6 con while: ");
            oEjercicio6.Ejercicio6While(nPosiciones);
            System.out.println();

            // Ejercicio 7
            Ejercicio7 oEjercicio7 = new Ejercicio7();
            System.out.println("\nSerie 7 con for: ");
            oEjercicio7.Ejercicio7For(nPosiciones);
            System.out.println("\nSerie 7 con do: ");
            oEjercicio7.Ejercicio7Do(nPosiciones);
            System.out.println("\nSerie 7 con while: ");
            oEjercicio7.Ejercicio7While(nPosiciones);
            System.out.println();

            // Ejercicio 8
            Ejercicio8 oEjercicio8 = new Ejercicio8();
            System.out.println("\nSerie 8 con for: ");
            oEjercicio8.Ejercicio8For(nPosiciones);
            System.out.println("\nSerie 8 con do: ");
            oEjercicio8.Ejercicio8Do(nPosiciones);
            System.out.println("\nSerie 8 con while: ");
            oEjercicio8.Ejercicio8While(nPosiciones);
            System.out.println();
            System.out.println("\nSerie 9 con for:"); 
            Ejercicio9.Ejercicio9For(nPosiciones); 
            System.out.println("\nSerie 9 con do: ");
            Ejercicio9.Ejercicio9While(nPosiciones);
            System.out.println("\nSerie 9 con while: ");
            Ejercicio9.Ejercicio9DoWhile(nPosiciones);
            System.out.println();

            // Ejercicio 10
            Ejercicio10 oEjercicio10 = new Ejercicio10(); 
            System.out.println("\nSerie 10 con for:"); 
            oEjercicio10.Ejercicio10For(nPosiciones); 
            System.out.println("\nSerie 10 con do: ");
            oEjercicio10.Ejercicio10While(nPosiciones);
            System.out.println("\nSerie 10 con while: ");
            oEjercicio10.Ejercicio10DoWhile(nPosiciones);
            System.out.println();

            // Ejercicio 12
            Ejercicio12 oEjercicio11 = new Ejercicio12();
            System.out.println("\nSerie 12 con for: ");
            oEjercicio11.Ejercicio12For(nPosiciones);
            System.out.println("\nSerie 12 con do: ");
            oEjercicio11.Ejercicio12Do(nPosiciones);
            System.out.println("\nSerie 12 con while: ");
            oEjercicio11.Ejercicio12While(nPosiciones);
            System.out.println();

            //---------------------------------- SERIES DE CARACTERES --------------------------------------------------

            System.out.println("EJERCICIOS POLIRETOS");
            // EJERCICIO 1
            System.out.println("\nSerie 1 de Caracteres:");
            objParteIF.serie1Char(nPosiciones);
            // EJERCICIO 2
            System.out.println("\nSerie 2 de Caracteres:");
            objParteIF.serei2Char(nPosiciones);
            // EJERCICIO 3

            // EJERCICIO 4

            // EJERCICIO 5
            Ejercicio5SC oEjercicio5SC = new Ejercicio5SC();
            System.out.println("\nSerie 5 de Caracteres:");
            oEjercicio5SC.ejercicio5SCFOR(nPosiciones);
            // EJERCICIO 6

            // EJERCICIO 7
            System.out.println("\nSerie 7 de Caracteres:");
            objParteIF.serie7Char(nPosiciones);        
            // EJERCICIO 8

            // EJERCICIO 9
            
            //---------------------------------------- FIGURAS --------------------------------------------------------
            //EJERCICIO 9
            System.out.println("\nFigura 9");
            objParteIF.figura9(nPosiciones);
            //FIGURA 10
            System.out.println("\nFigura 10");
            objParteIF.figura10(nPosiciones);
            //FIGURA 11 (PROBLEMA)
            //FIGURA 12
            System.out.println("\nFigura 12");
            objParteIF.figura12(nPosiciones);
            //FIGURA 17 (PROBLEMA)
            //FIGURA 18
            System.out.println("\nFigura 18");
            objParteIF.figura18(nPosiciones);
            //---------------------------------------- ARRAYS ----------------------------------------------------------
            //---------------------------------------- LOAGINGS --------------------------------------------------------
            //EJERCICIO 1
            System.out.println("\nLoading 1:");
            objParteIF.loading1();
            //EJERCICIO 2
            System.out.println("\nLoading 2");
            objParteIF.loading2();
            //EJERCICIO 7
        
            //---------------------------------------- LOAGINGS --------------------------------------------------------
        }
        System.out.println();
    }
}

//
//Please note that I have only added comments for the exercises where you have provided code. You can add comments for the other exercises in a similar manner..</s>
