public class Ejercicio9SC {
    public void anS9C(int rep) {
        int cont1 = 0, cont2 = 1;
        for (int i = 0; i < rep; i++) {
            for (int j = 0; j < cont2; j++) {
                System.out.print((char) ('a' + i));
            }
            System.out.print(" ");
            int cache = cont2;
            cont2 += cont1;
            cont1 = cache;
        }
    }
}