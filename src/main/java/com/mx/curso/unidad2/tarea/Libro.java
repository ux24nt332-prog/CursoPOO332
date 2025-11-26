package com.mx.curso.unidad2.tarea;

public class Libro {

    // Atributos
    String titulo;
    String autor;
    int paginas;

    // Constructor
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    // Método para mostrar la información
    public void mostrarInfo() {
        System.out.println("===== Información del Libro =====");
        System.out.println("Título : " + titulo);
        System.out.println("Autor  : " + autor);
        System.out.println("Páginas: " + paginas);
        System.out.println("---------------------------------\n");
    }

    // Método MAIN
    public static void main(String[] args) {

        // Crear dos objetos Libro
        Libro libro1 = new Libro("El Principito", "Antoine de Saint-Exupéry", 96);
        Libro libro2 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 417);

        // Mostrar información
        libro1.mostrarInfo();
        libro2.mostrarInfo();
    }

}
