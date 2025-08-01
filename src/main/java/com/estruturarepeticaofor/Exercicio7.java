package main.java.com.estruturarepeticaofor;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int numero = scanner.nextInt();
        int somaFatorial = 1;

        for (int i = 1; i <= numero ; i++) {
            somaFatorial = somaFatorial * i;

        }
        System.out.println("fatorial: " + somaFatorial);
    }
}
