import java.util.Scanner;
/**
*Copyright (C) 2K23, grupo2
*(grupo2 - Opus Geeks), matthewcedeno92@gmail.com

*/
/**
*@Version 1.0.
*@author: Matthew Cedeno.
*@DATE: 01/12/2023.
 */
public class Ejercicio3L{
    public static void loading3() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un carácter: ");
        char caracter = scanner.next().charAt(0);

        System.out.println("Desplazamiento del carácter:");

        int longitudBarra = 20;
        int posicion = 0;

        // Mover el carácter de izquierda a derecha en la barra
        for (int i = 0; i < longitudBarra * 2 - 1; i++) {
            // Construir la cadena de la barra de progreso
            StringBuilder barraProgreso = new StringBuilder("[");
            for (int j = 0; j < longitudBarra; j++) {
                if (j == posicion) {
                    barraProgreso.append(caracter);
                } else {
                    barraProgreso.append(" ");
                }
            }
            barraProgreso.append("] " + (posicion * 5) + "%");

            // Imprimir la barra de progreso
            System.out.print("\r" + barraProgreso);

            // Pausa breve para simular el desplazamiento
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Actualizar la posición del carácter
            if (i < longitudBarra - 1) {
                posicion++;
            } else {
                posicion--;
            }
        }

        // Cambiar de línea al finalizar
        System.out.println();

        // Cerrar el scanner al finalizar
        scanner.close();
    }
}