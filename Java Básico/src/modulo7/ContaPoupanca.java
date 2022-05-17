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
    public Double getSaldo() {
        return this.saldo + this.taxaDeJuros * this.saldo;
    }
}
