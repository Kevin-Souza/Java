package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Livro l1 = new Livro();
        l1.setTitulo("As Crônicas de Narnia");
        Emprestimo e1 = new Emprestimo();

        e1.setLivroE(l1);
    }
}
