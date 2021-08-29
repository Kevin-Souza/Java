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
    private String NomeC;
    private String Fabricante;
    private int Ano;
    private int Modelo;
    private String Cor;
    private String Placa;
    private int NumeroPortas;
    
    
    
    //metodos
    void imprimir(){
        System.out.println("Nome: "+ getNomeC());
        System.out.println("Fabricante: "+getFabricante());
        System.out.println("Ano: "+getAno());
        System.out.println("Modelo: "+getModelo());
        System.out.println("Postas: "+getNumeroPortas());
        System.out.println("Cor: "+getCor());
        System.out.println("Placa: "+getPlaca());
    }
    
    void andarFrente(){
        System.out.println("Andar pra frente...");
    }
    
    void ligarCarro(){
        System.out.println("Ligar o Carro...");
    }
    
    void LigarFarol(){
        System.out.println("Farol Ligado.");
    }
            
    void DesligarFarol(){
        System.out.println("Farol Desligado.");
    }
    
    public String getNomeC(){
        return NomeC;
    }
    public void setNomeC(String NomeC){
        this.NomeC = NomeC;
    }
    public String getFabricante(){
        return Fabricante;
    }
    public void setFabricante(String Fabricante){
        this.Fabricante = Fabricante;
    }
    public int getAno(){
        return Ano;
    }
    public void setAno(int Ano){
        this.Ano = Ano;
    }
    public int getModelo(){
        return Modelo;
    }
    public void setModelo(int Modelo){
        this.Modelo = Modelo;
    }
    public int getNumeroPortas(){
        return NumeroPortas;
    }
    public void setNumeroPortas(int NumeroPortas){
        this.NumeroPortas = NumeroPortas;
    }
    public String getCor(){
        return Cor;
    }
    public void setCor(String Cor){
        this.Cor = Cor;
    }
    public String getPlaca(){
        return Placa;
    }
    public void setPlaca(String Placa){
        this.Placa = Placa;
    }
    
    
}

