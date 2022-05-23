package produtos;

import jdk.swing.interop.SwingInterOpUtils;
import produtos.db.EstoquesDB;
import produtos.db.PedidoVendaDB;
import produtos.db.ProdutosDB;
import produtos.db.UsuariosDB;
import produtos.models.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    static ProdutosDB produtosDB = new ProdutosDB();
    static UsuariosDB usuariosDB = new UsuariosDB();
    static EstoquesDB estoquesDB = new EstoquesDB();
    static PedidoVendaDB pedidoVendaDB = new PedidoVendaDB();

    public static void main(String[] args) throws Exception{
        System.out.println("-----PEDIDO DE VENDAS-----");
        int option;
        do {
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos cadastrados");
            System.out.println("3 - Cadastrar Usuario ADMINISTRADOR");
            System.out.println("4 - Cadastrar usuario CLIENTE");
            System.out.println("5 - Listas todos os USUARIOS");
            System.out.println("6 - Cadastrar novo ESTOQUE DE PRODUTOS");
            System.out.println("7 - Listar todos os ESTOQUE");
            System.out.println("8 - Criar pedido de VENDAS");
            System.out.println("9 - Listar pedidos de VENDA");
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

            case 3: {
                Scanner sc = new Scanner(System.in);
                System.out.println("Qual o nome do usuário do ADMINISTRADOR");
                String nome = sc.nextLine();

                Admin novoAdmin = new Admin(nome);
                usuariosDB.addNovoUsuario(novoAdmin);
                break;
            }

            case 4: {
                Scanner sc = new Scanner(System.in);
                System.out.println("Qual o nome do usuario CLIENTE");
                String nome = sc.nextLine();

                Cliente novoCliente = new Cliente(nome);
                usuariosDB.addNovoUsuario(novoCliente);
                break;
            }
            case 5: {
                System.out.println("-----------------------------------");
                System.out.println("---LISTANDO USUARIOS CADASTRADOS---");
                System.out.println("-----------------------------------");
                for (Usuario usuario: usuariosDB.getUsuarioList()) {
                    System.out.println("ID: " + usuario.getId());
                    System.out.println("NOME: " + usuario.getNome());
                    System.out.println("TIPO: " + usuario.getTipoUsuario());
                    System.out.println("----------------------------------");
                }
                break;
            }
            case 6: {
                Scanner sc = new Scanner(System.in);
                System.out.println("-----------------------------------");
                System.out.println("---CADASTRANDO ESTOQUE DE PRODUTO---");
                System.out.println("-----------------------------------");

                System.out.println("Qual o identificador do estoque: ");
                String id = sc.next();

                System.out.println("Qual o produto que será adicionado ao estoque(informe o id): ");
                int produtoId = sc.nextInt();

                Produto produto = produtosDB.getProdutoPorId(produtoId);
                System.out.println("PRODUTO ID: " + produto.getId());
                System.out.println("PRODUTO DESCRIÇÃO: " + produto.getDescricao());
                System.out.println("PRODUTO VALIDADE: " + produto.getDataValidade());

                System.out.println("Qual a quantidade de produtos a ser adicionada em estoque: ");
                int quantidade = sc.nextInt();

                Estoque novoEstoque = new Estoque(id, produto, quantidade);
                estoquesDB.addNovoEstoque(novoEstoque);
                break;
            }

            case 7: {
                System.out.println("-----------------------------------");
                System.out.println("---LISTANDO ESTOQUES CADASTRADOS---");
                System.out.println("-----------------------------------");
                for (Estoque estoque : estoquesDB.getEstoques()) {
                    System.out.println("ID: " + estoque.getId());
                    System.out.println("NOME: " + estoque.getProduto().getDescricao());
                    System.out.println("TIPO: " + estoque.getProduto().getPreco());
                    System.out.println("QUANTIDADE: " + estoque.getQuantidade());
                    System.out.println("----------------------------------");
                }
               break;
            }
            case 8: {
                Scanner sc = new Scanner(System.in);

                System.out.println("Informe o ID do cliente: ");
                int idCliente = sc.nextInt();;

                Cliente cliente = (Cliente) usuariosDB.getUsuarioPorID(idCliente);
                System.out.println("ID: " + cliente.getId());
                System.out.println("NOME: " + cliente.getNome());
                System.out.println("TIPO: " + cliente.getTipoUsuario());
                System.out.println("---------------------------------------------");

                System.out.println("Informe o ID do produto: ");
                int idProduto = sc.nextInt();
                Produto produto = produtosDB.getProdutoPorId(idProduto);
                System.out.println("PRODUTO ID: " + produto.getId());
                System.out.println("PRODUTO DESCRIÇÃO: " + produto.getDescricao());
                System.out.println("PRODUTO VALIDADE: " + produto.getDataValidade());
                System.out.println("---------------------------------------------");

                System.out.println("Informe a quantidade: ");
                int quantidade = sc.nextInt();

                PedidoVenda novoPedido = new PedidoVenda(cliente, produto, quantidade);
                pedidoVendaDB.addNovoPedidoVenda(novoPedido);

                break;
            }
            case 9: {
                System.out.println("-----------------------------------");
                System.out.println("--- LISTANDO PEDIDOS DE VENDA -----");
                System.out.println("-----------------------------------");
                for (PedidoVenda pedidoVenda : pedidoVendaDB.getPedidoVendas()) {
                    System.out.println("ID: " + pedidoVenda.getId());
                    System.out.println("CLIENTE: " + pedidoVenda.getCliente().getNome());
                    System.out.println("PRODUTO: " + pedidoVenda.getProduto().getDescricao());
                    System.out.println("TIPO: " + pedidoVenda.getQuantidade());
                    System.out.println("VALOR TOTAL: " + pedidoVenda.getValorTotal());
                    System.out.println("----------------------------------");
                }
                break;
            }
        }
    }
}
