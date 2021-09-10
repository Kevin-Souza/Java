package org.example.Aula4;

public class Funcionario {
    private String nome;
    private String endereco;
    private Double salario;
    private String email;

    public Funcionario(String nome, String endereco, Double salario, String email){
        this.nome = nome;
        this.endereco = endereco;
        this.salario = salario;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void imprimir(){
        System.out.println("Informações do Funcionário \nNome:"+nome +
                "\nEndereço: "+endereco+"\nSalário: "+salario+"\nemail: "+email);
    }

}
