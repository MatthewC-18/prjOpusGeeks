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

        System.out.print("Ingrese el número de términos para la serie S1: ");
        int n = scanner.nextInt();

        generarSerieS1ConFor(n);

        scanner.close();
    }

    private static void generarSerieS1ConFor(int n) {
        System.out.println("S1:");
        int a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");

            int temp = a;
            a = b;
            b = temp + b;
        }

        System.out.println();
    }
}
