package com.mx.curso.unidad3.tarea26.Practica3;
import java.util.ArrayList;

abstract class Empleado {

    // Método no estático con implementación
    public void trabajar() {
        System.out.println("El empleado está realizando sus labores.");
    }

    // Método no estático que será sobrescrito
    public void saludar() {
        System.out.println("Hola, soy un empleado del restaurante.");
    }
}

// Subclase Cocinero
class Cocinero extends Empleado {

    @Override
    public void saludar() {
        System.out.println("Hola, soy el cocinero. ¡Listo para preparar deliciosos platillos!");
    }
}

// Subclase Mesero
class Mesero extends Empleado {

    @Override
    public void saludar() {
        System.out.println("Hola, soy el mesero. ¿En qué puedo atenderle hoy?");
    }
}

public class Main {

    public static void main(String[] args) {

        // Lista polimórfica de tipo Empleado
        ArrayList<Empleado> empleados = new ArrayList<>();

        // Agregamos objetos de las subclases
        empleados.add(new Cocinero());
        empleados.add(new Mesero());

        // Iterar sobre la lista y llamar saludar() y trabajar()
        for (Empleado e : empleados) {
            e.saludar();   // Llamada polimórfica
            e.trabajar();  // Llama versión de Empleado (no está sobrescrita)
            System.out.println();
        }
    }

}

