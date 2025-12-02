package com.mx.curso.unidad3.Herencia.Practica03;

public class CalculadoraGeometrica {

    private String nombreFogura;
    public static double PI = Math.PI;

    public CalculadoraGeometrica(){
        this.nombreFogura = "descocnocida";
    }

    public CalculadoraGeometrica(String nombreFogura){
        this.nombreFogura = nombreFogura;
    }

    public String getNombreFogura() {
        return nombreFogura;
    }

    public double calcularArea(double radio){
        return PI * radio * radio;
    }

    public double calcularArea(double ancho, double alto){
        return ancho * alto;
    }

    public double calcularArea(double base, int altura){
        return (base * altura) / 2;
    }

    public static void main(String[] args) {
        CalculadoraGeometrica cal1 = new CalculadoraGeometrica("Principal");

        System.out.println("Area del circulo: " + cal1.calcularArea(5));

        System.out.println("Area del rectangulo: " + cal1.calcularArea(4, 6));

        System.out.println("Area del Triangulo: " + cal1.calcularArea(12, 18));

        System.out.println("*****************************************************");


        CalculadoraGeometrica cal2 = new CalculadoraGeometrica("Principal");

        System.out.println("Area Circulo New: " + cal2.calcularArea(12));

        System.out.println("Area Rectangulo New: " + cal2.calcularArea(7, 12));

        System.out.println("Area Triangulo: " + cal2.calcularArea(10, 20));


    }

}
