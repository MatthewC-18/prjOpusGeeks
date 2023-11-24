/** 
*Copyright (C)
* (grupo 2 - OpusGeeks )alegria.farinango@epn.edu.ec 
* Isabel Farinango 
  */

public class Ejercicio9 {

  public static void main(String[] args) {
    serieS9For(); 
    serieS9While(); 
    serieS9DoWhile(); 
  }
  /*Funcion imprime S9, ocupando el bucle for */
  public static void serieS9For() {
    System.out.println("serie S9 ocupando for: ");
    int resultado=2; 
    for (int i=1; i<=8; i++) {
      System.out.print(resultado + " ");
      resultado+=2;
    }
    System.out.println();
  }
  /*Funcion imprime S9, ocupando el bucle while */
  public static void serieS9While() {
    System.out.println("serie S9 ocupando while: ");
    int resultado=2; 
    int i=1;
    while (i<=8) {
      System.out.print(resultado + " ");
      resultado+=2;
      i++;
    }
    System.out.println();
  }
  /*Funcion imprime S9, ocupando el bucle do while */
  public static void serieS9DoWhile() {
    System.out.println("serie S9 ocupando do-while: ");
    int resultado=2;
    int i=1;
    do {
      System.out.print(resultado + " ");
      resultado+=2;
      i++;
    } while (i<=8);
    System.out.println();
  }
}


  



