package com.mx.curso.unidad2.proyecto;

import java.util.Scanner;

public class tareaDel25_4 {

    // Método que valida el email (devuelve true si es válido)
    public static boolean validarEmail(String email) {
        // Validación básica
        if (email.contains("@") && email.contains(".")) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String email;

        // Ciclo do-while para pedir el email hasta que sea válido
        do {
            System.out.print("Ingresa un correo electrónico: ");
            email = sc.nextLine();

            if (!validarEmail(email)) {
                System.out.println("Correo no válido. Intenta nuevamente.\n");
            }

        } while (!validarEmail(email));

        System.out.println("Correo válido registrado: " + email);

        sc.close();
    }

}
