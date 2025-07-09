package main.java.com.estruturacondicional.switchase;

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite  n1");
        int n1 = scanner.nextInt();
        System.out.println("Digite  n2");
        int n2 = scanner.nextInt();
        System.out.println("Escolha entre (A)Adição, (S)Subtração, (M)Multiplicação e (D)Divisão ");
        String conta = scanner.next();

        double resultado = 0.0;
        switch ( conta) {
            case "A":
                resultado = n1 + n2;
                break;
            case "S":
                resultado = n1 - n2;
                break;
            case "M":
                ;
                resultado = n1 * n2;
                break;
            case "D":

                resultado = (double) n1 / n2;
                break;

        }
            System.out.println("O resultado é: " + resultado);



        }

}
