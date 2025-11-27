package com.mx.curso.unidad3.tarea26.ParadigmaOO;

// ===============================
// Clase base Producto
// ===============================
class Producto {
    protected String nombre;
    protected double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarDetalles() {
        System.out.println("Producto: " + nombre + " | Precio: $" + precio);
    }
}

// ===============================
// Clase derivada: Electrónica
// ===============================
class Electronica extends Producto {
    private int garantiaMeses;

    public Electronica(String nombre, double precio, int garantiaMeses) {
        super(nombre, precio);
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Electrónica -> " + nombre +
                " | Precio: $" + precio +
                " | Garantía: " + garantiaMeses + " meses");
    }
}

// ===============================
// Clase derivada: Alimento
// ===============================
class Alimento extends Producto {
    private String fechaDeCaducidad;

    public Alimento(String nombre, double precio, String fechaDeCaducidad) {
        super(nombre, precio);
        this.fechaDeCaducidad = fechaDeCaducidad;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Alimento -> " + nombre +
                " | Precio: $" + precio +
                " | Caduca: " + fechaDeCaducidad);
    }
}

// ===============================
// MAIN
// ===============================
public class Catalogo {
    public static void main(String[] args) {

        // Arreglo de tipo Producto (polimorfismo)
        Producto[] productos = new Producto[3];

        productos[0] = new Electronica("Laptop ASUS", 18500, 24);
        productos[1] = new Alimento("Leche entera", 27.50, "10/12/2025");
        productos[2] = new Electronica("Smartphone Samsung", 9200, 12);

        // Recorrer arreglo y mostrar detalles
        for (Producto p : productos) {
            p.mostrarDetalles();
        }
    }
}