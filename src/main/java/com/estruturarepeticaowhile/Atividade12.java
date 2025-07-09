package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero");
        int numeroX = scanner.nextInt();
        int valorY = 0;
        int contador = 1;


        while (contador<=20){
            if (contador % 1 == 0){
                valorY = valorY +(contador * numeroX);
                contador++;

            }

        }
        System.out.println("o valor de Y é :" +valorY);
    }
}




