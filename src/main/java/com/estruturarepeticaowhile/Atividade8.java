package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador=0;
        int quantidadeCidadeMenorQueDez = 0;
        double somaTemperatura = 0;
        int quantidadeCidade = 5;
        int quantidade = 0;
        while (contador <5){
            System.out.println("Digite a temperatura:");
            double temperatura = scanner.nextDouble();

            if (temperatura<10){
                quantidadeCidadeMenorQueDez++;
            }

            somaTemperatura +=temperatura;
            contador++;
        }
    }
}




