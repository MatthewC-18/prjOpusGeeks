/**
*Copyright (C) 2K23, grupo2
*(grupo2 - Opus Geeks), freddyjimenez2003@gmail.com
*@Version 1.0.
*@author: Freddy Jimenez.
*FECHA: 11/12/2023.
*/
public class Ejercicio15F {

    public static void imprimirTrianguloPascal(int numRowsFJ) {
        for (int i = 0; i < numRowsFJ; i++) {
            int coeficiente = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(coeficiente + "  ");
                coeficiente = coeficiente * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
