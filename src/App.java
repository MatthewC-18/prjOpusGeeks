
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("*********************************");
        System.out.println("*                               *");
        System.out.println("*  GRUPO NUMERO 2 - Opus Geeks  *");
        System.out.println("*                               *");
        System.out.println("*********************************");
        System.out.println("   Integrantes: "+"\n - Matthew Cedeño"+"\n - Ismael Freire"+"\n - Freddy Jimenez");
        System.out.println("\n*********************************");
        System.out.println("INGRESE UN NUMERO: ");
        int nPosiciones = sc.nextInt();
        int opcion;

        do {
            System.out.println("--------------------------MENU DE OPCIONES--------------------------------");
            System.out.println("--------------------------SERIES NUMERICAS--------------------------------");
            System.out.println("1. Ejercicio 1SN");
            System.out.println("2. Ejercicio 2SN");
            System.out.println("3. Ejercicio 3SN");
            System.out.println("4. Ejercicio 4SN");
            System.out.println("5. Ejercicio 5SN");
            System.out.println("6. Ejercicio 6SN");
            System.out.println("7. Ejercicio 7SN");
            System.out.println("8. Ejercicio 8SN");
            System.out.println("9. Ejercicio 9SN");
            System.out.println("10. Ejercicio 10SN");
            System.out.println("11. Ejercicio 11SN");
            
            System.out.println("-----------------------SERIES DE CARACTERES--------------------------------");
            System.out.println("12. Ejercicio 1SC");
            System.out.println("13. Ejercicio 2SC");
            System.out.println("14. ");
            System.out.println("15. ");
            System.out.println("16. ");
            System.out.println("17. Ejercicio 6SC");
            System.out.println("18. Ejercicio 7SC");
            System.out.println("19. ");
            System.out.println("20. Ejercicio 9SC");
            
            System.out.println("--------------------------------FIGURAS------------------------------------");
            System.out.println("21. ");
            System.out.println("22. ");
            System.out.println("23. ");
            System.out.println("24. ");
            System.out.println("25. Ejercicio 5F");
            System.out.println("26. Ejercicio 6F");
            System.out.println("27. Ejercicio 7F");
            System.out.println("28. Ejercicio 8F");
            System.out.println("29. Ejercicio 9F");
            System.out.println("30. Ejercicio 10F");
            System.out.println("31. Ejercicio 11F");
            System.out.println("32. Ejercicio 12F");
            System.out.println("33. ");
            System.out.println("34. ");
            System.out.println("35. Ejercicio 15F");
            System.out.println("36. Ejercicio 16F");
            System.out.println("37. Ejercicio 17F");
            System.out.println("38. Ejercicio 18F");
            System.out.println("39. Ejercicio 19F");
            
            System.out.println("--------------------------CADENA DE CARACTERES-----------------------------");
            System.out.println("40. Ejercicio 1C");
            System.out.println("41. Ejercicio 2C");
            System.out.println("42. Ejercicio 3C");
            System.out.println("43. Ejercicio 4C");
            System.out.println("44. Ejercicio 5C");
            System.out.println("45. Ejercicio 6C");
            System.out.println("46. ");
            System.out.println("47. ");
            System.out.println("48. ");
            
            System.out.println("---------------------------------ARRAYS-----------------------------------");
            System.out.println("49. ");
            System.out.println("50. ");
            System.out.println("51. Ejercicio3A");
            System.out.println("52. ");
            System.out.println("53. ");
            
            System.out.println("---------------------------------LOADINGS---------------------------------");  
            System.out.println("54. Ejercicio 1L");
            System.out.println("55. Ejercicio 2L");
            System.out.println("56. ");
            System.out.println("57. ");
            System.out.println("58. ");
            System.out.println("59. ");
            System.out.println("60. ");
            System.out.println("61. Ejercicio 8L");
            System.out.println("62. ");
            System.out.println("63. Ejercicio 10L");
            
            System.out.println("---------------------------------RECURSION---------------------------------");
            System.out.println("64. ");
            System.out.println("65. Ejercicio 2R");
            System.out.println("66. Ejercicio 3R");
            System.out.println("67. ");
            System.out.println("68. Ejercicio 5R");
            System.out.println("69. Ejercicio 6R");
            
            System.out.println("70. Salir");
            
            System.out.print("INGRESE UNA OPCION: ");
            opcion = sc.nextInt();

            switch(opcion) {
                //--------------------------SERIES NUMERICAS--------------------------------
                case 1:
                    // Ejercicio 1
                    Ejercicio1 oEjercicio1 =new Ejercicio1();
                    System.out.println("\n Serie 1 con for:  ");
                    oEjercicio1.Ejercicio1For(nPosiciones);
                    System.out.println("\n Serie 1 con do:  ");
                    oEjercicio1.Ejercicio1Do(nPosiciones);
                    System.out.println("\n Serie 1 con while:  ");
                    oEjercicio1.Ejercicio1While(nPosiciones);
                    System.out.println();
                    break;
                case 2:
                    // Ejercicio 2
                    Ejercicio2 oEjercicio2 = new Ejercicio2();
                    System.out.println("\n Serie 2 con for:  ");
                    oEjercicio2.Ejercicio2For(nPosiciones);
                    System.out.println("\n Serie 2 con do:  ");
                    oEjercicio2.Ejercicio2Do(nPosiciones);
                    System.out.println("\n Serie 2 con while:  ");
                    oEjercicio2.Ejercicio2While(nPosiciones);
                    System.out.println();
                    break;
                case 3:
                    // Ejercicio 3
                    Ejercicio3 oEjercicio3 = new Ejercicio3();
                    System.out.println("\nSerie 3 con for: ");
                    oEjercicio3.Ejercicio3For(nPosiciones);
                    System.out.println("\nSerie 3 con do: ");
                    oEjercicio3.Ejercicio3Do(nPosiciones);
                    System.out.println("\nSerie 3 con while: ");
                    oEjercicio3.Ejercicio3While(nPosiciones);
                    System.out.println();
                    break;
                case 4:
                    // Ejercicio 4
                    Ejercicio4 oEjercicio4 = new Ejercicio4();
                    System.out.println("\nSerie 4 con for: ");
                    oEjercicio4.Ejercicio4For(nPosiciones);
                    System.out.println("\nSerie 4 con do: ");
                    oEjercicio4.Ejercicio4Do(nPosiciones);
                    System.out.println("\nSerie 4 con while: ");
                    oEjercicio4.Ejercicio4While(nPosiciones);
                    System.out.println();
                    break;
                case 5:
                    // Ejercicio 5
                    Ejercicio5 oEjercicio5 = new Ejercicio5();
                    System.out.println("\nSerie 5 con for: ");
                    oEjercicio5.Ejercicio5For(nPosiciones);
                    System.out.println("\nSerie 5 con do: ");
                    oEjercicio5.Ejercicio5Do(nPosiciones);
                    System.out.println("\nSerie 5 con while: ");
                    oEjercicio5.Ejercicio5While(nPosiciones);
                    System.out.println();
                    break;
                case 6:
                    // Ejercicio 6
                    Ejercicio6 oEjercicio6 = new Ejercicio6();
                    System.out.println("\nSerie 6 con for: ");
                    oEjercicio6.Ejercicio6For(nPosiciones);
                    System.out.println("\nSerie 6 con do: ");
                    oEjercicio6.Ejercicio6Do(nPosiciones);
                    System.out.println("\nSerie 6 con while: ");
                    oEjercicio6.Ejercicio6While(nPosiciones);
                    System.out.println();
                    break;
                case 7:
                    // Ejercicio 7
                    Ejercicio7 oEjercicio7 = new Ejercicio7();
                    System.out.println("\nSerie 7 con for: ");
                    oEjercicio7.Ejercicio7For(nPosiciones);
                    System.out.println("\nSerie 7 con do: ");
                    oEjercicio7.Ejercicio7Do(nPosiciones);
                    System.out.println("\nSerie 7 con while: ");
                    oEjercicio7.Ejercicio7While(nPosiciones);
                    System.out.println();
                    break;
                case 8:
                    // Ejercicio 8
                    Ejercicio8 oEjercicio8 = new Ejercicio8();
                    System.out.println("\nSerie 8 con for: ");
                    oEjercicio8.Ejercicio8For(nPosiciones);
                    System.out.println("\nSerie 8 con do: ");
                    oEjercicio8.Ejercicio8Do(nPosiciones);
                    System.out.println("\nSerie 8 con while: ");
                    oEjercicio8.Ejercicio8While(nPosiciones);
                    System.out.println();
                    System.out.println("\nSerie 9 con for:"); 
                    Ejercicio9.Ejercicio9For(nPosiciones); 
                    System.out.println("\nSerie 9 con do: ");
                    Ejercicio9.Ejercicio9While(nPosiciones);
                    System.out.println("\nSerie 9 con while: ");
                    Ejercicio9.Ejercicio9DoWhile(nPosiciones);
                    System.out.println();
                    break;
                case 9:
                    
                    break;
                case 10:
                    // Ejercicio 10
                    Ejercicio10 oEjercicio10 = new Ejercicio10(); 
                    System.out.println("\nSerie 10 con for:"); 
                    oEjercicio10.Ejercicio10For(nPosiciones); 
                    System.out.println("\nSerie 10 con do: ");
                    oEjercicio10.Ejercicio10While(nPosiciones);
                    System.out.println("\nSerie 10 con while: ");
                    oEjercicio10.Ejercicio10DoWhile(nPosiciones);
                    System.out.println();
                    break;
                case 11:
                    // Ejercicio 12
                    Ejercicio12 oEjercicio11 = new Ejercicio12();
                    System.out.println("\nSerie 12 con for: ");
                    oEjercicio11.Ejercicio12For(nPosiciones);
                    System.out.println("\nSerie 12 con do: ");
                    oEjercicio11.Ejercicio12Do(nPosiciones);
                    System.out.println("\nSerie 12 con while: ");
                    oEjercicio11.Ejercicio12While(nPosiciones);
                    System.out.println();
                    break;
                
                //--------------------------SERIES DE CARACTERES--------------------------------
                case 12:   
                    // EJERCICIO 1SC
                    System.out.println("\nSerie 1 de Caracteres:");
                    Ejercicio1SC.serie1Char(nPosiciones);
                    break;
                case 13:
                    // EJERCICIO 2SC
                    System.out.println("\nSerie 2 de Caracteres:");
                    Ejercicio2SC.serei2Char(nPosiciones);
                    break;
                case 14:
                    // EJERCICIO 3SC
                    Ejercicio3SC oEjercicio3SC = new Ejercicio3SC();
                    System.out.println("\nSerie 3 de Caracter:");
                    oEjercicio3SC.ejercicio3SCFOR(nPosiciones);
                    break;
                case 15:
                    // EJERCICIO 4SC
                    Ejercicio4SC oEjercicio4SC = new Ejercicio4SC();
                    System.out.println("\nSerie 4 de Caracter:");
                    oEjercicio4SC.ejercicio4SCFOR(nPosiciones);
                    break;
                case 16:
                    // Ejercicio 5SC
                    Ejercicio5SC oEjercicio5SC = new Ejercicio5SC();
                    System.out.println("\nSerie 5 de Caracteres:");
                    oEjercicio5SC.ejercicio5SCFOR(nPosiciones);
                    break;
                case 17:
                    // Ejercicio 6SC
                    Ejercicio6SC util = new Ejercicio6SC();
                    String resultado = util.obtenerLetras(nPosiciones);
                    System.out.println(resultado);
                    break;
                case 18:
                    // Ejercicio 7SC
                    System.out.println("\nSerie 7 de Caracteres:");
                    Ejercicio7SC.serie7Char(nPosiciones); 
                    break;
                case 19:
                    // EJercicio 8SC
                    Ejercicio8SC oEjercicio8SC = new Ejercicio8SC();
                    System.out.println("\nSerie 8 de Caracter:");
                    oEjercicio8SC.ejercicio8SCFOR(nPosiciones);
                    System.out.println("\nFiguras:");
                    System.out.println();
                    break;
                case 20:
                    // Ejercicio 9SC
                    Scanner Ejercicio9SCFJ = new Scanner(System.in);
                    System.out.print("Ingrese un número entero para repeticiones: ");
                    int repeticiones = Ejercicio9SCFJ.nextInt();
                    Ejercicio9SC miObjeto = new Ejercicio9SC();
                    miObjeto.anS9C(repeticiones);
                    break;
                    
                //--------------------------------FIGURAS------------------------------------
                case 21:
                    
                    break;
                case 22:
         
                    break;
                case 23:
         
                    break;
                case 24:
         
                    break;
                case 25:
                    //FIGURA 5
                    Scanner EjercicioF5 = new Scanner(System.in);
                    System.out.println("Ingrese el número de líneas para el patrón de asteriscos:");
                    int numeroLineasFJ = EjercicioF5.nextInt();
                    Ejercicio5F.imprimirPatronAsteriscos(numeroLineasFJ);
                    break;
                case 26:
                    //FIGURA 6
                    Scanner EjercicioF6 = new Scanner(System.in);
                    System.out.println("Ingrese el número de líneas para el patrón de asteriscos:");
                    int numLineasFJ = EjercicioF6.nextInt();
                    Ejercicio6F.imprimirPatronAsteriscos(numLineasFJ);
                    break;
                case 27:
                    // FIGURA 7
                    Scanner EjercicioF7 = new Scanner(System.in);
                    System.out.println("Ingrese el número de columnas para el patrón:");
                    int numeroColumnasFJ = EjercicioF7.nextInt();
                    Ejercicio7F.imprimirPatronColumnas(numeroColumnasFJ);
                    break;
                case 28:
                    //FIGURA 8
                    Scanner EjercicioF8 = new Scanner(System.in);
                    System.out.println("Ingrese el número de líneas para el patrón:");
                    int numerLineasFJ = EjercicioF8.nextInt();
                    Ejercicio8F.imprimirPatronAumentando(numerLineasFJ);
                    break;
                case 29:
                    //FIGURA 9
                    System.out.println("\nFigura 9");
                    Ejercicio9F.figura9(nPosiciones);
                    break;
                case 30:
                    //FIGURA 10
                    System.out.println("\nFigura 10");
                    Ejercicio10F.figura10(nPosiciones);
                    break;
                case 31:
         
                    break;
                case 32:
                    //FIGURA 12
                    System.out.println("\nFigura 12");
                    Ejercicio12F.figura12(nPosiciones);
                    break;
                case 33:
                    
                    break;
                case 34:
         
                    break;
                case 35:
                    // Ejercicio 15F
                    Scanner EjercicioF15 = new Scanner(System.in);
                    System.out.println("Ingrese el número de filas para el Triángulo de Pascal:");
                    int numRowsFJ = EjercicioF15.nextInt();
                    Ejercicio15F.imprimirTrianguloPascal(numRowsFJ);
                    break;
                case 36:
                    // Ejercicio 16F
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("INGRESE LA CANTIDAD DESEADA PARA EL PATRON: ");
                    int cantidad = scanner.nextInt();
                    Ejercicio16F Ejercicio16f = new Ejercicio16F();
                    Ejercicio16f.F16(cantidad);
                    break;
                case 37:
                    //Figura 17
                    System.out.println("\nFigura 17");
                    Ejercicio17F.figura17(nPosiciones);
                    break;
                case 38:
                    //FIGURA 18
                    System.out.println("\nFigura 18");
                    Ejercicio18F.figura18(nPosiciones);
                    break;
                case 39:
                    // Ejercicio 19F
                    Ejercicio19F objeto = new Ejercicio19F();
                    System.out.println("\\nFigura 19");
                    objeto.figura19F(nPosiciones);
                    break;
                //--------------------------CADENA DE CARACTERES-----------------------------
                case 40:
                    // Ejercicio 1C
                    Scanner Ejercicio1CFJ = new Scanner(System.in);  
                    System.out.print("Ingrese una frase: ");
                    String frase = Ejercicio1CFJ.nextLine();
                    int contadorVocales = new Ejercicio1C().contarVocales(frase);
                    System.out.println("La frase tiene " + contadorVocales + " vocales.");
                    break;
                case 41:
                    // Ejercicio 2C
                    Scanner text = new Scanner(System.in);
                    System.out.print("Ingrese una frase: ");
                    String frase1 = text.nextLine(); 
                    Ejercicio2C ejercicio = new Ejercicio2C();
                    ejercicio.contarVocalesConsonantes(frase1);
                    break;    
                case 42:
                    //Ejercicio 3C
                    Scanner texto = new Scanner(System.in);
                    System.out.print("Ingrese la frase: ");
                    String frase2 = texto.nextLine();
                    System.out.print("Ingrese la vocal a eliminar: ");
                    char vocal = texto.next().charAt(0);  
                    String resultado2 = Ejercicio3C.eliminarVocal(frase2, vocal);
                    System.out.println(resultado2);
                    break;
                case 43:
                    //EJERCICIO 4C
                    System.out.println("\nCadena 4");
                    Ejercicio4CC.cadena4();
                    break;
                case 44:
                    //EJERCICIO 5C
                    System.out.println("\nCadena 5");
                    Ejercicio5CC.cadena5();
                    break;
                case 45:
                    //EJERCICIO 6C
                    System.out.println("\nCadena 6");
                    Ejercicio6CC.cadena6();
                    break;
                case 46:
                    
                    break;
                case 47:
         
                    break;
                case 48:
         
                    break;
                //---------------------------------ARRAYS-----------------------------------
                case 49:
         
                    break;   
                case 50:
         
                    break;
                case 51:
                    //Ejercicio 3A
                    System.out.println("\nArrays 3:");
                    Ejercicio3A.arrayGrafico();
                    break;
                case 52:
         
                    break;
                case 53:
                    // Ejercicio 5A
                    
                    break;
                    
                //---------------------------------LOADINGS---------------------------------
                case 54:
                    //EJERCICIO 1L
                    System.out.println("\nLoading 1:");
                    Ejercicio1L.loading1();
                    break;
                case 55:
                   //EJERCICIO 2L
                    System.out.println("\nLoading 2");
                    Ejercicio2L.loading2();
                    System.out.println();
                    break;
                case 56:
                    
                    break;
                case 57:
                    // Ejercicio 4L
                    
                    break;
                case 58:
         
                    break;
                case 59:
                    // Ejercicio 6L
                    
                    break;
                case 60:
                    //EJERCICIO 7L
                    System.out.println("\nLoading 7");
                    Ejercicio7L.loading7();
                    break;
                case 61:
                     // Ejercicio 8L
                    
                    break;
                case 62:
         
                    break;
                case 63:
                    // Ejercicio 10L
                    Ejercicio10L loadingFigura = new Ejercicio10L();
                    System.out.println("Iniciando animación de la figura:");
                    loadingFigura.Figura();
                    System.out.println("Animación completada.");
                    break;
                //---------------------------------RECURSION---------------------------------
                case 64:
                    
                    break;
                case 65:
                    //SUMA RECURSIVA 2R
                    System.out.println("\nSuma recursiva");
                    int suma = Ejercicio2R.sumaRecursiva(9, 3);
                    System.out.println(suma);
                    break;
                case 66:
                    //MULTIPLICACION RECURSIVA
                    System.out.println("\nMultiplicacion recursiva");
                    int multiplicacion = Ejercicio3R.multiplicacionRecursiva(3, 7);
                    System.out.println(multiplicacion);
                    break;
                case 67:
         
                    break;
                case 68:
                    // Ejercicio 5R
                    Ejercicio5R.conteoProgresivo(5);  
                    break;
                case 69:
                    // Ejercicio 6R
                    Scanner EjercicioR6 = new Scanner(System.in);
                    System.out.print("Ingrese el número de inicio para el conteo regresivo: ");
                    int inicio = EjercicioR6.nextInt();
                    Ejercicio6R contador = new Ejercicio6R();
                    contador.realizarConteo(inicio);
                    break;
                    
                    
                //    
                case 70:
                    System.out.println("Saliendo..."); 
                    break;

                default:
                    System.out.println("Opción inválida");
                
            }
        } while(opcion != 70);

        sc.close();
    }

}
//
//Please note that I have only added comments for the exercises where you have provided code. You can add comments for the other exercises in a similar manner..</s>
