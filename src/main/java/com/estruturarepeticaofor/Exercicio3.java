package main.java.com.estruturarepeticaofor;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade:");
        int quantidade = scanner.nextInt();

        int soma = 0;

        for (int i = 1; i <= quantidade ; i++) {
            System.out.println("Digite um numero");
            int numero = scanner.nextInt();
            soma = soma + numero;

        }
        System.out.println("A soma e:" + soma);
    }
}
