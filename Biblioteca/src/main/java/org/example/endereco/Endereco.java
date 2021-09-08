package org.example.endereco;

public class Endereco {
    private String Logradouro;
    private String Cidade;
    private String Bairro;
    private String Complemento;
    private int CEP;

    public int getCEP() {
        return CEP;
    }
    public void setCEP(int CEP) {
        this.CEP = CEP;
    }

    public String getBairro() {
        return Bairro;
    }
    public void setBairro(String bairro) {
        Bairro = bairro;
    }

    public String getCidade() {
        return Cidade;
    }
    public void setCidade(String cidade) {
        Cidade = cidade;
    }

    public String getComplemento() {
        return Complemento;
    }
    public void setComplemento(String complemento) {
        Complemento = complemento;
    }

    public String getLogradouro() {
        return Logradouro;
    }
    public void setLogradouro(String logradouro) {
        Logradouro = logradouro;
    }
}
