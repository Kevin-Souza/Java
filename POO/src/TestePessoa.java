/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevin
 */
public class TestePessoa {
    public static void main (String[] args){
    
        System.out.println("========= Pessoa 1");
        //Criar objeto P1 (instância da classe)
        Pessoa p1 = new Pessoa();
        
        //Usar ATRIBUTOS do objeto P1
        p1.nome = "João da Silva";
        p1.idade = 22;
        p1.sexo = 'M';
        p1.altura = 1.78f;
        p1.peso = 78.50f;
        
        // Usar métodos do objeto P1
        p1.imprimir();
        p1.falar();
        
        System.out.println("========= Pessoa 2");
        //Criar objeto P2 (instância da classe)
        Pessoa p2 = new Pessoa();
        
        //Usar ATRIBUTOS do objeto P2
        p2.nome = "Ana Maria";
        p2.idade = 34;
        p2.sexo = 'F';
        p2.altura = 1.62f;
        p2.peso = 59.00f;
        
        // Usar Métodos do objeto P2
        p2.imprimir();
        p2.correr();
        
        System.out.println("========= Pessoa 3");
        // criar objeto P2 (instância da classe)
        Pessoa p3 = new Pessoa();
        
        //Usar ATRIBUTOS do objeto P3
        p3.nome = "Isabella";
        p3.idade = 12;
        p3.sexo = 'F';
        p3.altura = 1.42f;
        p3.peso = 38.50f;
        
        // Usar Métodos do objeto P3
        p3.imprimir();
        p3.andar();
        p3.falar();
        
    }
    
}
