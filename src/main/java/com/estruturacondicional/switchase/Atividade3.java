package main.java.com.estruturacondicional.switchase;

import java.util.Scanner;



    public class Atividade3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.print("Digite o valor inteiro positivo X: ");
            int X = scanner.nextInt();

            System.out.print("Digite o valor real A: ");
            double A = scanner.nextDouble();

            System.out.print("Digite o valor real B: ");
            double B = scanner.nextDouble();


            System.out.println("Valores :");
            System.out.println("X = " + X);
            System.out.println("A = " + A);
            System.out.println("B = " + B);


            switch (X) {
                case 1:

                    double soma = A + B;
                    System.out.println("Resultado da soma de A e B: " + soma);
                    break;
                case 2:

                    if (B != 0) {
                        double divisao = A / B;
                        System.out.println("Resultado da divisão de A por B: " + divisao);
                    } else {
                        System.out.println("Erro: divisão por zero não é permitida.");
                    }
                    break;
                case 3:

                    if (A < B) {
                        System.out.println("Valores em ordem crescente: " + A + " e " + B);
                    } else {
                        System.out.println("Valores em ordem crescente: " + B + " e " + A);
                    }
                    break;
                case 4:

                    double maior = Math.max(A, B);
                    double menor = Math.min(A, B);
                    double diferenca = maior - menor;
                    System.out.println("Diferença entre o maior e o menor valor: " + diferenca);
                    break;
                case 5:

                    double media = (A + B) / 2;
                    System.out.println("Soma de A e B: " + media);
                    break;
                default:

                    System.out.println("Erro: valor de X inválido. Deve ser entre 1 e 5.");
                    break;
            }

            scanner.close();
        }
    }