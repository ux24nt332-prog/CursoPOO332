package com.mx.curso.unidad2.exepciones;

import java.util.Scanner;

public class ValidadorEdad {

    static void main(String[] args) {
        int edad = 0;
        Scanner scaner = new Scanner(System.in);

        try{
            System.out.println("ingresa tu edad");
            edad = Integer.parseInt(scaner.nextLine());
            validarEdad(edad);
            System.out.println("Tu edad es: " + edad);
        }catch (IllegalArgumentException e) {
            System.out.println("Edad NO valida" + e.getMessage());
        }
    }
    public static void validarEdad(int edad) throws  IllegalArgumentException {
        if (edad < 0 || edad > 120){
            throw  new IllegalArgumentException("Edad no valida" + edad);
        }
    }
}
