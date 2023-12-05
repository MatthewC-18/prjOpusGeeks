public class Ejercicio9F {
    /** 
     * F9:
                            ___   
                        ___|   |___
                    ___|	   	   |___
                ___|		   		   |___
            ___|			   			   |___
     *Copyright (C) 2K23, grupo2
     *(grupo2 - Opus Geeks), brandon.freire@epn.edu.ec
     * @author Ismael Freire
     * @version 2.0
     */
    public static void figura9 (int numFilas){
        //Recorrer filas
        for(int filas=0 ; filas<=numFilas ; filas++){
            //imprimir espacios en blanco
            for(int espacioBlanco=1 ; espacioBlanco<=numFilas-filas ; espacioBlanco++){
                System.out.print("    ");
            }
            // Imprimir el lado izquierdo
            if (filas>=1) {
                System.out.print("___|");
            }
            // Bucle para imprimir espacios en blanco entre los lados
            for (int k = 0; k < 2*filas-1; k++) {
                System.out.print("    ");
            }
            
            if (filas == 0) {
                System.out.println("____");
            }else{
                // Imprimir el lado derecho
                System.out.println("|___");
            }
        }
    }    
}
