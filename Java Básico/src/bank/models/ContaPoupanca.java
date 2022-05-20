package bank.models;

import bank.models.Conta;

public class ContaPoupanca extends Conta {

    private int diaAniversario = 10;
    private double taxaDeJuros = 0.05;

    public ContaPoupanca(double numero, int agencia, String nome, double saldo, int diaAniversario, Cliente cliente) {
        super(numero, agencia, nome, saldo, cliente);
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
        if (this.diaAniversario == 10){
            this.saldo += (this.saldo * this.taxaDeJuros);
        }
        return this.saldo;
    }

    @Override
    public String toString() {
        return "Conta poupança = agência = " + super.getAgencia() + ", número = " + super.getNumero() +
                ", banco = " + super.getNome() + ", saldo R$ = " + getSaldo() + ", taxa de juros = " + taxaDeJuros +
                ", id do cliente = " + getCliente().getId() + ", nome do cliente = " +  getCliente().getNome();
    }
}
