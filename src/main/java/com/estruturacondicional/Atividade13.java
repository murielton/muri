package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite numero1:");
        int numero1 = scanner.nextInt();
        System.out.println("Digite numero2:");
        int numero2 = scanner.nextInt();
        System.out.println("Digite numero3:");
        int numero3 = scanner.nextInt();


        int menor, meio, maior;


        if ((numero1 > numero2) && (numero1 > numero3)) {
            maior = numero1;
            if (numero2 > numero3) {
                meio = numero2;
                menor = numero3;
            } else {
                meio = numero3;
                menor = numero2;
            }
        } else if (numero2 > numero3) {
            maior = numero2;

            if (numero3 > numero1) {
                meio = numero3;
                menor = numero1;
            } else {
                meio = numero1;
                menor = numero3;
            }
        } else {
            maior = numero3;
            if (numero2 > numero1) {
                meio = numero2;
                menor = numero1;

            } else {
                meio = numero1;
                menor = numero2;
            }

        }
        System.out.println(menor + "," + meio + "," + maior);
    }
}