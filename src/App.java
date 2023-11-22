
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("GRUPO NUMERO 2 - Opus Geeks");
        System.out.println("INGRESE UN NUMERO: ");
        Scanner entrada = new Scanner(System.in);
        int nPosiciones = Integer.parseInt(entrada.nextLine());

        // Ejercicio 1
        // ...

        // Ejercicio 2
        // ...

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

        // Ejercicio 6
        // ...

        // Ejercicio 7
        // ...

        // Ejercicio 8
        // ...

        // Ejercicio 9
        // ...

        // Ejercicio 10
        // ...

        // Ejercicio 11
        // ...
    }
}

//
//Please note that I have only added comments for the exercises where you have provided code. You can add comments for the other exercises in a similar manner..</s>