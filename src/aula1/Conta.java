package aula1;

import java.util.Scanner;

//servi de molde
public class Conta {
   private int numero;
    private String titular;
    private double saldo;
    private String senha;
    //funções da conta

//Getter - pegar o conteudo da variavel
    public int getNumero() {
        return numero;
    }

//Setter - setar o conteudo(declarar)


    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void imprimirDados(){//conta,imprimirDados();

        System.out.println("***Dados da Conta***");
        System.out.println("Numero: "+this.numero);
        System.out.println("Titular: "+this.titular);
        System.out.println("Saldo: "+this.saldo);

    }
    public void sacar(){


    }
    public void depositar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanto voce quer depositar?");
        double valorDeposito = scanner.nextDouble();
        this.saldo += valorDeposito;
        System.out.println("Saldo atual:"+this.saldo);

    }
}
