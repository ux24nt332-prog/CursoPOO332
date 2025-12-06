package com.mx.curso.ProyectoF.Modelo;

public class CuentaCheques extends CuentaBancaria {

    private double limiteSobregiro;

    public CuentaCheques(String numeroCuenta, Cliente propietario, double saldoInicial, double limiteSobregiro) {
        super(numeroCuenta, propietario, saldoInicial);
        this.limiteSobregiro = limiteSobregiro;
    }

    @Override
    public boolean retirar(double monto) {
        if (saldo + limiteSobregiro >= monto) {
            saldo -= monto;
            historial.add(new Transaccion("Retiro", monto));
            return true;
        }
        return false;
    }

    @Override
    public void aplicarInteresODeduccion() {
        // No aplica interés, pero podría cobrar comisiones en una versión avanzada
    }
}
