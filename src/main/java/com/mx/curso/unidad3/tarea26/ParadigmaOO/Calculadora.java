package com.mx.curso.unidad3.tarea26.ParadigmaOO;

import java.util.Scanner;

public class Calculadora {

    // Método sumar (2 enteros)
    public int sumar(int a, int b) {
        return a + b;
    }

    // Método sumar (3 enteros)
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    // Método sumar (2 decimales)
    public double sumar(double a, double b) {
        return a + b;
    }

    // MAIN
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        int opcion;

        do {
            System.out.println("\n===== CALCULADORA =====");
            System.out.println("1. Sumar 2 enteros");
            System.out.println("2. Sumar 3 enteros");
            System.out.println("3. Sumar 2 decimales");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.print("Ingresa el primer entero: ");
                    int e1 = sc.nextInt();
                    System.out.print("Ingresa el segundo entero: ");
                    int e2 = sc.nextInt();
                    System.out.println("Resultado: " + calc.sumar(e1, e2));
                    break;

                case 2:
                    System.out.print("Ingresa el primer entero: ");
                    int t1 = sc.nextInt();
                    System.out.print("Ingresa el segundo entero: ");
                    int t2 = sc.nextInt();
                    System.out.print("Ingresa el tercer entero: ");
                    int t3 = sc.nextInt();
                    System.out.println("Resultado: " + calc.sumar(t1, t2, t3));
                    break;

                case 3:
                    System.out.print("Ingresa el primer decimal: ");
                    double d1 = sc.nextDouble();
                    System.out.print("Ingresa el segundo decimal: ");
                    double d2 = sc.nextDouble();
                    System.out.println("Resultado: " + calc.sumar(d1, d2));
                    break;

                case 4:
                    System.out.println("Saliendo de la calculadora...");
                    break;

                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }

        } while (opcion != 4);

        sc.close();
    }

}
