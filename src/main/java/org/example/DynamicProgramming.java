package org.example;


import java.util.HashMap;

public class DynamicProgramming { //Часова та просторова складність дорівнює O(N)
private static  HashMap<Integer, Long> fibonacciMap = new HashMap<>();
    private static long fibonacci(int n) {


        if (n <= 1 ){
            return n;
        }
        if (fibonacciMap.containsKey(n)) {
            return fibonacciMap.get(n);
        }
        long fibonachi = fibonacci(n - 1) + fibonacci(n - 2);
        fibonacciMap.put(n, fibonachi);


        return fibonachi ;
    }



    public static void main(String[] args) {
        int n = 20;
        long result = fibonacci(n);
        System.out.println("Fibonacci(" + n + ") = " + result);
    }
}
