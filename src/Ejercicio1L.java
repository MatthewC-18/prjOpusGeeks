public class Ejercicio1L {
    /**    L01) Indicador de carga desde 0  a 100% usar los signos \|/-| para simular un movimiento rotacional de carga 0% hasta 100%  
     / 100%
     * @autor Ismael Freire
     * @version 2.0
     * @date 03/12/2023
    */
    public static void loading1 (){
        String barraCargandoString[]={"|", "/", "-", "\\"};
        for(int i = 0; i <= 100; i++){
            String c = barraCargandoString[i%4];
            System.out.print("\r Loading "+ c +" "+ i +" %");
            try {Thread.sleep(70);} 
            catch (InterruptedException ie) {}
        }
        System.out.println();
    }
    
}
