package modulo4;

public class Carro {

    public static final String VERMELHO = "VERMELHO";
    public static final String VERDE = "VERDE";

    private Integer quantidadePneus;
    private Integer quantidadeCalota;
    private Integer quantidadeParafusosPneu;

    public Carro(Integer quantidadePneus) {
        setQuantidadePneus(quantidadePneus);
    }

    public Integer getQuantidadeCalota() {
        return quantidadeCalota;
    }

    public void setQuantidadeCalota(Integer quantidadeCalota) {
        this.quantidadeCalota = quantidadeCalota;
    }

    public Integer getQuantidadeParafusosPneu() {
        return quantidadeParafusosPneu;
    }

    public void setQuantidadeParafusosPneu(Integer quantidadeParafusosPneu) {
        this.quantidadeParafusosPneu = quantidadeParafusosPneu;
    }

    public Integer getQuantidadePneus() {
        return quantidadePneus + 1;
    }

    public void setQuantidadePneus(Integer quantidadePneus) {
        quantidadeCalota = quantidadePneus;
        quantidadeParafusosPneu = quantidadePneus * 4;
        this.quantidadePneus = quantidadePneus;
    }

    public void setCor(String cor) {
        System.out.println(cor);
    }

    public void imprimeValores() {
        System.out.println("Quantidade Pneus: " + getQuantidadePneus());
        System.out.println("Quantidade Calotas: " + getQuantidadeCalota());
        System.out.println("Quantidade de Parafusos: " + getQuantidadeParafusosPneu());
    }
}
