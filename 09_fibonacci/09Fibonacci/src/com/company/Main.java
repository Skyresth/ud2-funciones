package com.company;

import java.util.Scanner;

public class Main {

    private static int fib(int n) {
        if (n < 2) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static int fib3(int n) {
        Scanner sc = new Scanner(System.in);
        int n, fibo1, fibo2, i;
        do {
            System.out.print("Introduce numero mayor que 1: ");
            n = sc.nextInt();
        } while (n <= 1);
        System.out.println("Los " + n + " primeros términos de la serie de Fibonacci son:");

        fibo1 = 1;
        fibo2 = 1;

        System.out.print(fibo1 + " ");
        for (i = 2; i <= n; i++) {
            System.out.print(fibo2 + " ");
            fibo2 = fibo1 + fibo2;
            fibo1 = fibo2 - fibo1;
        }
        System.out.println(fibo1);
        System.out.println(fibo2);
        return 0;
    }
    private static int fib2 (int n) {
        // Iterativa
        int a = 0;
        int b = 1;
        int c;

        for (int k = 0; k < n; k++) {
            c = b + a;
            a = b;
            b = c;
        }

            return a;

    }

    public static void main(String[] args) {

        System.out.println(fib(8));
        System.out.println(fib2(8));
        System.out.println(fib3(8)); //Mal
        }
    }
