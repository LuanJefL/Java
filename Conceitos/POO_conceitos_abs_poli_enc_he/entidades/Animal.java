package entidades;

public class Animal{

    public String nome;
    public int idade;

    public Animal(String nome, int idade) {

        this.nome = nome;
        this.idade = idade;

    }

    public void informar() {

        System.out.printf("Nome:%s Idade:%d\n", nome, idade);

    }

}