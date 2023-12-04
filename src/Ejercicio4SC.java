

public class Ejercicio4SC {

    public String ejercicio4SCFOR(int nPosiciones) {
        StringBuilder serie = new StringBuilder();
        String[] operadores = {"+", "-", "*", "/"};
        int indiceOperador = 0;

        for (int i = 0; i < nPosiciones; i++) {
            serie.append(operadores[indiceOperador]).append(" ");
            indiceOperador = (indiceOperador + 1) % operadores.length;
        }

        return serie.toString().trim();
    }
}
