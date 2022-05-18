package modulo8.polimorfismo;

import modulo8.polimorfismo.Animal;

public class Gato extends Animal {
    @Override
    public void comer() {
        System.out.println("Gato comendo ração");
    }
}
