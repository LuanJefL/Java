package entidies;

public class Pessoa {

    public String nome;
    public int idade;

    public Pessoa(String nome, int idade) {

        this.nome = nome;
        this.idade = idade;

    }

    public String toString() {

        return String.format("Nome:%s Idade:%d", nome, idade);

    } 
    
}
