/**
 * Copyright (C) 2K23, grupo2
 * (grupo2 - Opus Geeks), brandon.freire@epn.edu.ec
 * 
 * @version 1.0.
 * @author Ismael Freire
 *         FECHA: 21/11/2023.
 */

public class Ejercicio11 {
      /**
       * Este fragmento de codigo utiliza un bluce for
       */
      public void Ejercicio11For(int nPosiciones) {
            int a=4;
            int contador1 = 2;
            for (int i = 1; i<=nPosiciones; i++ ) {
                  System.out.print(contador1);
                  System.out.print(" ");
                  contador1+=a;
                  a+=2;
            }
      }
      /**
       * Este fragmento de codigo utiliza bucle "do while"
       */
      public void Ejercicio11Do(int nPosiciones){
            int j=1;
            int contador2 = 2;
            int b=4;
            do{
                  System.out.print(contador2);
                  System.out.print(" ");
                  contador2 += b;
                  b +=2;
                  j++;
            }while(j<nPosiciones);
      }
      /**
       * Este fragmento de codigo utiliza bucle "while"
       */
      public void Ejercicio11While(int nPosiciones){
            int k=1;
            int contador3=2;
            int c=4;
            while (k<nPosiciones) {
                  System.out.print(contador3);
                  System.out.print(" ");
                  contador3 +=c;
                  c+=2;
                  k++;
            }
      }

}
