package com.mx.curso.unidad2.ciclos;

public class AnalizadorDeNumeros {

    static void main(String[] args) {

        int suma = 0;

        for (int i=0; i<100; i++){
            suma += i;
        }
        System.out.println("Las suma de de lis primeros 100 numeros es :" + suma);

        //Encontrar el primer numero mayor a 50

        int num=1;

        while (num<70){
            if (num>50){
                System.out.println("El primer numero mayor a 50 es :" + num);
                break;
            }
            num++;
        }
    }
}
