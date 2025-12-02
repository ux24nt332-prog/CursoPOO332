package com.mx.curso.unidad4.ActividadesDeAprendizaje;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormularioRegistro {
    public static void main(String[] args) {

        // Crear ventana
        JFrame ventana = new JFrame("Formulario de Registro");
        ventana.setSize(350, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Layout
        ventana.setLayout(new GridLayout(3, 2, 10, 10));

        // Componentes
        JLabel lblNombre = new JLabel("Nombre:");
        JTextField txtNombre = new JTextField();

        JLabel lblEmail = new JLabel("Email:");
        JTextField txtEmail = new JTextField();

        JButton btnRegistrar = new JButton("Registrar");

        // Agregar componentes
        ventana.add(lblNombre);
        ventana.add(txtNombre);

        ventana.add(lblEmail);
        ventana.add(txtEmail);

        ventana.add(new JLabel()); // Espacio vacío
        ventana.add(btnRegistrar);

        // Acción del botón
        btnRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String nombre = txtNombre.getText().trim();
                String email = txtEmail.getText().trim();

                // Validar campos vacíos
                if (nombre.isEmpty() || email.isEmpty()) {
                    JOptionPane.showMessageDialog(
                            ventana,
                            "Por favor llena todos los campos.",
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                    );
                    return;
                }

                // Mostrar mensaje de bienvenida
                JOptionPane.showMessageDialog(
                        ventana,
                        "¡Bienvenido, " + nombre + "!",
                        "Registro Exitoso",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        });

        // Mostrar ventana
        ventana.setVisible(true);
    }
}
