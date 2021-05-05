/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevin
 */
public class Animal {
    String NomeAnimal;
    String Especie;
    double Peso;
    double Altura;
    char Sexo;
    
    //Metodos
    void imprimir(){
        System.out.println("Nome: "+NomeAnimal);
        System.out.println("Especie: "+Especie);
        System.out.println("Peso: "+Peso);
        System.out.println("Altura: "+Altura);
        System.out.println("Sexo: "+Sexo);
    }
    
    void andar(){
        System.out.println("Andando");
    }
    
    void comer(){
        System.out.println("Comendo....");
    }
    
    void dormir(){
        System.out.println("Dormindo....");
    }
}
