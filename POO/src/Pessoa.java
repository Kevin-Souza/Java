public class Pessoa {
    // Atributos
    String nome;
    int idade;
    char sexo;
    float altura;
    float peso;
    
    // Métodos
    void imprimir(){
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Sexo: "+sexo);
        System.out.println("Altura: "+altura);
        System.out.println("Peso: "+peso);
    }
    
    void andar(){
        System.out.println(nome +" andando...");
    }
    void falar(){
        System.out.println(nome +" falando...");
    }
    void correr(){
        System.out.println(nome +" correndo...");
    }
}
