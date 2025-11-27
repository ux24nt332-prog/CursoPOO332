package com.mx.curso.unidad3.tarea26.ParadigmaOO;

public class SistemaVehiculos {


    //Clase base: Vehiculo
    public static class Vehiculo{

        int velocidad;
        int numLlantas;
        //constructor
        public Vehiculo(int velocidad, int numLlantas){
            this.velocidad = velocidad;
            this.numLlantas = numLlantas;
        }

        //metodo acelerar generico
        public void acelerar(){
            velocidad += 5; //Aumenro basico
            System.out.println("El vehiculo acelero. Velocidad actual: " + velocidad + "km/h");
        }

    }

    //Clase derivada: Bicicleta
    public static class Bicileta extends Vehiculo{

        public Bicileta(){
            super(0,2);
        }
    }

    //Clase derivada:Automovil
    public static class Automovil extends Vehiculo{

        public Automovil(){
            super(0, 4);
        }

        //@Override
        public void acelerar(){
            velocidad += 15; //acelera más rápido
            System.out.println("Automóvil aceleró. Velocidad actual: " + velocidad + "km/h");
        }

        static void main(String[] args) {
            Bicileta bici  = new Bicileta();
            Automovil auto = new Automovil();

            System.out.println("==== Probando Bici ====");
            bici.acelerar();//aumenra +5

            System.out.println("=== Probando Auto ===");
            auto.acelerar();// aumenta +15
        }

    }


}
