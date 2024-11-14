package complejidad;

import java.util.Arrays;

// Complejidad O(n log n)
public class MergeSort {
    public static int[] mergesort(int[] lista) {
        if (lista.length <= 1) {
            return lista;
        }
        int medio = lista.length / 2;
        int[] izquierda = mergesort(Arrays.copyOfRange(lista, 0, medio));
        int[] derecha = mergesort(Arrays.copyOfRange(lista, medio, lista.length));
        return merge(izquierda, derecha);
    }

    private static int[] merge(int[] izquierda, int[] derecha) {
        int[] resultado = new int[izquierda.length + derecha.length];
        int i = 0, j = 0, k = 0;
        while (i < izquierda.length && j < derecha.length) {
            if (izquierda[i] <= derecha[j]) {
                resultado[k++] = izquierda[i++];
            } else {
                resultado[k++] = derecha[j++];
            }
        }
        while (i < izquierda.length) {
            resultado[k++] = izquierda[i++];
        }
        while (j < derecha.length) {
            resultado[k++] = derecha[j++];
        }
        return resultado;
    }

    public static void main(String[] args) {
        int[] lista = {5, 1, 4, 2, 8};
        int[] ordenada = mergesort(lista);
        for (int num : ordenada) {
            System.out.print(num + " ");  // Imprime 1 2 4 5 8
        }
    }
}
