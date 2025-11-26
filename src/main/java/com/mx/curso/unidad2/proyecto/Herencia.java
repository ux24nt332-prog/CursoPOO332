package com.mx.curso.unidad2.proyecto;

public class Herencia {

    public static abstract class FiguraGeometrica {
        protected String nombre;

        public FiguraGeometrica(String nombre) {
            this.nombre = nombre;
        }

        public void mostrarNombre() {
            System.out.println("Figura: " + nombre);
        }

        public abstract double calcularArea();
    }

    // ================================
    // Clase hija 1: CÍRCULO
    // ================================
    public static class Circulo extends FiguraGeometrica {
        private double radio;

        public Circulo(double radio) {
            super("Círculo");
            this.radio = radio;
        }

        @Override
        public double calcularArea() {
            return Math.PI * radio * radio;
        }
    }

    // ================================
    // Clase hija 2: RECTÁNGULO
    // ================================
    public static class Rectangulo extends FiguraGeometrica {
        private double base;
        private double altura;

        public Rectangulo(double base, double altura) {
            super("Rectángulo");
            this.base = base;
            this.altura = altura;
        }

        @Override
        public double calcularArea() {
            return base * altura;
        }
    }

    // ================================
    // MÉTODO MAIN
    // ================================
    public static void main(String[] args) {

        // Polimorfismo: una lista de la clase padre con objetos hijos
        FiguraGeometrica[] figuras = new FiguraGeometrica[2];

        figuras[0] = new Circulo(5);      // Radio = 5
        figuras[1] = new Rectangulo(4, 6); // Base = 4, Altura = 6

        // Recorrer todas las figuras
        for (FiguraGeometrica figura : figuras) {
            figura.mostrarNombre();
            System.out.println("Área: " + figura.calcularArea());
            System.out.println("----------------------");
        }
    }

}
