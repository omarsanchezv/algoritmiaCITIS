package complejidad;

// Complejidad O(log n)
public class BusquedaBinaria {
    public static int busquedaBinaria(int[] lista, int objetivo) {
        int bajo = 0;
        int alto = lista.length - 1;
        while (bajo <= alto) {
            int medio = (bajo + alto) / 2;
            if (lista[medio] == objetivo) {
                return medio;
            } else if (lista[medio] < objetivo) {
                bajo = medio + 1;
            } else {
                alto = medio - 1;
            }
        }
        return -1;  // Elemento no encontrado
    }

    public static void main(String[] args) {
        int[] lista = {1, 3, 5, 7, 9, 11};
        System.out.println(busquedaBinaria(lista, 5));  // Devuelve 2
    }
}

