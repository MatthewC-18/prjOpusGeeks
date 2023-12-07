
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

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
            System.out.println("********************************");
            System.out.println("EJERCICIOS POLIRETOS");
            System.out.println("SERIE caracteres");
            // EJERCICIO 1
            System.out.println("\nSerie 1 de Caracteres:");
            Ejercicio1SC.serie1Char(nPosiciones);
            // EJERCICIO 2
            System.out.println("\nSerie 2 de Caracteres:");
            Ejercicio2SC.serei2Char(nPosiciones);
            // EJERCICIO 3
            Ejercicio3SC oEjercicio3SC = new Ejercicio3SC();
            System.out.println("\nSerie 3 de Caracter:");
            oEjercicio3SC.ejercicio3SCFOR(nPosiciones);
            // EJERCICIO 4
            Ejercicio4SC oEjercicio4SC = new Ejercicio4SC();
            System.out.println("\nSerie 4 de Caracter:");
            oEjercicio4SC.ejercicio4SCFOR(nPosiciones);
            // EJERCICIO 5
            Ejercicio5SC oEjercicio5SC = new Ejercicio5SC();
            System.out.println("\nSerie 5 de Caracteres:");
            oEjercicio5SC.ejercicio5SCFOR(nPosiciones);
            // EJERCICIO 6
            System.out.println("\nSerie 6 de Caracter:");
            //Ejercicio6SC oEjercicio6SC = new Ejercicio6SC();
            //oEjercicio6SC.Ejercicio6SCFOR(nPosiciones);
            // EJERCICIO 7
            System.out.println("\nSerie 7 de Caracteres:");
            Ejercicio7SC.serie7Char(nPosiciones);           
            // EJERCICIO 8
            Ejercicio8SC oEjercicio8SC = new Ejercicio8SC();
            System.out.println("\nSerie 8 de Caracter:");
            oEjercicio8SC.ejercicio8SCFOR(nPosiciones);
            //FiguraMT oFiguraMT = new FiguraMT();
            System.out.println("\nFiguras:");
            //oFiguraMT.FiguraMT(nPosiciones);
            System.out.println();
            // EJERCICIO 9
            
            //---------------------------------------- FIGURAS --------------------------------------------------------
            System.out.println();
            System.out.println("FIGURAS");            
            //EJERCICIO 9
            System.out.println("\nFigura 9");
            Ejercicio9F.figura9(nPosiciones);
            //FIGURA 10
            System.out.println("\nFigura 10");
            Ejercicio10F.figura10(nPosiciones);
            //FIGURA 11 (PROBLEMA)
            //FIGURA 12
            System.out.println("\nFigura 12");
            Ejercicio10F.figura10(nPosiciones);
            //FIGURA 17 (PROBLEMA)
            //FIGURA 18
            System.out.println("\nFigura 18");
            Ejercicio18F.figura18(nPosiciones);
            
            //---------------------------------------- CADENA DE CARACTERES ----------------------------------------------------------
            System.out.println();
            System.out.println("CADENA de caracteres");
            //EJERCICIO 4
            System.out.println("\nCadena 4");
            Ejercicio4CC.cadena4();
            //EJERCICIO 5
            System.out.println("\nCadena 5");
            Ejercicio5CC.cadena5();
            //EJERCICIO 6
            System.out.println("\nCadena 6");
            Ejercicio6CC.cadena6();
            
            
            //---------------------------------------- ARRAYS ----------------------------------------------------------
            //---------------------------------------- LOAGINGS --------------------------------------------------------
            System.out.println();
            System.out.println("Loadings");            
            //EJERCICIO 1
            System.out.println("\nLoading 1:");
            Ejercicio1L.loading1();
            //EJERCICIO 2
            System.out.println("\nLoading 2");
            Ejercicio2L.loading2();
            System.out.println();
            //EJERCICIO 7
            System.out.println("\nLoading 7");
            Ejercicio7L.loading7();
            //---------------------------------------- LOAGINGS --------------------------------------------------------
            System.out.println();
            System.out.println("RECURSIVIDAD");
            //SUMA RECURSIVA
            System.out.println("\nSuma recursiva");
            int resultado1 = Ejercicio2R.sumaRecursiva(9, 3);
            System.out.println(resultado1);
            //MULTIPLICACION RECURSIVA
            System.out.println("\nMultiplicacion recursiva");
            int resultado2 = Ejercicio3R.multiplicacionRecursiva(3, 7);
            System.out.println(resultado2);

        }
        System.out.println();
    }
        
}

//
//Please note that I have only added comments for the exercises where you have provided code. You can add comments for the other exercises in a similar manner..</s>
