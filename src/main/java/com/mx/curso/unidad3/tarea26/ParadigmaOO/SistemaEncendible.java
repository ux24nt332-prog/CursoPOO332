package com.mx.curso.unidad3.tarea26.ParadigmaOO;

public class SistemaEncendible {


    // Interfaz Encendible
    public interface Encendible {
        void encender();
        void apagar();
    }


    // Clase no relacionada: TV
    public static class TV implements Encendible {

        @Override
        public void encender() {
            System.out.println("La TV se ha encendido.");
        }

        @Override
        public void apagar() {
            System.out.println("La TV se ha apagado.");
        }
    }


    // Clase no relacionada: Bombilla
    public static class Bombilla implements Encendible {

        @Override
        public void encender() {
            System.out.println("La bombilla está encendida.");
        }

        @Override
        public void apagar() {
            System.out.println("La bombilla está apagada.");
        }
    }


    // MAIN – Demostración con polimorfismo
    public static void main(String[] args) {

        Encendible[] dispositivos = new Encendible[2];

        dispositivos[0] = new TV();
        dispositivos[1] = new Bombilla();

        System.out.println("=== Probando dispositivos encendibles ===");

        for (Encendible e : dispositivos) {
            e.encender();
            e.apagar();
            System.out.println("------------------------");
        }
    }

}
