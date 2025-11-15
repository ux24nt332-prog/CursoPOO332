package com.mx.curso.unidad2.ciclos;

public class ProcesadorDeListas {

    static void main(String[] args) {

        String[] frutas = {"Platano", "Granada", "Guayaba", "Pitaya", "Kiwi"};

        for (int i=0; i<frutas.length; i++){
            System.out.println("Nombre de la fruta :" + frutas[i]);
        }

        int indice=0;

        while (indice<frutas.length){
            if(frutas[indice].equals("Kiwi")){
                System.out.println("Fruta encontrada: " + frutas[indice]);
                break;
            }
            indice++;
        }

    }

}
