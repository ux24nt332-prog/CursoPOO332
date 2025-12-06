package com.mx.curso.ProyectoF.Modelo;

import java.util.ArrayList;

public abstract class CuentaBancaria {

    protected String numeroCuenta;
    protected double saldo;
    protected Cliente propietario;

    protected ArrayList<Transaccion> historial = new ArrayList<>();

    public CuentaBancaria(String numeroCuenta, Cliente propietario, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.propietario = propietario;
        this.saldo = saldoInicial;
    }

    public String getNumeroCuenta() { return numeroCuenta; }
    public double getSaldo() { return saldo; }
    public Cliente getPropietario() { return propietario; }
    public ArrayList<Transaccion> getHistorial() { return historial; }

    public void depositar(double monto) {
        saldo += monto;
        historial.add(new Transaccion("Depósito", monto));
    }

    public abstract boolean retirar(double monto);

    public abstract void aplicarInteresODeduccion();
}

