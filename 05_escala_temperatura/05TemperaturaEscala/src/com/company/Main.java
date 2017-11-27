package com.company;

import java.util.Scanner;

public class Main {

    private static double convertirTemperatura(double t, char escala) {
        if (escala == 'F') {
            return t * 1.8 + 32;
        } else {
            return t + 273.15;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("=== Temperaturas ===\n" +
                    "1. Convertir a Fahrenheit\n" +
                    "2. Convertir a Kelvin\n" +
                    "3. Salir\n" +
                    "Opción:");
            opcion = Integer.parseInt(sc.nextLine());
            System.out.println("Escribe la temperatura en ºC: ");
            double temperatura = Double.parseDouble(sc.nextLine());
            switch (opcion) {
                case 1:
                    System.out.println("El resultado es: " + convertirTemperatura(temperatura, 'F'));
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
        } while (opcion != 3);
    }
}