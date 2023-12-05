public class Ejercicio10F {
    /**F10:
            _+_
                |_-_
                    |_+_
                        |_-_
                            |_+_
                                |
     *Copyright (C) 2K23, grupo2
     *(grupo2 - Opus Geeks), brandon.freire@epn.edu.ec                            
     * @autor Ismael Freire
     * @version 2.0
     */
    public static void figura10(int numFilas){
        String s = "|_-_";
        String s1 = " _+_";
        for(int filas=0 ; filas<=numFilas ; filas++){
            for(int espacioBlanco=0 ; espacioBlanco<2*filas ; espacioBlanco++){
                System.out.print("  ");
            }
            
            if (filas==0) {
                System.out.println(s1);
            }else if(filas >= 1 && filas<numFilas){
                System.out.println(s);
                if(s=="|_-_"){
                    s="|_+_";
                 }else{
                    s="|_-_";
                }           
            }if(filas==numFilas){
                    System.out.println("|");
                }            
        }
    }
}
