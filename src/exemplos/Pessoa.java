package exemplos;

public class Pessoa {
    
    private String nome;
    private int idade;
    private char sexo;
    private double altura;
    private double peso;
    String setNome;
    
    public Pessoa(){
    
    }
    
    public Pessoa(String nome) {
        this.nome = nome;
    }
    
    public Pessoa(String nome, int idade, char sexo, double altura, double peso){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Pessoa{nome: " + nome + ", idade: " + idade + "}";
    }
    
    
    
}
