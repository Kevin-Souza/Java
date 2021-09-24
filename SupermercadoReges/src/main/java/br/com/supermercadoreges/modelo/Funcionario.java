package br.com.supermercadoreges.modelo;

public class Funcionario extends Pessoa {
    private String salario;
    private String pis;






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
