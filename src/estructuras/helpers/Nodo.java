package estructuras.helpers;

// Clase para representar el nodo del árbol binario
public class Nodo {
    public int valor;
    public Nodo izquierdo, derecho;

    public Nodo(int valor) {
        this.valor = valor;
        izquierdo = derecho = null;
    }
}
