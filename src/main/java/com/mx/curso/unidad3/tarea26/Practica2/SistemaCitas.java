package com.mx.curso.unidad3.tarea26.Practica2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemaCitas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Solicitar hora
            System.out.print("Ingrese la hora de la cita (formato 24h): ");
            int hora = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            // Solicitar día
            System.out.print("Ingrese el día de la semana: ");
            String dia = sc.nextLine().toLowerCase();

            // Validar día laboral
            boolean esFinDeSemana = dia.equals("sabado") || dia.equals("sábado") || dia.equals("domingo");

            // IF anidados
            if (hora >= 9 && hora <= 17) {
                if (!esFinDeSemana) {
                    System.out.println("Cita agendada con éxito ✔");
                } else {
                    System.out.println("Error: No se pueden agendar citas en fin de semana ");
                }
            } else {
                System.out.println("Error: La hora debe estar entre 9 y 17 horas ");
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar un número entero para la hora ");
        }

        sc.close();
    }

}
