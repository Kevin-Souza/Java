package org.example.Biblioteca;

/**
 * Hello world!
 *
 */
public class Biblioteca
{
    public static void main( String[] args )
    {
        //livro
        Livro l1 = new Livro();
        l1.setTitulo("As Crônicas de Narnia");
        l1.setAutor("C. S. Lewis");

        //Leitor
        Leitor le1 = new Leitor();
        le1.setNome("Lucas");
        le1.setDataNascimento("2021-07-10");

        //Empréstimo
        Emprestimo e1 = new Emprestimo();

        e1.status(l1,le1);
        System.out.println("---");
        e1.emprestar(l1,le1);
        e1.status(l1,le1);
        System.out.println("----");
        e1.devolver(l1,le1);
        e1.status(l1,le1);
    }
}
