package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        double numero1 = scanner.nextDouble();
        System.out.println("Digite o segundo numero: ");
        double numero2 = scanner.nextDouble();

        if (numero1 != numero2) {
            if (numero1 > numero2) {
                System.out.println(numero1 + numero2);
            } else {
                System.out.println(numero1 * numero2);
            }
        }
    }
}

