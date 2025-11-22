package com.mx.curso.unidad2.exepciones;

public class ConversorDeObjetos {
    static void main(String[] args) {
        Object objeto ="ux";

        try{
            Integer numero = (Integer) objeto;
        }catch (ClassCastException e){
            System.out.println("No es pocible combertir un tipo de bjeto al tipo deseado" + e.getMessage());
        }
    }
}
