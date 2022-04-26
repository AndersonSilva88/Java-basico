package produtos;

import produtos.models.Produto;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a descrição do produto: ");
        String descricao = sc.nextLine();

        System.out.println("Digite o ID do produto: ");
        int id = sc.nextInt();

        Produto produto = new Produto(id, descricao);
       // produto.setId(id);
       // produto.setDescricao(descricao);

        System.out.println("Produto criado com sucesso!!!");
        System.out.println("--- ID: " + produto.getId());
        System.out.println("--- Descrição: " + produto.getDescricao());
    }
}
