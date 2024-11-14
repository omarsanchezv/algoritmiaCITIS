package ejercicios;

import java.util.Scanner;

// El ejercicio trata de que crear un metodo que al ingresar una palabra (sin espacios)
// te diga cuantas veces se utiliza cada letra
// ejemplo: metiendo Carroza debe de imprimir
// C 1
// a 2
// R 2
// o 1
// z 1

// T es solo para no revelar el tipo necesario no es parte del codigo
public class CuentaLetras<T> {

    public T contarLetras(String texto) {
        return null;
    }

    public void imprimir(T valor) {

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el texto a analizar");
        String texto = scanner.nextLine();
        CuentaLetras<Integer> obj = new CuentaLetras<Integer>();
        Integer val = obj.contarLetras(texto);
        obj.imprimir(val);

    }
}
