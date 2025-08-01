package main.java.com.estruturarepeticaofor;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um nome:");
        String nome = scanner.next();

        for (int i = 0; i < nome.length(); i++) {
            System.out.println(nome.split("")[i]);
        }
    }
}
