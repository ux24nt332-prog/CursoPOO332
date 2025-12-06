package com.mx.curso.ProyectoF.Controlador;

import com.mx.curso.ProyectoF.Modelo.CuentaBancaria;
import com.mx.curso.ProyectoF.Modelo.Transaccion;
import com.mx.curso.ProyectoF.Servicio.BancoServicio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BancoServicio banco = new BancoServicio();

        int opcion;

        do {
            System.out.println("\n===== BANCO UX =====");
            System.out.println("1. Crear cliente");
            System.out.println("2. Crear cuenta de ahorro");
            System.out.println("3. Crear cuenta de cheques");
            System.out.println("4. Depositar");
            System.out.println("5. Retirar");
            System.out.println("6. Transferir");
            System.out.println("7. Consultar estado de cuenta");
            System.out.println("8. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1 -> {
                    System.out.print("ID Cliente: ");
                    String id = sc.next();
                    System.out.print("Nombre: ");
                    String nombre = sc.next();
                    banco.crearCliente(id, nombre);
                }

                case 2 -> {
                    System.out.print("Número cuenta: ");
                    String num = sc.next();
                    System.out.print("ID Cliente: ");
                    String id = sc.next();
                    System.out.print("Saldo inicial: ");
                    double saldo = sc.nextDouble();
                    banco.crearCuentaAhorro(num, id, saldo, 0.02);
                }

                case 3 -> {
                    System.out.print("Número cuenta: ");
                    String num = sc.next();
                    System.out.print("ID Cliente: ");
                    String id = sc.next();
                    System.out.print("Saldo inicial: ");
                    double saldo = sc.nextDouble();
                    banco.crearCuentaCheques(num, id, saldo, 500);
                }

                case 4 -> {
                    System.out.print("Cuenta: ");
                    String cta = sc.next();
                    System.out.print("Monto: ");
                    double monto = sc.nextDouble();
                    banco.depositar(cta, monto);
                }

                case 5 -> {
                    System.out.print("Cuenta: ");
                    String cta = sc.next();
                    System.out.print("Monto: ");
                    double monto = sc.nextDouble();
                    banco.retirar(cta, monto);
                }

                case 6 -> {
                    System.out.print("Cuenta origen: ");
                    String o = sc.next();
                    System.out.print("Cuenta destino: ");
                    String d = sc.next();
                    System.out.print("Monto: ");
                    double m = sc.nextDouble();
                    banco.transferir(o, d, m);
                }

                case 7 -> {
                    System.out.print("Cuenta: ");
                    String cta = sc.next();
                    CuentaBancaria c = banco.buscarCuenta(cta);
                    if (c != null) {
                        System.out.println("\n--- Estado de cuenta ---");
                        System.out.println("Saldo: $" + c.getSaldo());
                        System.out.println("Historial:");
                        for (Transaccion t : c.getHistorial()) {
                            System.out.println(t);
                        }
                    }
                }

                case 8 -> System.out.println("Saliendo...");

                default -> System.out.println("Opción inválida");
            }

        } while (opcion != 8);
    }
}
