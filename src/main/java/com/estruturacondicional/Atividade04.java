package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double primeiroNumero = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double segundoNumero = scanner.nextDouble();

        System.out.println("O resultado é:");
        System.out.println(primeiroNumero + segundoNumero);
        System.out.println(primeiroNumero - segundoNumero);
        System.out.println(primeiroNumero * segundoNumero);
        System.out.println(primeiroNumero / segundoNumero);

    }
}


