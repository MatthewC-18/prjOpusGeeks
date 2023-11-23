/** 
*Copyright (C)
* (grupo 2 - OpusGeeks )alegria.farinango@epn.edu.ec 
* Isabel Farinango 
  */

public class Ejercicio9 {

  public static void main(String[] args) {
    serieS9();
  }
//Funcion que imprime la serie S9
public static void serieS9() {
    System.out.println("S9: ");
    //Inicializa la variable
    int resultado = 2; 
    //Bucle for 
    for (int i = 1; i <= 8; i++) {
      System.out.println(resultado + ",");
      resultado *= 2; 
    }
  System.out.println(); 
  }
}



