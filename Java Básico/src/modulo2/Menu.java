package modulo2;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        System.out.println("| MENU       |");
        System.out.println("| OPÇÕES     |");
        System.out.println("| 1. Opção 1 |");
        System.out.println("| 2. Opção 2 |");
        System.out.println("| 3. Sair    |");
        Scanner sc = new Scanner(System.in);

        System.out.println("Selecione uma opção: ");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Opcao 1 selecionada");
                break;
            case 2:
                System.out.println("Opcao 2 selecionada");
                break;
            case 3:
                System.out.println("Sair");
                break;
            default:
                System.out.println("Opcão invalida!!");
                break;
        }
    }
}
