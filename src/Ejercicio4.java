public class Ejercicio4 {
    public void Ejercicio4For (int nPosiciones){
        int numerador1   = 0;
        int numerador2   = 1;
        int denominador1 = 2;
        int salto = 2;
        for(int i = 0; i < nPosiciones; i++){
            System.out.print(numerador1+ "/");
            System.out.print(denominador1+ " ");
            int signumerador = numerador1 + numerador2;
            numerador1 = numerador2;
            numerador2 = signumerador;
            denominador1 += salto;
        }
    }
    public void Ejercicio4Do (int nPosiciones){
        int numerador1 = 0;
        int numerador2 = 1;
        int denominador1 = 2;
        int salto = 2;
        int i = 0;
        do{
            System.out.print(numerador1+ "/");
            System.out.print(denominador1+ " ");
            int signumerador = numerador1 + numerador2;
            numerador1 = numerador2;
            numerador2 = signumerador;
            denominador1 += salto;
            i++;
            } while (i < nPosiciones);
        }
    public void Ejercicio4While (int nPosiciones){
        int numerador1 = 0;
        int numerador2 = 1;
        int denominador1 = 2;
        int salto = 2;
        int i = 0;
        while (i < nPosiciones ) {
            System.out.print(numerador1+ "/");
            System.out.print(denominador1+ " ");
            int signumerador = numerador1 + numerador2;
            numerador1 = numerador2;
            denominador1 += salto;
            i++;
        }   
    }
}

