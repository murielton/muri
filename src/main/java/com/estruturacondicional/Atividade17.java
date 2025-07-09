package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Atividade17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a refeiçao");
        System.out.println("Vegetariano, Peixe, Frango ou Carne");
        String refeicao = scanner.next();
        System.out.println("Digite a sobremesa");
        System.out.println("Abacaxi, Sorvete ou Mousse");
        String sobremessa = scanner.next();
        System.out.println("Digite a bebida");
        System.out.println("Suco ou Refri");
        String bebida = scanner.next();

        int calorias = 0;

        if (refeicao.equals("Vegetariano")) {
            calorias = 180;
        } else if (refeicao.equals("Peixe")) {
            calorias = calorias = 230;
        } else if (refeicao.equals("Frango")) {
            calorias = calorias = 250;
        } else if (refeicao.equals("Carne")) {
            calorias = calorias = 350;
        }

        if (refeicao.equals("Abacaxi")) {
            calorias = calorias + 75;
        } else if (refeicao.equals("Sorvete")) {
            calorias = calorias + 110;
        } else if (refeicao.equals("Mousse")) {
            calorias = calorias + 200;
        }
        if (refeicao.equals("Suco")) {
            calorias = calorias + 80;
        } else if (refeicao.equals("Refri")) {
            calorias = calorias + 200;

        }

        System.out.println("A quantidade de calorias é:" + calorias);

    }
}