package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scanner.nextInt();
        int contador = 1;

        while (contador < 5) {
            int proximoNumero = numero = contador;
            if (proximoNumero % 1 == 0) {
                System.out.println(proximoNumero);

            }
            contador++;
        }
    }
}

