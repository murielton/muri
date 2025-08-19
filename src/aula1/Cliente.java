package aula1;

import java.util.Date;
import java.util.Scanner;

//deixar private e criar os getters e setters
//Criar um objeto cliente no main
public class Cliente {
   private String nome;
    private String cpf;
    private String telefone;
    private String dataNascimento;
    private String email;
    private String senha;

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;


    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    public void formulario() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome");
        setNome(scanner.next());
        System.out.println("Cpf");
        setCpf(scanner.next());
        System.out.println("Telefone");
        setTelefone(scanner.next());
        System.out.println("DataNascimento");
        setDataNascimento(scanner.next());
        System.out.println("Email");
        setEmail(scanner.next());
        System.out.println("Senha");
        setSenha(scanner.next());
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", telefone='" + telefone + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}

