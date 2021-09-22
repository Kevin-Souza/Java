package org.example.Lanchonete;

public class Cliente {
    private String nome;
    private String celular;
    private String endereco;
    private int nunResidencia;
    private String cidade;
    private String cep;

    Cliente(String nome, String celular, String endereco, int nunResidencia, String cidade, String cep){
        this.nome = nome;
        this.celular = celular;
        this.endereco = endereco;
        this.nunResidencia = nunResidencia;
        this.cidade = cidade;
        this.cep = cep;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNunResidencia() {
        return nunResidencia;
    }

    public void setNunResidencia(int nunResidencia) {
        this.nunResidencia = nunResidencia;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
