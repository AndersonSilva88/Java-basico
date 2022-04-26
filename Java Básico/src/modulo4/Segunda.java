package modulo4;

public class Segunda {
    private void metodoPrivado() {
        Primeira primeira = new Primeira();
        primeira.metodoPublico();
        primeira.metodoProtected();
        primeira.metodoDefault();

        Primeira.metodoEstatico();
    }

    public Integer soma(Integer valor1, Integer valor2) {
        return valor1 + valor2;
    }

}
