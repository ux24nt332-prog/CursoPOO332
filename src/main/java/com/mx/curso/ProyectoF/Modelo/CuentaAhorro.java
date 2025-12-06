package com.mx.curso.ProyectoF.Modelo;

public class CuentaAhorro extends CuentaBancaria {

    private double tasaInteres; // mensual

    public CuentaAhorro(String numeroCuenta, Cliente propietario, double saldoInicial, double tasaInteres) {
        super(numeroCuenta, propietario, saldoInicial);
        this.tasaInteres = tasaInteres;
    }

    @Override
    public boolean retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            historial.add(new Transaccion("Retiro", monto));
            return true;
        }
        return false;
    }

    @Override
    public void aplicarInteresODeduccion() {
        double interes = saldo * tasaInteres;
        saldo += interes;
        historial.add(new Transaccion("Interés aplicado", interes));
    }
}
