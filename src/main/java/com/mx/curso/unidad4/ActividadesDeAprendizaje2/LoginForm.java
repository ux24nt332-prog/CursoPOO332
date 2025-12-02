package com.mx.curso.unidad4.ActividadesDeAprendizaje2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame implements ActionListener {

    private JTextField usuarioField;
    private JPasswordField passwordField;
    private JButton btnIngresar;

    public LoginForm() {
        setTitle("Formulario de Login");
        setSize(300, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2, 5, 5)); // 3 filas, 2 columnas

        // Componentes
        JLabel usuarioLabel = new JLabel("Usuario:");
        JLabel passwordLabel = new JLabel("Contraseña:");

        usuarioField = new JTextField();
        passwordField = new JPasswordField();
        btnIngresar = new JButton("Ingresar");

        btnIngresar.addActionListener(this);

        // Agregar componentes
        add(usuarioLabel);
        add(usuarioField);
        add(passwordLabel);
        add(passwordField);
        add(new JLabel()); // espacio vacío
        add(btnIngresar);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String usuario = usuarioField.getText();
        String password = String.valueOf(passwordField.getPassword());

        // Credenciales predefinidas
        if (usuario.equals("admin") && password.equals("1234")) {
            JOptionPane.showMessageDialog(this, "Bienvenido " + usuario + "!");
        } else {
            JOptionPane.showMessageDialog(this, "Error: Credenciales incorrectas");
        }
    }

    public static void main(String[] args) {
        new LoginForm();
    }
}