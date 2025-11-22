package com.mx.curso.unidad2.control;

public class RecetaCocina {

    static void main(String[] args) {
        int ingredientesPreparados = 0;
        int tiempoDeCocina = 0;

        System.out.println("paso 1: Prepearar los ingredientes");
        System.out.println(ingredientesPreparados++);
        System.out.println("Agregar Ingredientes al Platillo");
        System.out.println(ingredientesPreparados++);

        System.out.println("Paso 2: Cocina platillo");
        System.out.println(tiempoDeCocina++);
    }

}
