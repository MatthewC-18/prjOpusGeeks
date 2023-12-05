public class Ejercicio1SC {
    // S1: + - + - + - + ...
    /**
     * @autor Ismael Freire
     * @version 1.0
    */    
    public static void serie1Char(int posiciones) {

        char signo = '+';
        for (int i = 0; i < posiciones; i++) {
            System.out.print(signo + " ");
            if (signo=='+') {
                signo = '-';
            }else{
                signo = '+';
            }
        }   
        System.out.println();
    }

}
