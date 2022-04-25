package modulo2;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        System.out.println("CALCULADORA SIMPLES");

        int opcao;
        do {
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Dividir");
            System.out.println("O que voce deseja fazer? (0 para sair): ");

            Scanner sc = new Scanner(System.in);
            opcao = sc.nextInt();
            processar(opcao);

        } while (opcao != 0);
    }

    public static  void processar(int opcao) {
        Scanner sc = new Scanner(System.in);
        switch (opcao) {
            case 1:{
                System.out.println("Somando dois números");

                System.out.println("Digite valor do primeiro número: ");
                int n1 = sc.nextInt();
                System.out.println("Digite o valor do segundo número: ");
                int n2 = sc.nextInt();

                int soma = n1 + n2;
                System.out.println("A soma dos dois números é : " + soma);
                break;
            }

            case 2: {
                System.out.println("Subtração dois números");

                System.out.println("Digite valor do primeiro número: ");
                int n1 = sc.nextInt();
                System.out.println("Digite o valor do segundo número: ");
                int n2 = sc.nextInt();

                int subtracao = n1 - n2;
                System.out.println("A subtração dos dois números é : " + subtracao);
                break;
            }
            case 3: {
                System.out.println("Multiplicação dois números");

                System.out.println("Digite valor do primeiro número: ");
                int n1 = sc.nextInt();
                System.out.println("Digite o valor do segundo número: ");
                int n2 = sc.nextInt();

                int multiplicacao = n1 - n2;
                System.out.println("A multiplicação dos dois números é : " + multiplicacao);
                break;
            }
            case 4: {
                System.out.println("Divisão dois números");

                System.out.println("Digite valor do primeiro número: ");
                double n1 = sc.nextInt();
                System.out.println("Digite o valor do segundo número: ");
                double n2 = sc.nextInt();

                if (n1 == 0 || n2 == 0){
                    System.out.println("Impossivel dividir!!!");
                } else {
                    double divisao = n1 / n2;
                    System.out.println("A divisão dos dois números é : " + divisao);
                }

                break;
            }

        }
    }

}
