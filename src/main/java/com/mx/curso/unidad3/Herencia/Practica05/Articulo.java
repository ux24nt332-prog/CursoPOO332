package com.mx.curso.unidad3.Herencia.Practica05;

public class Articulo {

    // Atributos privados
    private String codigo;
    private int cantidadStock;
    private double precioUnitario;

    // Constructor mínimo
    public Articulo(String codigo) {
        this.codigo = codigo;
        this.cantidadStock = 0;
        this.precioUnitario = 1.0;
    }

    // Constructor completo (sobrecarga)
    public Articulo(String codigo, int cantidadStock, double precioUnitario) {
        this.codigo = codigo;
        this.cantidadStock = cantidadStock;
        this.precioUnitario = precioUnitario;
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    // Setter con validación
    public void setCantidadStock(int nuevaCantidad) {
        if (nuevaCantidad >= 0) {
            this.cantidadStock = nuevaCantidad;
        } else {
            System.out.println("Error: La cantidad debe ser mayor o igual a 0.");
        }
    }
}

