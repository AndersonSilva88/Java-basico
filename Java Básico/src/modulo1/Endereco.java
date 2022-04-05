package modulo1;

import java.util.Scanner;

public class Endereco {

    public static void main(String[] args) {
        System.out.println("---CADASTRO DE USUÁRIOS---");

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome completo: ");
        String nome = sc.nextLine();

        System.out.print("Insira no nome da rua: ");
        String rua = sc.nextLine();

        System.out.print("Digite o número da residencia: ");
        String numero = sc.nextLine();

        System.out.print("Digite o nome do Bairro: ");
        String bairro = sc.nextLine();

        System.out.print("Digite nome da cidade: ");
        String cidade = sc.nextLine();

        System.out.print("Digite nome do estado: ");
        String estado = sc.nextLine();

        System.out.print("Digite o cep: ");
        String cep = sc.nextLine();

        System.out.println("Nome completo: " + nome);
        System.out.println("Endereço: " + rua + "," + numero + "," + bairro + "," + cidade + "," + estado);
        System.out.println("CEP: " + cep);


        sc.close();
    }
}
