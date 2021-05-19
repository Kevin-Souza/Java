/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevin
 */
public class TesteCarro {
    public static void main (String[] args){
        
        //Carro 1
        System.out.println("============ Carro 1");
        // Criar objeto C1 (instância da Classe)
        Carro c1 = new Carro();
        
        //Usar atributos do objeto c1
        c1.setNomeC("Gol");
        c1.setAno(2001);
        c1.setModelo(2002);
        c1.setNumeroPortas(2);
        c1.setFabricante("Volkswagen");
        c1.setCor("Branco");
        c1.setPlaca("PIA2A19");
        
        //Usar métodos do objeto c1
        c1.imprimir();
        c1.LigarFarol();
        c1.ligar();
        
        
        
        //Carro 2
        System.out.println("============ Carro 2");
        // Criar objeto C1 (instância da Classe)
        Carro c2 = new Carro();
        
        //Usar atributos do objeto c1
        c2.setNomeC("Golf");
        c2.setAno(2004);
        c2.setModelo(2005);
        c2.setNumeroPortas(4);
        c2.setFabricante("Volkswagen");
        c2.setCor("Cinza");
        c2.setPlaca("BRA0S17");
        
        //Usar métodos do objeto c1
        c2.imprimir();
        c2.LigarFarol();
        c2.DesligarFarol();
        
        
        //Carro 3
        System.out.println("============ Carro 3");
        // Criar objeto C1 (instância da Classe)
        Carro c3 = new Carro();
        
        //Usar atributos do objeto c1
        c3.setNomeC("Nivus");
        c3.setAno(2010);
        c3.setModelo(2011);
        c3.setNumeroPortas(4);
        c3.setFabricante("Volkswagen");
        c3.setCor("Branco");
        c3.setPlaca("NIV2A19");
        
        //Usar métodos do objeto c1
        c3.imprimir();
        c3.ligar();
        c3.andarFrente();
        
    }
}
