package modulo9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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
        Cliente cli2 = new Cliente("Java", true, "abc", 1);
        Cliente cli3 = new Cliente("Kotlin", true, "abc", 5);
        Cliente cli4 = new Cliente("HTML", true, "abc", 4);
        Cliente cli5 = new Cliente("CSS", true, "abc", 3);
        Cliente cli6 = new Cliente("JavaScript", true, "abc", 2);
        Cliente cli7 = new Cliente("PHP", true, "abc", 4);
        Cliente cli8 = new Cliente("C", true, "abc", 3);
        Cliente cli9 = new Cliente("Spring", true, "abc", 8);
        Cliente cli10 = new Cliente("Angular", true, "abc", 1);

        List<Cliente> clientes = Arrays.asList(cli1, cli2, cli3, cli4, cli5, cli6, cli7, cli8, cli9, cli10);

        Comparator<Cliente> compraMaior = Comparator.comparing(Cliente::getCompras);
        List<Cliente> maiorCompra = clientes.stream().max(compraMaior).stream().collect(Collectors.toList());
        System.out.println("Cliente maior compra: " + maiorCompra);
        System.out.println("======================================");

        Comparator<Cliente> compraMenor = Comparator.comparing(Cliente::getCompras);
        List<Cliente> menorCompra = clientes.stream().min(compraMenor).stream().collect(Collectors.toList());
        System.out.println("Cliente menor compra: " + menorCompra);
        System.out.println("======================================");

        double mediaCompra = clientes.stream().mapToInt(Cliente::getCompras).average().getAsDouble();
        System.out.println("Media de compras: " + mediaCompra);
        System.out.println("======================================");

//        cli1.autentica("456");
//
//        List<Cliente> clientes = Arrays.asList(cli1, cli2);
//        MostraCliente mostra = new MostraCliente();
//        clientes.forEach(mostra);

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

//        Stream<Cliente> stream = clientes.stream().filter(cliente -> cliente.getCompras() >= 8 );
//
//        List<Cliente> selecionados = stream.collect(Collectors.toList());
//        selecionados.forEach(cliente -> System.out.println(cliente.getCompras()));


    }


}
