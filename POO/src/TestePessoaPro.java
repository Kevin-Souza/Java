/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevin
 */
public class TestePessoaPro {
       public static void main (String[] args){
    
        System.out.println("========= Pessoa 1");
        PessoaPro p1 = new PessoaPro();
        
        //Usar ATRIBUTOS do objeto P1
        p1.setNome("Kevin");
        p1.setIdade(19);
        p1.setSexo("Masculino");
        p1.setAltura(1.80f);
        p1.setPeso(78f);
        p1.setRg("11.111.111-1");
        
        // Usar métodos do objeto P1
        p1.imprimir();
        p1.falar();
        p1.comer();
        p1.andar();
        }
}
