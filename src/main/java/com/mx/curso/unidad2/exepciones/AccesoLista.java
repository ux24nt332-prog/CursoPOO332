package com.mx.curso.unidad2.exepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AccesoLista {
    static void main(String[] args) {
        int[] arr = {1,2,3} ;
        Scanner scanner = new Scanner(System.in);
        int dato =0;
        try {
            System.out.println("Pocicion para consultar: ");
            dato = scanner.nextInt();
            System.out.println(arr [dato]);
        }catch (InputMismatchException e){
            System.out.println("Erorr: pocicion fuera de los limites");
        }finally {
            scanner.close();
        }
    }
}
