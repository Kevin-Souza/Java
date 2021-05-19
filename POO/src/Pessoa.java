public class Pessoa {
    // Atributos
    private String nome;
    private int idade;
    private char sexo;
    private float altura;
    private float peso;
    
    // Métodos
    void imprimir(){
        System.out.println("Nome: "+ getNome());
        System.out.println("Idade: "+ getIdade());
        System.out.println("Sexo: "+ getSexo());
        System.out.println("Altura: "+ getAltura());
        System.out.println("Peso: "+ getPeso());
    }
    
    public void andar(){
        System.out.println(getNome() +" andando...");
    }
    public void falar(){
        System.out.println(getNome() +" falando...");
    }
    public void correr(){
        System.out.println(getNome() +" correndo...");
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
    public char getSexo(){
        return sexo;
    }
    public void setSexo(char sexo){
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
    
}
