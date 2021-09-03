package org.example;

public class AgendaTest {
    public static void main (String[] args){
        Agenda ag1 = new Agenda();
        ag1.setNome("Denys");
        ag1.setTelefone(99999999);

        Agenda ag2 = new Agenda();
        ag2.setNome("Rodrigo");
        ag2.setTelefone(99999999);

        Agenda ag3 = new Agenda();
        ag3.setNome("Evailton");
        ag3.setTelefone(888888888);
        ag3.setEndereco("Rua dos Prantos");

        Agenda ag4 = new Agenda();
        ag4.setNome("Gertrudez");
        ag4.setTelefone(99999999);

        Agenda ag5 = new Agenda();
        ag5.setNome("Faustão");
        ag5.setTelefone(99999999);

        System.out.println(ag1.getTelefone());
        System.out.println("nome: "+ag3.getNome() +" Endereço: "+ag3.getEndereco());

    }
}
