package bank;

public class ContaSalario extends Conta{
    public int qtde = 2;

    public ContaSalario(double numero, int agencia, String nome, double saldo) {
        super(numero, agencia, nome, saldo);
    }

    @Override
    public double sacar(double valor) {

        return 0;
    }

    @Override
    public double deposito(double valor) {
        return 0;
    }

    @Override
    public double getSaldo() {
        return 0;
    }
}
