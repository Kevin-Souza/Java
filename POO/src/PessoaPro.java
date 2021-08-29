/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevin
 */
public class PessoaPro {
    private String nome;
    private int idade;
    private String sexo;
    private float altura;
    private float peso;
    private String rg;
    
    public void imprimir(){
        System.out.println("Nome: "+ getNome());
        System.out.println("Idade: "+ getIdade());
        System.out.println("Sexo: "+ getSexo());
        System.out.println("Altura: "+ getAltura());
        System.out.println("Peso: "+ getPeso());
        System.out.println("RG: "+ getRg());
    }
    
    public void andar(){
        System.out.println(getNome() +" andando...");
    }
    public void falar(){
        System.out.println(getNome() +" falando...");
    }
    public void comer(){
        System.out.println(getNome() +" comendo...");
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public String getSexo(){
        return sexo;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public float getAltura(){
        return altura;
    }
    public void setAltura(float altura){
        this.altura = altura;
    }
    public float getPeso(){
        return peso;
    }
    public void setPeso(float peso){
        this.peso = peso;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }

}
