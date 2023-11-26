/*Copyright (C)
 * chriscriollo2309@gmail.com
 * Christopher Criollo
 * Version 1.0
 */

 /* 
  * Suma progresiva en 5
  */

public class Ejercicio8 {
  /* 
   * El codigo presenta una suma progresiva de 5 en 5 utilizando el ciclor "for".
   */
    public void Ejercicio8For (int nPosiciones){
      int contador2=1;
      /* 
       * declara el inicio de la progresion, la condicion y la suma progresiva.
       */
    for (int a = 3; contador2 <= nPosiciones; a+=5 ) {
      /* 
       *  genera la suma progresiva.
       */
        System.out.print(" "+a);
        contador2++;
      }
    }
    /*
     * El codigo genera un ciclo "do while" que de la suma progresiva de 5 en 5.
     */ 
    public void Ejercicio8Do (int nPosiciones){
      int contador2=1;
      /* 
       * se declara la variable y el inicio de la progresion.
       */
      int a=3;
      do {
        /* 
         * Instruccion con la impresion y la suma.
         */
        System.out.print(" "+a);
        a+=5;
        contador2++;
        /* 
         * Hasta donde puede llegar la progresion.
         */
      } while (contador2<=nPosiciones);    
    }
    /* 
     * Codigo con el ciclo "While" que genera la progresion.
     */
    public void Ejercicio8While (int nPosiciones){
      int contador2=1;
      /* 
       * Inicio de la progresion.
       */
      int a=3;
      /* 
       * Final de la progresion.
       */
      while (contador2<=nPosiciones) {
        /* 
         * Impresion de la progresion junto a la instruccion de la suma progresiva.
         */
        System.out.print(" "+a);
        a+=5;
        contador2++;
      }
    } 
}
