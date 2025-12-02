package com.mx.curso.unidad4.ActividadesDeAprendizaje;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraBasica {

    public static void main(String[] args) {

        // Crear ventana
        JFrame ventana = new JFrame("Calculadora Básica");
        ventana.setSize(400, 250);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new GridLayout(5, 2, 10, 10));

        // Componentes
        JLabel lblNum1 = new JLabel("Número 1:");
        JTextField txtNum1 = new JTextField();

        JLabel lblNum2 = new JLabel("Número 2:");
        JTextField txtNum2 = new JTextField();

        JButton btnSuma = new JButton("Sumar");
        JButton btnResta = new JButton("Restar");
        JButton btnMultiplicar = new JButton("Multiplicar");
        JButton btnDividir = new JButton("Dividir");

        JLabel lblResultado = new JLabel("Resultado: ");

        // Agregar componentes a la ventana
        ventana.add(lblNum1);
        ventana.add(txtNum1);

        ventana.add(lblNum2);
        ventana.add(txtNum2);

        ventana.add(btnSuma);
        ventana.add(btnResta);

        ventana.add(btnMultiplicar);
        ventana.add(btnDividir);

        ventana.add(new JLabel()); // Espacio vacío
        ventana.add(lblResultado);

        // Función para obtener números y validar
        ActionListener operacion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Validar que los campos no estén vacíos
                    if (txtNum1.getText().trim().isEmpty() || txtNum2.getText().trim().isEmpty()) {
                        JOptionPane.showMessageDialog(ventana, "Por favor ingresa ambos números.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    double n1 = Double.parseDouble(txtNum1.getText().trim());
                    double n2 = Double.parseDouble(txtNum2.getText().trim());
                    double resultado = 0;

                    // Saber qué botón se presionó
                    if (e.getSource() == btnSuma) {
                        resultado = n1 + n2;
                    } else if (e.getSource() == btnResta) {
                        resultado = n1 - n2;
                    } else if (e.getSource() == btnMultiplicar) {
                        resultado = n1 * n2;
                    } else if (e.getSource() == btnDividir) {

                        if (n2 == 0) {
                            JOptionPane.showMessageDialog(ventana, "No se puede dividir entre cero.", "Error", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        resultado = n1 / n2;
                    }

                    // Mostrar resultado
                    lblResultado.setText("Resultado: " + resultado);

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(ventana, "Ingresa valores numéricos válidos.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        };

        // Asignar listener a los botones
        btnSuma.addActionListener(operacion);
        btnResta.addActionListener(operacion);
        btnMultiplicar.addActionListener(operacion);
        btnDividir.addActionListener(operacion);

        // Mostrar ventana
        ventana.setVisible(true);
    }

}
