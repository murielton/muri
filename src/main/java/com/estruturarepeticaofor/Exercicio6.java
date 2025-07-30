package main.java.com.estruturarepeticaofor;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite um numero:");
            int numero = scanner.nextInt();

            for (int i = numero; i >= 1; i--) {
                System.out.println(i);


            }
        }
    }


