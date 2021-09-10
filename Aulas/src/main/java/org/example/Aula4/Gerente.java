package org.example.Aula4;

public class Gerente extends Funcionario {
    private String senha;

    public Gerente(String nome, String endereco, Double salario, String email, String senha){
        super(nome, endereco, salario, email);
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
}
