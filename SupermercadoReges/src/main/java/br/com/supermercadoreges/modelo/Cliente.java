package br.com.supermercadoreges.modelo;

import java.util.Date;

public class Cliente extends Pessoa{
    private String numeroCartaoFidalidade;

    public Cliente(String Nome,  String Documento){
        super(Nome, Documento);

    };

    public Cliente(String Nome, String Telefone, String Documento, Date DataNascimento, Endereco Endereco,String numeroCartaoFidalidade){
        super(Nome, Telefone, Documento, DataNascimento, Endereco);
        this.numeroCartaoFidalidade = numeroCartaoFidalidade;
    };






    public String getNumeroCartaoFidalidade() {
        return numeroCartaoFidalidade;
    }

    public void setNumeroCartaoFidalidade(String numeroCartaoFidalidade) {
        this.numeroCartaoFidalidade = numeroCartaoFidalidade;
    }
}
