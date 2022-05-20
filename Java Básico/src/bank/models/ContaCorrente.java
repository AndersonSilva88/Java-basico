package bank.models;

public class ContaCorrente extends Conta implements Tributavel {

    private double chequeEspecial = 1000;

    public ContaCorrente(double numero, int agencia, String nome, double saldo, Cliente cliente) {
        super(numero, agencia, nome, saldo, cliente);
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
                   this.saldo -= getValorimposto();
        } else {
            System.out.println("Saldo insuficiente na conta: " + limite);
        }
        return this.saldo;
    }

    @Override
    public double deposito(double valor) {
        return this.saldo + valor;
    }

    @Override
    public double getValorimposto() {
        return this.saldo * 0.2;
    }

    @Override
    public String toString() {
        return  "Conta corrente = agência = " + super.getAgencia() + ", número = " + super.getNumero() +
                ", banco = " + super.getNome() + ", saldo R$ = " + getSaldo() + ", cheque especial R$ = " + chequeEspecial +
                ", id do cliente = " + getCliente().getId() + ", nome do cliente = " +  getCliente().getNome();
    }
}
