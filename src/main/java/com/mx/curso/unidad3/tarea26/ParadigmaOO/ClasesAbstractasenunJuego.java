package com.mx.curso.unidad3.tarea26.ParadigmaOO;

// Clase abstracta
abstract class Personaje {
    public abstract void atacar();
}

// Clase concreta Guerrero
class Guerrero extends Personaje {
    @Override
    public void atacar() {
        System.out.println("El guerrero ataca con su espada!");
    }
}

// Clase concreta Mago
class Mago extends Personaje {
    @Override
    public void atacar() {
        System.out.println("El mago lanza un poderoso hechizo!");
    }
}

public class ClasesAbstractasenunJuego {
    public static void main(String[] args) {

        // NO se puede hacer:
        // Personaje p = new Personaje(); //

        Personaje g = new Guerrero();  // ✔ polimorfismo
        Personaje m = new Mago();      // ✔ polimorfismo

        g.atacar();
        m.atacar();
    }
}
