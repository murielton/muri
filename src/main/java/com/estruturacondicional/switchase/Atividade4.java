package main.java.com.estruturacondicional.switchase;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero");
        int numero = scanner.nextInt();

        switch (numero) {
            case 1 :
                System.out.println("O livro pertence a categoria de  ficção");
                break;
            case 2 :
                System.out.println("O livro pertence a categoria de não ficção");
                break;
            case 3 :
                System.out.println("O livro pertence a categoria de  romance");
                break;
            case 4 :
                System.out.println("O livro pertence a categoria de terro");
                break;
            case 5 :
                System.out.println("O livro pertence a categoria de misterio");
                break;
            default:
                System.out.println("Categotia invalida");
                break;

        }
    }
}
