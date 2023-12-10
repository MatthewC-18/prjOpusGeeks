public class Ejercicio2R {
    /**
     * Copyright (C) 2K23, grupo2
     * (grupo2 - Opus Geeks), brandon.freire@epn.edu.ec
     * R02) crear un metodo recursivo para obtener la suma(a,b)
     * @autor Ismael Freire
     * @version 2.0
     * @date 07/12/2023
     */
    public static int sumaRecursiva(int a, int b){
        //un condicional para comprobar si el primer valor es cero
        if(a==0){
            return b;
            //un segundo condicional anidado para comprobar si el segundo valor es cero
        }else if (b==0){
            return a;
        }else{
            //finalmente el caso contrario retornara la funcion suma hasta obtener la suma de los dos numeros
            return 1+sumaRecursiva(a, b-1);
        }
        
    } 
}
