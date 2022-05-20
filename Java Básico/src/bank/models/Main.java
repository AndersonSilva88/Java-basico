package bank.models;

import bank.db.ClienteDB;
import bank.db.ContasDB;

import java.text.ParseException;
import java.util.Scanner;

public class Main {

    static ClienteDB clienteDB = new ClienteDB();
    static ContasDB contasDB = new ContasDB();

    public static void main(String[] args) throws Exception{

        System.out.println("********** BANCO MENTORAMA ********");
        int option;
        do {
            System.out.println("1 - CADASTRAR CLIENTE");
            System.out.println("2 - CRIAR CONTA CORRENTE");
            System.out.println("3 - CRIAR CONTA POUPANÇA");
            System.out.println("4 - CRIAR CONTA SALÁRIO");
            System.out.println("5 - LISTAR CONTAS");
            System.out.println("6 - TRANFERENCIA ENTRE CONTAS");
            System.out.println("7 - EXIBIR SALDO TOTAL");
            System.out.println("8 - LISTAR CLIENTES");
            System.out.println("0 - Sair");

            Scanner sc =new Scanner(System.in);

            System.out.println("Qual operação você deseja realizar: ");
            option = sc.nextInt();

            proessarOperacão(option);

        } while(option != 0);

    }

    private static void proessarOperacão(int opcao) throws ParseException {
        switch (opcao) {
            case 1: {
                Scanner sc = new Scanner(System.in);
                System.out.println("CADASTRAR CLIENTE");

                System.out.println("Informe o nome do Cliente");
                String nome = sc.nextLine();

                System.out.println("Informe o ID do Cliente");
                String id = sc.next();


                Cliente cliente = new Cliente(id, nome);
                clienteDB.addNovoCliente(cliente);
                break;
            }
            case 2: {
                Scanner sc = new Scanner(System.in);
                System.out.println("---CRIAR CONTA CORRENTE--");
                System.out.println("Informe o id do cliente: ");
                int id = sc.nextInt();

                System.out.println("Informe o número da Conta: ");
                int numero = sc.nextInt();

                System.out.println("Informe o número da agência: ");
                int agencia = sc.nextInt();

                System.out.println("Informe o ID do banco: ");
                String banco = sc.next();

                System.out.println("Informe o Saldo Inicial da Conta: ");
                double saldo = sc.nextDouble();

                Cliente cliente = clienteDB.getClienteId(id);
                System.out.println("ID CLIENTE: " + cliente.getId());
                System.out.println("NOME DO CLIENTE: " + cliente.getNome());

                Conta contaCorrente = new ContaCorrente(numero, agencia, banco, saldo, cliente);
                contasDB.addNovaConta(contaCorrente);

                break;
            }

            case 3: {
                Scanner sc = new Scanner(System.in);
                System.out.println("---- CRIAR CONTA POUPANÇA -----");
                System.out.println("Informe o id do cliente: ");
                int id = sc.nextInt();

                System.out.println("Informe o número da Conta: ");
                int numero = sc.nextInt();

                System.out.println("Informe o número da Agencia");
                int agencia = sc.nextInt();

                System.out.println("Informe o ID do banco: ");
                String banco = sc.next();

                System.out.println("Informe do Saldo Inicial da Conta:");
                double saldo = sc.nextDouble();

                System.out.println("Informe o dia Aniversario para Rendimento: ");
                int dia = sc.nextInt();
                System.out.println("Dia de Rendimento é dia 10");

                Cliente cliente = clienteDB.getClienteId(id);
                System.out.println("ID CLIENTE: " + cliente.getId());
                System.out.println("NOME DO CLIENTE: " + cliente.getNome());

                Conta contaPoupanca = new ContaPoupanca(numero,agencia,banco, saldo, dia, cliente );
                contasDB.addNovaConta(contaPoupanca);
                break;
            }
            case 4: {
                Scanner sc = new Scanner(System.in);
                System.out.println("----- CRIAR CONTA SALÁRIO -----");
                System.out.println("Informe o id do cliente: ");
                int id = sc.nextInt();

                System.out.println("Informe o número da Conta: ");
                int numero = sc.nextInt();

                System.out.println("Informe o número da agência: ");
                int agencia = sc.nextInt();

                System.out.println("Informe o ID do banco: ");
                String banco = sc.next();

                System.out.println("Informe o Saldo Inicial da Conta: ");
                double saldo = sc.nextDouble();

                Cliente cliente = clienteDB.getClienteId(id);
                System.out.println("ID DO CLIENTE: " + cliente.getId());
                System.out.println("NOME DO CLIENTE: " + cliente.getNome());

                Conta contaSalario = new ContaSalario(numero, agencia, banco,saldo, cliente);
                contasDB.addNovaConta(contaSalario);

                break;
            }
            case 5: {
                Scanner sc = new Scanner(System.in);
                System.out.println("|-------LISTAR CONTAS -------|");

                for (Conta conta : contasDB.getContaList()) {
                    System.out.println(conta.toString());
                    System.out.println("==========================");
                }
                break;
            }
            case 6: {
                Scanner sc= new Scanner(System.in);
                System.out.println("|-------TRANSFERENCIA ENTRE CONTAS--------|");

                System.out.println("Informe o Valor da Transferencia: ");
                double valor = sc.nextDouble();

                System.out.println("Informe a agencia a receber o valor: ");
                int agencia = sc.nextInt();

                System.out.println("Informe a agencia a debitar o valor: ");
                int agenciaDeb = sc.nextInt();

                Conta contaDebito = contasDB.getAgenciaId(agencia);
                Conta contaRecebe = contasDB.getAgenciaId(agenciaDeb);

                contaDebito.tranferencia(contaRecebe, contaDebito, valor);
                System.out.println("Saldo da conta " + contaRecebe.getCliente() + " "+ contaRecebe.getSaldo());
                System.out.println("Saldo da conta " + contaDebito.getCliente() + " "+ contaDebito.getSaldo());
                break;
            }
            case 7: {
                System.out.println("|-----EXIBIR SALDO TOTAL------|");
                double saldoTotal = 0;
                for (Conta conta : contasDB.getContaList()) {
                    saldoTotal += conta.getSaldo();
                }
                System.out.println("O saldo total do banco é R$: " + saldoTotal);
                break;
            }
            case 8: {
                System.out.println("|----LISTAR CLIENTES ----|");

                for (Cliente cliente : clienteDB.getCliente()) {
                    System.out.println(cliente.toString());
                    System.out.println("=========================");
                }
                break;
            }

        }
    }
}

























