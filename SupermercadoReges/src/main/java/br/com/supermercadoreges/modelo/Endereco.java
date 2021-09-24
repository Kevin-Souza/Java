package br.com.supermercadoreges.modelo;

public class Endereco {
    private String id;
    private String logradouro;
    private String bairro;
    private String cep;
    private String cidade;
    private String complemento;
    private String numero;
    private String uf;


    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public String getLogradouro() {
        return logradouro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getBairro() {
        return bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
