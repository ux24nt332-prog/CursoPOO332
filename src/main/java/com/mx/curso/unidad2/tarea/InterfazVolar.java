package com.mx.curso.unidad2.tarea;

public class InterfazVolar {

    // =====================================
    // Interfaz
    // =====================================
    public interface PuedeVolar {
        void volar(); // método abstracto
    }

    // =====================================
    // Clase 1: Avión
    // =====================================
    public static class Avion implements PuedeVolar {

        @Override
        public void volar() {
            System.out.println("El avión enciende sus motores y despega.");
        }
    }

    // =====================================
    // Clase 2: Pájaro
    // =====================================
    public static class Pajaro implements PuedeVolar {

        @Override
        public void volar() {
            System.out.println("El pájaro bate sus alas y comienza a volar.");
        }
    }

    // =====================================
    // MAIN
    // =====================================
    public static void main(String[] args) {

        // Arreglo de la interfaz
        PuedeVolar[] objetosQueVuelan = new PuedeVolar[2];

        objetosQueVuelan[0] = new Avion();
        objetosQueVuelan[1] = new Pajaro();

        // Recorrer e invocar el método volar() (polimorfismo)
        System.out.println("=== Objetos que pueden volar ===");
        for (PuedeVolar obj : objetosQueVuelan) {
            obj.volar();
        }
    }

}
