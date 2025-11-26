package com.mx.curso.unidad2.tarea;

public class AnimalesPolimorfismo {

    // ================================
    // Clase base: Animal
    // ================================
    public static class Animal {
        String sonido;

        public Animal(String sonido) {
            this.sonido = sonido;
        }

        public void hacerSonido() {
            System.out.println("Sonido genérico: " + sonido);
        }
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

        // Arreglo de tipo Animal
        Animal[] animales = new Animal[2];

        // Agregamos un Perro y un Gato
        animales[0] = new Perro();
        animales[1] = new Gato();

        // Recorrer arreglo y llamar método (polimorfismo)
        System.out.println("=== Sonidos de los animales ===");
        for (Animal animal : animales) {
            animal.hacerSonido(); // Cada uno usa su implementación sobrescrita
        }
    }

}
