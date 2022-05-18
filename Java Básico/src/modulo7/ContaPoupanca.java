package modulo7;

public class ContaPoupanca extends Conta{
    private int dataAniversario;
    private double taxaDeJuros;

    public ContaPoupanca(int numero, int agencia, String nome, Double saldo, int dataAniversario, double taxaDeJuros) {
        super(numero, agencia, nome, saldo);
        this.dataAniversario = dataAniversario;
        this.taxaDeJuros = taxaDeJuros;
    }

    @Override
    public double getSaldo(int dia ) {
        if (dia >= this.dataAniversario){
            this.saldo = this.taxaDeJuros * this.saldo;
            return this.saldo;
        } else {
            return this.saldo;
        }
    }

    @Override
    public double sacar(double valorSaque) {
        if (valorSaque <= this.getSaldo()){
            this.saldo -= valorSaque;
            System.out.println("Saque realizado: " + valorSaque);
        } else {
            System.out.println("Saldo insuficiente");
        }
        return saldo;
    }

    @Override
    public double depositar(double valorDeposito) {
        return this.saldo += valorDeposito;
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "dataAniversario=" + dataAniversario +
                ", taxaDeJuros=" + taxaDeJuros +
                '}';
    }
}
