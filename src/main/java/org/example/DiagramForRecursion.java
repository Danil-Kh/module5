package org.example;

public class DiagramForRecursion {// Часова складність дорівнює O(N^2) просторова O(N)

    private static long fibonacci(int n) {
        if (n <= 1 ){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }


    public static void main(String[] args) {
        int n = 6;
        long result = fibonacci(n);
        System.out.println("Fibonacci(" + n + ") = " + result);
    }
}
