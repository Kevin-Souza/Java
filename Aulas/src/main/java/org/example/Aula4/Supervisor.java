package org.example.Aula4;

public class Supervisor extends Funcionario {
    private String turno;

    public Supervisor(String nome, String endereco, Double salario, String email, String turno){
        super(nome, endereco, salario, email);
        this.turno = turno;
    }

    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }
}
