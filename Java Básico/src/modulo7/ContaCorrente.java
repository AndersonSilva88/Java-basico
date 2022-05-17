package modulo7;

public class ContaCorrente extends Conta {

    private double chequeEspecial;

    public ContaCorrente(int numero, int agencia, String nome, Double saldo, double chequeEspecial) {
        super(numero, agencia, nome, saldo);
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public Double getSaldo() {
        return this.chequeEspecial + this.saldo;
    }

    @Override
    public String toString() {
        return "ContaCorrente " +
                "chequeEspecial = " + chequeEspecial +
                ' ';
    }
}
