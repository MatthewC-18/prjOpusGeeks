public class Ejercicio4A {
    /**
     *     A04)    Crear un matriz donde forme una X con su nombre y apellido

            P                           P
                a                   a
                    t           c
                        r   c
                        h   i
                    a           c
                                    i
                                        o
     * Copyright (C) 2K23, grupo2
     * (grupo2 - Opus Geeks), brandon.freire@epn.edu.ec
     * @autor Ismael Freire
     * @version 1.0
     * @date 10/12/2023
     */
    public static void matrizNombre(){
        String nombre = "Ismael";
        String apellido = "Freire";
        char[] caracteresNombre = nombre.toUpperCase().toCharArray();
        char[] caracteresApellido = apellido.toUpperCase().toCharArray();
        int tamanio = nombre.length();
        //matriz de tamaño nombre
        char[][] matriz = new char[tamanio][tamanio];
        //Inicializar la matriz con espacios en blanco 
        for(int i=0 ; i<tamanio ; i++){
            for(int j=0 ; j<tamanio ; j++){
                matriz[i][i]=' ';
            }
        }
        //Llenar la matriz con el nombre y apellido 
        for(int i=0 ; i<tamanio ; i++){
            matriz[i][i] = caracteresNombre[i];
            matriz[i][tamanio-1-i]=caracteresApellido[i];
        }
        //Imprimir la matriz 
        for(int i=0 ; i<tamanio ; i++){
            for(int j=0 ; j<tamanio ; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }
}
