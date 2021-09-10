package org.example.Biblioteca;

import javax.sound.midi.Soundbank;

public class Emprestimo {
    private Leitor LeitorE;
    private Livro LivroE;

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

    public void emprestar(Livro LivroE, Leitor LeitorE){
        this.LivroE = LivroE;
        this.LeitorE = LeitorE;
        System.out.println("Livro: "+LivroE.getTitulo()+" foi atribuido ao Leitor: "+LeitorE.getNome());
    }

    public void devolver(Livro livroE, Leitor leitorE){
        this.LivroE = null;
        this.LeitorE = null;
        System.out.println("O livro foi devolvido");
    }

    public void status(Livro livroE, Leitor leitorE){
        if (LivroE == null || LeitorE == null ){
            System.out.println("====================================");
            System.out.println("Não há livros emprestados no momento");
            System.out.println("====================================");
        }else{
            System.out.println("====================================");
            System.out.println("O Livro: "+LivroE.getTitulo()+" está com o leitor: "+LeitorE.getNome());
            System.out.println("====================================");
        }
    }
}
