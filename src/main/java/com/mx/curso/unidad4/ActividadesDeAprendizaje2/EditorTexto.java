package com.mx.curso.unidad4.ActividadesDeAprendizaje2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class EditorTexto extends JFrame implements ActionListener {

    private JTextArea textArea;
    private JMenuItem itemAbrir, itemGuardar, itemSalir;

    public EditorTexto() {

        setTitle("Editor de Texto Básico");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // --------------------------
        // Área de texto con scroll
        // --------------------------
        textArea = new JTextArea();
        JScrollPane scroll = new JScrollPane(textArea);
        add(scroll, BorderLayout.CENTER);

        // --------------------------
        // Menú
        // --------------------------
        JMenuBar menuBar = new JMenuBar();
        JMenu menuArchivo = new JMenu("Archivo");

        itemAbrir = new JMenuItem("Abrir");
        itemGuardar = new JMenuItem("Guardar");
        itemSalir = new JMenuItem("Salir");

        itemAbrir.addActionListener(this);
        itemGuardar.addActionListener(this);
        itemSalir.addActionListener(this);

        menuArchivo.add(itemAbrir);
        menuArchivo.add(itemGuardar);
        menuArchivo.addSeparator();
        menuArchivo.add(itemSalir);

        menuBar.add(menuArchivo);
        setJMenuBar(menuBar);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // --------------------------
        // ABRIR ARCHIVO
        // --------------------------
        if (e.getSource() == itemAbrir) {

            JFileChooser chooser = new JFileChooser();
            int opcion = chooser.showOpenDialog(this);

            if (opcion == JFileChooser.APPROVE_OPTION) {
                File archivo = chooser.getSelectedFile();

                try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
                    textArea.read(reader, null);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Error al abrir archivo");
                }
            }
        }

        // --------------------------
        // GUARDAR ARCHIVO
        // --------------------------
        if (e.getSource() == itemGuardar) {

            JFileChooser chooser = new JFileChooser();
            int opcion = chooser.showSaveDialog(this);

            if (opcion == JFileChooser.APPROVE_OPTION) {
                File archivo = chooser.getSelectedFile();

                try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
                    textArea.write(writer);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Error al guardar archivo");
                }
            }
        }

        // --------------------------
        // SALIR
        // --------------------------
        if (e.getSource() == itemSalir) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new EditorTexto();
    }
}