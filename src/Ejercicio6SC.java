public class Ejercicio6SC {
    public String obtenerLetras(int valor) {
        StringBuilder letras = new StringBuilder();

        if (valor > 0 && valor <= 26) {
            for (int i = 0; i < valor; i++) {
                char letra = (char) ('a' + i);
                letras.append(letra).append(" ");
            }
        } else {
            letras.append("El valor ingresado no es válido. Debe estar entre 1 y 26.");
        }

        return letras.toString();
    }
}