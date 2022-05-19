package bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Numero da conta: ");
        double numero = sc.nextDouble();

        System.out.println("numero da agencia");
        int agencia = sc.nextInt();

        System.out.print("Nome do banco: ");
        String banco = sc.nextLine();

        System.out.print("Informe o saldo: ");
        double saldo = sc.nextDouble();

        ContaCorrente cc = new ContaCorrente(numero, agencia, banco, saldo );
        System.out.println("Realizar saque: " );
        double saque = sc.nextDouble();
        cc.sacar(saque);
        System.out.println("saldo atual: " + cc.getSaldo());



    }
}
