package com.mx.curso.unidad3.Polimorfismo;
import java.util.List;

public class Test {

    static void main(String[] args) {
        List<Empleado> empleado = List.of(new Cocinero(), new Mesero(), new LabaPlatos());

        /**
         * Creamos un siclo que  itera la lista de empleados
         * e implementa el metodo correspondiente calcularSalario
         */
        for (Empleado e : empleado){
            System.out.println("Salario Empleados: " + e.calcularSalario());
        }
    }
}


