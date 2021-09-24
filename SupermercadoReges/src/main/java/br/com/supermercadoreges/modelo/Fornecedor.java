package br.com.supermercadoreges.modelo;

import java.util.ArrayList;
import java.util.Date;

public class Fornecedor extends Pessoa{
    private String razaoSocial;
    private String inscricaoEstadual;
    private String categoria;
    private String tipoProduto;
    private ArrayList<Cnae> cnaes;

    public Fornecedor(String Nome,  String Documento){
        super(Nome, Documento);

    }

    public Fornecedor(String Nome, String Telefone, String Documento, Date DataNascimento, Endereco Endereco,String razaoSocial,
                      String inscricaoEstadual, String categoria, String tipoProduto, ArrayList cnaes){
        super(Nome, Telefone, Documento, DataNascimento, Endereco);
        this.razaoSocial = razaoSocial;
        this.inscricaoEstadual = inscricaoEstadual;
        this.categoria = categoria;
        this.tipoProduto = tipoProduto;
        this.cnaes = cnaes;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public ArrayList<Cnae> getCnaes() {
        return cnaes;
    }

    public void setCnaes(ArrayList<Cnae> cnaes) {
        this.cnaes = cnaes;
    }
}
