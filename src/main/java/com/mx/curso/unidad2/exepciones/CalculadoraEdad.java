package com.mx.curso.unidad2.exepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraEdad {

    static void main(String[] args) {
        int anioActual =2004;

        Scanner scanner = new Scanner(System.in);

        try {
            int anioNacimiento = scanner.nextInt();
            int edad = anioActual - anioNacimiento;
            System.out.println("tu edad es: " + edad);
        }catch (InputMismatchException e) {
            System.out.println("Error: Debes ingresas " +
                            "un numero Valido para e; anio de nacimiento.");
        }
        scanner.close();
    }

}
