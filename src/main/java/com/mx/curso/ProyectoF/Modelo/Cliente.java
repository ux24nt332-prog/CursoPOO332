package com.mx.curso.ProyectoF.Modelo;

import java.util.ArrayList;

public class Cliente {
    private String idCliente;
    private String nombre;
    private ArrayList<CuentaBancaria> cuentas = new ArrayList<>();

    public Cliente(String idCliente, String nombre) {
        this.idCliente = idCliente;
        this.nombre = nombre;
    }

    public String getIdCliente() { return idCliente; }
    public String getNombre() { return nombre; }
    public ArrayList<CuentaBancaria> getCuentas() { return cuentas; }

    public void agregarCuenta(CuentaBancaria cuenta) {
        cuentas.add(cuenta);
    }
}
