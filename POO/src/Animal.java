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
    private String NomeAnimal;
    private String Especie;
    private double Peso;
    private double Altura;
    private char Sexo;
    
    //Construtor "Limpo"
    public Animal(){
        this.NomeAnimal = "";
        this.Especie = "";
        this.Altura = 0;
        this.Peso = 0;
        this.Sexo = 0;
    }
    
    //Construtor com nome qualquer
    public Animal(double Peso, double Altura){
        this.NomeAnimal = "Fofinho";
        this.Peso = Peso;
        this.Altura = Altura;
        this.Especie = "Cachorro";
    }
    
    
    //Metodos
    void imprimir(){
        System.out.println("Nome: "+ getNomeAnimal());
        System.out.println("Especie: "+ getEspecie());
        System.out.println("Peso: "+ getPeso());
        System.out.println("Altura: "+ getAltura());
        System.out.println("Sexo: "+ getSexo());
    }
    
    void andar(){
        System.out.println(getNomeAnimal() +"Andando");
    }
    
    void comer(){
        System.out.println("Comendo....");
    }
    
    void dormir(){
        System.out.println("Dormindo....");
    }
    
    public String getNomeAnimal(){
        return NomeAnimal;
    }
    public void setNomeAnimal(String NomeAnimal){
        this.NomeAnimal = NomeAnimal;
    }
    public String getEspecie(){
        return Especie;
    }
    public void setEspecie(String Especie){
        this.Especie = Especie;
    }
    public double getPeso(){
        return Peso;
    }
    public void setPeso(double Peso){
        this.Peso = Peso;
    }
    public double getAltura(){
        return Altura;
    }
    public void setAltura(double Altura){
        this.Altura = Altura;
    }    
    public char getSexo(){
        return Sexo;
    }
    public void setSexo(char Sexo){
        this.Sexo = Sexo;
    }
    
    
    
    
    
}
