package Aula5;

public class Funcionario {
    private String nome;
    private String endereco;
    protected double salario;
    private String email;

    Funcionario(String pNome){
        this.nome = pNome;
    }

    Funcionario(String pNome, String pEndereco){
        this.nome = pNome;
        this.endereco = pEndereco;
    }

    Funcionario(String pNome, String pEncereco, String pEmail){
        this.nome = pNome;
        this.endereco = pEncereco;
        this.email = pEmail;
    }

    Funcionario(String nome, String endereco, Double salario, String email){
        this.nome = nome;
        this.endereco = endereco;
        this.salario = salario;
        this.email = email;
    }

    public void aumentarSalario(double pAumento){
        this.salario = salario + pAumento;
        System.out.println("O saláro do funcionário é: "+this.salario);
    }

    public void registraPonto(){
        System.out.println("Funcionário registrou o ponto !");
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
