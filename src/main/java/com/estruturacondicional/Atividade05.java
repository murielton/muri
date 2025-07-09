package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();


        System.out.println("Digite o primeira nota:");
        double primeiraNota = scanner.nextDouble();

        System.out.println("Digite o segunda nota:");
        double segundaNota = scanner.nextDouble();

        System.out.println("Digite o terceira nota:");
        double terceiraNota= scanner.nextDouble();

        System.out.println("O resultado da média é:");

        double media = ((primeiraNota + segundaNota + terceiraNota) / 3);

        if (media >= 7) {
            System.out.println(nome + " voce está aprovado:" + media);
        }else
            System.out.println(nome + " voce está reprovado:" + media);
        }

    }



