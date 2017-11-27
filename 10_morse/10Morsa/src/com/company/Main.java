package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    // Falta que se repita hasta decir stop
    private static String morse(char frase) {
        switch (frase) {
            case 'a':
                System.out.println("·-");
                break;
            case 'b':
                System.out.println("-···");
                break;
            case 'c':
                System.out.println("-·-·");
                break;
            case 'd':
                System.out.println("-··");
                break;
            case 'e':
                System.out.println("·");
                break;
            case 'f':
                System.out.println("··-·");
                break;
            case 'g':
                System.out.println("--·");
                break;
            case 'h':
                System.out.println("····");
                break;
            case 'i':
                System.out.println("··");
                break;
            case 'j':
                System.out.println("·---");
                break;
            case 'k':
                System.out.println("-·-");
                break;
            case 'l':
                System.out.println("·-··");
                break;
            case 'm':
                System.out.println("--");
                break;
            case 'n':
                System.out.println("-·");
                break;
            case 'o':
                System.out.println("---");
                break;
            case 'p':
                System.out.println("·--·");
                break;
            case 'q':
                System.out.println("--·-");
                break;
            case 'r':
                System.out.println("·-·");
                break;
            case 's':
                System.out.println("···");
                break;
            case 't':
                System.out.println("-");
                break;
            case 'u':
                System.out.println("··-");
                break;
            case 'v':
                System.out.println("···-");
                break;
            case 'w':
                System.out.println("·--");
                break;
            case 'x':
                System.out.println("-··-");
                break;
            case 'y':
                System.out.println("-·--");
                break;
            case 'z':
                System.out.println("--··");
                break;
        }
        // No se que hay que poner en el return para que no salga error
        return ;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String frase;
        do {
            System.out.println("Ingrese la frase que quiere traducir: ");
            frase = br.readLine().toLowerCase();
            if (!frase.equalsIgnoreCase("STOP"))
            for (int i = 0; i < frase.length(); i++) {
                System.out.println(morse(frase.charAt(i)));
            }
            System.out.println();

        } while (!frase.equalsIgnoreCase("STOP"));
    }
}