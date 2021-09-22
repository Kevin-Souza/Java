package org.example.Lanchonete;

public class Produto {
    private String nome;
    private String tipo;
    private int quantidade;
    private double valoruni;

    Produto(String nome, String tipo, int quantidade, double valoruni){
        this.nome=nome;
        this.tipo=tipo;
        this.quantidade = quantidade;
        this.valoruni=valoruni;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValoruni() {
        return valoruni;
    }

    public void setValoruni(double valoruni) {
        this.valoruni = valoruni;
    }
}
