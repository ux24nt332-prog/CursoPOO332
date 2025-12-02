package com.mx.curso.unidad4.ActividadesDeAprendizaje2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimuladorSemaforo extends JFrame implements ActionListener {

    private JRadioButton rojoBtn, amarilloBtn, verdeBtn;
    private JPanel panelColor;
    private ButtonGroup grupo;

    public SimuladorSemaforo() {
        setTitle("Simulador de Semáforo");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        // ------------------------
        // PANEL PRINCIPAL DE COLOR
        // ------------------------
        panelColor = new JPanel();
        panelColor.setBackground(Color.GRAY);
        add(panelColor, BorderLayout.CENTER);

        // ------------------------
        // BOTONES DE RADIO
        // ------------------------
        rojoBtn = new JRadioButton("Rojo");
        amarilloBtn = new JRadioButton("Amarillo");
        verdeBtn = new JRadioButton("Verde");

        rojoBtn.addActionListener(this);
        amarilloBtn.addActionListener(this);
        verdeBtn.addActionListener(this);

        // Agrupamos los botones
        grupo = new ButtonGroup();
        grupo.add(rojoBtn);
        grupo.add(amarilloBtn);
        grupo.add(verdeBtn);

        // Panel lateral para los botones
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(3, 1));
        panelBotones.add(rojoBtn);
        panelBotones.add(amarilloBtn);
        panelBotones.add(verdeBtn);

        add(panelBotones, BorderLayout.WEST);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (rojoBtn.isSelected()) {
            panelColor.setBackground(Color.RED);
        }
        else if (amarilloBtn.isSelected()) {
            panelColor.setBackground(Color.YELLOW);
        }
        else if (verdeBtn.isSelected()) {
            panelColor.setBackground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        new SimuladorSemaforo();
    }
}
