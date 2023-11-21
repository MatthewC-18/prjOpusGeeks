/*Copyrigh  (C) 
 * matthewcedeno92@gmail.com
 * Matthew Cedeno
 * Version 2.0
 */

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de términos para la serie : ");
        int n = scanner.nextInt();
        generarSerieConBucles(n);
        scanner.close();
    }

    private static void generarSerieConBucles(int n) {
        System.out.println(" (for):");
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }
        System.out.println();

        System.out.println("S1 (do-while):");
        int j = 0;
        int c = 0, d = 1;
        do {
            System.out.print(c + " ");
            int temp = c;
            c = d;
            d = temp + d;
            j++;
        } while (j < n);
        System.out.println();

        System.out.println("S1 (While)");
        int i = 0;
        int e = 0, f = 1;

        while (i < n) {
            System.out.print(e + " ");

            int temp = e;
            e = f;
            f = temp + f;

            i++;
        }

        System.out.println();
    }
}
