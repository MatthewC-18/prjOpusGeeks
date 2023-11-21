/*Copyrigh  (C) 
 * matthewcedeno92@gmail.com
 * Version 1.0
 */
/*
 * @author
 */
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de términos para la serie Fibonacci (S1): ");
        int n = scanner.nextInt();

        System.out.println("Elija el tipo de bucle:");
        System.out.println("1. for");
        System.out.println("2. do-while");

        int opcion = scanner.nextInt();

        if (opcion == 1) {
            generarSerieConFor(n);
        } else if (opcion == 2) {
            generarSerieConDoWhile(n);
        } else {
            System.out.println("Opción no válida. Por favor, elija 1 o 2.");
        }

        scanner.close();
    }

    private static void generarSerieConFor(int n) {
        System.out.println("S1 (con for):");
        int a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");

            int temp = a;
            a = b;
            b = temp + b;
        }

        System.out.println();
    }

    private static void generarSerieConDoWhile(int n) {
        System.out.println("S1 (con do-while):");
        int a = 0, b = 1;
        int i = 0;

        do {
            System.out.print(a + " ");

            int temp = a;
            a = b;
            b = temp + b;

            i++;
        } while (i < n);

        System.out.println();
    }
}



    
        
