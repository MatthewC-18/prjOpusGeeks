/**
*Copyright (C) 2K23, grupo2
*(grupo2 - Opus Geeks), freddyjimenez2003@gmail.com
*@Version 1.0.
*@author: Freddy Jimenez.
*FECHA: 11/12/2023.
*/
public class Ejercicio16F {
    public void F16(int cantidad) {
        System.out.println();
        for (int i = 0; i < cantidad; i++) {
            System.out.print("\t\t");
            for (int j = 0; j < cantidad; j++) {
                if (j == i || j == cantidad - i - 1) {
                    if (i % 2 == 0) {
                        System.out.print(" +");
                    } else {
                        System.out.print(" -");
                    }
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
