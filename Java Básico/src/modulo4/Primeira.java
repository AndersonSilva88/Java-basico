package modulo4;

public class Primeira {

    public static final Integer CONSTANTE = 10;

    private static Integer variavel = 1;

    private Integer escopoClasse = 2;

    public static Integer metodoEstatico() {
        return variavel;
    }

    public void metodoPublico() {
        Integer variavel = CONSTANTE;

        System.out.println(variavel);
        variavel = 2;
        System.out.println(variavel);

        System.out.println(escopoClasse);
        escopoClasse = 2;
    }

    public void alteraVariavel() {
        System.out.println(escopoClasse);
        escopoClasse = escopoClasse + 2;
        System.out.println(escopoClasse);
    }

    private void metodoPrivado() {

    }

    protected  void metodoProtected() {

    }

    void metodoDefault() {

    }
}
