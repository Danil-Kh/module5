package org.example;

import java.util.ArrayList;

public class iteration { //Часова та просторова складність дорівнює O(N)
    public static long fibonacci(int n) {
        long result = 0;
        ArrayList<Long> arrayListResult = new ArrayList<>();
        arrayListResult.add(1L);
        arrayListResult.add(1L);
        if (n <= 2) {
          return   arrayListResult.getLast();
        }
      for (int i = 2; i <= n - 1; i++) {
        result = arrayListResult.get(i - 1) + arrayListResult.get(i - 2);
          arrayListResult.add(result);
      }
      return result;
    }

    public static void main(String[] args) {
        int n = 4;
        long result = fibonacci(n);
        System.out.println("Fibonacci(" + n + ") = " + result);
    }
}
