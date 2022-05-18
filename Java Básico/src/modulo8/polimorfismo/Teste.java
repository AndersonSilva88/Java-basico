package modulo8.polimorfismo;

public class Teste {
    public void alimentar(Animal animal) {
        animal.comer();
    }
    public static void main(String[] args) {
        Teste t = new Teste();
        t.alimentar(new Animal());
        t.alimentar(new Galinha());
        t.alimentar(new Gato());

    }
}
