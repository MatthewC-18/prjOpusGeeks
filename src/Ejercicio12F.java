public class Ejercicio12F {
    /**F12:
        ...
        123456789
        12345678
        1234567
        123456
        12345
        1234
        123
        12
        1
     *Copyright (C) 2K23, grupo2
     *(grupo2 - Opus Geeks), brandon.freire@epn.edu.ec
     * @autor Ismael Freire
     * @version 2.0
     * Fecha: 04/12/2023
     */
    public static void  figura12(int posiciones){

        int contador=posiciones;
        for(int i=0 ; i<=posiciones ; i++){
            for(int j=1 ; j<=contador ; j++){
                System.out.print(j);
            }
            System.out.println();
            contador--;
        }
    }    
}
