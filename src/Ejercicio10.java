/** 
*Copyright (C)
* (grupo 2 - OpusGeeks )alegria.farinango@epn.edu.ec 
* Isabel Farinango 
  */

public class Ejercicio10 {

/*Funcion imprime S10, ocupando el bucle for */
public void Ejercicio10For(int nPosiciones){
  System.out.println("Serie S10 ocupando for: ");
int resultado=3; 
for(int exponente=1; exponente<=nPosiciones; exponente++){
  System.out.print(resultado + " ");
  resultado *=3;  
  }
  System.out.println();

}
 
/*Funcion imprime S10, ocupando el bucle do-while */
public void Ejercicio10DoWhile(int nPosiciones){
  System.out.println("Serie S10 ocupando do-while: ");
  int resultado=3; 
  int exponente=1;
  do {
    System.out.print(resultado + " ");
    resultado *=3;  
    exponente++;
  }while(exponente<=nPosiciones);
  System.out.println();
  } 
 
/*Funcion imprime S10, ocupando el bucle while */
public void Ejercicio10While(int nPosiciones){
  System.out.println("Serie S10 ocupando while: ");
  int resultado=3; 
  int exponente=1;
  while(exponente<=nPosiciones){
    System.out.print(resultado + " ");
    resultado *=3;  
    exponente++;
  }
  System.out.println();
 }

}

