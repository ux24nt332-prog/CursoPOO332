package com.mx.curso.unidad2.exepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraPromedio {

    static void main(String[] args) {
        double nota1= 0;
        double nota2= 0;
        Scanner sacaner = new Scanner(System.in);

        try {
            System.out.println("Ingresa La Nota 1: ");
            nota1 = sacaner.nextDouble();
            System.out.println("Ingresa la segunda nota: ");
            nota2 = sacaner.nextDouble();
            double promedio = (nota1 + nota2) / 2;
            System.out.println("El promedio es :" + promedio);
        } catch (InputMismatchException e){
            System.out.println("Error: " + "Debe de ingresaar un numero valido para las notas." + e.getMessage());
        }finally {
            sacaner.close();
        }
    }

}
