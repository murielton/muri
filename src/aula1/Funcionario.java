package aula1;

import java.util.Scanner;

public class Funcionario {
    private String nome;
    private String matricula;
    private String turno;
    private double salarioBase;

    // Getters
    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getTurno() {
        return turno;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

//parara
    public void getDados() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome: " + this.nome);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Turno: " + this.turno);
        System.out.println("Salario Base: " + this.salarioBase);
        System.out.println("Salario Final: " + getSalarioFinal());
    }

    public double getSalarioFinal() {
        if (turno.equalsIgnoreCase("noite")) {
            return salarioBase * 1.2;
        } else {
            return salarioBase;
        }
    }
}
