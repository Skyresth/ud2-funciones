package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    // Ponerlo en mayusculas o no me lo aceptara

            public static int perimetroRectangulo(int base, int altura) {

                int perimetro = 2*(base+altura);

                return perimetro;
            }

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Escriba la base: ");
            int base = Integer.parseInt(br.readLine());

            System.out.print("Escriba la altura: ");
            int altura = Integer.parseInt(br.readLine());

            int r = perimetroRectangulo(base, altura);

            System.out.println("Perimetro: " +r);
        }
 }
