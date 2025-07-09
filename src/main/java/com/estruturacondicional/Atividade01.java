package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
final int MAIORIDADE = 18;
        System.out.println("Digite a idade:");
        int idade = scanner.nextInt();

        if (idade >= MAIORIDADE) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }
}
