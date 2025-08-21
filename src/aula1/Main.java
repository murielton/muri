package aula1;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //construir um objeto conta

      Funcionario funcionario = new Funcionario();
        System.out.println("Nome");
      funcionario.setNome(scanner.next());
        System.out.println("Matricula");
        funcionario.setMatricula(scanner.next());
        System.out.println("Turno");
       funcionario.setTurno(scanner.next());
        System.out.println("SalarioBase");
        funcionario.setSalarioBase(scanner.nextDouble());
        System.out.println("salario final "+funcionario.getSalarioFinal());

//        //criar uma conta2
//        //pedir para o usuario digitar os dados
//        Conta conta2;
//        conta2 = new Conta();
//        System.out.println("Digite o numero da conta:");
//        conta2.setNumero(scanner.nextInt());
//        System.out.println("Digite o titular da conta:");
//        conta2.setTitular(scanner.next());
//        conta2.setSaldo(0);
//        conta2.depositar();
//        conta2.sacar();
//        conta2.imprimirDados();

        }
    }

