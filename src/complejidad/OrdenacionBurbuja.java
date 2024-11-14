package complejidad;

// Complejidad O(N^2)
public class OrdenacionBurbuja {
    public static void ordenacionBurbuja(int[] lista) {
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista.length - i - 1; j++) {
                if (lista[j] > lista[j + 1]) {
                    // Intercambiar los elementos
                    int temp = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] lista = {5, 1, 4, 2, 8,3,10,6,12,14,9,7};
        ordenacionBurbuja(lista);
        for (int num : lista) {
            System.out.print(num + " ");  // Imprime 1 2 4 5 8
        }
    }
}

