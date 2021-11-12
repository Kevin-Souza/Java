package br.com.supermercadoreges.modelo;

import java.util.Date;

public class Funcionario extends Pessoa {
    private String salario;
    private String pis;

    public Funcionario(String Nome, String Documento) {
        super(Nome, Documento);
    }

    public Funcionario(String Nome, String Telefone, String Documento, Date DataNascimento, Endereco Endereco) {
        super(Nome, Telefone, Documento, DataNascimento, Endereco);
    }


    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getPis() {
        return pis;
    }

    public void setPis(String pis) {
        this.pis = pis;
    }
}
