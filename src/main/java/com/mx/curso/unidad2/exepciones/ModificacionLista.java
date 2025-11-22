package com.mx.curso.unidad2.exepciones;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

public class ModificacionLista {
    static void main(String[] args) {
        List<Integer> Lista = new ArrayList<>();
        Lista.add(1);
        Lista.add(2);
        Lista.add(3);

        try{
            for (Integer numero : Lista){
                Lista.remove(numero);
            }
        } catch (ConcurrentModificationException e){
            System.out.println("No se puede modificar una lista mientras se intera con for each");
        }
    }
}
