package com.mx.curso.unidad2.proyecto;

public class tareaDel25_2 {

    public static class ClasificacionStock {

        public static void main(String[] args) {

            // Arreglo con la cantidad de stock de 10 productos
            int[] stock = {60, 45, 0, 12, 5, 100, 8, 50, 1, 0};

            System.out.println("=== REPORTE DE STOCK ===");

            // Recorrer el arreglo
            for (int i = 0; i < stock.length; i++) {

                String categoria;

                // Clasificación usando switch con rangos
                switch (stock[i]) {
                    case 0:
                        categoria = "Descontinuado";
                        break;

                    // Rangos usando múltiples cases
                    case 1, 2, 3, 4, 5, 6, 7, 8, 9:
                        categoria = "Urgente";
                        break;

                    case 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
                         20, 21, 22, 23, 24, 25, 26, 27, 28, 29,
                         30, 31, 32, 33, 34, 35, 36, 37, 38, 39,
                         40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50:
                        categoria = "Bajo stock";
                        break;

                    default:
                        // Todo lo demás (mayor a 50)
                        categoria = "En stock";
                        break;
                }

                // Mostrar reporte
                System.out.println("Producto " + (i + 1) + ": "
                        + stock[i] + " unidades → " + categoria);
            }
        }
    }

}
