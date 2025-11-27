package com.mx.curso.unidad3.tarea26.ParadigmaOO;

public class returnyConstructores {

    // Atributo privado
    private double radio;

    // Constructor
    public returnyConstructores(double radio) {
        this.radio = radio;
    }

    // Método para calcular el área del círculo
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    // Método para calcular circunferencia
    public double calcularCircunferencia() {
        return 2 * Math.PI * radio;
    }

    // MAIN
    public static void main(String[] args) {

        returnyConstructores c = new returnyConstructores(5);

        double area = c.calcularArea();
        double circunferencia = c.calcularCircunferencia();

        System.out.println("Área del círculo: " + area);
        System.out.println("Circunferencia del círculo: " + circunferencia);
    }
}