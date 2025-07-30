package main.java.com.estruturarepeticaofor;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de notas:");
        int quantidade = scanner.nextInt();

        double soma = 0;

        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Digite a nota:");
            double nota = scanner.nextDouble();
            soma = soma + nota;

            }
        double media = soma / quantidade;
            System.out.println("A media e:" + media);
        }
    }






