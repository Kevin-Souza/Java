/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevin
 */
public class Carro {
    String NomeC;
    String Fabricante;
    int Ano;
    int Modelo;
    String Cor;
    String Placa;
    int NumeroPortas;
    
    //metodos
    void imprimir(){
        System.out.println("Nome: "+NomeC);
        System.out.println("Fabricante: "+Fabricante);
        System.out.println("Ano: "+Ano);
        System.out.println("Modelo: "+Modelo);
        System.out.println("Postas: "+NumeroPortas);
        System.out.println("Cor: "+Cor);
        System.out.println("Placa: "+Placa);
    }
    
    void andarFrente(){
        System.out.println("Andar pra frente...");
    }
    
    void ligar(){
        System.out.println("Ligar o Carro...");
    }
    
    void LigarFarol(){
        System.out.println("Farol Ligado.");
    }
            
    void DesligarFarol(){
        System.out.println("Farol Desligado.");
    }
    
    
    
    
}

