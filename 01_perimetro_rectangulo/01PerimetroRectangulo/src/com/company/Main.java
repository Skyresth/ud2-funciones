package com.company;

import java.util.Scanner;

public class Main {

    public static int perimetroRectangulo() {
        // No se hacerlo con BufferedReader
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el valor en cm de base (horizontal):");
        int a = sc.nextInt();
        System.out.println("Introduce el valor en cm de altura (vertical):");
        int b = sc.nextInt();
        int r = 2 * a + 2 * b;
        return r;
    }

    public static void main(String[] args) {

        System.out.print(perimetroRectangulo());
    }
}

/** Ejemplo de clase
 public Main {

 public static int perimetroRectangulo(int base, int altura) {

 int perimetro = 2*(base+altura);

 return perimetro;
 }

 public static void main(String[] args) perimetroRectangulo() Lanzar excepcion  {

 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

 System.out.print("Escriba la base: ");
 int base = Integer.parseInt(br.readLine());

 System.out.print("Escriba la altura: ");
 int altura = Integer.parseInt(br.readLine());

 int r = perimetroRectangulo(base, altura);

 System.out.println("Perimetro: " +r);
 }
 }
 **/