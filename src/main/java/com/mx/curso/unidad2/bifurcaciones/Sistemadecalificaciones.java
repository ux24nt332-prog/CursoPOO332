package com.mx.curso.unidad2.bifurcaciones;

public class Sistemadecalificaciones {

    static void main(String[] args) {

        int notExamen = 85;

        if(notExamen <0){
            System.out.println("Solo numeros pocitivos");
        }

        if(notExamen >= 60){
            System.out.println("Felicidades");
            if(notExamen>=90){
                System.out.println("Exelente");
            }
        }else {
            System.out.println("Lo siento mucho");
        }

        switch (notExamen){
            case 90:
                System.out.println("calif:A");
                break;
            case 80:
                System.out.println("calif:B");
                break;
            case 70:
                System.out.println("calif:C");
                break;
            case 60:
                System.out.println("calif:D");
                break;
            case 50:
                System.out.println("calif:E");
                break;
        }

    }

}
