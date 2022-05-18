package modulo7;

public class TestaConta {

    public static  void main(String[] args) {
        //Conta c1 = new Conta(1, 1, "Banco A", 100.0 );
        //System.out.println(c1);

        ContaCorrente cc1 = new ContaCorrente(22, 1, "Banco AA", 200.0, 2000);
        System.out.println(cc1.sacar(500.0));
        System.out.println(cc1.getSaldo());

        System.out.println(cc1);

        System.out.println("O saldo da conta corrente é R$: " + cc1.getSaldo());

        ContaPoupanca p1 = new ContaPoupanca(33, 3, "Banco cc", 10.0,  10, 0.5);
        System.out.println("O Saldo da conta poupança é R$: " + p1.getSaldo());

        ContaSalario cs = new ContaSalario(3,1,"bacoa",100.0,3);

        p1.depositar(100.0);
        System.out.println(p1);
        System.out.println("saldo "+p1.getSaldo(10));




    }
}
