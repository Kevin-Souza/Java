package org.example.endereco;

public class Pessoa {
    private String Nome;
    private String Telefone;
    private String Email;
    private Endereco endereco1;

    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }
    public String getTelefone() {
        return Telefone;
    }

    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }


    public Endereco getEndereco1() {
        return endereco1;
    }
    public void setEndereco1(Endereco endereco1) {
        this.endereco1 = endereco1;
    }
}
