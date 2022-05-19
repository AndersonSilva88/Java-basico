package bank;

public abstract class Conta {

    private double numero;
    private int agencia;
    private String nome;
    protected double saldo;

    public abstract double sacar(double valor);
    public abstract double deposito(double valor);

    public Conta(double numero, int agencia, String nome, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract double getSaldo();


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}
