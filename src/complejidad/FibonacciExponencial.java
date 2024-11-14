package complejidad;

// Complejidad O(2^n)
public class FibonacciExponencial {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(6));  // Devuelve 8
    }
}
