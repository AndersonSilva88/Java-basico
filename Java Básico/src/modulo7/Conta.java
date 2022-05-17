package modulo7;

public abstract class Conta {

    private int numero;
    private int agencia;
    private String nome;
    protected Double saldo;

    public Conta(int numero, int agencia, String nome, Double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
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

    public abstract Double getSaldo();

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta " +
                "numero = " + numero +
                ", agencia = " + agencia +
                ", nome = '" + nome + '\'' +
                ", saldo = " + saldo +
                ' ';
    }
}
