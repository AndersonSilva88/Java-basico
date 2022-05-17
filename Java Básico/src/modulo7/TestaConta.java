package modulo7;

public class TestaConta {

    public static  void main(String[] args) {
        //Conta c1 = new Conta(1, 1, "Banco A", 100.0 );
        //System.out.println(c1);

        ContaCorrente cc1 = new ContaCorrente(22, 1, "Banco AA", 100.0, 1000);
        System.out.println(cc1);

        System.out.println("O saldo da conta corrente é R$: " + cc1.getSaldo());

        ContaPoupanca p1 = new ContaPoupanca(33, 3, "Banco cc", 10.0,  10, 0.5);
        System.out.println("O Saldo da conta poupança é R$: " + p1.getSaldo());
    }
}
