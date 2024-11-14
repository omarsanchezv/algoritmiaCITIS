package estructuras;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// HashSet
public class RegistroParticipantes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> participantes = new HashSet<>();

        System.out.println("Bienvenidos al sistema de registro de participantes.");
        System.out.println("Ingrese los nombres de los participantes. Escriba 'FIN' para terminar.");

        while (true) {
            System.out.print("Ingrese el nombre: ");
            String nombre = scanner.nextLine().trim();

            // Si el usuario ingresa 'FIN', terminamos el registro
            if (nombre.equalsIgnoreCase("FIN")) {
                break;
            }

            // Intentar agregar el nombre al HashSet
            if (participantes.add(nombre)) {
                System.out.println("Participante registrado: " + nombre);
            } else {
                System.out.println("Este participante ya está registrado: " + nombre);
            }
        }

        // Mostrar la lista de participantes
        System.out.println("\nLista de participantes registrados:");
        for (String participante : participantes) {
            System.out.println(participante);
        }

        // Permitir eliminar un participante
        System.out.print("\n¿Desea eliminar a un participante? (si/no): ");
        String respuesta = scanner.nextLine().trim();

        if (respuesta.equalsIgnoreCase("si")) {
            System.out.print("Ingrese el nombre del participante a eliminar: ");
            String nombreAEliminar = scanner.nextLine().trim();

            if (participantes.remove(nombreAEliminar)) {
                System.out.println("Participante eliminado: " + nombreAEliminar);
            } else {
                System.out.println("El participante no se encuentra en la lista.");
            }
        }

        // Mostrar la lista final de participantes
        System.out.println("\nLista final de participantes:");
        for (String participante : participantes) {
            System.out.println(participante);
        }

        scanner.close();
    }
}

