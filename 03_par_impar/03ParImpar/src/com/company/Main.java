package com.company;

import java.util.Scanner;

public class Main {
    private static boolean esPar(int a) {

        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean esImpar(int a) {

        if (a % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero ");
        int numero = Integer.parseInt(sc.nextLine());

        if (esPar(numero)) {
            if (numero % 2 == 0) {
                System.out.println("Es par");
            } else {
                System.out.println("Es impar");
            }
            if (!esPar(numero)) {
                if (numero % 2 == 0) {
                    System.out.println("Es par");
                } else {
                    System.out.println("Es impar");
                }
            }
        }
    }
}