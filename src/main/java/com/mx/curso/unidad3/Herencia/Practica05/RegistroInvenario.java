package com.mx.curso.unidad3.Herencia.Practica05;

public class RegistroInvenario {

    private String nombreEncargado;

    public RegistroInvenario(String nombreEncargado){
        this.nombreEncargado = nombreEncargado;
    }

    public String getNombreEncargado(){
      return nombreEncargado;
    };

    public class RegistroInventario{

        private String nombreEncargado;

        public void RegistroInvenario(String nombreEncargado){
            this.nombreEncargado = nombreEncargado;
        }

        public String getNombreEncargado(){
            return nombreEncargado;
        }

        public void setNombreEncargado(Articulo articulo, int cantidad){
            System.out.println("Entrada registrada por " + nombreEncargado + ": +" + cantidad + " unidades del artículo " + articulo.getCodigo());

            int nuevoStock = articulo.getCantidadStock() + cantidad;
            articulo.setCantidadStock(nuevoStock);

            System.out.println("Stock actual de " + articulo.getCodigo() + ": " + nuevoStock);
        }

    }

    public void registrarMovimiento(Articulo articulo, int cantidad, String prioridad){
        System.out.println("Salida registrada por " + nombreEncargado + ": -" + cantidad + "unidades del articulo" + articulo.getCodigo() + "| Prioridad: " + prioridad);

        int stockActual = articulo.getCantidadStock();

        //Sin negativo
        if (cantidad > stockActual){
            System.out.println("ERROR: No hay suficiente espacio para realizar esta salida");
            return;

        }

        //Actualizar
        int nuevoStock = stockActual - cantidad;
        articulo.setCantidadStock(nuevoStock);

        System.out.println("Stock actual de " + articulo.getCodigo() + ": " + nuevoStock );

    }

}







