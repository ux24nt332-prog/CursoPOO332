package com.mx.curso.unidad4.ActividadesDeAprendizaje2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VisorImagenes extends JFrame implements ActionListener {

    private JLabel labelImagen;
    private JButton btnCargar;

    public VisorImagenes() {
        setTitle("Visor de Imágenes");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Botón para cargar imagen
        btnCargar = new JButton("Cargar Imagen");
        btnCargar.addActionListener(this);

        // Etiqueta donde se mostrará la imagen
        labelImagen = new JLabel("", SwingConstants.CENTER);

        // Agregar componentes
        add(btnCargar, BorderLayout.NORTH);
        add(labelImagen, BorderLayout.CENTER);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Selecciona una imagen");

        int resultado = chooser.showOpenDialog(this);

        if (resultado == JFileChooser.APPROVE_OPTION) {

            String ruta = chooser.getSelectedFile().getAbsolutePath();

            // Cargar imagen
            ImageIcon iconoOriginal = new ImageIcon(ruta);

            // Escalar imagen al tamaño del JLabel
            Image imagenEscalada = iconoOriginal.getImage().getScaledInstance(
                    labelImagen.getWidth(),
                    labelImagen.getHeight(),
                    Image.SCALE_SMOOTH
            );

            ImageIcon iconoEscalado = new ImageIcon(imagenEscalada);

            // Mostrar imagen
            labelImagen.setIcon(iconoEscalado);
        }
    }

    public static void main(String[] args) {
        new VisorImagenes();
    }
}
