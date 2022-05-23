package modulo9;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {


    public static void main(String[] args) {
//
//        ContaCorrente cc1 = new ContaCorrente(1, 1,"banco",1000, 1000);
//        ContaCorrente cc2 = new ContaCorrente(2, 1,"banco",100, 100);
//        ContaCorrente cc3 = new ContaCorrente(3, 1,"banco",10, 10);

//        List<ContaCorrente> contas = Arrays.asList(cc1,cc2,cc3);
//
//        for(ContaCorrente conta: contas) {
//            System.out.println(conta);
//        }

        Cliente cli1 = new Cliente("Anderson", true, "123", 2);
        Cliente cli2 = new Cliente("Java", true, "abc", 3);
//        cli1.autentica("456");
//
//        List<Cliente> clientes = Arrays.asList(cli1, cli2);
//        MostraCliente mostra = new MostraCliente();
//        clientes.forEach(mostra);

        List<Cliente> clientes = Arrays.asList(cli1, cli2);

//        Consumer<Cliente> consumer = new Consumer<Cliente>() {
//            @Override
//            public void accept(Cliente cliente) {
//                System.out.println(cliente.getNome());
//            }
//        };
//        clientes.forEach(consumer);

//        Consumer<Cliente> consumer = (Cliente cli) -> {
//            System.out.println(cli.getNome());
//        };
//        clientes.forEach(consumer);

//        clientes.forEach( cli -> System.out.println(cli.getNome()));

//        clientes.forEach(Cliente :: getNome);

//        clientes.forEach(cli -> System.out.println(cli.getCompras()));

        Stream<Cliente> stream = clientes.stream().filter(cliente -> cliente.getCompras() > 2);

        List<Cliente> selecionados = stream.collect(Collectors.toList());
        selecionados.forEach(cliente -> System.out.println(cliente.getCompras()));

    }


}
