/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevin
 */
public class TesteAnimal {
    public static void main (String[] args){
        System.out.println("========= Pessoa 1");
        //Criar objeto P1 (instância da classe)
        Animal a1 = new Animal();
        
        //Usar atributos do objeto 1
        a1.NomeAnimal = "Denys";
        a1.Especie = "Homo Sapiens Sapiens";
        a1.Sexo = 'M';
        a1.Altura = 1.75;
        a1.Peso = 75;
        
        //usar atributos
        a1.imprimir();
        a1.comer();
    }
}
