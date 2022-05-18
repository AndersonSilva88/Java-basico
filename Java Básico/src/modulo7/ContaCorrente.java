package modulo7;

public class ContaCorrente extends Conta implements Tributavel {

    private double chequeEspecial = 1000;

    public ContaCorrente(int numero, int agencia, String nome, Double saldo, double chequeEspecial) {
        super(numero, agencia, nome, saldo);
        this.chequeEspecial = chequeEspecial;
    }


    @Override
    public double getSaldo() {
        return  this.chequeEspecial + this.saldo;
    }

    @Override
    public double getSaldo(int dia) {
        return 0;
    }

    @Override
    public double sacar(double valorSaque) {
        double disponivel = this.chequeEspecial + this.saldo;
        if ( valorSaque > disponivel) {
            System.out.println("Slado insulficiente");
        } else {
            this.saldo -= valorSaque;
            System.out.println("Saldo insufiente");
        }
        return saldo;
    }



    @Override
    public double depositar(double valorDeposito) {
        System.out.println("Deposito realizado com sucesso!!");
        return this.saldo += valorDeposito;
    }

    @Override
    public String toString() {
        return "ContaCorrente " +
                "chequeEspecial = " + chequeEspecial +
                ' ';
    }

    @Override
    public double getValorimposto() {
        return this.getSaldo() - 0.06;
    }
}
