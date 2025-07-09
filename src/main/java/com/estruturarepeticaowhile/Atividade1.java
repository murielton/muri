package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int sair = 0;
        String nome = "";
        int totalAlunos = 0;
        while (sair != 1 ){
            System.out.println("Digite um nome");
            nome = scanner.next();
            totalAlunos = totalAlunos + 1;
            System.out.println("Digite  um número diferente de 1 para sair");
            sair = scanner.nextInt();

        }
        System.out.println("A quantidade de alunos é:" + totalAlunos);

    }
}



