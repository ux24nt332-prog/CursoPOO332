package com.mx.curso.unidad4.ActividadesDeAprendizaje2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraCientifica extends JFrame {

    private JTextField campo1, campo2, campoResultado;

    public CalculadoraCientifica() {
        setTitle("Calculadora Científica");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // TabbedPane
        JTabbedPane pestañas = new JTabbedPane();
        pestañas.add("Básica", panelBasico());
        pestañas.add("Científica", panelCientifico());

        add(pestañas);
        setVisible(true);
    }

    // -------------------------
    // PANEL OPERACIONES BÁSICAS
    // -------------------------
    private JPanel panelBasico() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2, 5, 5));

        campo1 = new JTextField();
        campo2 = new JTextField();
        campoResultado = new JTextField();
        campoResultado.setEditable(false);

        JButton btnSuma = new JButton("Suma");
        JButton btnResta = new JButton("Resta");
        JButton btnMult = new JButton("Multiplicación");
        JButton btnDiv = new JButton("División");

        panel.add(new JLabel("Número 1:"));
        panel.add(campo1);
        panel.add(new JLabel("Número 2:"));
        panel.add(campo2);
        panel.add(new JLabel("Resultado:"));
        panel.add(campoResultado);

        panel.add(btnSuma);
        panel.add(btnResta);
        panel.add(btnMult);
        panel.add(btnDiv);

        // Eventos Básicos
        btnSuma.addActionListener(e -> calcularBasico("+"));
        btnResta.addActionListener(e -> calcularBasico("-"));
        btnMult.addActionListener(e -> calcularBasico("*"));
        btnDiv.addActionListener(e -> calcularBasico("/"));

        return panel;
    }

    private void calcularBasico(String op) {
        try {
            double n1 = Double.parseDouble(campo1.getText());
            double n2 = Double.parseDouble(campo2.getText());
            double resultado = 0;

            switch (op) {
                case "+": resultado = n1 + n2; break;
                case "-": resultado = n1 - n2; break;
                case "*": resultado = n1 * n2; break;
                case "/":
                    if (n2 == 0) {
                        JOptionPane.showMessageDialog(this, "No se puede dividir entre cero");
                        return;
                    }
                    resultado = n1 / n2;
                    break;
            }

            campoResultado.setText(String.valueOf(resultado));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese números válidos");
        }
    }

    // ----------------------------
    // PANEL OPERACIONES CIENTÍFICAS
    // ----------------------------
    private JPanel panelCientifico() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 5, 5));

        JTextField campoCientifico = new JTextField();
        JTextField campoResultadoCient = new JTextField();
        campoResultadoCient.setEditable(false);

        JButton btnSin = new JButton("sin()");
        JButton btnCos = new JButton("cos()");
        JButton btnLog = new JButton("log()");
        JButton btnSqrt = new JButton("sqrt()");

        panel.add(new JLabel("Valor:"));
        panel.add(campoCientifico);

        panel.add(new JLabel("Resultado:"));
        panel.add(campoResultadoCient);

        panel.add(btnSin);
        panel.add(btnCos);
        panel.add(btnLog);
        panel.add(btnSqrt);

        // Eventos científicos
        btnSin.addActionListener(e -> calcularCientifico("sin", campoCientifico, campoResultadoCient));
        btnCos.addActionListener(e -> calcularCientifico("cos", campoCientifico, campoResultadoCient));
        btnLog.addActionListener(e -> calcularCientifico("log", campoCientifico, campoResultadoCient));
        btnSqrt.addActionListener(e -> calcularCientifico("sqrt", campoCientifico, campoResultadoCient));

        return panel;
    }

    private void calcularCientifico(String op, JTextField entrada, JTextField salida) {
        try {
            double valor = Double.parseDouble(entrada.getText());
            double resultado = 0;

            switch (op) {
                case "sin": resultado = Math.sin(valor); break;
                case "cos": resultado = Math.cos(valor); break;
                case "log":
                    if (valor <= 0) {
                        JOptionPane.showMessageDialog(this, "El logaritmo solo acepta valores positivos");
                        return;
                    }
                    resultado = Math.log(valor);
                    break;
                case "sqrt":
                    if (valor < 0) {
                        JOptionPane.showMessageDialog(this, "No se puede sacar raíz de un número negativo");
                        return;
                    }
                    resultado = Math.sqrt(valor);
                    break;
            }

            salida.setText(String.valueOf(resultado));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido");
        }
    }

    public static void main(String[] args) {
        new CalculadoraCientifica();
    }
}
