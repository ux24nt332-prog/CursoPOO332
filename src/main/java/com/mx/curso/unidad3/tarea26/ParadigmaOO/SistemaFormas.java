package com.mx.curso.unidad3.tarea26.ParadigmaOO;

public class SistemaFormas {


    // Clase base: Forma
    public static class Forma {

        public double calcularArea() {
            return 0; // área genérica
        }
    }


    // Clase derivada: Circulo
    public static class Circulo extends Forma {

        double radio;

        public Circulo(double radio) {
            this.radio = radio;
        }

        @Override
        public double calcularArea() {
            return Math.PI * radio * radio;
        }
    }


    // Clase derivada: Rectangulo
    public static class Rectangulo extends Forma {

        double base;
        double altura;

        public Rectangulo(double base, double altura) {
            this.base = base;
            this.altura = altura;
        }

        @Override
        public double calcularArea() {
            return base * altura;
        }
    }


    // MAIN — Demostración de polimorfismo
    public static void main(String[] args) {

        // Arreglo de tipo Forma
        Forma[] formas = new Forma[2];

        formas[0] = new Circulo(5);         // Radio 5
        formas[1] = new Rectangulo(4, 6);   // Base 4, Altura 6

        // Recorrer el arreglo y mostrar áreas
        System.out.println("=== Áreas Calculadas ===");

        for (Forma f : formas) {
            System.out.println("Área: " + f.calcularArea());
        }
    }

}
