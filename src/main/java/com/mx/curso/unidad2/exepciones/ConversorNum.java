package com.mx.curso.unidad2.exepciones;

import java.util.Scanner;

public class ConversorNum {
    static void main(String[] args) {
        String text ="";
        Scanner scaner = new Scanner(System.in);
        try{
            System.out.println("ingresar un texto");
            text = scaner.nextLine();
            int numero = Integer.parseInt(text);
            System.out.println("Numero "+ numero);
        }catch (NumberFormatException e){
            System.out.println("El texto no es valido");
        }
    }
}
