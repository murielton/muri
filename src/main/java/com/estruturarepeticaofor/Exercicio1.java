package main.java.com.estruturarepeticaofor;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int numero = scanner.nextInt();

        for (int i = 0; i <= numero; i++) {
            System.out.println(i);


        }
    }
}
