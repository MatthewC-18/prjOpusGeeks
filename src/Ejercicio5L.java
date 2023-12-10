import java.util.concurrent.TimeUnit;

public class Loading5 {
    public static void main(String[] args) {
        ejecutarLoading5();
    }

    public static void ejecutarLoading5() {
        int longitudBarra = 20;

        for (int i = 0; i <= longitudBarra; i++) {
            // Calcular el porcentaje completado
            int porcentaje = i * 100 / longitudBarra;

            // Imprimir la barra de progreso
            System.out.print("\r[");
            for (int j = 0; j < longitudBarra; j++) {
                if (j < i) {
                    System.out.print("=");
                } else if (j == i) {
                    System.out.print(">");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("] " + porcentaje + "%");

            // Pausa breve para simular el progreso
            try {
                TimeUnit.MILLISECONDS.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\nTarea completada.");
    }
}
