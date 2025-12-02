package com.mx.curso.unidad4.ActividadesDeAprendizaje;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestionTareas extends JFrame {

    private DefaultTableModel modelo;
    private JTable tabla;
    private JTextField campoTarea;
    private int contadorID = 1;

    public GestionTareas() {
        setTitle("Gestión de Tareas con JTable");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // ----- Modelo de la tabla -----
        modelo = new DefaultTableModel(new Object[]{"ID", "Tarea", "Completada"}, 0);
        tabla = new JTable(modelo);

        add(new JScrollPane(tabla), BorderLayout.CENTER);

        // ----- Panel inferior -----
        JPanel panelInferior = new JPanel();
        panelInferior.setLayout(new FlowLayout());

        campoTarea = new JTextField(20);
        JButton btnAgregar = new JButton("Agregar Tarea");
        JButton btnEliminar = new JButton("Eliminar Tarea");

        panelInferior.add(new JLabel("Nueva tarea:"));
        panelInferior.add(campoTarea);
        panelInferior.add(btnAgregar);
        panelInferior.add(btnEliminar);

        add(panelInferior, BorderLayout.SOUTH);

        // ------ Acción: Agregar Tarea ------
        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String descripcion = campoTarea.getText().trim();

                if (descripcion.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Debes escribir una tarea.");
                    return;
                }

                Tarea nueva = new Tarea(contadorID++, descripcion, false);

                modelo.addRow(new Object[]{
                        nueva.getId(),
                        nueva.getDescripcion(),
                        nueva.isCompletada()
                });

                campoTarea.setText("");
            }
        });

        // ------ Acción: Eliminar Tarea ------
        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int filaSeleccionada = tabla.getSelectedRow();

                if (filaSeleccionada == -1) {
                    JOptionPane.showMessageDialog(null, "Selecciona una tarea para eliminar.");
                    return;
                }

                modelo.removeRow(filaSeleccionada);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new GestionTareas().setVisible(true);
        });
    }
}