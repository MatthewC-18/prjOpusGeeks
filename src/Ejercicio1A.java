import java.util.Scanner;
/**
*Copyright (C) 2K23, grupo2
*(grupo2 - Opus Geeks), matthewcedeno92@gmail.com
*/
/**
 @Version 1.0.
*@author: Matthew Cedeno.
*@DATE: 01/12/2023.
 */
public class Ejercicio1A {
    public static void ejercicio1A() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            // Ingresa el nombre
            System.out.print("Ingrese el nombre " + (i + 1) + ": ");
            String nombre = scanner.nextLine();

            // Ingresa el porcentaje de carga
            System.out.print("Ingrese el porcentaje de carga para " + nombre + " (0-100): ");
            int porcentaje = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea pendiente después del nextInt

            // Muestra la representación gráfica del porcentaje de carga para el nombre
            mostrarPorcentajeCarga(nombre.split(" "), porcentaje);
        }
    }

    static void mostrarPorcentajeCarga(String[] palabras, int porcentaje) {
        for (int i = 0; i < palabras.length; i++) {
            int longitud = palabras[i].length();
            int carga = (int) (longitud * (porcentaje / 100.0));
            String subcadena = palabras[i].substring(0, carga);
            String barra = "[" + "=".repeat(carga) + ">" + " ".repeat(longitud - carga) + "]";
            System.out.printf("%s %d%% %s%n", barra, porcentaje, subcadena);
        }
    }
}
