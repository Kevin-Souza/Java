package org.example.endereco;

public class enderecoTest {
    public static void main (String[] args){
        //Pessoa
        Pessoa p1 = new Pessoa();
        p1.setNome("Gertrudez");
        p1.setTelefone("(95) 99999-9999");
        p1.setEmail("gertrudez@gmail.com");

        //Endereço
        Endereco e1 = new Endereco();
        e1.setCidade("Pradópolis");
        e1.setBairro("Onde Judas perdeu as botas");
        e1.setComplemento("-");
        e1.setLogradouro("Rua das Estrelas");
        e1.setCEP(9999999);

        p1.setEndereco1(e1);

        System.out.println("Nome: "+p1.getNome());
        System.out.println("Telefone: "+p1.getTelefone());
        System.out.println("Email: "+p1.getEmail());

        if (p1 != null && p1.getEndereco1() != null) {
            System.out.println("Cidade: "+p1.getEndereco1().getCidade());
            System.out.println("Bairro: "+p1.getEndereco1().getBairro());
            System.out.println("Logradouro: "+p1.getEndereco1().getLogradouro());
            System.out.println("Complemento: "+p1.getEndereco1().getComplemento());
            System.out.println("CEP: "+p1.getEndereco1().getCEP());
        }
    }
}
