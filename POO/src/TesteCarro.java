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
        c1.NomeC = "Gol";
        c1.Ano = 2001;
        c1.Modelo = 2002;
        c1.NumeroPortas = 2;
        c1.Fabricante = "Volkswagen";
        c1.Cor = "Branco";
        c1.Placa = "PIA2A19";
        
        //Usar métodos do objeto c1
        c1.imprimir();
        c1.LigarFarol();
        c1.ligar();
        
        
        
        //Carro 2
        System.out.println("============ Carro 2");
        // Criar objeto C1 (instância da Classe)
        Carro c2 = new Carro();
        
        //Usar atributos do objeto c1
        c2.NomeC = "Golf";
        c2.Ano = 2004;
        c2.Modelo = 2005;
        c2.NumeroPortas = 4;
        c2.Fabricante = "Volkswagen";
        c2.Cor = "Cinza";
        c2.Placa = "BRA0S17";
        
        //Usar métodos do objeto c1
        c2.imprimir();
        c2.LigarFarol();
        c2.DesligarFarol();
        
        
        //Carro 3
        System.out.println("============ Carro 3");
        // Criar objeto C1 (instância da Classe)
        Carro c3 = new Carro();
        
        //Usar atributos do objeto c1
        c3.NomeC = "Nivus";
        c3.Ano = 2010;
        c3.Modelo = 2011;
        c3.NumeroPortas = 4;
        c3.Fabricante = "Volkswagen";
        c3.Cor = "Branco";
        c3.Placa = "NIV2A19";
        
        //Usar métodos do objeto c1
        c3.imprimir();
        c3.ligar();
        c3.andarFrente();
        
    }
}
