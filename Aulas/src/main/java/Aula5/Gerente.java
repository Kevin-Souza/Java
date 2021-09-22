package Aula5;

public class Gerente extends Funcionario {
    private String senha;

    Gerente(String pNome){
        super(pNome);
    }

    Gerente(String pNome, String pEndereco) {
        super(pNome, pEndereco);
    }

    Gerente(String pNome, String pEndereco, String pEmail) {
        super(pNome, pEndereco, pEmail);
    }

    Gerente(String pNome, String pEndereco, String pEmail, Double pSalario) {
        super(pNome, pEndereco, pSalario, pEmail);
    }

    Gerente(String pNome, String pEndereco, Double pSalario, String pEmail, String pSenha) {
        super(pNome, pEndereco, pSalario, pEmail);
        this.senha = pSenha;
    }

    @Override
    public void registraPonto(){
        System.out.println("Gerente não marca ponto");
    }

    @Override
    public void aumentarSalario(double pAumento){
        this.salario = (salario + pAumento) * 1.50;
        System.out.println("O saláro do funcionário é: "+this.salario);
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
}
