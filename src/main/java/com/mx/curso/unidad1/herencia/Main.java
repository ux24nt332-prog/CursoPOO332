package com.mx.curso.unidad1.herencia;

public class Main {

    static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Christopher");
        System.out.println("Nombre:" + persona.getNombre());

        //objeto clase CAR
        CAR car = new CAR();
        car.setNumerollantas(4);
        car.setTipoluses("LED");
        System.out.println("Num Llantas:" + car.getNumerollantas());
        System.out.println("Tipo Luces:" + car.getTipoluses());
    }


}
