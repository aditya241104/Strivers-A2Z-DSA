package Recursion;

public class FibonacciNumber {
    public static void main(String args[]){
        int n = 10;  // Example: print first 10 Fibonacci numbers
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
    static int fibonacci(int n) {
        if (n == 0) return 0;      // base case 1
        if (n == 1) return 1;      // base case 2
        return fibonacci(n - 1) + fibonacci(n - 2);  // recursive case
    }
}
