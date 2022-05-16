package modulo6;

import java.util.ArrayList;
import java.util.List;

public class ListaList {

    public static void main(String[] args) {


        List<String> colecao = new ArrayList<>();

        colecao.add("Carro");
        colecao.add("Moto");
        colecao.add("Barco");
        colecao.add("Carro");

        System.out.println(colecao.get(0));
        System.out.println(colecao.get(2));

        System.out.println("|--- ForEach---|");
        for (String lista : colecao) {
            System.out.println(colecao);
        }

        colecao.remove(0);

        System.out.println("|--- For ---|");
        for (int i = 0; i < colecao.size(); i++) {
            System.out.println(colecao.get(i));
        }

    }

}
