package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static double convertirTemperatura(double centigrado) {

        return (centigrado * 1.8) + 32;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introducir una temperatura en centígrados: ");
        double centigrado = Double.parseDouble(br.readLine());

        double respuesta = convertirTemperatura(centigrado);

        System.out.print("La solucion es:  " + respuesta + " ºF");
    }
}
