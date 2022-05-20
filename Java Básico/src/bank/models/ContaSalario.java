package bank.models;

public class ContaSalario extends Conta implements Tributavel {
    public int qtde = 2;

    public ContaSalario(double numero, int agencia, String nome, double saldo, Cliente cliente) {
        super(numero, agencia, nome, saldo, cliente);
    }

    @Override
    public double sacar(double valor) {
        if (valor <= this.qtde) {
            this.saldo -= valor;
            this.qtde--;
        } else {
            System.out.println("Atingiu limite de saques ");
        }
        return this.saldo;
    }

    @Override
    public double deposito(double valor) {
        return this.saldo += valor;
    }

    @Override
    public double getSaldo() {
        return this.saldo - getValorimposto();
    }

    @Override
    public double getValorimposto() {
        return this.saldo * 0.2;
    }

    @Override
    public String toString() {
        return "Conta salário = agência = " + super.getAgencia() + ", número = " + super.getNumero() +
                ", banco = " + super.getNome() + ", saldo R$ = " + getSaldo() + ", limite de saques = " + qtde +
                ", id do cliente = " + getCliente().getId() + ", nome do cliente = " +  getCliente().getNome();
    }
}
