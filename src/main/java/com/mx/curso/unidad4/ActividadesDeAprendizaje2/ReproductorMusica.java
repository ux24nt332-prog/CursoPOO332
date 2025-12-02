package com.mx.curso.unidad4.ActividadesDeAprendizaje2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReproductorMusica extends JFrame implements ActionListener {

    private JLabel estadoLabel;
    private JButton btnReproducir, btnPausar, btnDetener;

    public ReproductorMusica() {
        setTitle("Reproductor de Música");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        estadoLabel = new JLabel("Estado: Detenido");

        btnReproducir = new JButton("Reproducir");
        btnPausar = new JButton("Pausar");
        btnDetener = new JButton("Detener");

        // Agregar eventos a los botones
        btnReproducir.addActionListener(this);
        btnPausar.addActionListener(this);
        btnDetener.addActionListener(this);

        // Añadir componentes a la ventana
        add(estadoLabel);
        add(btnReproducir);
        add(btnPausar);
        add(btnDetener);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnReproducir) {
            estadoLabel.setText("Estado: Reproduciendo música...");
        } else if (e.getSource() == btnPausar) {
            estadoLabel.setText("Estado: Música en pausa");
        } else if (e.getSource() == btnDetener) {
            estadoLabel.setText("Estado: Música detenida");
        }
    }

    public static void main(String[] args) {
        new ReproductorMusica();
    }
}