package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número:");
            int numero = scanner.nextInt();
            int contador = 1;
            if (contador < 0) {
                System.out.println("Nao é permitido número negativo");
                return;

            }
            while (contador <= 10) {
                System.out.println(numero + contador);
            contador++;

        }


    }
}


