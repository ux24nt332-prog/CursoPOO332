package com.mx.curso.unidad2.proyecto;

import java.util.Scanner;


public class tareaDel25_5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== SISTEMA DE AUTENTICACIÓN ===\n");

        boolean autenticado = false;

        // Ciclo for con máximo de 3 intentos
        for (int i = 1; i <= 3; i++) {

            System.out.print("Ingresa el usuario: ");
            String usuario = sc.nextLine();

            System.out.print("Ingresa la contraseña: ");
            String password = sc.nextLine();

            // IF anidado
            if (usuario.equals("admin")) {

                if (password.equals("pass123")) {
                    System.out.println("\n✔ Autenticación exitosa. Bienvenido.");
                    autenticado = true;
                    break;  // Salir del ciclo
                } else {
                    System.out.println("✖ Contraseña incorrecta.\n");
                }

            } else {
                System.out.println("Usuario no encontrado.\n");
            }
        }

        // Si no logró autenticarse en los 3 intentos
        if (!autenticado) {
            System.out.println("Demasiados intentos. Acceso denegado.");
        }

        sc.close();
    }

}
