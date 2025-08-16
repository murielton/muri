package aula1;

import java.util.Scanner;

//servi de molde
public class Conta {
    int numero;
    String titular;
    double saldo;
    //funções da conta
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
