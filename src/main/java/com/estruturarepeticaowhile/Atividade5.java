package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soma = 0;
        int contador = 0;

        while (true) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                break;
            }
            contador++;
            soma = soma + numero;
        }
        double media = soma / contador;
        System.out.println("A média é: " + media);
    }
}








