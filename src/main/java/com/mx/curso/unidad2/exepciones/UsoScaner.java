package com.mx.curso.unidad2.exepciones;

import java.util.Scanner;

public class UsoScaner {
    static void main(String[] args) {
        int dato=0;
        Scanner scaner = new Scanner(System.in);
        scaner.close();

        try {
            System.out.println("Ingresar dato");
            dato = scaner.nextInt();
        }catch (IllegalArgumentException e){
            System.out.println("Error: dato no leeido, scaner cerrado" + e.getMessage());
        }
    }
}
