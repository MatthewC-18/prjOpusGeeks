/**
*Copyright (C) 2K23, grupo2
*(grupo2 - Opus Geeks), matthewcedeno92@gmail.com
*@Version 1.0.
*@author: Matthew Cedeno.
*FECHA: 01/12/2023.

*/
public class Ejercicio4SC {
    

    public  String ejercicio4SCFOR(int nPosiciones) {
        StringBuilder serie = new StringBuilder();
        String[] operadores = {"+", "-", "*", "/"};
        int indiceOperador = 0;

        for (int i = 0; i < nPosiciones; i++) {
            serie.append(operadores[indiceOperador]).append(" ");
            indiceOperador = (indiceOperador + 1) % operadores.length;
        }

        return serie.toString().trim();
    }
}
