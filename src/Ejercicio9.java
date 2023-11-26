/** 
*Copyright (C)
* (grupo 2 - OpusGeeks )alegria.farinango@epn.edu.ec 
* Isabel Farinango 
  */

public class Ejercicio9 {

  /*Funcion imprime S9, ocupando el bucle for */
  public void Ejercicio9For(int nPosiciones) {
    System.out.println("serie S9 ocupando for: ");
    int resultado=2; 
    for (int i=1; i<=nPosiciones; i++) {
      System.out.print(resultado + " ");
      resultado+=2;
    }
    System.out.println();
  }

  /*Funcion imprime S9, ocupando el bucle do-while */
  public void Ejercicio9DoWhile(int nPosiciones) {
    System.out.println("serie S9 ocupando do-while: ");
    int resultado=2;
    int i=1;
    do {
      System.out.print(resultado + " ");
      resultado+=2;
      i++;
    } while (i<=nPosiciones);
    System.out.println();
  }
 
  /*Funcion imprime S9, ocupando el bucle while */
  public void Ejercicio9While(int nPosiciones) {
    System.out.println("serie S9 ocupando while: ");
    int resultado=2; 
    int i=1;
    while (i<=nPosiciones) {
      System.out.print(resultado + " ");
      resultado+=2;
      i++;
    }
    System.out.println();
  }
 
}


  



