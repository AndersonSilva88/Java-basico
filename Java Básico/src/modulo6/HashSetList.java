package modulo6;

import java.util.HashSet;
import java.util.Set;

public class HashSetList {

    public static void main(String[] args) {

        Set<String> colecao = new HashSet<>();

        colecao.add("Carro");
        colecao.add("Moto");
        colecao.add("Barco");
        colecao.add("Carro");

        System.out.println("|--- ForEach---|");
        for (String lista: colecao) {
            System.out.println(colecao);
        }

    }
}
