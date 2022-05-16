package produtos;

import produtos.db.ProdutosDB;
import produtos.models.Produto;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    static ProdutosDB produtosDB = new ProdutosDB();

    public static void main(String[] args) throws Exception{
        System.out.println("-----PEDIDO DE VENDAS-----");
        int option;
        do {
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos cadastrados");
            System.out.println("0 - Sair");
            Scanner sc =new Scanner(System.in);

            System.out.println("Qual operação você deseja realizar: ");
            option = sc.nextInt();
            process(option);

        } while(option != 0);

    }

    public static void process(int option) throws Exception{
        switch(option) {
            case 1: {
                Scanner sc = new Scanner(System.in);

                System.out.println("Digite a descrição do produto: ");
                String descricao = sc.nextLine();

                System.out.println("Digite o ID do produto: ");
                int id = sc.nextInt();

                System.out.println("Qual o preço: ");
                double preco = sc.nextDouble();

                System.out.println("Qual a data de validade: ");
                String dataString = sc.next();

                Date dataValidade = new SimpleDateFormat("dd/MM/yyyy").parse(dataString);

                Produto produto = new Produto(id, descricao, preco, dataValidade);
                // produto.setId(id);
                // produto.setDescricao(descricao);


                produtosDB.addNovoProduto(produto);

                /*
                System.out.println("Produto criado com sucesso!!!");
                System.out.println("--- ID: " + produto.getId());
                System.out.println("--- Descrição: " + produto.getDescricao());
                System.out.println("--- Preço: " + produto.getPreco());
                System.out.println("--- Data de validade: " + produto.getDataValidade());
                System.out.println("--------------------------------------");
                 */

                break;
            }
            case 2: {
                List<Produto> listaDeProdutos = produtosDB.getProdutoList();

                for (Produto produto: listaDeProdutos) {
                    System.out.println("--- ID: " + produto.getId());
                    System.out.println("--- Descrição: " + produto.getDescricao());
                    System.out.println("--- Preço: " + produto.getPreco());
                    System.out.println("--- Data de validade: " + produto.getDataValidade());
                    System.out.println("--------------------------------------");
                }
                break;
            }
        }
    }
}
