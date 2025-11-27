package com.mx.curso.unidad3.tarea26.Practica2;

import java.util.Scanner;

public class SistemaAutenticacion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Sistema de Autenticación ===");

        // Ciclo con máximo de 3 intentos
        for (int i = 1; i <= 3; i++) {

            System.out.print("Ingrese usuario: ");
            String usuario = sc.nextLine();

            System.out.print("Ingrese contraseña: ");
            String contrasena = sc.nextLine();

            // Verificación con if anidado
            if (usuario.equals("medico1") && contrasena.equals("doc123")) {

                System.out.println("Acceso de Médico exitoso");
                break; // sale del for

            } else if (usuario.equals("enfermera2") && contrasena.equals("enf456")) {

                System.out.println("Acceso de Enfermera exitoso");
                break; // sale del for

            } else {
                System.out.println("Credenciales incorrectas. Intento " + i + " de 3.");
                continue; // pasa al siguiente intento
            }
        }

        System.out.println("Fin del programa.");
    }

}
