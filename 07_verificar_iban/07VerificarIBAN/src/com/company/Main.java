package com.company;


public class Main {

    private static boolean esValido(String IBAN) {

        // Quitar los espacios
        IBAN = IBAN.replaceAll("\\s+", "");
        System.out.println(IBAN);
        // Extraer los cuatro primeros caracteres, Ctrl+Q Ayuda rapida sobre un comando
        String cuatrosPrimeros = IBAN.substring(0,4);
        String restoCadena = IBAN.substring(4);

        // Convertir las letras a numeros usando la tabla
        int numero1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                .indexOf(cuatrosPrimeros.charAt(0)) + 10;
        int numero2 = "ABCDEFGHIJKLMOPQRSTUVWXYZ"
                .indexOf(cuatrosPrimeros.charAt(1)) + 10;

        // Llevarlos al final
        String nuevoIBAN = restoCadena + numero1 + numero2 + cuatrosPrimeros.substring(2);

        // Hacer la division y comprobar
        long numero = Long.parseLong(nuevoIBAN);

        return numero % 97 == 1;
    }

    public static void main(String[] args) {

        if(esValido("BE88 3200 34171 3441")) {
            System.out.println("OK");
        } else {
            System.out.println("ERROR");
        }
    }
}
