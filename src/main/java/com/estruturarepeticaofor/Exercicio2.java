package main.java.com.estruturarepeticaofor;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int numero = scanner.nextInt();


        for (int i = 1; i <= 10 ; i++) {
            System.out.println(numero + "X" + i + "=" +(i * numero));


        }
    }
}
