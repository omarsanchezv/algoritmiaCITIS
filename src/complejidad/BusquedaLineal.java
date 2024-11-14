package complejidad;

// Complejidad O(N)
public class BusquedaLineal {
    public static int buscarElemento(int[] lista, int objetivo) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == objetivo) {
                return i;  // Devuelve el índice del elemento
            }
        }
        return -1;  // Elemento no encontrado
    }

    public static void main(String[] args) {
        int[] lista = {1, 3, 5, 7, 9, 11};
        System.out.println(buscarElemento(lista, 7));  // Devuelve 3
    }
}
