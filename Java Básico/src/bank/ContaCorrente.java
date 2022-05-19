package bank;

public class ContaCorrente extends Conta{

    private double chequeEspecial = 1000;

    public ContaCorrente(double numero, int agencia, String nome, double saldo) {
        super(numero, agencia, nome, saldo);
    }

    @Override
    public double getSaldo() {
        return this.saldo + this.chequeEspecial;
    }

    @Override
    public double sacar(double valor) {
        double limite = this.saldo + this.chequeEspecial;
        if (valor < limite) {
                 this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente na conta: " + limite);
        }
        return this.saldo;
    }

    @Override
    public double deposito(double valor) {
        return this.saldo + valor;
    }
}
