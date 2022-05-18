package modulo8.polimorfismo;

import modulo8.polimorfismo.Animal;

public class Galinha extends Animal {
    @Override
    public void comer() {
        System.out.println("Galinha comendo milho");
    }
}
