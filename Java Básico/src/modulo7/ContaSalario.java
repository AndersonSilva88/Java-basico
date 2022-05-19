package modulo7;

public class ContaSalario extends Conta{
    private int qtde;

    public ContaSalario(int numero, int agencia, String nome, Double saldo, int qtde) {
        super(numero, agencia, nome, saldo);
        this.qtde = qtde;
    }


    @Override
    public double getSaldo() {
        return 0;
    }

    @Override
    public double getSaldo(int dia) {
        return 0;
    }

    @Override
    public double sacar(double valorSaque) {
        if (qtde > 0){
            if (valorSaque <= this.getSaldo()){
                this.saldo -= valorSaque;
                System.out.println("Saque efetuado ");
                qtde--;
            } else {
                System.out.println("Saque não efetuado");
            }
        }
        return this.saldo;
    }

    @Override
    public double depositar(double valorDeposito) {
        System.out.println("Deposito efetuado");
        return this.saldo += valorDeposito;
    }
}
