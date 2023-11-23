/** 
*Copyright (C)
* (grupo 2 - OpusGeeks )alegria.farinango@epn.edu.ec 
* Isabel Farinango 
  */

public class Ejercicio10 {
  
 public static void main(String[] args) {
  serieS10(); 
 }

 //Funcion que imprime la serie S10
 public static void serieS10() {
   System.out.println("S10: ");
   int resultado = 3; 
   int exponente = 1; 
     //Bucle while
     while (exponente<=7) {
       System.out.println(resultado + ",");
       resultado *= 3;
       exponente++;
     }
     System.out.println();
   } 
 }


