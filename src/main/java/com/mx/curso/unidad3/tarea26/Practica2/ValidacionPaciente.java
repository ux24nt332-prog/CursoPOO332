package com.mx.curso.unidad3.tarea26.Practica2;

import java.util.Scanner;

public class ValidacionPaciente {

    // Método que valida si un ID es de 5 dígitos
    public static boolean validarIDPaciente(int id) {
        // Un ID válido debe estar entre 10000 y 99999
        if (id >= 10000 && id <= 99999) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int idPaciente;
        boolean esValido;

        // Ciclo do-while para solicitar ID hasta que sea válido
        do {
            System.out.print("Ingrese el ID del paciente (5 dígitos): ");

            // Validar que el usuario realmente escriba un número
            while (!sc.hasNextInt()) {
                System.out.println("Entrada inválida. Debe ser un número entero.");
                sc.next(); // limpiar entrada incorrecta
                System.out.print("Ingrese el ID del paciente nuevamente: ");
            }

            idPaciente = sc.nextInt();

            esValido = validarIDPaciente(idPaciente);

            if (!esValido) {
                System.out.println("ID inválido. Debe tener exactamente 5 dígitos.\n");
            }

        } while (!esValido);

        System.out.println("✔ ID válido. Registro completado para el paciente #" + idPaciente);
        sc.close();
    }

}
