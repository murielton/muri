package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        while (contador < 3) {
            System.out.println("Número: " + contador);
            contador = contador + 1;
        }
    }
}
