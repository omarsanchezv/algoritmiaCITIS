package estructuras;

import java.util.Scanner;
import java.util.Stack;

public class Pila {
    /***
     * Valida si el conjunto de parentesis esta balanceado
     * osea que cada llave ( [ {
     * venga acompañado de su llave de cierre ) ] }
      */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("teclea un patron");
        String pattern = scanner.nextLine();
        validate(pattern);
    }

    // Valida el Patron
    private static void validate(String pattern) {
        Stack<Character> stack = new Stack<>();
        if (pattern.length() % 2 == 1) {
            System.out.println("NO");
            return;
        }

        for (char a : pattern.toCharArray()) {
            if (stack.size() > pattern.length() / 2) {
                System.out.println("NO");
                return;
            }

            if (isOpen(a)) {
                stack.push(a);
            } else {
                if (stack.isEmpty()) {
                    System.out.println("NO");
                    return;
                }
                if (a != getClose(stack.pop())) {
                    System.out.println("NO");
                    return;
                }
            }
        }

        if (stack.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean isOpen(char c) {
        return c == '(' || c == '{' || c == '[';
    }

    private static char getClose(char c) {
        return switch (c) {
            case '{' -> '}';
            case '[' -> ']';
            case '(' -> ')';
            default -> ' ';
        };
    }
}
