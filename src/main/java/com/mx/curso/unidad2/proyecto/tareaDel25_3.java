package com.mx.curso.unidad2.proyecto;

import java.util.Scanner;  // ✔ Import en lugar correcto
public class tareaDel25_3 {




        public static class TrazabilidadPedido {

            public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                String estado = ""; // Estado inicial vacío

                System.out.println("=== SISTEMA DE TRAZABILIDAD DE PEDIDO ===");
                System.out.println("Estados posibles: Procesando, En camino, Error en envío, Entregado\n");

                // El ciclo continúa mientras NO sea "Entregado"
                while (!estado.equalsIgnoreCase("Entregado")) {

                    System.out.print("Ingresa el estado actual del pedido: ");
                    estado = sc.nextLine();

                    // Condicionales anidados
                    if (estado.equalsIgnoreCase("En camino")) {

                        System.out.println("El pedido sigue en camino... avanzando al siguiente registro.\n");
                        continue; // Salta esta iteración y pide el siguiente estado

                    } else if (estado.equalsIgnoreCase("Error en envío")) {

                        System.out.println("¡Error detectado en el envío! Deteniendo proceso.");
                        break; // Termina el ciclo inmediatamente

                    } else if (estado.equalsIgnoreCase("Procesando")) {

                        System.out.println("El pedido está siendo procesado...\n");

                    } else if (estado.equalsIgnoreCase("Entregado")) {

                        System.out.println("El pedido ha sido entregado con éxito.");

                    } else {

                        System.out.println("Estado no reconocido. Intenta de nuevo.\n");
                    }
                }

                System.out.println("\n--- FIN DEL SISTEMA ---");
                sc.close();
            }
        }

}
