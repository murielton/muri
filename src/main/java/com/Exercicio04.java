package main.java.com;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o dividendo: ");
        double primeiroNumero = scanner.nextDouble();

        System.out.println("Digite o divisor: ");
        double segundoNumero = scanner.nextDouble();

        double quociente = (primeiroNumero/segundoNumero);
        double restoDivisao = (primeiroNumero%segundoNumero);
        System.out.println("O quociente será: " +restoDivisao);
        System.out.println("O resto da divisao sera: " +restoDivisao);
    }
}
