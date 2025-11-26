package com.mx.curso.unidad2.proyecto;

import java.util.Scanner;

public class Tarea25_11_25 {

    // ====== CLASE PADRE (HERENCIA) ======
    static class Cuenta {
        private String titular;   // Encapsulamiento
        private double saldo;

        public Cuenta(String titular) {
            this.titular = titular;
            this.saldo = 0;
        }

        // Getters y Setters (Encapsulamiento)
        public String getTitular() {
            return titular;
        }

        public void setTitular(String titular) {
            this.titular = titular;
        }

        public double getSaldo() {
            return saldo;
        }

        public void depositar(double monto) {
            saldo += monto;
        }

        // Método polimórfico
        public void mostrarInfo() {
            System.out.println("Cuenta genérica de " + titular);
        }
    }

    // ====== CLASE HIJA 1 ======
    static class CuentaAhorro extends Cuenta {

        public CuentaAhorro(String titular) {
            super(titular);
        }

        @Override
        public void mostrarInfo() {
            System.out.println("Cuenta de Ahorro");
            System.out.println("Titular: " + getTitular());
            System.out.println("Saldo: $" + getSaldo());
        }
    }

    // ====== CLASE HIJA 2 ======
    static class CuentaCorriente extends Cuenta {

        public CuentaCorriente(String titular) {
            super(titular);
        }

        @Override
        public void mostrarInfo() {
            System.out.println("Cuenta Corriente");
            System.out.println("Titular: " + getTitular());
            System.out.println("Saldo: $" + getSaldo());
        }
    }

    // ====== MAIN (CONSOLE APP) ======
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== BANCO VIRTUAL ===");

        System.out.print("Ingrese el nombre del titular: ");
        String nombre = sc.nextLine();

        System.out.println("Seleccione el tipo de cuenta:");
        System.out.println("1. Cuenta de Ahorro");
        System.out.println("2. Cuenta Corriente");
        System.out.print("Opción: ");
        int opcion = sc.nextInt();

        Cuenta cuenta;

        if (opcion == 1) {
            cuenta = new CuentaAhorro(nombre);
        } else {
            cuenta = new CuentaCorriente(nombre);
        }

        System.out.print("Ingrese monto a depositar: ");
        double monto = sc.nextDouble();
        cuenta.depositar(monto);

        System.out.println("\n--- INFORMACIÓN DE LA CUENTA ---");
        cuenta.mostrarInfo(); // POLIMORFISMO

        sc.close();
    }
}