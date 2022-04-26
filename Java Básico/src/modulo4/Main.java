package modulo4;

public class Main {

    public static void main(String[] args) {
        Primeira primeira = new Primeira();
        primeira.metodoPublico();
        primeira.alteraVariavel();
        primeira.metodoPublico();

        Carro carro = new Carro(4);

        carro.setCor(carro.VERMELHO);
        carro.imprimeValores();

        Segunda segunda = new Segunda();
        System.out.println(segunda.soma(10,10));

    }
}
