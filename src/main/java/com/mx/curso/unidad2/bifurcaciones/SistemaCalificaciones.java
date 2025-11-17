package com.mx.curso.unidad2.bifurcaciones;

public class SistemaCalificaciones {

    static void main(String[] args) {

        int notaexamen = 92;

        if (notaexamen < 0 || notaexamen > 100){
            System.out.println("Error: la nota debe estar entre 0 y 100.");
            return;
        }
        if (notaexamen >= 60){
            System.out.println("felicidades, tu aprobaste");

            if (notaexamen >= 90){
                System.out.println("Exelente");
            }
        }else{
            System.out.println("Lo intentaste");
        }

        char calificacion;

        switch (notaexamen/10){
            case 10:
            case 9:
                calificacion = 'A';
                break;
            case 8:
                calificacion = 'B';
                break;
            case 7:
                calificacion = 'C';
                break;
            case 6:
                calificacion = 'D';
                break;
            default:
                calificacion = 'f';
        }

        System.out.println("tu calificacion es: " + calificacion);
    }

}
