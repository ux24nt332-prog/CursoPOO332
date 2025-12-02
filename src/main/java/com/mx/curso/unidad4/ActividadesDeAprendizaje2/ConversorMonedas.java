package com.mx.curso.unidad4.ActividadesDeAprendizaje2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConversorMonedas extends JFrame {

    public ConversorMonedas() {
        // Título
        setTitle("Conversor de Monedas");

        // Tamaño de la ventana
        setSize(300, 150);

        // Cerrar al salir
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Layout
        setLayout(new FlowLayout());

        // Crear componentes
        JLabel labelPesos = new JLabel("Pesos MXN:");
        JTextField txtPesos = new JTextField(10);

        JButton btnConvertir = new JButton("Convertir");

        JLabel labelResultado = new JLabel("Dólares USD: —");

        // Acción del botón
        btnConvertir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double pesos = Double.parseDouble(txtPesos.getText());
                    double dolares = pesos * 0.054;  // Tipo de cambio aproximado

                    labelResultado.setText("Dólares USD: " + String.format("%.2f", dolares));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null,
                            "Por favor, ingresa un número válido.",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Agregar componentes a la ventana
        add(labelPesos);
        add(txtPesos);
        add(btnConvertir);
        add(labelResultado);

        // Hacer visible la ventana
        setVisible(true);
    }

    public static void main(String[] args) {
        new ConversorMonedas();
    }
}