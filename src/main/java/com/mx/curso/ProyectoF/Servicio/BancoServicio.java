package com.mx.curso.ProyectoF.Servicio;

import com.mx.curso.ProyectoF.Modelo.*;

import java.util.HashMap;

public class BancoServicio {

    private HashMap<String, Cliente> clientes = new HashMap<>();
    private HashMap<String, CuentaBancaria> cuentas = new HashMap<>();

    // Crear cliente
    public void crearCliente(String id, String nombre) {
        clientes.put(id, new Cliente(id, nombre));
    }

    public Cliente buscarCliente(String id) {
        return clientes.get(id);
    }

    // Crear cuenta
    public void crearCuentaAhorro(String num, String idCliente, double saldoIni, double tasa) {
        Cliente c = buscarCliente(idCliente);
        if (c != null) {
            CuentaAhorro ca = new CuentaAhorro(num, c, saldoIni, tasa);
            c.agregarCuenta(ca);
            cuentas.put(num, ca);
        }
    }

    public void crearCuentaCheques(String num, String idCliente, double saldoIni, double sobregiro) {
        Cliente c = buscarCliente(idCliente);
        if (c != null) {
            CuentaCheques cc = new CuentaCheques(num, c, saldoIni, sobregiro);
            c.agregarCuenta(cc);
            cuentas.put(num, cc);
        }
    }

    public CuentaBancaria buscarCuenta(String numero) {
        return cuentas.get(numero);
    }

    // Operaciones
    public boolean depositar(String cuenta, double monto) {
        if (monto <= 0) return false;
        CuentaBancaria c = buscarCuenta(cuenta);
        if (c == null) return false;
        c.depositar(monto);
        return true;
    }

    public boolean retirar(String cuenta, double monto) {
        if (monto <= 0) return false;
        CuentaBancaria c = buscarCuenta(cuenta);
        if (c == null) return false;
        return c.retirar(monto);
    }

    public boolean transferir(String origen, String destino, double monto) {
        CuentaBancaria o = buscarCuenta(origen);
        CuentaBancaria d = buscarCuenta(destino);

        if (o == null || d == null) return false;

        if (o.retirar(monto)) {
            d.depositar(monto);
            return true;
        }
        return false;
    }
}
