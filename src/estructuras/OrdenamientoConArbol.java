package estructuras;

import estructuras.helpers.ArbolBinario;

import java.util.Scanner;

public class OrdenamientoConArbol {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArbolBinario arbol = new ArbolBinario();

        System.out.println("Ingrese números enteros para insertar en el árbol binario.");
        System.out.println("Escriba 'FIN' para terminar.");

        // Leer números hasta que se ingrese "FIN"
        while (true) {
            System.out.print("Ingrese un número: ");
            String input = scanner.nextLine().trim();

            // Si el usuario ingresa "FIN", detener la lectura
            if (input.equalsIgnoreCase("FIN")) {
                break;
            }

            try {
                int numero = Integer.parseInt(input); // Convertir a entero
                arbol.insertar(numero);
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
            }
        }

        // Realizar el recorrido in-order e imprimir los valores
        System.out.println("\nRecorrido in-order del árbol binario:");
        arbol.inOrder();

        scanner.close();
    }
}

