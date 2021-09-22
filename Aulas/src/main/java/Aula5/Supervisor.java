package Aula5;

public class Supervisor extends Funcionario {
    private String turno;

    Supervisor(String pNome){
        super(pNome);
    }

    Supervisor(String pNome, String pEndereco) {
        super(pNome, pEndereco);
    }

    Supervisor(String pNome, String pEndereco, String pEmail) {
        super(pNome, pEndereco, pEmail);
    }

    Supervisor(String pNome, String pEndereco, String pEmail, Double pSalario) {
        super(pNome, pEndereco, pSalario, pEmail);
    }

    Supervisor(String pNome, String pEndereco, Double pSalario, String pEmail, String pTurno) {
        super(pNome, pEndereco, pSalario, pEmail);
        this.turno = pTurno;
    }

    @Override
    public void registraPonto(){
        System.out.println("Supervisor troca turno");
    }

    @Override
    public void aumentarSalario(double pAumento){
        this.salario = (salario + pAumento) * 1.30;
        System.out.println("O saláro do funcionário é: "+this.salario);
    }

    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }
}
