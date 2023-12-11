public class Ejercicio3A{
    /**    A03)    Dibujar un plano de coordenadas positivo y graficar f(x) = 2x usando como caracteres las letras de su nombre
            Ejemplo:    patmic

            6 |            c
            5 |          i
            4 |        m
            3 |      t
            2 |    a
            1 |  p
            0 |______________________
     * Copyright (C) 2K23, grupo2
     * (grupo2 - Opus Geeks), brandon.freire@epn.edu.ec
     * @autor Ismael Freire
     * @version 2.0
     * @date 10/12/2023
    */
    public static void arrayGrafico(){
        String nombre = "brandon";
        int tamMatriz = nombre.length();
        char[] letras = nombre.toCharArray();
        //imprimir eje y
        for(int i=tamMatriz ; i>=0 ; i--){
            System.out.print(i + "|");
            //imprimir nombre 
            for(int j=0 ; j<tamMatriz ; j++){
                if (i*2==(j+1)*2) {
                    System.out.print(letras[j]+" ");
                }else{
                    System.out.print("  ");
                }
            }                  
            System.out.println();
        } 
        // Imprimir el eje x
        System.out.print("  ");
        for (int i = 2; i <= tamMatriz * 2; i += 2) {
            System.out.print("__");
        }
        System.out.println();               
    }
}