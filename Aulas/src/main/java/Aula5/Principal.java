package Aula5;

public class Principal {
    public static void  main(String[] args){

        Supervisor sup = new Supervisor("Toninho","Bar do Toninho");
        System.out.println("Supervisor: "+sup.getNome());
        System.out.println(sup.getEndereco());
        sup.registraPonto();
        sup.setSalario(1000);
        sup.aumentarSalario(100);
        System.out.println("============================");

        Gerente gere = new Gerente("Pedrão");
        System.out.println("Gerente: " +gere.getNome());
        gere.registraPonto();
        gere.setSalario(1000);
        gere.aumentarSalario(100);
        System.out.println("============================");

        Funcionario fun = new Funcionario("Tião");
        System.out.println("Funcionário: "+fun.getNome());
        fun.registraPonto();
        fun.setSalario(1000);
        fun.aumentarSalario(100);
        System.out.println("============================");
    }
}
