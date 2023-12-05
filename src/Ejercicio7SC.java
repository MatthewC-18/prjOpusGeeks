public class Ejercicio7SC {
    /** S7:  aa   bbbb  cccccc  dddddddd    ...
    *Copyright (C) 2K23, grupo2
    *(grupo2 - Opus Geeks), brandon.freire@epn.edu.ec
    * @autor Ismael Freire
    * @version 1.0
    */    
    public static void serie7Char(int posiciones){

        int contadorElementos=0;
        char letra = 'a';
        for(int i=2 ; contadorElementos<posiciones ; i+=2){
            //System.out.print(i);
            for(int j=0 ; j<i ; j++){
                System.out.print(letra);
            }
            System.out.print(" ");
            letra++;
            contadorElementos++;
        }
        System.out.println();
    }
}
