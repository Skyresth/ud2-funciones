package com.company;

import java.util.Scanner;

public class Main {

    public static double calcularCambio(double euro) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese cantidad: ");
        euro = sc.nextDouble();


        return euro;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        char opcion;
        do {

            System.out.print("CONVERSOR DE EUROS\n" +
                    "---------------------\n" +
                    "a. Dolar\n" +
                    "b. Libra\n" +
                    "c. Yuan Chino\n" +
                    "d. Yen\n" +
                    "e. Salir\n" +
                    "Opción:");

            opcion = sc.nextLine().toLowerCase().charAt(0);

            switch (opcion) {
                case 'a':
                    double rdolar = 1.16 * calcularCambio();
                    System.out.format(rdolar);
                    break;
                case 'b':
                    double rlibra = 0.88 * calcularCambio();
                    System.out.format(rlibra);
                    break;
                case 'c':
                    double ryuan = 7.68 * calcularCambio();
                    System.out.format(ryuan);
                    break;
                case 'd':
                    double ryen = 131.91 * calcularCambio();
                    System.out.format(ryen);
                    break;
                case 'e':
                    System.out.println("Fin del programa.");
                    break;
                default:
                    System.out.println("ERROR: Opción no válida...");
                    break;
            }

        } while (opcion != 'e');
    }
}
