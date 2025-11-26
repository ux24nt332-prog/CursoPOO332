package com.mx.curso.unidad2.tarea;

public class CuentaBancaria {

    // Atributo privado
    private double saldo;

    // Constructor que inicializa el saldo
    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Método para depositar dinero
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito realizado: $" + monto);
        } else {
            System.out.println("Error: El monto a depositar debe ser mayor a 0.");
        }
    }

    // Método para retirar dinero
    public void retirar(double monto) {
        if (monto > saldo) {
            System.out.println("Fondos insuficientes. No se puede retirar $" + monto);
        } else if (monto <= 0) {
            System.out.println("Error: El monto a retirar debe ser mayor a 0.");
        } else {
            saldo -= monto;
            System.out.println("Retiro realizado: $" + monto);
        }
    }

    // Método getter para consultar el saldo
    public double getSaldo() {
        return saldo;
    }

    // Método MAIN para probar la clase
    public static void main(String[] args) {

        // Crear una cuenta con saldo inicial
        CuentaBancaria cuenta = new CuentaBancaria(500);

        // Probar métodos
        System.out.println("Saldo inicial: $" + cuenta.getSaldo());

        cuenta.depositar(200);
        System.out.println("Saldo actual: $" + cuenta.getSaldo());

        cuenta.retirar(100);
        System.out.println("Saldo actual: $" + cuenta.getSaldo());

        cuenta.retirar(1000); // Prueba de fondos insuficientes
    }

}
