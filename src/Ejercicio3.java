public class Ejercicio3 {
    public void Ejercicio3For (int nPosiciones){
        int numerador1   = 0;
        int numerador2   = 1;
        int denominador1 = 1;
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
    public void Ejercicio3Do (int nPosiciones){
        int numerador1 = 0;
        int numerador2 = 1;
        int denominador1 = 1;
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
    public void Ejercicio3While (int nPosiciones){
        int numerador1 = 0;
        int numerador2 = 1;
        int denominador1 = 1;
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
