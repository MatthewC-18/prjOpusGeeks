/**
*Copyright (C) 2K23, grupo2
*(grupo2 - Opus Geeks), freddyjimenez2003@gmail.com
*@Version 1.0.
*@author: Freddy Jimenez.
*FECHA: 11/12/2023.
*/
public class Ejercicio6R {
     public void realizarConteo(int n) {
        conteoRegresivo(n);
    }

    private void conteoRegresivo(int n) {
        if (n >= 0) {
            System.out.println("Conteo: " + n);
            conteoRegresivo(n - 1); // Llamada recursiva con n decrementado
        } else {
            System.out.println("¡Conteo regresivo completado!");
        }
    }
}
