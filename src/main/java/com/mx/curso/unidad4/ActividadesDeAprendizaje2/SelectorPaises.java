package com.mx.curso.unidad4.ActividadesDeAprendizaje2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectorPaises extends JFrame {

    public SelectorPaises() {

        setTitle("Selector de Países");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Etiqueta inicial
        JLabel labelSeleccion = new JLabel("País seleccionado: —");

        // Opciones del ComboBox
        String[] paises = {
                "México",
                "Argentina",
                "Colombia",
                "Estados Unidos",
                "España"
        };

        JComboBox<String> comboPaises = new JComboBox<>(paises);

        // Evento al seleccionar un país
        comboPaises.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pais = (String) comboPaises.getSelectedItem();
                labelSeleccion.setText("País seleccionado: " + pais);
            }
        });

        // Agregar componentes
        add(comboPaises);
        add(labelSeleccion);

        // Hacer visible
        setVisible(true);
    }

    public static void main(String[] args) {
        new SelectorPaises();
    }
}