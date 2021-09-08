package org.example;

public class Emprestimo {
    private int IDEmp;
    private Leitor LeitorE;
    private Livro LivroE;

    public int getIDEmp() {
        return IDEmp;
    }
    public void setIDEmp(int IDEmp) {
        this.IDEmp = IDEmp;
    }

    public Leitor getLeitorE() {
        return LeitorE;
    }

    public void setLeitorE(Leitor leitorE) {
        LeitorE = leitorE;
    }

    public Livro getLivroE() {
        return LivroE;
    }
    public void setLivroE(Livro livroE) {
        LivroE = livroE;
    }
}
