public class Ejercicio3R {
    /**
     * Copyright (C) 2K23, grupo2
     * (grupo2 - Opus Geeks), brandon.freire@epn.edu.ec
     * R03) crear un metodo recursivo para obtener la multiplicacion(a,b)
     * @autor Ismael Freire
     * @version 2.0
     * @date 07/12/2023
     * @param a
     * @param b
     * @return
     */
   public static int multiplicacionRecursiva(int a, int b){
       if (a==0 || b==0) {
           return 0;
       } else{
           return a+multiplicacionRecursiva(a, b-1);
       }
   }
}
