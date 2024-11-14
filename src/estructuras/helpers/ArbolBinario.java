package estructuras.helpers;

// Clase que representa el árbol binario
public class ArbolBinario {
    Nodo raiz;

    // Constructor de un árbol vacío
    public ArbolBinario() {
        raiz = null;
    }

    // Método para insertar un nuevo valor en el árbol
    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    // Método recursivo para insertar el valor en el árbol
    private Nodo insertarRec(Nodo raiz, int valor) {
        // Si el árbol está vacío, se crea un nuevo nodo
        if (raiz == null) {
            raiz = new Nodo(valor);
            return raiz;
        }

        // Si el valor es menor que el valor actual, insertarlo en el subárbol izquierdo
        if (valor < raiz.valor) {
            raiz.izquierdo = insertarRec(raiz.izquierdo, valor);
        }
        // Si el valor es mayor, insertarlo en el subárbol derecho
        else if (valor > raiz.valor) {
            raiz.derecho = insertarRec(raiz.derecho, valor);
        }

        // Retorna el nodo (sin cambios)
        return raiz;
    }

    // Método para realizar un recorrido in-order
    public void inOrder() {
        inOrderRec(raiz);
    }

    // Método recursivo para el recorrido in-order
    private void inOrderRec(Nodo raiz) {
        if (raiz != null) {
            // Recorrer el subárbol izquierdo
            inOrderRec(raiz.izquierdo);
            // Imprimir el valor del nodo actual
            System.out.print(raiz.valor + " ");
            // Recorrer el subárbol derecho
            inOrderRec(raiz.derecho);
        }
    }
}

