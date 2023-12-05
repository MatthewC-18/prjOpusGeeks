//Realizar la siguietne serie con el bucle for do-while y while     S3:  ++	 +++ +++++ +++++++ +++++++++++ +++++++++++++ ...
/**
*Copyright (C) 2K23, grupo2
*(grupo2 - Opus Geeks), matthewcedeno92@gmail.com
*@Version 1.0.
*@author: Matthew Cedeno.
*FECHA: 01/12/2023.

*/

public class Ejercicio3SC {
    
    public  void ejercicio3SCFOR(int nPosiciones) {
        int contadorSignos = 2;

        for (int i = 0; i < nPosiciones; i++) {
            for (int j = 0; j < contadorSignos; j++) {
                System.out.print("+");
            }
            System.out.print(" ");
            contadorSignos += 2;
        }
    }
}
