/**
*Copyright (C) 2K23, grupo2
*(grupo2 - Opus Geeks), brandon.freire@epn.edu.ec
*@version_1.0.
*@author Ismael Freire
*FECHA: 21/11/2023. 
*/

/**
 * La serie presenta los numeros primos
*/

public class Ejercicio5 {
    int primerNum = 2;
    int contador=0;

    public void Ejercicio5For (int nPosiciones){
        for(int i=primerNum; i < nPosiciones; i++){
            if (esPrimo(nPosiciones)) {
                System.out.println(i);
            }
        }
    }
    public boolean esPrimo(int numero){
        int aux;
        for(int contador=primerNum; contador<numero; contador++){
            aux=numero%contador;
            if (aux==0) {
                return false;
            }
        }
        return true;
    }
}
