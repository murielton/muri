package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        double numero1 = scanner.nextDouble();
        System.out.println("Digite o segundo numero:");
        double numero2 = scanner.nextDouble();
        System.out.println("Digite o terceiro numero:");
        double numero3 = scanner.nextDouble();

        double maior = 0;

        if ((numero1 > numero2) && (numero1 > numero3)) {
            maior = numero1;
        } else if (numero2 > numero3) {
            maior = numero2;
        } else {
            maior = numero3;
        }

            System.out.println("O Maior numero é:" + maior);



    }
}
