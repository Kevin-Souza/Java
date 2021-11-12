package br.com.supermercadoreges.modelo;

import java.util.Date;

public abstract class Pessoa {
    private String id;
    private String nome;
    private String telefone;
    private String email;
    private String documento;
    private Date dataNascimento;
    private Endereco endereco;

    public Pessoa(String Nome,  String Documento){
        this.nome = Nome;
        this.documento = Documento;

    };

    public Pessoa(String Nome, String Telefone, String Documento, Date DataNascimento, Endereco Endereco){
        this.nome = Nome;
        this.telefone = Telefone;
        this.documento = Documento;
        this.dataNascimento = DataNascimento;
        this.endereco = Endereco;
    };







    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
