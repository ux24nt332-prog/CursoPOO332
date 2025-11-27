package com.mx.curso.unidad3.tarea26.ParadigmaOO;

public class Empleados {

    // Atributos privados (encapsulamiento)
    private int id;
    private double salario;

    // Constructor
    public Empleados(int id, double salario) {
        this.id = id;
        this.salario = salario;
    }

    // Método para aumentar el salario según porcentaje
    public void aumentarSalario(double porcentaje) {
        salario += salario * (porcentaje / 100);
    }

    // Getter del salario (solo lectura)
    public double getSalario() {
        return salario;
    }

    // MAIN para probar funcionamiento
    public static void main(String[] args) {

        Empleados emp = new Empleados(101, 10000.0);

        System.out.println("Salario inicial: " + emp.getSalario());

        emp.aumentarSalario(10); // aumenta 10%
        System.out.println("Salario después del aumento: " + emp.getSalario());
    }

}
