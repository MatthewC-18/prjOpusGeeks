/** 
*Copyright (C)
* (grupo 2 - OpusGeeks )alegria.farinango@epn.edu.ec 
* Isabel Farinango 
  */

public class Ejercicio10 {

  public static void main(String[] args) {
    serieS10For(); 
    serieS10While(); 
    serieS10DoWhile(); 
}

/*Funcion imprime S10, ocupando el bucle for */
public static void serieS10For(){
  System.out.println("Serie S10 ocupando for: ");
int resultado=3; 
for(int exponente=1; exponente<=7; exponente++){
  System.out.print(resultado + " , ");
  resultado *=3;  
  }
  System.out.println();

}

/*Funcion imprime S10, ocupando el bucle while */
public static void serieS10While(){
  System.out.println("Serie S10 ocupando while: ");
  int resultado=3; 
  int exponente=1;
  while(exponente<=7){
    System.out.print(resultado + " , ");
    resultado *=3;  
    exponente++;
  }
  System.out.println();
}
/*Funcion imprime S10, ocupando el bucle do-while */
public static void serieS10DoWhile(){
  System.out.println("Serie S10 ocupando do-while: ");
  int resultado=3; 
  int exponente=1;
  do {
    System.out.print(resultado + " , ");
    resultado *=3;  
    exponente++;
  }while(exponente<=7);
  System.out.println();
  } 

}

