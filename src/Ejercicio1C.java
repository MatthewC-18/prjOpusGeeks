public class Ejercicio1C {
    // Método para contar las vocales en una cadena
    public int contarVocales(String cadena) {
        int contador = 0;

        // Convertir la cadena a minúsculas para contar las vocales sin importar mayúsculas o minúsculas
        cadena = cadena.toLowerCase();

        // Iterar sobre cada caracter en la cadena
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);

            // Verificar si el caracter es una vocal
            if (esVocal(caracter)) {
                contador++;
            }
        }

        return contador;
    }

    // Método para verificar si un caracter es una vocal
    private boolean esVocal(char caracter) {
        return caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u';
    }
}