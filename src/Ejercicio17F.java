/**
 * F17:
            1				1
                0		0
                    1
                0		0
            1				1
            ....
 *Copyright (C) 2K23, grupo2
 *(grupo2 - Opus Geeks), brandon.freire@epn.edu.ec
 * @autor Ismael Freire
 * @version 2.0
 * @date 09/12/2023
 */
public class Ejercicio17F {
    public static void figura17(int posiciones){
        for (int i = 0; i < posiciones; i++) {
            System.out.print("          ");
            for (int j = 0; j < posiciones; j++) {
                if (j == i || j == posiciones - i - 1) {
                    if (i % 2 == 0) {
                        System.out.print(" 1");
                    } else {
                        System.out.print(" 0");
                    }
                } else {
                    System.out.print("    ");
                }
            }
            System.out.println();
        }
    }
}
