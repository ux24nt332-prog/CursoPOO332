package com.mx.curso.unidad2.proyecto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class tareaDel25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingresa el nombre del producto: ");
            String nombreProducto = sc.nextLine();

            System.out.print("Ingresa la cantidad en stock: ");
            int cantidad = sc.nextInt();

            System.out.print("Ingresa el precio unitario: ");
            double precio = sc.nextDouble();

            // Validaciones con if-else anidados
            if (cantidad > 0) {
                if (precio > 0) {
                    System.out.println("Producto registrado correctamente.");
                    System.out.println("Nombre: " + nombreProducto);
                    System.out.println("Cantidad: " + cantidad);
                    System.out.println("Precio unitario: " + precio);
                } else {
                    System.out.println("✖ Error: El precio debe ser mayor a 0.");
                }
            } else {
                System.out.println("Error: La cantidad debe ser mayor a 0.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Ingresaste un dato no válido. Se esperaba un número.");
        }

        sc.close();
    }
}