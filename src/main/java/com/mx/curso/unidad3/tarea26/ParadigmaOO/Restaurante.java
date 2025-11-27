package com.mx.curso.unidad3.tarea26.ParadigmaOO;

public class Restaurante {
    // Atributos
    String nombre;
    String tipoDeComida;
    int calificacion;

    // Constructor
    public Restaurante(String nombre, String tipoDeComida, int calificacion) {
        this.nombre = nombre;
        this.tipoDeComida = tipoDeComida;
        this.calificacion = calificacion;
    }

    // Método abrir
    public void abrir() {
        System.out.println("El restaurante " + nombre + " está abierto. Tipo: "
                + tipoDeComida + " | Calificación: " + calificacion + "/5");
    }

    // Método main
    public static void main(String[] args) {

        // Crear objetos
        Restaurante r1 = new Restaurante("La Parrilla", "Cortes de carne", 5);
        Restaurante r2 = new Restaurante("SushiZen", "Comida japonesa", 4);

        // Llamar métodos
        r1.abrir();
        r2.abrir();
    }
}
