package complejidad;

// Complejidad O(1)
public class ComplejidadConstante {
    public static int obtenerElemento(int[] lista, int indice) {
        return lista[indice];
    }

    public static void main(String[] args) {
        int[] lista = {1, 2, 3, 4, 5};
        System.out.println(obtenerElemento(lista, 2)); // Devuelve 3
    }
}


