package main.java.com;

import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da mercadoria:");
        String nome = scanner.nextLine();

        System.out.println("Digite o preço de compra:");
        double compra = scanner.nextDouble();

        System.out.println("digite o preço de venda:");
        double venda = scanner.nextDouble();

        double lucro = (venda-compra);

        System.out.println("A mercadoria" +nome);
        System.out.println("Obteve um lucro de:" +lucro);


    }
}
