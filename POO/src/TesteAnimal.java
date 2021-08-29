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
        System.out.println("========= Animal 1");
        //Criar objeto P1 (instância da classe)
        Animal a1 = new Animal();
        
        //Usar atributos do objeto 1
        a1.setNomeAnimal("Denys");
        a1.setEspecie("Homo Sapiens Sapiens");
        a1.setSexo('M');
        a1.setAltura(1.75);
        a1.setPeso(75);
        
        //usar atributos
        a1.imprimir();
        a1.comer();
        
        Animal a2 = new Animal();
        a2.imprimir();
        
        Animal a3 = new Animal(10.3,1);
        a3.imprimir();
    }
}
