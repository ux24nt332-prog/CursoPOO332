package com.mx.curso.unidad3.tarea26.Practica2;

import java.util.Scanner;

public class SistemaNotificaciones {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String estado = "";

        // Ciclo while que se ejecuta hasta que el estado sea "Listo para revisión"
        while (!estado.equalsIgnoreCase("Listo para revisión")) {

            System.out.print("Ingrese el estado de los resultados: ");
            estado = sc.nextLine();

            switch (estado) {

                case "En proceso":
                    System.out.println("→ El resultado sigue en proceso. Continuando...\n");
                    continue; // Pasa a la siguiente iteración

                case "Error en muestra":
                    System.out.println("Error detectado en la muestra. Proceso detenido.");
                    break; // Sale del switch, pero también rompe el while
                case "Listo para revisión":
                    System.out.println("Los resultados están listos para revisión.");
                    break;

                default:
                    System.out.println("Estado no reconocido. Inténtelo nuevamente.\n");
                    continue;
            }

            // Si llega aquí por "Error en muestra", terminamos el ciclo
            if (estado.equals("Error en muestra")) {
                break;
            }
        }

        sc.close();
    }

}
