package com.mx.curso.unidad3.tarea26.Practica2;

public class ClasificacionPacientes {

    public static void main(String[] args) {

        // 1. Declarar arreglo de códigos de 10 pacientes
        String[] codigos = {"C", "P", "N", "X", "C", "P", "A", "N", "C", "Z"};

        // 2. Recorrer el arreglo con un ciclo for
        for (int i = 0; i < codigos.length; i++) {

            String area;

            // 3. Clasificar según el código usando switch
            switch (codigos[i]) {
                case "C":
                    area = "Cardiología";
                    break;
                case "P":
                    area = "Pediatría";
                    break;
                case "N":
                    area = "Neurología";
                    break;
                default:
                    area = "General"; // Para cualquier otro código
                    break;
            }

            // 4. Mostrar reporte
            System.out.println("Paciente " + (i + 1) + ": Código = "
                    + codigos[i] + " → Área asignada: " + area);
        }
    }

}
