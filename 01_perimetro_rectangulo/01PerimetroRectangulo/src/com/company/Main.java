package com.company;

import java.util.Scanner;

public class Main {

    public static int perimetroRectangulo() {
        // No se hacerlo con BufferedReader
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el valor en cm de horizontal:");
        int a = sc.nextInt();
        System.out.println("Introduce el valor en cm de vertical:");
        int b = sc.nextInt();
        int r = 2 * a + 2 * b;
        return r;
    }

    public static void main(String[] args) {

        System.out.print(perimetroRectangulo());
    }
}