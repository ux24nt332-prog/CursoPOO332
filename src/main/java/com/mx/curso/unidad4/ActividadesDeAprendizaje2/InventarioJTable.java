package com.mx.curso.unidad4.ActividadesDeAprendizaje2;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InventarioJTable extends JFrame {

    private JTable tabla;
    private DefaultTableModel modelo;
    private JButton btnAgregar;

    public InventarioJTable() {
        setTitle("Gestión de Inventario");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // -------------------------------
        // MODELO DE LA TABLA (Columnas)
        // -------------------------------
        modelo = new DefaultTableModel();
        modelo.addColumn("Producto");
        modelo.addColumn("Cantidad");

        // -------------------------------
        // TABLA
        // -------------------------------
        tabla = new JTable(modelo);
        JScrollPane scroll = new JScrollPane(tabla);
        add(scroll, BorderLayout.CENTER);

        // -------------------------------
        // BOTÓN AGREGAR
        // -------------------------------
        btnAgregar = new JButton("Agregar Producto");

        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String producto = JOptionPane.showInputDialog("Ingrese el nombre del producto:");
                if (producto == null || producto.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Nombre inválido.");
                    return;
                }

                String cantidadStr = JOptionPane.showInputDialog("Ingrese la cantidad:");
                if (cantidadStr == null || cantidadStr.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Cantidad inválida.");
                    return;
                }

                try {
                    int cantidad = Integer.parseInt(cantidadStr);
                    if (cantidad < 0) {
                        JOptionPane.showMessageDialog(null, "La cantidad debe ser positiva.");
                        return;
                    }

                    // Agregar a la tabla
                    modelo.addRow(new Object[]{producto, cantidad});

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar un número válido.");
                }
            }
        });

        add(btnAgregar, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new InventarioJTable();
    }
}
