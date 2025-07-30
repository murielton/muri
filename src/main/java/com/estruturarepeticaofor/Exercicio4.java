package main.java.com.estruturarepeticaofor;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int numero = scanner.nextInt();

        for (int i = 1; i <= numero ; i++) {
            if (i % 2 == 0) {
                System.out.println(i);

            }

        }
    }
}
