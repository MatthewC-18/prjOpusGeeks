import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("GRUPO NUMERO 2 - Opus Geeks");
        System.out.println("INGRESE UN NUMERO: ");
        Scanner entrada = new Scanner(System.in);
        int nPosiciones = Integer.parseInt(entrada.nextLine());
        //Ejercicio 1
        




        //Ejercicio 2
        Ejercicio2 oEjercicio2 = new Ejercicio2();
        System.out.println("\n serie 2 con for:  ");
        oEjercicio2.Ejercicio2For(nPosiciones);
        System.out.println("\n serie 2 con do:  ");
        oEjercicio2.Ejercicio2Do(nPosiciones);
        System.out.println("\n serie 2 con while:  ");
        oEjercicio2.Ejercicio2While(nPosiciones);
        System.out.println();




        //EJERCICIO 3
        Ejercicio3 oEjercicio3 = new Ejercicio3();
        System.out.println("\n serie 3 con for:  ");
        oEjercicio3.Ejercicio3For(nPosiciones);
        System.out.println("\n serie 3 con do:  ");
        oEjercicio3.Ejercicio3Do(nPosiciones);
        System.out.println("\n serie 3 con while:  ");
        oEjercicio3.Ejercicio3While(nPosiciones);
        System.out.println();
        //EJERCICIO 4
        Ejercicio4 oEjercicio4 = new Ejercicio4();
        System.out.println("\n serie 4 con for:  ");
        oEjercicio4.Ejercicio4For(nPosiciones);
        System.out.println("\n serie 4 con do:  ");
        oEjercicio4.Ejercicio4Do(nPosiciones);
        System.out.println("\n serie 4 con while:  ");
        oEjercicio4.Ejercicio4While(nPosiciones);
        System.out.println();
        //EJRCICIO 5
        Ejercicio5 oEjercicio5 = new Ejercicio5();
        System.out.println("\n serie 5 con for:  ");
        oEjercicio5.Ejercicio5For(nPosiciones);
        System.out.println("\n serie 5 con do:  ");
        oEjercicio5.Ejercicio5Do(nPosiciones);
        System.out.println("\n serie 5 con while: ");
        oEjercicio5.Ejercicio5While(nPosiciones);
        //EJERCICIO 6




        //EJERCICIO 7





        //EJERCICIO 8




        //EJERCICIO 9




        //EJERCICIO 10





        //EJERCICIO 11



    }
}
