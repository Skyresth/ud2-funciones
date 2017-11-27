package com.company;

public class Main {

    public static int factorial(int n) {
        // Repetitivo o iterativa

        int r = 1;

        for (int i = 1; i <= n; i++) {
            r *= i;
        }

        return r;
    }
    public static int factorial2(int n) {
        // Recursiva

        if( n > 0 ) {
            return factorial(n-1)*n;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {

        System.out.println(factorial(5));   // Iterativa
        System.out.println(factorial2(5));  // Recursiva
    }
}
