package com.mx.curso.unidad4.ActividadesDeAprendizaje2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe extends JFrame implements ActionListener {

    private JButton[][] botones = new JButton[3][3];
    private boolean turnoX = true; // true = X, false = O

    public TicTacToe() {
        setTitle("Tic-Tac-Toe");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3));
        add(panel);

        // Crear botones y agregarlos al panel
        for (int fila = 0; fila < 3; fila++) {
            for (int col = 0; col < 3; col++) {
                botones[fila][col] = new JButton();
                botones[fila][col].setFont(new Font("Arial", Font.BOLD, 40));
                botones[fila][col].addActionListener(this);
                panel.add(botones[fila][col]);
            }
        }

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton boton = (JButton) e.getSource();

        // Si ya tiene X o O, no se puede modificar
        if (!boton.getText().equals("")) {
            return;
        }

        // Alternar turno
        if (turnoX) {
            boton.setText("X");
        } else {
            boton.setText("O");
        }

        turnoX = !turnoX;

        // Revisar si alguien ganó
        if (hayGanador()) {
            String ganador = turnoX ? "O" : "X"; // turno cambia al final, por eso se invierte
            JOptionPane.showMessageDialog(this, "¡El ganador es: " + ganador + "!");
            reiniciarTablero();
            return;
        }

        // Revisar si hay empate
        if (tableroLleno()) {
            JOptionPane.showMessageDialog(this, "¡Empate!");
            reiniciarTablero();
        }
    }

    // -----------------------
    // MÉTODOS DE LÓGICA
    // -----------------------

    private boolean hayGanador() {
        // Revisar filas
        for (int f = 0; f < 3; f++) {
            if (!botones[f][0].getText().equals("") &&
                    botones[f][0].getText().equals(botones[f][1].getText()) &&
                    botones[f][1].getText().equals(botones[f][2].getText())) {
                return true;
            }
        }

        // Revisar columnas
        for (int c = 0; c < 3; c++) {
            if (!botones[0][c].getText().equals("") &&
                    botones[0][c].getText().equals(botones[1][c].getText()) &&
                    botones[1][c].getText().equals(botones[2][c].getText())) {
                return true;
            }
        }

        // Revisar diagonales
        if (!botones[0][0].getText().equals("") &&
                botones[0][0].getText().equals(botones[1][1].getText()) &&
                botones[1][1].getText().equals(botones[2][2].getText())) {
            return true;
        }

        if (!botones[0][2].getText().equals("") &&
                botones[0][2].getText().equals(botones[1][1].getText()) &&
                botones[1][1].getText().equals(botones[2][0].getText())) {
            return true;
        }

        return false;
    }

    private boolean tableroLleno() {
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                if (botones[f][c].getText().equals("")) {
                    return false;
                }
            }
        }
        return true;
    }

    private void reiniciarTablero() {
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                botones[f][c].setText("");
            }
        }
        turnoX = true;
    }

    public static void main(String[] args) {
        new TicTacToe();
    }
}
