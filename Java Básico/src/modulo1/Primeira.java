package modulo1;

import java.util.Scanner;

public class Primeira {

    public static void main(String[] args) {
        System.out.println("curso de java");
        Scanner sc = new Scanner(System.in);

        System.out.println("Oi, qual e o seu nome: ");
        String nome = sc.next();

        System.out.println("oi, " + nome + ", tudo bem?");
    }
}
