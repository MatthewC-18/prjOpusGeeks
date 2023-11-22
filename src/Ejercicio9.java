public class Ejercicio9 {

  public static void main(String[] args) {
    serieS9();
    serieS10();
  }

public static void serieS9() {
    System.out.println("S9: ");
    int resultado = 2; 
    for (int i = 1; i <= 8; i++) {
      System.out.println(resultado + ",");
      resultado *= 2; 
  }
  System.out.println(); 
}
public static void serieS10() {
  System.out.println("S10: ");
  int resultado = 3; 
  int exponente = 1; 
    while (exponente<=7) {
      System.out.println(resultado + ",");
      resultado *= 3;
      exponente++;
      
    }
    System.out.println();
  } 

}



