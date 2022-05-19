package bank;

public class ContaPoupanca extends Conta {

    private int diaAniversario = 10;
    private double taxaDeJuros = 0.05;

    public ContaPoupanca(double numero, int agencia, String nome, double saldo, int diaAniversario) {
        super(numero, agencia, nome, saldo);
        this.diaAniversario = diaAniversario;
    }

    @Override
    public double sacar(double valor) {
        double  limite = this.saldo;
        if (valor < limite ){
                this.saldo -= valor;
            } else {
            System.out.println("saldo");
        }
        return this.saldo;
    }

    @Override
    public double deposito(double valor) {
        return this.saldo += valor;
    }

    @Override
    public double getSaldo() {
         return this.saldo;
    }
}
