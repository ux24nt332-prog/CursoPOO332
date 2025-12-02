package com.mx.curso.unidad4.ActividadesDeAprendizaje;

import javax.swing.JFrame;

public class MiPrimeraVentana {

    public static void main(String[] args) {

        // Crear la ventana
        JFrame ventana = new JFrame();

        // Establecer el título
        ventana.setTitle("Mi Primera Ventana");

        // Definir el tamaño (ancho, alto)
        ventana.setSize(400, 300);

        // Hacer visible la ventana
        ventana.setVisible(true);

        // Cerrar el programa al cerrar la ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
