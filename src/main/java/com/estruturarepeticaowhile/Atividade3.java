package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 1;
        int soma = 0;

        while (contador < 11) {
            System.out.println("Digite o número ");
            int numero = scanner.nextInt();
            if (numero % 2 == 0) {
                soma = soma + numero;
        }

        contador++;
    }
        System.out.println("A soma dos números é:" + soma);

}
}






