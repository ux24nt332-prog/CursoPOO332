package com.mx.curso.unidad2.mdelado;

public class Machine {

    static void main(String[] args) {
        PC pc = new PC();
        pc.setNumPuertos(8);
        pc.setTipoPC("Ecritorio");
        System.out.println("Numero de puertos:" + pc.getNumPuertos());
        System.out.println("Tipo de PC:" + pc.getTipoPC());
    }
}
