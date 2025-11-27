package com.mx.curso.unidad3.tarea26.ParadigmaOO;
import java.util.ArrayList;

public class Estudiante {
    private String nombre;
    private int id;

    public Estudiante(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }
}

class Clase {
    private String nombreDeClase;
    private ArrayList<Estudiante> estudiantes;

    public Clase(String nombreDeClase) {
        this.nombreDeClase = nombreDeClase;
        this.estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante e) {
        estudiantes.add(e);
    }

    public void mostrarEstudiantes() {
        System.out.println("Estudiantes en la clase " + nombreDeClase + ":");
        for (Estudiante e : estudiantes) {
            System.out.println("- " + e.getNombre() + " (ID: " + e.getId() + ")");
        }
    }
}

 class Main {
    public static void main(String[] args) {

        Clase clase = new Clase("Programación Orientada a Objetos");

        Estudiante e1 = new Estudiante("Christopher", 1);
        Estudiante e2 = new Estudiante("María", 2);
        Estudiante e3 = new Estudiante("Luis", 3);

        clase.agregarEstudiante(e1);
        clase.agregarEstudiante(e2);
        clase.agregarEstudiante(e3);

        clase.mostrarEstudiantes();
    }
}
