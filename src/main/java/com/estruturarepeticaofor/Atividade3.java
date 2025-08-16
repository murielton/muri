package main.java.com.estruturarepeticaofor;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[6];
        int totalPares = 0;


        System.out.println("Digite 6 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();


            if (numeros[i] % 2 == 0) {
                totalPares++;
            }
        }


        System.out.println("Total de números pares: " + totalPares);


    }
}

