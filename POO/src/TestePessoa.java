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
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
