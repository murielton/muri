package aula1;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //construir um objeto conta

        Cliente cliente = new Cliente();
        System.out.println("Nome");
        cliente.setNome(scanner.next());
        System.out.println("Cpf");
        cliente.setCpf(scanner.next());
        System.out.println("Telefone");
        cliente.setTelefone(scanner.next());
        System.out.println("DataNascimento");
        cliente.setDataNascimento(scanner.next());
        System.out.println("Email");
        cliente.setEmail(scanner.next());
        System.out.println("Senha");
        cliente.setSenha(scanner.next());
        System.out.println(cliente.toString());

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

