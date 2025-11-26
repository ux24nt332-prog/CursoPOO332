package com.mx.curso.unidad2.tarea;

public class Animal {

    // ================================
    // Clase base: Animal
    // ================================
        String sonido;

        public Animal(String sonido) {
            this.sonido = sonido;
        }

        // Método que será sobrescrito
        public void hacerSonido() {
            System.out.println("Sonido genérico: " + sonido);
        }


    // ================================
    // Clase derivada: Perro
    // ================================
    public static class Perro extends Animal {

        public Perro() {
            super("Guau");
        }

        @Override
        public void hacerSonido() {
            System.out.println("El perro hace: Guau");
        }
    }

    // ================================
    // Clase derivada: Gato
    // ================================
    public static class Gato extends Animal {

        public Gato() {
            super("Miau");
        }

        @Override
        public void hacerSonido() {
            System.out.println("El gato hace: Miau");
        }
    }

    // ================================
    // MAIN
    // ================================
    public static void main(String[] args) {

        Animal perro = new Perro();
        Animal gato = new Gato();

        perro.hacerSonido();
        gato.hacerSonido();
    }

}
