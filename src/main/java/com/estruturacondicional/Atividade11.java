package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Atividade11 {  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite quantidade de cópias:");
    double copias = scanner.nextDouble();

    if ((copias >= 1) && (copias <= 10)) {
        System.out.println(copias * 0.10);
    } else if ((copias >= 11) && (copias <= 50)){
        System.out.println(copias * 0.8);
    }else if(copias > 50){
        System.out.println(copias * 0.05);
    }
}
}

